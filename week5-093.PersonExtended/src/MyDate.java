
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differneceInYears(MyDate compared) {
        // find out which date is smaller
        MyDate startDate = compared;
        MyDate endDate = this;
        
        if(earlier(compared)) {
            startDate = this;
            endDate = compared;
        }
        
        int difference = 0;
        
        if(endDate.month < startDate.month) {
            // not a complete year
            difference = 1;
        }   
        
        if(endDate.month == startDate.month) {
            if(endDate.day < startDate.day) {
                difference = 1;
            }
        }
        
        return endDate.year - startDate.year - difference;
    }
}
