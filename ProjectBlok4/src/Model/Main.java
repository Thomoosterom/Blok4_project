package Model;

public class Main {
    public static void main(String[] args) throws Exception {
        Klas k = new Klas("V1a");
        Klas.setKlas(k);

        Student k1 = new Student("Thom", "thom.oosterom@student.hu.nl", "thomoosterom", "test");
        k.VoegStudentToe(k1);




    }

}
