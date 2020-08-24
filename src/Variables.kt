

 fun main (args: Array<String>){
	 //print("Hola")
	 variablesYCostantes()
	 
	 
	}
 /*
 Aqui vamos hablar de variables y constantes
 */
 
 private fun variablesYCostantes(){
	 //varaiables, puede ser modificada con el tiempo, no se pude cambiar el tipo de variable luego
	 // de ser iniciada.
	 
	 var mayVariable = "Hello kotlin"
	 
	 println(mayVariable)
	 
	 mayVariable = "Te amo luisa"
	 println(mayVariable)
	 
	 var numero = 1
	 println(numero.toString())
	 
	 var mySecondVariable: Float? 
	 mySecondVariable = 2.88F
	 println(mySecondVariable)
	 
	 // costantes con la palabra reservada val, este tipo no puede mutar con el tiempo
	 
	 val myCostante  = "No cambio"
	 println(myCostante)
	 
	}