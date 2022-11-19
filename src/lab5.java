public class lab5 {
    public static void main(String[] args) {
        int min =1;
        int max =1000;

        int randNumber1 =(int)( min + Math.random()*(max- min +1));
        int randNumber2 =(int)( min + Math.random()*(max- min +1));

        System.out.println(" the number1 is :"+randNumber1);
        System.out.println(" the number2 is :"+randNumber2);

        if(randNumber2<randNumber1){
            int i=randNumber1-1;
                    while(i>=randNumber2+1){

              if(i%5==0){
                  System.out.print(" "+i);
              }
              if(i%8==0){
                  System.out.print(" "+i);
              }
                i--;
            }

        }
        if(randNumber2>randNumber1){
            int i=randNumber2-1;
            while(i>=randNumber1+1){

                if(i%5==0){
                    System.out.print(" "+i);
                }
                if(i%8==0){
                    System.out.print(" "+i);
                }
                i--;
            }

        }

    }
}
