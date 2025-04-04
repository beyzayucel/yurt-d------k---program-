import java.util.Scanner;

public class Yolcu implements YurtDisiKurallari{
    private int harcKontrol;
    private boolean siyasiYasakKontrol;
    private boolean vizeDurumuKontrol;

    public Yolcu(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Yatırdığınız harç bedeli: ");
        this.harcKontrol=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Herhangi bir siyasi yasağınız bulunuyor mu?(evet-hayır) ");
        String cevap=scanner.nextLine();
        if(cevap.equals("evet")){
            this.siyasiYasakKontrol=true;
        }
        else{
            this.siyasiYasakKontrol=false;
        }
        System.out.print("Vizeniz bulunuyor mu?(evet-hayır) ");
        String cevap2=scanner.nextLine();
        if(cevap2.equals("evet")){
            this.vizeDurumuKontrol=true;
        }
        else{
            this.vizeDurumuKontrol=false;
        }


    }

    @Override
    public boolean yurtDisiHarci() {
        if(this.harcKontrol<15) {
            System.out.println("Lütfen çıkış harcını tam yatırın ");
            return false;
        }
        else{
            System.out.println("Yurtdışı harcı işlemi tamam ");
            return true;
        }
    }

    @Override
    public boolean siyasiYasak() {
        if(this.siyasiYasakKontrol==true){
            System.out.println("Siyasi yasağınız bulunuyor.Yurtdışına çıkamazsınız ");
            return false;
        }
        else{
            System.out.println("Siyasi yasağınız bulunmuyor");
            return true;
        }

    }

    @Override
    public boolean vizeDurumu() {
        if(this.vizeDurumuKontrol){
            System.out.println("Vize işlemleri tamam");
            return true;
        }
        else{
            System.out.println("Vizeniz gideceğiniz ülkeye bulunmamaktadır");
            return false;
        }
    }
}
