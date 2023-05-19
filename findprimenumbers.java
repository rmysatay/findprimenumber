import java.util.Scanner;

public class findprimenumbers {
    public static void main(String[] args) {
        findprimenumbers prime = new findprimenumbers();
        Scanner scan = new Scanner(System.in);
        System.out.println("Asal olup olmadığını öğrenmek istediğiniz sayıyı giriniz lütfen ?");
        int number = scan.nextInt(); 
        prime.primenumber(number);
    }

    public void primenumber(int i) {
        int a=0;
        int b=0;
        for(int j=2;j<=i;j++){
            if(i%j==0){
                a++;
            }
            else{
                b++;
            }
        }
        if(a==1){
            System.out.println(i+" asal sayıdır.");
        }
        else{
            System.out.println(i+" asal sayı değildir.");
        }

    }
}
