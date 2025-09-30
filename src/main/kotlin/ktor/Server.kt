package ktor

import io.ktor.network.selector.*
import io.ktor.network.sockets.*
import io.ktor.util.cio.*
import io.ktor.utils.io.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.io.File


fun main(): Unit = runBlocking {

    val port = 8877
    val saveFile = File("src/main/kotlin/ktor/received_pdf_file.pdf")
    val selectorManager = SelectorManager(Dispatchers.IO)

    val serverSocket = aSocket(selectorManager).tcp()
        .bind(InetSocketAddress("localhost", port))

    println("Server: Listening on the port: $port")
    delay(3000)

    val socket = serverSocket.accept()
    println("Server: Client connected: ${socket.remoteAddress}")
    delay(3000)

    launch(Dispatchers.IO) {
        val inputReadChannel = socket.openReadChannel()
        val writeChannel = saveFile.writeChannel()

        inputReadChannel.copyTo(writeChannel)
        writeChannel.close()
        saveFile.appendText("\nWritten by the server")

        println("Server: File received successfully")
        serverSocket.close()
    }

}