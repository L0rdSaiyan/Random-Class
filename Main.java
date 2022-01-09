/*By: Lord Saiyan
  Date: 09/01/2022 / 01/09/2022
Números aleatórios gerados pela classe random e foi utilizado uma estrutura de repetição "While" para a formação dos números de acordo com a entrada do usuário.
*/

import java.util.Scanner;  //Importando a classe Scanner
import java.util.Random;  //Importando a classe Random
public class Main
{
	public static void main(String[] args) {
	  
	  Scanner goku = new Scanner(System.in);	
	  Random aleatorio = new Random();
	  
	  //Criação das variáveis
	  String answer;
	  int numbers, intervalo;
	  
	  System.out.println("Quantos números aleatórios você deseja criar?: ");
	   numbers=goku.nextInt();
	  
	    System.out.println("\nVocê deseja definir um intervalo para os números? (Ex: 0 a 10 etc...)");
	     answer=goku.next();
	  
	  
	      while(!(answer.equals("Sim") || (answer.equals("sim")) || (answer.equals("S")) || (answer.equals("s")) || (answer.equals("Yes")) || (answer.equals("yes")) || (answer.equals("Yeah")) || (answer.equals("yeah")) || (answer.equals("Não") || (answer.equals("Nao")) || (answer.equals("não")) || (answer.equals("nao")) ||(answer.equals("no")) || (answer.equals("No"))))){
	             
	       System.out.println("Eeee... Não entendi. Talvez você tenha dado uma entrada inesperada. Vamos começar de novo.");
	        System.out.println("\nVocê deseja definir um intervalo para os números? (Ex: 0 a 10 etc...)");
	         answer=goku.next();
	              
}
	  
	          if (answer.equals("Sim") || (answer.equals("sim")) || (answer.equals("S")) || (answer.equals("s")) || (answer.equals("Yes")) || (answer.equals("yes")) || (answer.equals("Yeah")) || (answer.equals("yeah"))){
	      
	           System.out.println("\nQual o maior número que deve ser gerado? (COLOQUE O MAIOR NÚMERO DO INTERVALO EX: SE QUISER DE 1 A 100, COLOQUE \"100\")");
	            intervalo=goku.nextInt();
	      
	            while(numbers>0){

	             System.out.println(aleatorio.nextInt(intervalo) + 1); //Foi atribuido o valor "+ 1" depois do parâmetro para que não seja gerado um número a menos.
        
                  numbers--;
	       
} //Fim do While

	            
	             
	               }else if (answer.equals("Não") || (answer.equals("Nao")) || (answer.equals("não")) || (answer.equals("nao")) ||(answer.equals("no")) || (answer.equals("No"))){
	      
	               System.out.println("\nO intervalo foi automaticamente definido para 10.");
	      
	               while(numbers>0){
	          
	              System.out.println(aleatorio.nextInt(10) + 1); //Foi atribuido o valor "+ 1" depois do parâmetro para que não seja gerado um número a menos.
	          
	             numbers--;
	          
	      } //Fim do While
	    
	  } //Fim do If
	      	 
    } //Fim do public Static Void main
	  
} //Fim do programa

	  