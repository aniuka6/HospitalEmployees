public class Doctor extends Person {
    private int premia;

    public int getPremia() {
        return premia;
    }

    public void setPremia(int premia) {
        this.premia = premia;
    }

    public Doctor(String name, String surname, int salary, int premia) {
        super(name, surname, salary);
        this.premia = premia;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +" Premia: " + getPremia() + " zł";
    }
}
