class Computer {
    private String name;

    Computer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int addNums(int a, int b) {
        return a + b;
    }

    public int addNums(int a, int b, int c) {
        return a + b + c;
    }
}

class MethodOverriding {
    public static void main(String[] args) {
        System.out.println("Hello This is Method Overriding Example");
        Computer comp = new Computer("APJ");
        System.out.println(comp.addNums(2, 4));
        System.out.println(comp.addNums(1, 5, 6));
    }
}

    