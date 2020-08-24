
fun main(args: Array<String>){
	sentencia()
	
}

/*
 Sentencia de control llamada When el tipico switch en java
 */

private fun sentencia(){
	
	val country = "Peru"
	
	// cundo tenemos gran número de condiciones es mejor usar when
	
	when (country){
		
		// si tengo casos considentes
		
		"España","Colombia","Peru" -> {
			print("Español")
			
		}
		"EEUU" -> {
			print("Ingles")
			
		}
		"Francia" -> {
			print("Frances")
		}
		else -> {
			println("No concemos el idioma")
			
		}
		
	}
	//when con int
	
	val age = 100
	when (age){
		//podemos abreviar con numeros
		in 0..3 ->{
		println("Eres bebé")
	    }
		in 4..12 -> {
			println("Eres Niño")
			
		}
		in 13..17 ->{
		println("Eres Adolecente")
	    }
		in 18..69 -> {
			println("Eres Adulto")
		}
		in  70..89 ->{
			println("Eres Abuelo")
		}
		else -> {
			println("ohhhh")
		}
		
			
		
	}
	
	
}