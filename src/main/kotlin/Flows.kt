import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

// Theory of flows.
// An asynchronous data stream that sequentially emits values and completes normally or with an exception.
// Note - cold flow doesn't start emitting until one collects them.
// Flow builders are: flow{}, flowOf(), channelFlow{}, MutableStateFlow, MutableSharedFlow


suspend fun main() {

    // normal flow.
//    val flow = flow { // flow builder.
//        for(i in 1..10 step 1) {
//            delay(1000)
//            println("Inside the flow")
//            emit(i)     // used to send a value into the flow stream or collector.
//        }
//    }

    // using flowOf() to create flow.
//    val flow = flowOf("Apple", "Banana", "Cherry", "Dates")

    // using .asFlow() thereby converting the data structure as flow.
//    val flow = listOf(1, "Apple", 2, "Banana", 3, "Cherry", 4, "Dates").asFlow()

    // using .asFlow() for IntRange.
//    val flow = (1 .. 10).asFlow()

    // flow methods.
    val flow = (1 .. 10).asFlow()


    coroutineScope {

        launch {
//            flow.collect {      // collector, collecting the emitted value.
//                println("Emitting: $it")
//                delay(1000)
//            }

            // Note - using the functions like .map, .filter, .fold, etc., should be used in the flow definition rather
            // than flow collection.

            // using .map{}.
//            flow
//                .map {      // used to print the table of 9.
//                    it * 9
//                }
//                .collect {
//                    println("9 X ${it / 9} = $it")
//                }

            // using .filter{}.
//            println("Even number are as follows:")
//            flow
//                .filter {       // printing the even numbers.
//                    it % 2 == 0
//                }
//                .collect {
//                    println(it)
//                }

            // using .fold{}.
            // fold() is a suspending terminal operator that:
            //	•	Collects all emitted values
            //	•	Applies an accumulator function
            //	•	Returns one final result (not a Flow)
//            val total = flow
//                .fold(0) { accum, value ->   // accum: stores the result, value: each emitted value from the flow.
//                    println("accum: $accum, value: $value")
//                    accum + value
//                }
//            println("Total: $total")    // returns the sum of numbers from 1 to 10.

            // using .combine{}.
            // In Kotlin Flow, .onEach {} is an intermediate operator used for side effects like logging or UI updates.
            // Though it looks like .collect {}, it does not trigger the flow — this often causes confusion, as only
            // collect starts the flow.
//            val flowD = flowOf(1, 2, 3, 4, 5)
//                .onEach { delay(1000) }     // delays before the flow collection.

            // using combine(){}.
            // Returns a Flow whose values are generated with transform function by combining the most recently emitted
            // values by each flow.
//            val flowA = flow {
//                println("Even flow.")
//                for (i in 2..10 step 2) {
//                    emit(i)
//                    delay(1000)
//                }
//            }
//            val flowB = flow {
//                println("Odd flow.")
//                for (i in 1 .. 10 step 2) {
//                    emit(i)
//                    delay(2000)
//                }
//            }

            //combine(){} is a Flow operator that merges two flows by emitting a new value every time either flow emits,
            // using the latest values from both — which may feel confusing when the flows emit at different speeds.
//            val combinedFlow = flowA.combine(flowB) { a, b ->
//                a + b
//            }
//            combinedFlow.collect {
//                println(it)
//            }
            /*
                Output of the above 'combine' code:
                    2 + 1 = 3;  a = 2, b = 1
                    1000ms
                    4 + 1 = 4;  a = 4, b = 1.
                    1000ms
                    6 + 3 = 9;  a = 6, b = 3.
                    1000ms
                    8 + 3 = 11; a = 8, b = 3.
                    .
                    .
                    and so on. this has been because since delays are different, the resultant flow has to aggregate
                    when either of the two flows emits a value with the latest emitted values of both flows.
             */

            val flowC = flowOf(1, 2, 3, 4, 5)
                .onEach { delay(1000) }
            val flowD = flowOf("Apple", "Banana", "Cherry", "Dates", "Elderberry")
                .onEach { delay(2000) }

            // using .zip(){}.
            // It pairs values from two flows index-wise, emitting only when both flows emit, unlike combine,
            // which emits on any new emission using the latest values.
            val zippedFlow = flowC.zip(flowD) { c, d ->
                Pair(c, d)
            }
            zippedFlow.collect {
                println(it)
            }
            /*
                Output of the above 'zip' code:
                    (1, Apple)
                    (2, Banana)
                    (3, Cherry)
                    (4, Dates)
                    (5, Elderberry)
                    this has been because although delays are different, the resultant flow has to aggregate
                    when both two flows emit a value rather than either of them emits.
             */

        }

    }

}