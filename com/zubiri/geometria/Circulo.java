package com.zubiri.geometria;
/*
 * Clase para obtener resultados de distintas operaciones aritméticas.
 */
public class Circulo {

private double radio;
 //Método que calcula el area de un circulo.
 public double area () {

	double result = 0;	
	result = this.getRadio()*this.getRadio()* Math.PI; 
	return result;
 }
//Metodo que calcula la circunferencia de un circulo.
public double circunferencia () {

	double result = 0;	
	result = 2 * this.getRadio() * Math.PI ;
	return result;
 }

public double getRadio(){
	
	return radio;
}

public void setRadio(double rad){

	radio=rad;

}
}
