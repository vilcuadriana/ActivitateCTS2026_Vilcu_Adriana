package ro.ase.cts.main;

import ro.ase.cts.clase.ProbaOrala;
import ro.ase.cts.clase.ProbaScrisa;
import ro.ase.cts.clase.Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Petrisor");
        student1.examinare();

        student1.setModSustinere(new ProbaOrala());
        student1.examinare();

        student1.setModSustinere(new ProbaScrisa());
        student1.examinare();
    }
}
