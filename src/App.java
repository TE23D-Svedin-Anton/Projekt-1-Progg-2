import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static ArrayList<Bestallning> bestallningsLista = new ArrayList<>();
    static boolean on = true;
    static Scanner tangentbord = new Scanner(System.in);
    static int val;
    static int byggnad;

    public static void main(String[] args) throws Exception {

        while (on) {
            System.out.println("1. Lägg en beställning");
            System.out.println("2. Se beställningar");
            System.out.println("3. Ta bort beställning");
            System.out.println("4. Avsluta");

            System.out.print("Välj alternativ:");
            int val = tangentbord.nextInt();

            switch (val) {
                case 1:
                    System.out.println("Vad för byggnad vill du köpa?");
                    System.out.println("1. Villa");
                    System.out.println("2. Radhus");
                    System.out.println("3. Garage");
                    System.out.println("4. Avbryt");

                    System.out.print("Välj alternativ:");
                    int byggnad = tangentbord.nextInt();

                    switch (byggnad) {

                        case 1:
                            try {
                                System.out.println("___Beställning___");
                                System.out.println("Byggnad: Villa");
                                String typ = ("Villa");

                                System.out.print("Personummer:");
                                int personummer = tangentbord.nextInt();

                                System.out.print("Telefonnummer:");
                                int telefonnummer = tangentbord.nextInt();

                                System.out.println("Välj hur många rum du vill ha. Min 4 & Max 7");
                                System.out.print("Rum:");
                                int rum = tangentbord.nextInt();

                                System.out.println("Välj hur stor yta(kvm) du vill ha. Min 150 & Max 230");
                                System.out.print("Yta:");
                                int yta = tangentbord.nextInt();

                                System.out.println("Välj hur många badrum du vill ha. Min 1 & Max 2");
                                System.out.print("Badrum:");
                                int badrum = tangentbord.nextInt();

                                int Kok = 1;

                                System.out.println("Välj hur stor tomt(kvm) du vill ha. Min 400 & Max 1000");
                                System.out.print("Tomt:");
                                int tomt = tangentbord.nextInt();

                                int pris = 3500000 + (rum - 4) * 200000 + (yta - 150) * 20000 + (badrum - 1) * 300000
                                        + (tomt - 400) * 1000;

                                Villa bestalldVilla = new Villa(pris, typ, rum, yta, badrum, Kok, tomt);

                                Bestallning info = new Bestallning(personummer, telefonnummer, bestalldVilla);
                                bestallningsLista.add(info);

                            } catch (Exception e) {
                                System.out.println("Fel: " + e.getMessage());
                            }
                            break;

                        case 2:
                            try {
                                System.out.println("___Beställning___");
                                System.out.println("Byggnad: Radhus");
                                String typ = ("Radhus");

                                System.out.print("Personummer:");
                                int personummer = tangentbord.nextInt();

                                System.out.print("Telefonnummer:");
                                int telefonnummer = tangentbord.nextInt();

                                System.out.println("Välj hur många rum du vill ha. Min 4 & Max 7");
                                System.out.print("Rum:");
                                int rum = tangentbord.nextInt();

                                System.out.println("Välj hur stor yta(kvm) du vill ha. Min 150 & Max 230");
                                System.out.print("Yta:");
                                int yta = tangentbord.nextInt();

                                System.out.println("Välj hur många badrum du vill ha. Min 1 & Max 2");
                                System.out.print("Badrum:");
                                int badrum = tangentbord.nextInt();

                                int Kok = 1;

                                System.out.println("Välj hur stor tomt(kvm) du vill ha. Min 400 & Max 1000");
                                System.out.print("Tomt:");
                                int tomt = tangentbord.nextInt();

                                int pris = 2500000 + (rum - 4) * 200000 + (yta - 150) * 20000 + (badrum - 1) * 300000
                                        + (tomt - 400) * 1000;

                                Radhus bestalldRadhus = new Radhus(pris, typ, rum, yta, badrum, Kok, tomt);

                                Bestallning info = new Bestallning(personummer, telefonnummer, bestalldRadhus);
                                bestallningsLista.add(info);

                            } catch (Exception e) {
                                System.out.println("Fel: " + e.getMessage());
                            }
                            break;

                        case 3:
                            try {
                                System.out.println("___Beställning___");
                                System.out.println("Byggnad: Garage");
                                String typ = ("Garage");

                                System.out.print("Personummer:");
                                int personummer = tangentbord.nextInt();

                                System.out.print("Telefonnummer:");
                                int telefonnummer = tangentbord.nextInt();

                                System.out.println("Välj hur stor bil-area(kvm) du vill ha. Min 15 & Max 30");
                                System.out.print("Bil-area:");
                                int bilArea = tangentbord.nextInt();

                                System.out.println("Välj hur stor förrådsarea(kvm) du vill ha. Min 5 & Max 20");
                                System.out.print("Förrådsarea:");
                                int foradsArea = tangentbord.nextInt();

                                int pris = 500000 + (bilArea - 15) * 20000 + (foradsArea - 30) * 1000;

                                Garage bestalldGarage = new Garage(pris, typ, bilArea, foradsArea);

                                Bestallning info = new Bestallning(personummer, telefonnummer, bestalldGarage);
                                bestallningsLista.add(info);

                            } catch (Exception e) {
                                System.out.println("Fel: " + e.getMessage());
                            }
                            break;

                        case 4:
                            System.out.println("Avbryter beställning");
                            break;
                    }
                    break;

                case 2:
                    for (int i = 0; i < bestallningsLista.size(); i++) {
                        System.out.println("Beställning " + (i + 1) + ": " + bestallningsLista.get(i));
                    }
                    break;

                case 3:
                    System.out.print("Ange personummer för beställningen som ska tas bort:");
                    int personummerAttTaBort = tangentbord.nextInt();

                    boolean hittad = false;

                    for (int i = 0; i < bestallningsLista.size(); i++) {
                        if (bestallningsLista.get(i).getPersonummer() == personummerAttTaBort) {
                            bestallningsLista.remove(i);
                            hittad = true;
                            System.out.println("Beställning borttagen!");
                            break;
                        }
                    }

                    if (!hittad) {
                        System.out.println("Ingen beställning hittades med det personumret.");
                    }
                    break;

                case 4:
                    System.out.println("Avbryter Program");
                    on = false;
                    break;
            }
        }
    }
}
