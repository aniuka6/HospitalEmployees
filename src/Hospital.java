public class Hospital {
    private static final int MAX_EMPLOYEES = 3;

    private Person[] persons = new Person[MAX_EMPLOYEES];
    private int personsNumber = 0;

    void add(Person person) {
        if (personsNumber < MAX_EMPLOYEES) {
            persons[personsNumber] = person;
            personsNumber++;
        }
    }
    String getInfo(){
        String result = "";
        for (int i = 0; i < personsNumber; i++) {
            result = result + persons[i].getInfo() + "\n";
        }
        return result;
//    public static void main(String[] args) {
//        Person[] persons = new Person[3];
//        persons[0] = new Doctor("Anna", "Kolodizej", 2400, 450);
//        persons[1] = new Nurse("Alex", "Kop", 4500, 34);
//        persons[2] = new Nurse("Tom", "Kopec", 6700, 20);
//
//        for (Person person : persons){
//            person.getInfo();
    }
        }

