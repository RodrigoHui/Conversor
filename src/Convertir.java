import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Convertir {
    public Moneda conversion(String monedaLocal, String monedaObjetivo, double cantidad){

        String direccion = "https://v6.exchangerate-api.com/v6/62d552f676b81de72b603690/pair/"+monedaLocal+"/"+monedaObjetivo+"/"+cantidad;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        return  new Gson().fromJson(response.body(), Moneda.class);
    }
}
