public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    Course quizm,quizk,quizf;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course quizm,Course fizik,Course quizf,Course kimya,Course quizk) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.quizf=quizf;
        this.quizk=quizk;
        this.quizm=quizm;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat,int quizm, int fizik,int quizf, int kimya,int quizk) {

        if (mat >= 0 && quizm>=0 && quizm<=100 && mat <= 100) {
            this.mat.note = mat;
            this.quizm.note=quizm;
        }

        if (fizik >= 0 && quizf>=0 && quizf<=100 && fizik <= 100) {
            this.fizik.note = fizik;
            this.quizf.note=quizf;
        }

        if (kimya >= 0 && quizk>=0 && quizk<=100 && kimya <= 100) {
            this.kimya.note = kimya;
            this.quizk.note=quizk;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş.");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = ( (this.fizik.note*0.8 +this.quizf.note*0.2) + (this.kimya.note*0.8+this.quizk.note*0.2) + (this.mat.note*0.8+this.quizm.note*0.2)) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Quiz : " + this.quizm.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Quiz : " + this.quizf.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Quiz : " + this.quizk.note);
    }

}