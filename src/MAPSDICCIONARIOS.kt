

fun main(args: Array<String>){
	diccionarios()
	
}
/*
 Con los diccionarios podemos collecionar datos, sus caracteristicas son:
 No podemos repetir la calves
 No son ordenados
 Los datos se agurpan clave valor
 Clave todos de un tipo de datos y los datos del mismo tipo
 Las claves no puedentener el mismo valor
 */
fun diccionarios(){
	
	//definimos el mapa, con su tipo de dato de la clave y valor
	
	var myMap:Map<String, Int> = mapOf() //este no es mutable
	
	myMap = mapOf("Primero" to(1),"Segundo" to(2))
	
	println(myMap)
	
	//añadir un solo valor si queremos que sea mutable
	
	var mapMutable: Map<String, Int> = mapOf()
	mapMutable = mutableMapOf("Primero" to(1),"Segundo" to(2))
	
	//añadir valores
	mapMutable["ANA"]= 8
	mapMutable.put("Maria",10)
	println(mapMutable)
	
	//modificamos la clave como si lo agregaramos por que no se puede reptetir entonces se modifica
	mapMutable.put("Primero",10)
	println(mapMutable)
	
	//acceder a ellos
	println(myMap["Primero"])
	
	//eliminar datos
	mapMutable.remove("Primero")
	println(mapMutable)
	

	
}