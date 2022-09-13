package Package;

public class Calculator {
    public int value1;
    public int value2;
    public int value3;

    public Calculator(int value1, int value2, int value3){
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;

    }
    public int solution (){
        return this.value1 * this.value2 + this.value3;
    }

}
