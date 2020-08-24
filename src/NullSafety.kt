
fun main(args: Array<String>){
	nullSafety()
}
/*
 Null Safety, es la seguridad contra nulos
 
 SIEMPRE DEBEMOS USAR ? POR QUE EN ALGUN MOMENTO LA VARIABLE PUEDE SER NULL Y ASÍ ESTAMOS OBLIGADOS
 A VERIFICAR LA VARIABLE
 
 */
fun nullSafety(){
	
	var myString = "Alejandro"
	
	//myString = null Esto nos daria un error de compilación ya que la vartiable no puede ser nula
	
	println(myString)
	
	// Si queremos evitar esto, lo que hacemos ed definir el tipo de variable y poner ?
	
	var mySafety: String? = "Rojas null safety"
	mySafety = null //ahora si puede ser null
	println(mySafety)
	
	//Si nos vamos a asegurar de que algo no llegue null ponemos
	
	if(mySafety != null){ //si es distinto de null
		println(mySafety!!) //Con !! noa aseguramos de que en este punto no es null
	}else
		{
			println("sI ES NULL")
		}
	
	//SI NO QUEREMOS HACER LOS IF PUES USAMOS SAFE CALL, O LLAMADA SEGURA
	
	println(mySafety?.length) //Si usamos ? no ejecutara si es null
	
	//Con let podemos tener un Safe call
	
	mySafety?.let {
		//este código se ejecutara solo si no es null
		
		println(it) //El it sera el valor de la variable si no es null
		
	}?: run {//Si es null ejecutara esto
		
		println(mySafety)
	}
	
}