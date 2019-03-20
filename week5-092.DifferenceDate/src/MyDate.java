public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
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
    
    private boolean leapYear(int year) {
        boolean leap = false;
        
        if(year%4 == 0) {
            if(year%100 == 0) {
                if(year%400 == 0) {
                    leap = true;
                }
            }
            else {
                leap = true;
            }
        }
        return leap;
    }

    // model approach
    /*
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
 
    public int differenceInYears(MyDate compared) {
        if (this.earlier(compared)) {
            return differenceWhenThisEarlier(compared);
        }
        
        int minusOneYear = 0;
        if (this.month < compared.month) {
            minusOneYear = 1; 
        } else if (this.month == compared.month && this.day < compared.day) {
            minusOneYear = 1; 
        }
 
        return this.year - compared.year - minusOneYear;
    }
 
    private int differenceWhenThisEarlier(MyDate compared) {
        int minusOneYear = 0;
 
        if (compared.month < this.month) {
            minusOneYear = 1;
        } else if (compared.month == this.month && compared.day < this.day) {
            minusOneYear = 1;
        }
 
        return compared.year - this.year - minusOneYear;
    }    
    */
    public int differenceInYears(MyDate comparedDate) {
        // first figure out which is the start date which is the end date
        MyDate firstDate = null;
        MyDate secondDate = null;
        boolean leapYear = false;
        
        if(comparedDate.year > this.year) {
            firstDate = this;
            secondDate = comparedDate;
        }
        else if(this.year > comparedDate.year) {
            firstDate = comparedDate;
            secondDate = this;
        }
        else {
            return 0;
        }
        
        int days = 0;
        
        // add first year's days
        if(firstDate.month != 12) {
            for(int i=firstDate.month + 1; i<=12; i++) {
                if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                    days += 31;
                }
                else {
                    if(i == 2) {
                        if(leapYear(firstDate.year)) {
                            days += 29;
                            leapYear = !leapYear;
                        }
                        else {
                            days += 28;
                        }
                    }
                    else {
                        days += 30;
                    }
                }
            }
        }
        
        if(firstDate.month == 1 || firstDate.month == 3 || 
                firstDate.month == 5 || firstDate.month == 7 || 
                firstDate.month == 8 || firstDate.month == 10 || firstDate.month == 12) {
            days += (31 - firstDate.day);
        }
        else {
            if(firstDate.month == 2) {
                if(leapYear(firstDate.year)) {
                    days += (29 - firstDate.day);
                    leapYear = !leapYear;
                }
                else {
                    days += (28 - firstDate.day);
                }
            }
            else {
                days += (30 - firstDate.day);
            }
        }
        
        for(int i=firstDate.year+1; i<= secondDate.year - 1; i++) {
            // get time till 30.12.year
            days += 7 * 31;
            days += 4 * 30;
            if(leapYear(i)) {
                days += 29;
                leapYear = !leapYear;
            }
            else {
                days += 28;
            }
        }
        
        if(secondDate.month != 1) {
            for(int i=1; i<secondDate.month; i++) {
                if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                    days += 31;
                }
                else {
                    if(i == 2) {
                        if(leapYear(firstDate.year)) {
                            days += 29;
                            leapYear = !leapYear;
                        }
                        else {
                            days += 28;
                        }
                    }
                    else {
                        days += 30;
                    }
                }
            }
        }
        days += secondDate.day;
        return (days/365);
    }
}
