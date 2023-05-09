import java.util.Scanner;

public class KullaniciGiris{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        String kullaniciAdi = sc.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        String sifre = sc.nextLine();

        if(kullaniciAdi.equals("patika") && sifre.equals("123")){
            System.out.print("Giriş başarılı");
        }
        else{
            System.out.println("Kullanıcı Adı veya Şifre yanlış");
            System.out.println("Şifrenizi sıfırlamak ister misiniz? [E/H]");
            String cevap = sc.nextLine();

            switch(cevap){
                case "E":
                case "e":
                    System.out.print("Yeni şifrenizi giriniz: ");
                    String yeniSfire = sc.nextLine();
                    if(yeniSfire.equals("123")){
                        System.out.println("yeni şifre eskisi ile aynı olamaz, Şifre oluşturulamadı");
                        System.out.println("Lütfen tekrar deneyiniz");
                        if(yeniSfire.equals("1234")){
                            System.out.println("Şifreniz değiştirildi. Şifre oluşturuldu.");
                        }
                        
                    }
                    else{
                        System.out.println("Şifre oluşturuldu.");
                    }
                    break;
                case "H":
                case "h":
                    System.out.print("Lütfen girişi tekrar deneyiniz...");

            }
        }
    }
}