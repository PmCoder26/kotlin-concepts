import kotlinx.coroutines.*


@OptIn(ExperimentalCoroutinesApi::class)
fun main() {

    // runBlocking is also a coroutine builder that bridges the non-coroutine world of a regular fun main()
    runBlocking {

        // First coroutine.
        // Launch is a coroutine builder. It launches a new coroutine concurrently with the rest of the code,
        // which continues to work independently
//        launch {
//            delay(2000)
//            println("Hello from the first coroutine...")
//        }
//        println("Hello from outside the coroutine...")

        // A coroutineScope builder can be used inside any suspending function to perform multiple concurrent operations.
        coroutineScope {

            val job1 = launch {
                delay(1000)
                println("I am job1")
            }

            val job2 = launch {
//             Cancels the job1 coroutine and then executes the below task.
//                job1.cancel()
//             continues the below code execution after completion of the job1 coroutine
//             similar to say that 'hey, I am job2 and will execute the below code after
//             completing job1's execution'.
//                job1.join()
//             invokeOnCompletion { ... } registers a callback to run later, after the job completes — asynchronously.
//             It does not suspend the current coroutine, and it does not block or wait.
                job1.invokeOnCompletion {
                    println("After completion of the job1....")
                }
                println("I am job2")
//            }

//                val job3 = launch(CoroutineName("Job3")) {
//                    try {
//                        delay(2000L)
//                        println("I am job3")
//                    } catch (e: Exception) {
//                        println("Doing cleanup process after cancellation...")
//                    }
//                }
//
//                val job4 = launch(CoroutineName("Job4")) {
//                    // 1. Sends a cancellation signal to the coroutine.
//                    // 2. Suspends until the coroutine has finished any cleanup (like try/finally blocks).
//                    // 3. And then executes the below code after it.
////                job3.cancelAndJoin()
//                    // returns the parent of the job3
////                println(job3.parent.toString())
//                    // returns the children of the parent.
//                    val jobList = job3.parent?.children?.toList() ?: emptyList()
//                    for (job in jobList) {
//                        println("Job: ${job}")
//                    }
//                    println("I am job4")
//                }


            }


        }
    }
}