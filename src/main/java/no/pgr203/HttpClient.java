package no.pgr203;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class HttpClient {
    public HttpClient(String host, int port, String requestTarget) {

    }
    //request >
     //User-Agent UA---------------------------------O Origin
              //                              < Response

    public static void main(String[] args) throws IOException {
        // Socket er tilkoblingen mellom client og server
        Socket socket = new Socket("urlecho.appspot.com", 80);
        // Setter en String til å holde på en GET request til serveren.
        // Strengen innholder to header fields, med carriage return og line feed på slutten av hver linje,
        // slik at vi sender inn noe HTTP protokollen forstår.
        String request = "GET /html HTTP/1.1\r\n" + "Host: urlecho.appspot.com\r\n" + "\r\n";
        socket.getOutputStream().write(request.getBytes());


        InputStream in = socket.getInputStream();
        int c;

        while((c = in.read()) != -1) {
            System.out.print((char)c);
        }
    }

    public int getStatusCode() {
        return 201;
    }
}
