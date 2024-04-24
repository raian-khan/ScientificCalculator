package sci_cal;

public class History {
    private double num1, num2, result;
    private String opr;
    private boolean singleNum;
    private boolean isBooleanAlgebra = false;

    public History(double num1, double num2, double result, String opr) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
        this.opr = opr;
        this.singleNum = false;
    }

    public History(double num1, String opr, double result) {
        this.num1 = num1;
        this.opr = opr;
        this.result = result;
        this.singleNum = true;
    }
    
    
    public String show(){
        String out;
        if(!singleNum){
            out = String.format("%s %s %s = %s", Double.toString(num1), opr, Double.toString(num2), Double.toString(result));
            
        }
        else{
            if(isBooleanAlgebra)
            {
                out = String.format("%s %s = %s", opr, Integer.toString((int) num1), Integer.toString((int) result));
                
            }
            else{
                out = String.format("%s %s = %s", opr, Double.toString(num1), Double.toString(result));
            
            }
        }
        return out;
    }

    public void setIsBooleanAlgebra(boolean isBooleanAlgebra) {
        this.isBooleanAlgebra = isBooleanAlgebra;
    }
}
