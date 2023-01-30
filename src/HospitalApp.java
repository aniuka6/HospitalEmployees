public class HospitalApp {
    public static void main(String[] args){
        Hospital hospital = new Hospital();
        hospital.add(new Doctor("Anna", "Kot", 5640, 453));
        hospital.add(new Nurse("Ola", "Kowalska", 4532, 54));
        hospital.add(new Nurse("Konrad", "Kowal", 4322, 24));

        System.out.println("Pracownicy Szpitala: ");
        System.out.println(hospital.getInfo());
    }
}
