package hesapmakinesi;
import java.util.Scanner;
import java.math.*;

public class HesapMakinesi {
    public static void main(String[] args) {
        int num1,num2,operation;
        float answer;
        Scanner input=new Scanner(System.in);
        
        System.out.println("****************");
        System.out.println("1-Toplama");
        System.out.println("2-Çıkartma");
        System.out.println("3-Çarpma");
        System.out.println("4-Bölme");
        System.out.println("****************");
        
        System.out.println("Yapmak istediğiniz işlemi giriniz:");
        operation=input.nextInt();
        
        System.out.println("İlk sayıyı giriniz:");
        num1=input.nextInt();
        
        System.out.println("İkinci sayıyı giriniz:");
        num2=input.nextInt();
        
        switch(operation){
            case 1:
                answer=num1+num2;
                System.out.println("cevap:"+answer);
                break;
            case 2:
                answer=num1-num2;
                System.out.println("cevap:"+answer);
                break;
            case 3:
                answer=num1*num2;
                System.out.println("cevap:"+answer);
                break;
            case 4:
                
                if(num2==0){
                    System.out.println("İkinci sayı sıfır olamaz");
                    
                }
                else{
                    answer=num1/num2;
                    System.out.println("cevap:"+answer);
                    
                }
                
                break;
            default:
                break;
        }
        
       
        
        
        
        
        
    }
    
}
