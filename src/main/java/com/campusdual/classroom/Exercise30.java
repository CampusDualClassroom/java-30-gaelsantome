package com.campusdual.classroom;


public class Exercise30 {


    public static double divisionWithCustomException(double numerator, double denominator) throws DivisionByZeroException {
        if (denominator == 0) {
            throw new DivisionByZeroException("No se pueden dividir");
        }
        return numerator / denominator;
    }

    public static void main(String[] args) {
        try {
            double result = divisionWithCustomException(10, 2);
            System.out.println("Resultado" + result);
        } catch (DivisionByZeroException e) {
            System.out.println( e.getMessage());
        }
    }
}

