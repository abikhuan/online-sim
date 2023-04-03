package task.one;

import com.fasterxml.jackson.databind.ObjectMapper;
import task.one.Response;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;


public abstract class RequestSender<T extends Response> {

    private T sendGetRequest(String path) throws IOException {
        URL url = new URL(path);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(conn.getInputStream()))) {
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            ObjectMapper  objectMapper = new ObjectMapper();
            return objectMapper.readValue(content.toString(), getClazz());
        }
    }

    protected abstract Class<T> getClazz();
    protected abstract String getPath();

    public T getResult(Map<String, String> params) throws IOException {

        StringBuilder getParams = new StringBuilder("");

        if(params != null) {
            getParams.append("?");
            params.forEach((key, value) -> {
                getParams.append(key);
                getParams.append("=");
                getParams.append(value);
                getParams.append("&");
            });
        }
        return sendGetRequest(getPath() + getParams);
    }

}
