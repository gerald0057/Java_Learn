public class Variable {
    public static void main(String[] args) {
        int value_x = 100;
        System.out.println("Value X: " + value_x);
        value_x = 200;
        System.out.println("Value X (new): " + value_x);
        int value_y = value_x;
        System.out.println("Value Y (from Value X): " + value_y);

        int value_int_max = Integer.MAX_VALUE;
        System.out.println("Value int_max: " + value_int_max);

        int value_int_min = Integer.MIN_VALUE;
        System.out.println("Value int min: " + value_int_min);

        int value_huge = 2_000_000_000;
        System.out.println("Value huge: " + value_huge);

        char a = 'A';
        char zh = '中';
        System.out.println(a);
        System.out.println(zh);

        {
            {
                int value_scope_demo = 100;
                System.out.println("Value value_scope_a: " + value_scope_demo);
            }
            int value_scope_demo = 200;
            System.out.println("Value value_scope_a: " + value_scope_demo);
        }
        int value_scope_demo = 300;
        System.out.println("Value value_scope_a: " + value_scope_demo);
    }
}
