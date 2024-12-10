public class One_to_Hundred {
    public static void main(String[] args) {
        int num = 15;
        boolean istrue = false;
        for (int i = 2; i <= num / 2; i++) {
            if (i % num == 0) {
                istrue = true;
                break;
            }

        }
        if (istrue) {
            System.out.println(num + "is a prime");

        } else {
            System.out.println(num + "is not a prime");
        }
    }
}
