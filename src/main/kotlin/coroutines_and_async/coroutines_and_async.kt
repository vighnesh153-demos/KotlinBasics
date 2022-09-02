package coroutines_and_async

import kotlin.system.measureTimeMillis
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.TimeoutCancellationException
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import kotlinx.coroutines.withTimeout

fun usage() {
  // firstCoroutine()
  // suspendFunction()
  // coroutineContexts()
  // runBlockingDemo()
  // jobsCancellationAndTimeout()
  // asyncAndAwaitDemo()
  scopesDemo()
  // exceptionHandling()
}

fun firstCoroutine() {
  GlobalScope.launch {
    delay(1000)
    println("Coroutine says \"Hello from the thread\" (${Thread.currentThread().name})")
  }
  println("\"Hello from thread\" (${Thread.currentThread().name})")
  Thread.sleep(2000)
}

suspend fun doNetworkCall(): String {
  delay(3000)
  return "This is the answer"
}

fun suspendFunction() {
  GlobalScope.launch {
    delay(1000)
    doNetworkCall()
  }
}

fun coroutineContexts() {
  GlobalScope.launch(Dispatchers.IO) {
    val answer = doNetworkCall()
    withContext(Dispatchers.Main) {
    }
  }
}

fun runBlockingDemo() {
  println("Before runBlocking")
  runBlocking {
    launch (Dispatchers.IO) {
      delay(10000)
      println("Inside launch")
    }

    println("Start of runBlocking")
    delay(5000)
    println("End of runBlocking")
  }
  println("After runBlocking")
}

fun jobsCancellationAndTimeout() {
  val job = GlobalScope.launch(Dispatchers.Default) {
    repeat(5) {
      println("Coroutine is still working...")
      delay(1000)
    }
  }

  // Join
  // runBlocking {
  //   job.join()
  //   println("Main thread is continuing...")
  // }

  // Cancel
  // runBlocking {
  //   delay(2000)
  //   job.cancel()
  //   println("Main thread is continuing...")
  // }

  // Timeout
  runBlocking {
    try {
      withTimeout(3000) {
        delay(2000)
        job.join()
        println("Main thread is continuing...")
      }
    } catch (e: TimeoutCancellationException) {
      println("*".repeat(5))
      e.printStackTrace()
    }
  }
}

fun asyncAndAwaitDemo() {
  suspend fun networkCall1(): String {
    delay(3000)
    return "Answer 1"
  }

  suspend fun networkCall2(): String {
    delay(3000)
    return "Answer 2"
  }

  // Sequential
  // val job = GlobalScope.launch(Dispatchers.IO) {
  //   val time = measureTimeMillis {
  //     val answer1 = networkCall1()
  //     val answer2 = networkCall2()
  //     println("Answer1 is $answer1")
  //     println("Answer2 is $answer2")
  //   }
  //   println("Requests took $time ms")
  // }

  val job = GlobalScope.launch(Dispatchers.IO) {
    val time = measureTimeMillis {
      val answer1 = async { networkCall1() }
      val answer2 = async { networkCall2() }

      println("Answer1 is ${answer1.await()}")
      println("Answer2 is ${answer2.await()}")
    }
    println("Requests took $time ms")
  }

  runBlocking {
    job.join()
  }
}

fun scopesDemo() {
  // Global Scope

  val handler = CoroutineExceptionHandler { _, throwable ->
    println("Caught exception: $throwable")
  }

  CoroutineScope(Dispatchers.Main + handler).launch {
    launch {
      delay(300)
      throw Exception("Coroutine 1 failed")
    }
    launch {
      delay(400)
      println("Coroutine 2 finished")
    }
  }
}

fun exceptionHandling() {
  val handler = CoroutineExceptionHandler { _, throwable ->
    println("Caught exception: $throwable")
  }
  val job = GlobalScope.launch(handler) {
    launch {
      throw Exception("Some error")
    }
  }
  runBlocking {
    job.join()
  }
}
