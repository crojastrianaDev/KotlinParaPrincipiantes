
fun main(args: Array<String>){
	loops()
	
}
/*
Nos permite repetir o recorrer estructuras que almacenan datos un bloque de código
 tenemos for y while
 */
private fun loops(){
	
	val myArray = listOf("Hola","Bienvenidos","A kotlin loops")
	val map: MutableMap<String, Int> = mutableMapOf("Primero" to 1,"Segundo" to 2,"Tercero" to 3)
	
	//bucle for, nos sirve repetir una acción o recorrer el contenido de estructuras
	for (i in myArray){
		println(i)
	}
	for (i in map){
		println("${i.key}=${i.value}")
	}
	//aplicaciones, para recorrer rangos
	for (x in 0..9){
		println(x)
	}
	//recorrido until, sin tener en cuenta el ultimo número
	for (x in 0 until 11){
		println(x)
	}
	// para hacer saltos
	for (x in 0..11 step 2){
		println(x)
	}
	///recorrer de atras a adelanre
	println("De atras hacia adelante")
	for (i in 10 downTo 0){
		println(i)
	}
	
	//crear array númerico
	val  myNumber: IntRange = (0..20)
	println(myNumber)
	for (i in myNumber){
		print(i)
	}
	//Bucle While  mientras esto pase, haga esto
	var x = 0
	println("While")
	while (x < 10){
		print("-"+x)
		x++
		
	}
	
	
}