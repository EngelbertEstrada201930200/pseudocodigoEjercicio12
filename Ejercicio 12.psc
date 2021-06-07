Algoritmo participantes_de_un_curso
	Definir edad, alturaF, alturaM como Real
	Definir sexoF, cF, sM, cM, sE, cE Como Entero
	Definir promedioF, promedioM, promedioE Como Real
	
	Definir sexo Como Caracter
	
	edad = 0
	altura = 0
	
	
	Escribir " Ingrese una edad "
	Leer edad
	
	Escribir " Ingrese una altura "
	Leer altura
	
	Escribir " Ingrese un sexo ( M/F ) "
	Leer sexo
	
	sexo = "F"
	sexo = "M"
	
	Mientras altura > 0  Hacer
	
		Si sexo = "F" Entonces
			sF <- sF+ altura
			cF <- cF+1
		
		Fin Si
		
		Si sexo = "M" Entonces
			sM <- sM+ altura
			cM <- cM+1
		
		Fin Si
		
		// Cantidad y suma para promedio de edad
		sE =  sE+edad
		cE =  cE+1
		
		Escribir " Ingrese una edad "
		Leer edad
		
		Escribir " Ingrese una altura "
		Leer altura
		
		Escribir " Ingrese un sexo ( M/F ) "
		Leer sexo
		
	Fin Mientras
	
	promedioF = sF/cF
	promedioM = sM/cM
	promedioE = sE/cE
	
	Escribir " El promedio de la altura de las mujeres es.. " promedioF
	Escribir " EL promedio de altura de los varones es.. " promedioM
	Escribir " El promedio de la edad es.. " promedioE
	
FinAlgoritmo
