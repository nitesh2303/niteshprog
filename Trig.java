public class Trig { 
    public static void main(String[] args) {
        double degrees = Double.parseDouble(args[0]);
        double radians = Math.toRadians(degrees);
		System.out.println("Entered degree in radian is= " + radians);

        double s = Math.sin(radians);
        System.out.println("sin(" + degrees + ") = " + s);

        double c = Math.cos(radians);
        System.out.println("cos(" + degrees + ") = " + c);

        double t = Math.tan(radians);
        System.out.println("tan(" + degrees + ") = " + t);
        
    }
}