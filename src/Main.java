import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Задание 1");
        int firstFriday = 2;
        int i = firstFriday;
        for(;i<=31;i+=7){
            System.out.println("Сегодня пятница " + i + "-е число. Необходимо подготовить отчет");
        }
        }
    }