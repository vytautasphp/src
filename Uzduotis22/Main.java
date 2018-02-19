package Uzduotis22;

import com.google.gson.Gson;

import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;

class Main {

    public static void main(String[] ignored) throws Exception {

        URI uri = new URI("https",
                "postit.lt",
                "/data",
                "address=A. Gustaičio g. 5, Kaunas",
                null);
        URL url = uri.toURL();

        InputStreamReader reader = new InputStreamReader(url.openStream());
        MyDto dto = new Gson().fromJson(reader, MyDto.class);


        System.out.println(dto.data[0]);
        System.out.println(dto.status);

    }

    private class MyDto {

        Data data[];
        String status;


    }
    private class Data {
        String post_code;
        @Override
        public String toString() {
            return "Pasto kodas = " + post_code;
        }
    }
}