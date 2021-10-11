public class Engine {

    public static String calculate(Number first, Number second, String action) throws Exception {

        int result;

        switch (action) {
            case "+":
                result = first.getValue() + second.getValue();
                break;
            case "-":
                result = first.getValue() - second.getValue();
                break;
            case "*":
                result = first.getValue() * second.getValue();
                break;
            case "/":
                result = first.getValue() / second.getValue();
                break;
            default:
                throw new Exception("Wrong operation symbol. Quiting...");

        }

        if (first.getType() == NumberType.ROMAN) {
            return TypeDetection.toRomanNumber(result);
        } else return String.valueOf(result);
    }
}
