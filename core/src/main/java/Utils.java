
public class Utils {
    public boolean isAllPositiveNumbers(String... str) {
        StringUtils stringUtils = new StringUtils();
        for (String value : str) {
            if (!stringUtils.isPositiveNumber(value)) {
                return false;
            }
        }
        return true;
    }
}
