package no.pgr203;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HttpClientTest {

    @Test
    void dummyTest() {
        assertEquals(42, 6*7);
    }

    @Test
    void shouldGetSuccessfulReponseCode() {
        HttpClient client = new HttpClient("urlecho.appspot.com", 80, "/html");
        assertEquals(200, client.getStatusCode());
    }

    @Test
    void shouldGetFailureResponseCode() {
        HttpClient client = new HttpClient("urlecho.appspot.com", 80, "/status/403");
        assertEquals(401, client.getStatusCode());
    }
}