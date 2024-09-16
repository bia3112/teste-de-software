
package br.unipar.exemplotesteunitario;

/**
Crie uma classe ConversorTemperatura com métodos para converter temperaturas
entre Celsius, Fahrenheit e Kelvin: celsiusParaFahrenheit(double celsius),
fahrenheitParaCelsius(double fahrenheit), e celsiusParaKelvin(double celsius).
Escreva testes unitários para garantir que as conversões de temperatura sejam
precisas. Inclua testes para valores extremos e casos especiais, como a temperatura
zero absoluto.
 */
public class ConversorDeTemperatura {
    
    public double celsiusParaFahrenheit(double celsius){
        double tf = (celsius*1.8) + 32;
        return tf;
    }
    
    public double fahrenheitParaCelsius(double fahrenheit){
        double tc = (fahrenheit - 32) / 1.8;
        return tc;
    }
    
    public double celsiusParaKelvin(double celsius){
        double tk = celsius + 273.15;
        return tk;
    }
        
    
}
