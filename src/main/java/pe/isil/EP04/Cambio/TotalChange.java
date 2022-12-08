package pe.isil.EP04.Cambio;

import lombok.Data;

@Data
public class TotalChange {
    private ChangeResponseDetail query;
    private ChangebioInfo info;
    private Float result;
}
