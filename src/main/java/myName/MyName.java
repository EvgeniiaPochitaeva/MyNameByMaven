package myName;

import com.google.gson.Gson;

import java.util.LinkedHashMap;
import java.util.Map;

public class MyName {
    public static void main(String[] args) {
        Map<String, String> human = new LinkedHashMap<>();
        human.put("name", "Evgeniia");
        human.put("lastName", "Pochitaeva");
        System.out.println(new Gson().toJson(human));


    }
}
