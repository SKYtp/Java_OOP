public class Tax {
    private int filingStatus;
    private double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
    private int[][] brackets = {
        {8350, 33950, 82250, 171550, 372950}, // Single filer
        {16700, 67900, 137050, 20885, 372950}, // Married jointly or qualifying widow(er)
        {8350, 33950, 68525, 104425, 186475}, // Married separately
        {11950, 45500, 117450, 190200, 372950} // Head of household
    };
    private double taxableIncome;
    private double tax = 0;
    Tax(){
        
    }
    Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome){
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }
    public double getTax(){
        if(taxableIncome >= brackets[filingStatus][0]){ //1
            tax += (brackets[filingStatus][0] * rates[0]);
        }
        if(taxableIncome >= brackets[filingStatus][0]){ //2
            if(taxableIncome >= brackets[filingStatus][0] && taxableIncome < brackets[filingStatus][1]){
                tax += (taxableIncome - brackets[filingStatus][0]) * rates[1];
            }
            else{
                tax += (brackets[filingStatus][1] - brackets[filingStatus][0]) * rates[1];
            }
        }
        if(taxableIncome >= brackets[filingStatus][1]){ //3
            if(taxableIncome >= brackets[filingStatus][1] && taxableIncome < brackets[filingStatus][2]){
                tax += (taxableIncome - brackets[filingStatus][1]) * rates[2];
            }
            else{
                tax += (brackets[filingStatus][2] - brackets[filingStatus][1]) * rates[2];
            }
        }
        if(taxableIncome >= brackets[filingStatus][2]){ //4
            if(taxableIncome >= brackets[filingStatus][2] && taxableIncome < brackets[filingStatus][3]){
                tax += (taxableIncome - brackets[filingStatus][2]) * rates[3];
            }
            else{
                tax += (brackets[filingStatus][3] - brackets[filingStatus][2]) * rates[3];
            }
        }
        if(taxableIncome >= brackets[filingStatus][3]){ //5
            if(taxableIncome >= brackets[filingStatus][3] && taxableIncome < brackets[filingStatus][4]){
                tax += (taxableIncome - brackets[filingStatus][3]) * rates[3];
            }
            else{
                tax += (brackets[filingStatus][4] - brackets[filingStatus][3]) * rates[4];
            }
        }
        if(taxableIncome >= brackets[filingStatus][4]){ //6
            tax += (taxableIncome - brackets[filingStatus][4]) * rates[5];
        }
        return tax;
    }
    public void setBrackets(int[][] brackets){
        this.brackets = brackets;
    }
    public void setRates(double[] rates){
        this.rates = rates;
    }
    public void setStatus(int status){
        this.filingStatus = status;
    }
    public void setIncom(double taxableIncome){
        this.taxableIncome = taxableIncome;
    }
}
