import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        final double ROUBLES_PER_YUAN=11.91;
        int yuan=-10;
        double roubles;
        String okon_china="их", okon_yuan="ей";
        
        Scanner input=new Scanner(System.in);
        
        while(yuan<0){
            System.out.print("Введите кол-во юаней: ");
            yuan=input.nextInt();
        }
        roubles=ROUBLES_PER_YUAN*yuan;
        
        if (yuan%10==1){
            if (yuan!=11){
                okon_yuan="ь";
                okon_china="ий";
            }
        }
        else if ((yuan%10>1) && (yuan%10<5)){
            if ((yuan!=11) && (yuan!=12) && (yuan!=13) && (yuan!=14)){
                okon_yuan="я";
                okon_china="их";
            }
        }
        System.out.print(yuan+" китайск"+okon_china+" юан"+ okon_yuan +" это "+roubles+" рублей");
    }
}