class ParameterizedConstructor {
    int value;

    // Parameterized constructor
    public ParameterizedConstructor(int val) {
        value = val;
        System.out.println("Parameterized constructor called with value: " + value);
    }

    public static void main(String[] args) {
        ParameterizedConstructor obj = new ParameterizedConstructor(42);
    }
}
