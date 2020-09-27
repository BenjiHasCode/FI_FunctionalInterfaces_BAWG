public class Text implements ZeroArgument<String>, OneArgument<String>, TwoArguments<String> {
    @Override
    public String zero() {
        return "Zero";
    }

    @Override
    public String one(String parameter) {
        return parameter;
    }

    @Override
    public String two(String parameter, String parameter2) {
        return parameter + " " + parameter2;
    }
}