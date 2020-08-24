import java.util.ArrayList

fun main(args: Array<String>){
	arreglo()
}

/*
 En el podemos almacenar muchos datos de un tipo de dato definido
 */
private fun arreglo(){
	
	val name = "Alejandro"
	val apellido = "Rojas"
	val company = "Hornet"
	val age = "24"
	
	val myArray = arrayListOf<String>()
	
	myArray.add(name)
	myArray.add(apellido)
	myArray.add(company)
	myArray.add(age)
	
	println(myArray)
	
	//añadir conjunto de datos
	
	myArray.addAll(listOf("Hola","Bienvenidos"))
	println(myArray)
	
	//Acceso a datos del array
	
	println(myArray[0])
	
	//modificar
	
	myArray[5] = "Bienvenidos a Kotlin"
	
	println(myArray[5])
	
	//Borrar datos
	
	myArray.removeAt(4)
	println(myArray)
	
	//recorrer mi array
	
	myArray.forEach{
		println(it)
	}
	
	//tenemos un gran listado de funciones para los array
	
	myArray.count() //saber cuantos tenemos
	
	myArray.clear() //lo eliminamos
	
	myArray.sort() //podemos orgenarlos
	
	
	
}