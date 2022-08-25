package io.marwin1991.testfactory;

public class Employer {

    private String name;
    private Department department;

    private int perDayInput;
    private int daysOff;

    private boolean retired;

    /**
     * Returns employer result which is perDayInput multiplay by (20 - daysOff) if daysOff is 0 plus 5
     */
    public int getResult() {
        throw new RuntimeException("Not impl");
    }


    public enum Department {
        SALES, HR, FACTORY
    }

}
