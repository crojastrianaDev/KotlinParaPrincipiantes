
fun main(arg: Array<String>){
	val uno = clases("Alejandro Rojas",24)
	
	println(uno)
	
	val dos = modificar("Alejandro",24)
	
	println(dos.age)
	
	val tres = dataClass("Luisa", 20, arrayOf(dos))
	
	println(tres.name + " - " + tres.age + " Amigos "+tres.friends)
	
	val alejandro = lenguajes(arrayOf("Java","Kotlin","Python","JavaScript"))
	alejandro.programa() //puedo acceder a funciones que la clase tiene
	
}

/*
 Un clase es una costrución felixible de uso general.
 Nos permite definir propiedades o métodos en ellas y nos permiten crear objetos de ellas.
 */

// De esta forma las podemos usar solo dentro de la clase

class clases(name: String?, age: Int?){
	//Si queremos que esta clase sea mutable deberiamos implmentar el bloque init
	
	var name: String? = null
	var age: Int? = null
	
	init{
		this.name = name
		this.age = age
	}
}

// De esta forma las podemos hacer la propiedades mutables con menor códgio
class modificar(var name: String, var age: Int){
	
	enum class lenguajes{
		KOTLIN,
		JAVA,
		JAVASCRIPT,
		SWIFT
	}
	
		
}

// La clase data class nos dota de una vez de los constructures y algunas otras funciones 
data class dataClass(var name: String, var age: Int, val friends: Array<modificar>? = null){}


class lenguajes(var lenguajes: Array<String>){
	fun programa(){
		for (i in lenguajes){
			println("Porgrma en: $i")
		}
	}
}