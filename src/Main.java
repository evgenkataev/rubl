public class Main {
    public static void main(String[] args) {
        int account = 200;
        int pay = 1001;
        int percent;

        if (pay > 1000) {
            percent = 1;
        }else {
            percent = 0;
        }
        int bonus = pay/100*percent;
        int all = account+pay + bonus;
        System.out.println("Итого на вашем счете:" + all);
    }
}
