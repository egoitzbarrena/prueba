package com.zubiri.geometria;
/*
 * Clase para obtener resultados de distintas operaciones aritméticas.
 */
public class Rectangulo {

	private double base;
	private double altura;
 //Método que calcula el area de un circulo.
 public double area () {

	double result = 0;	
	result = this.getBase()*this.getAltura(); 
	return result;
 }
//Metodo que calcula la circunferencia de un circulo.
public double perimetro () {

	double result = 0;	
	result = (2 * this.getBase()) + (2*this.getAltura()) ;
	return result;
 }

public double getBase(){
	
	return base;
}

public double getAltura(){
	
	return altura;
}

public void setBase(double oinarria){

	base=oinarria;
}

public void setAltura(double altuera){

	altura=altuera;
}

}
