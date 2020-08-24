
fun main(args: Array<String>){
	tiposDeDatos()
}
/*
 Los tipos de datos principales en Kotlin
 */
private fun tiposDeDatos(){
	
	// los String, los Int, los Float, los Doubles, Boolean
	
	//String
	
	var cadena:String?
	cadena = "Soy cadena definida"
	//o solo
	var cadenaDos = "Hola soy string por ser fuertemente tipado"
	println(cadena+" y yo  $cadenaDos")
	
	// Int de tipo  (Byte(solo entre -127 y 18 )Shore() Int y Long)
	val int = 10
	println(int.toString())
	val intDos:Int = 10
	var suma = int + intDos
	println(suma)
	val double = 1.5
	val float:Float = 2.5F //solo si sabemos que no sera muy grande
	var sumaDos = double+float
	println(sumaDos)
	
	//Boleand 1 true y/o 0 false para tomar decisiones logiccas
	var bol: Boolean?
	bol = true
	var bolDos = false
	println(bol == bolDos)
	
	
	
	
	
	
	
	
	
		
	
}