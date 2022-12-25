public class Employee {
    String name;
    double salary;
    int WorkHours;
    int HireYear;


    public Employee(String name, double salary, int WorkHours, int HireYear) {
        this.name = name;
        this.salary = salary;
        this.HireYear = HireYear;
        this.WorkHours = WorkHours;


    }

    //maaşa uygulanan vergiyi hesaplamak için tax
    /*  Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.
tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
toString() : Çalışana ait bilgileri ekrana bastıracaktır.*/
    double tax() {
        if (this.salary < 1000) {
            System.out.println("vergi uygulanmamıştır");
            return 0;

        } else {
            return this.salary * 0.03;

        }

    }

    double bonus() {
        if (this.WorkHours >= 40) {
            return (this.WorkHours - 40) * 30;

        } else
            return 0;

    }

    double raiseSalary() {
        int referenceYear = 2022;
        if (referenceYear - this.HireYear < 10) {
            return (this.salary * 0.05);

        } else if (referenceYear - this.HireYear > 9 && referenceYear - this.HireYear < 20) {
            return (this.salary * 0.10);

        } else if (referenceYear - this.HireYear > 20) {
            return (this.salary * 0.15);

        }
        return 0;
    }
        void print(){
            System.out.println("name="+this.name);
            System.out.println("salary="+this.salary);
            System.out.println("WorkHour="+this.WorkHours);
            System.out.println("HireYear="+this.HireYear);
            System.out.println("tax="+this.tax());
            System.out.println("bonus="+this.bonus());
            System.out.println("raiseSalary="+this.raiseSalary());
            double semiTotal=this.salary+this.bonus()-this.tax();
            System.out.println("salary with tax and bonus"+semiTotal);
            double totalSalary=this.salary+this.bonus()+this.raiseSalary()-this.tax();
            System.out.println("total salary="+totalSalary);
        }


    }


