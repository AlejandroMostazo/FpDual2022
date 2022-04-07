package com.company;

public class MainC {
    public static void main(String[] args) {
        BaseC C1 = new BaseC();
        BaseA A1 = C1;
        try {
            A1.Arrojar();
        } catch (JerarquiaN1 e) {
            e.printStackTrace();
        }
    }
}
