class Super {
    public void test() {
        System.out.println("Super");
    }

    public void function() {
        System.out.println("Not overrided");
    }
}

class Sub extends Super {
    public void test() {
        System.out.println("Sub");
    }
}

class Sub2 extends Sub {
}

class Main {
    public static void main(String[] args) {
        Super s = new Sub();
        s.test();
        s.function();

        Super s1 = new Sub();
        s1.test();
        s1.function();

        Sub2 s2 = new Sub2();
        s2.test();
        s2.function();
    }
}