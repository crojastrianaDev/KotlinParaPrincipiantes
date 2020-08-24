
fun main(args: Array<String>){
	sentenciaIf()
	
}
/*
 SETENCAIA IF, NOS PERMITE HACER COMPARACIONES LÓGICAS PARA SABER LOS PASOS A SEGUIR
 */

private fun sentenciaIf(){
	// > mayor qué
	// < menor qué
	// >= mayor igual que
	// <= menor igual que
	// == igual a
	// != desigualdad
	// operadores lógicos || = O, && = y, y el No ! 
	
	val myNumber = 53
	if((myNumber < 10 && myNumber > 5) || myNumber == 23){
		println("$myNumber Es menor a 10 y mayor que 5 o igual a 53")
		
	}else if(myNumber == 10){
		println("$myNumber: Es igual a 10")
	}else{
		println("$myNumber: Es mayor a 10 o menor que 5 y no es 53")
	}
	
}