package pe.isil.EP04.Cambio;

import lombok.Data;

@Data
public class ChangeResponse {
    private ChangeResponseDetail query;
    private ChangebioInfo info;
}
