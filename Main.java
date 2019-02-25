import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        ArrayList<String> kopi   = new ArrayList<String>();

        MesinKopi robusta = new MesinKopi();
        robusta.setJenisKopi("Robusta");
        robusta.setJumlahStokKopi(40);
        kopi.add(robusta.getJenisKopi());
        MesinKopi arabica = new MesinKopi();
        arabica.setJenisKopi("arabica");
        arabica.setJumlahStokKopi(40);
        kopi.add(arabica.getJenisKopi());
        MesinKopi Flores = new MesinKopi();
        Flores.setJenisKopi("Flores");
        Flores.setJumlahStokKopi(40);
        kopi.add(Flores.getJenisKopi());

        ArrayList<String> Topping   = new ArrayList<String>();

        Topping susu = new Topping();
        susu.setJenisTopping("susu");
        susu.setJumlahStokTopping(40);
        Topping.add(susu.getJenisTopping());
        Topping gula = new Topping();
        gula.setJenisTopping("gula");
        gula.setJumlahStokTopping(40);
        Topping.add(gula.getJenisTopping());
        Topping cream = new Topping();
        cream.setJenisTopping("cream");
        cream.setJumlahStokTopping(40);
        Topping.add(cream.getJenisTopping());


        for(int i=0; i< kopi.size();i++){
            int j= i+1;
            System.out.println("Menu kopi adalah "+j+" "+kopi.get(i));
        }
        System.out.println("Masukan kopi yang mau dipilih :");
        int pilihanKopi = keyboard.nextInt() -1;

        for(int i=0; i< Topping.size();i++){
            int j= i+1;
            System.out.println("Menu Topping adalah "+j+" "+Topping.get(i));
        }


        System.out.println("Masukan Toping yang mau dipilih :");
        int pilihanTopping = keyboard.nextInt() -1;

        System.out.println("Pesanan anda adalah " +kopi.get(pilihanKopi)+"dengan topping" + Topping.get(pilihanTopping));







    }
}
