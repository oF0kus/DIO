import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        
    //Variaveis, condicionais, arrays, loops e casting
    //tipos primitivos

    //num inteiros = 100, 123123, 1233, 1, 12123, 111

    /*
    byte => 8 bits = -128 a 127
    short => 16 bits = -32.768 a 32.767
    int => 32 bits = -2.146.483.648 a 2.146.483.647 
    long => 64 bits = -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
    */

    //num decimais = 1.2, 3.4, 5.6, 7.8, 9.0

    /*
    float => 32 bits = precisao simples => 39.23, 123.12
    double => 64 bits = precisao dupla => 39.2312, 123.1223
    */ 

    //Palavras e caracteres

    /*
    String => representa palavras e frases
    Char => representa um unico caractere
    */

    //Boolean
    //boolean => true ou false
    
    
    byte algumByte = 127;
    short algumShort = 32767;
    int algumInt = 2146483647;
    long algumLong = 9223372036854775807L;
    float algumFloat = 39.23f;
    double algumDouble = 39.232;
    char algumChar = 'a';
    String algumString = "Ola mundo";
    boolean algumBoolean = false;


    boolean bool = true;
    String str = "Fernando";
    
    if(bool){
        System.out.println("Verdadeiro");
    }else{
        System.out.println("Falso");
    
    }

    if(str.isBlank()){
        System.out.println("Esta vazio");
    }else{
        System.out.println("Nao, nao esta vazio");
    
    }

    int[] colecaoDeInteiros = {1,2,3,4,5};
    
    ArrayList<String> nomes = new ArrayList<>();

    nomes.add("Fernando");
    nomes.add("Carla");
    nomes.add("Joao");
    nomes.add("Leo");
    nomes.add("Maria");

        for(int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));

        }


    int[] meusNumeros = new int[5];
        meusNumeros[0] = 1;
        meusNumeros[1] = 2;
        meusNumeros[2] = 3;
        meusNumeros[3] = 4;

    for(int i = 0; i < meusNumeros.length; i++){
        System.out.println(meusNumeros[i]);

        }


    for (String nome : nomes){
        System.out.println(nome);
    }

    int cont = 0;
    while (cont < 10) {
        System.out.println(cont+1);
        cont++;
    }

    double resultado = 0.0;
    int resultadoInt = (int) resultado;


    int meuInt = 10;
    double meuDouble = meuInt;


    String meuString = "10";
    int meuInt2 = Integer.parseInt(meuString);
 
 
    String minhaString = String.valueOf(meuInt2);



}
}
