package pe.isil.EP04.Cambio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1")

public class ChangeController {
    @Autowired
    private RestTemplate restTemplate;

    private static String Preg1 = "https://api.exchangerate.host/convert?from=MonedaO&to=MonedaC";

    private static String Preg2 = "https://api.exchangerate.host/convert?amount=Monto&from=MonedaO&to=MonedaC";

    @GetMapping
    @RequestMapping("/ChangeType")
    public List<Object> getConvert(@RequestParam String from, @RequestParam String to){
        ChangeResponse response = restTemplate.getForObject(Preg1, ChangeResponse.class,from,to);


        return Arrays.asList(response);
    }

    @GetMapping
    @RequestMapping("/ChangeValue")
    public List<Object> getConvert(@RequestParam Float amount, @RequestParam String from, @RequestParam String to){
        TotalChange response = restTemplate.getForObject(Preg2,TotalChange.class,amount,from,to);


        return Arrays.asList(response);
    }
}
