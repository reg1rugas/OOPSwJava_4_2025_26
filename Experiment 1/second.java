class second {

    double area(int l) {
        return l * l; // Sq
    }

    double area(int l, int b) {
        return l * b; // REct
    }

    public static void main(String[] args) {

        second s = new second();

        System.out.println("Area of Sq: " + s.area(5));
        System.out.println("Area of Recte: " + s.area(4, 6));
    }
}
