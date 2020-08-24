fun main(args: Array<String>){
	funciones()
	for (i in 0..2){
		hello()
	}
	entrada("Alejandro",24)
	val suma = suma(2,5)
	println(suma)
	println(suma(suma,10))
	
	
}
/*
 
 Las funciones, son un bloque de código que nos permite desenpelar tareas
 y nos permite la reutilización de código.
 
 Con ello dividimos las cosas para que sea más legible el código
 
 */
fun funciones(){
	
	println("Hola")
	println("Holaa")
	println("Hola")
	
}
fun hello(){
	println("Hola")
}
// en una función puedo llamar a otras

//fUNCIONES CON PARAMETRO DE ENTRADA
fun entrada(name: String, age:Int){
	println("Tu nombre es: $name y mi edad es: $age")//la conversión es automatica
}

// si vamos a retornar algo
fun suma(n1:Int, n2:Int):Int{
	return n1+n2
	
}
