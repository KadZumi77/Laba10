import lab_10.Faculty;
import lab_10.Institute;
import lab_10.ResearchAssociate;

public class Main {

    public static void main(String[] args) {
        Faculty fkn = new Faculty("ФКН");
        Institute toizi = new Institute("ТОиЗИ", "297");
        Institute is = new Institute("ИС", "387");
        Institute tst = new Institute("ЦТ", "311п");
        Institute itu = new Institute("ИТУ", "312п");
        Institute piit = new Institute("ПиИТ", "380");
        fkn.setInstitutes(new Institute[]{toizi, is, tst, itu, piit});
        ResearchAssociate emp1 = new ResearchAssociate(1234, "Соломатин Дмитрий Иванович",
                "защита информации");
        ResearchAssociate emp2 = new ResearchAssociate(1234, "Чекмарёв Андрей Игоревич",
                "моделирование систем");
        ResearchAssociate emp3 = new ResearchAssociate(1234, "Нужных Алексей Васильевич",
                "интеллектуальные системы");
        piit.setEmployees(new ResearchAssociate[]{emp1, emp2, emp3});
        Institute[] fkn_institutes = fkn.getInstitutes();
        System.out.println("Кафедры на факультете " + fkn.getName() + ": \n");
        for (int i = 0; i < fkn_institutes.length; i++) {
            System.out.println(fkn_institutes[i].getName());
        }
        System.out.println("\n");
        ResearchAssociate[] piitEmployees = piit.getEmployees();
        System.out.println("Сотрудники кафедры " + piit.getName() + ": \n");
        for (int i = 0; i < piitEmployees.length; i++) {
            System.out.println(piitEmployees[i].getName());
        }
    }
}
