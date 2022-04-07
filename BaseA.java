package com.company;

//10.Cree una jerarquía de excepciones de tres niveles. Ahora cree una clase base A con
//un método que arroja una excepción en la base de su jerarquía.
//Heredar B de A y anular el método para que arroje una excepción en el nivel
//dos de tu jerarquía. Repita heredando la clase C de B. En main(), cree
//una C y convertirlo a A, luego llamar al método

public class BaseA {
    public void Arrojar () throws JerarquiaN1 {
        throw new JerarquiaN1();
    }
}
