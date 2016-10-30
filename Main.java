import com.sun.org.apache.bcel.internal.generic.NEW;

public class Main {

    public static void main(String[] args) {
        int aylarDizisi[] = new int [12]; // bellekten 12 tane int degerinde degisken ayirir
        aylarDizisi[0] = 31; //Ocak ayi 31 gun. Diziler 0 dan saymaya baslar
        aylarDizisi[1] = 28;
        aylarDizisi[2] = 31;
        aylarDizisi[3] = 30;
        aylarDizisi[4] = 31;
        aylarDizisi[5] = 30;
        aylarDizisi[6] = 31;
        aylarDizisi[7] = 31;
        aylarDizisi[8] = 30;
        aylarDizisi[9] = 31;
        aylarDizisi[10] = 30;
        aylarDizisi[11] = 31;
        System.out.println("Ocak Ayi "+aylarDizisi[0]);
        System.out.println("Subat Ayi "+aylarDizisi[1]);
        System.out.println("Agustos Ayi "+aylarDizisi[8]);

        //Dizilerde boyut belirtmedende bu sekilde atama yapabiliyoruz.
        int sayi[] = {1234, 1989 ,1997};
        System.out.println("\nSayi 1: "+sayi[0]);
        System.out.println("Sayi 2: "+sayi[1]);
        System.out.println("Sayi 3: "+sayi[2]);

    }
}
