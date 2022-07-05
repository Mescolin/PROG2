package doisnumeros;

public class DoisNumeros {

    public static void main(String[] args) {
        
        System.out.println(args.length);
        
        if(args.length !=2){
            System.out.println("Informe apenas 2 argumentos");
            System.exit(0);
        }
         
       int x = Integer.parseInt(args[0]);
       int y = Integer.parseInt(args[1]);
       
       int min,max;
       
       if(x>y){
           max = x;
           min = y;
       } 
       else{
           max = y;
           min = x;
       }
       
       for(int valor=min; valor <=max; valor++){
           if(valor % 2 == 0 && valor % 3 == 0){
               
               System.out.println(valor);
           }
       }
       
    }
    
}
