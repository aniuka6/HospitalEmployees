public class Nurse extends Person{
    private int overtime;

    public int getOvertime() {
        return overtime;
    }

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }

    public Nurse(String name, String surname, int salary, int overtime) {
        super(name, surname, salary);
        this.overtime = overtime;
    }
    @Override
    public String getInfo(){
        return super.getInfo() + " Nadgodziny: "+ getOvertime() + " h";
}
}
