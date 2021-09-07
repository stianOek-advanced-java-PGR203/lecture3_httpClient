package no.pgr203;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class HttpClient {
                //request >
     //User-Agent UA---------------------------------O Origin
    //                              < Response

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("stianhermansen.com", 80);

        String request = "GET /html HTTP/1.1\r\n" + "Host: stianhermansen.com\r\n" + "\r\n";
        socket.getOutputStream().write(request.getBytes());


        InputStream in = socket.getInputStream();
        int c;
        while((c = in.read()) != -1) {
            System.out.print((char)c);
        }
    }
}
