import java.util.Scanner;
public class Kullanici_Girisi_Programi {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        String username, password, inpUsername = "Patika", yesNo,
         inpPassword = "Patika123";
        try{
            System.out.print("Kullanıcı adını giriniz : ");
            username = input.nextLine();
            System.out.print("Şifrenizi giriniz : ");
            password = input.nextLine();

            if(username.equals(inpUsername) && password.equals(inpPassword))    {
                System.out.println("Başarılı bir şekilde giriş yaptınız     !");
            }
            else{
                System.out.print("Kullanıcı adı veya şifre yanlış !\nŞifrenizi değiştirmek istiyor musunuz ?\nEvet için (Y) hayır için (N) basınız. (Y/N) : ");
                yesNo = input.nextLine();

                switch (yesNo) {
                    case "Y":
                    case "y":
                        System.out.print("Yeni şifrenizi giriniz : ");
                        password = input.nextLine();
                    
                        if(password.equals(inpPassword)){
                        System.out.println("Yeni şifreniz eski şifrenizle aynı olamaz !");
                        }
                        else{
                        System.out.println("Şifreniz başarılı bir şekilde oluşturuldu !");
                        }
                        break;
                    case "N":
                    case "n":
                        System.out.println("Ana menüye dönülüyor...");
                        break;
                    default:
                        System.out.println("Hatalı bir tuşlama yaptınız     !");
                        break;
                }
            }
        }finally{
            input.close();
        }
    }
        
}
    

