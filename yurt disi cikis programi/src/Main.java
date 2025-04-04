public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Sabiha Gökçen Havalimanına Hoşgeldiniz");
        String sartlar="Yurtdışı Çıkış Kuralları\n"+"Herhangi bir siyasi yasağınız bulunmamalı\n"+"15 tl harç bedelinizi tam olarak yatırmanız gerekiyor\n"+"Gideceğiniz ülkeye vizenizin bulunması gerekiyor";
        String mesaj="Yurtdışı şartlarından hepsini sağlamanız gerekiyor. ";

                while(true){
                    System.out.println("*****************************");
                    System.out.println(sartlar);
                    System.out.println("*****************************");


                    Yolcu yolcu=new Yolcu();
                    System.out.println("Harç bedeli kontrol ediliyor..");

                    Thread.sleep(3000);
                    if(yolcu.yurtDisiHarci()==false){
                        System.out.println(mesaj);
                        continue; //döngünün başına gider
                    }
                    System.out.println("Siyasi yasak kontrol ediliyor..");


                    if(yolcu.siyasiYasak()==false){
                        System.out.println(mesaj);
                        continue; //döngünün başına gider
                    }
                    System.out.println("Vize durumu kontrol ediliyor..");

                    if(yolcu.vizeDurumu()==false){
                        System.out.println(mesaj);
                        continue;
                    }


                    System.out.println("İşlemleriniz tamam. Yurtdışına çıkabilirsiniz.");
                    break;
                }





    }
}