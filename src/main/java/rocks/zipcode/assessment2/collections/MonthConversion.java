package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.Set;

/**
 * Use a map to solve
 */
public class MonthConversion {
    HashMap<Integer, String> monthsOfYear = new HashMap<>();

    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName   - name of month
     */
    public void add(Integer monthNumber, String monthName) {
        monthsOfYear.put(monthNumber, monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        return monthsOfYear.get(monthNumber);
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public Integer getNumber(String monthName) {
        Integer result = null;
        Set<Integer> keys = monthsOfYear.keySet();
        for (Integer i : keys) {
            if (monthsOfYear.get(i) == monthName) {
                result = i;
            }
        }
        return result;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        return monthsOfYear.containsKey(monthNumber);
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        return monthsOfYear.containsValue(monthName);
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return monthsOfYear.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName   - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        monthsOfYear.put(monthNumber, monthName);
    }
}
