public class Number implements ZeroArgument<Integer>, OneArgument<Integer>, TwoArguments<Integer> {

    @Override
    public Integer zero() {
        return 5;
    }

    @Override
    public Integer one(Integer parameter) {
        return 5 * parameter;
    }

    @Override
    public Integer two(Integer parameter, Integer parameter2) {
        return 5 * (parameter + parameter2);
    }
}