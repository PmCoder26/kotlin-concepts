package ktor

import io.ktor.network.selector.*
import io.ktor.network.sockets.*
import io.ktor.util.cio.*
import io.ktor.utils.io.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.io.File


fun main(): Unit = runBlocking {

    val port = 8877
    val sendFile = File("src/main/kotlin/ktor/send_pdf_file.pdf")
    val selectorManager = SelectorManager(Dispatchers.IO)

    val clientSocket = aSocket(selectorManager).tcp()
        .connect(InetSocketAddress("localhost", port))

    println("Client: Connected to the server: ${clientSocket.remoteAddress}")

    launch(Dispatchers.IO) {
        val outputWriteChannel = clientSocket.openWriteChannel()
        val inputReadChannel = sendFile.readChannel()

        inputReadChannel.copyTo(outputWriteChannel)
        outputWriteChannel.close()

        print("Client: File sent successfully")
        clientSocket.close()
    }

}