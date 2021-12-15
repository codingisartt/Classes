public class Employee{
    String name;
    double Salary;
    int workHours;
    int hireYear;

    public Employee(String name, int Salary, int workHours, int hireYear){
        this.name=name;
        this.Salary=Salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }
    public double tax(){
        if(this.Salary>1000){
            double tax=(this.Salary*0.03);
            return tax;
        }
        return 0;
        
    }
    public double bonus(){
        if(this.workHours>40){
            double bonus=(this.workHours-40)*30;
            return bonus;

        }
        return 0;
    }
    public double raiseSalary(){
        int year=2021-hireYear;
        if(year<=9){
            double raising=this.Salary*0.05;
            return  raising;
        }else if(year>9 && year<=19){
            double raising=this.Salary*0.1;
            return  raising;
        }else {
            double raising=this.Salary*0.15;
            return  raising;
        }
        
    }
    void printInfo(){
        System.out.println("Adı: "+this.name+"\n"+
                            "Maaşı: "+this.Salary+"\n"+
                            "Çalışma Saati: "+this.workHours+"\n"+
                            "Başlangıç Yılı: "+this.hireYear);
        System.out.println("Vergi: "+tax()); 
        System.out.println("Bonus: "+bonus()); 
        System.out.println("Maaş Artışı: "+raiseSalary()); 
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: "+(this.Salary+bonus()-tax()));
        System.out.println("Toplam Maaş: "+(Salary+bonus()+raiseSalary()-tax()));
    }
    
}