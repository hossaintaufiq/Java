public class random_choose {
    public static void main(String[] args) {

        // int random = (int)(min+Math.random()*(max-min+1))

        int random = (int) (5 + Math.random() * (10 - 5 + 1));
        System.out.println(random);
    }
}
