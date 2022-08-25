package io.marwin1991.testfactory;

import java.util.List;

/**
 * Static class with extension methods for reports about employer' performance during the work
 */
public class CompanyResultBoard {

    /**
     * Returns a collection of all employers, sorted by their result (from highest to lowest)
     *
     */
    public static List<Employer> getRankedEmployer(List<Employer> employers) {
        throw new RuntimeException("Not impl");
    }

    /**
     * Returns a collection of all employers, from given department, sorted by their score (from highest to lowest)
     */
    public static List<Employer> getRankedEmployerInDepartment(List<Employer> employers, Employer.Department department) {
        throw new RuntimeException("Not impl");
    }

    /**
     * Returns the department that has the greatest result scored by its employers
     */
    public static Employer.Department getBestDepartment(List<Employer> employers) {
        throw new RuntimeException("Not impl");
    }


    /**
     * Returns amount of retired employers
     */
    public static int getRetiredEmployers(List<Employer> employers) {
        throw new RuntimeException("Not impl");
    }

    /**
     * Returns full result board string for list (see the example)
     */
    public static String getResultBoard(List<Employer> players) {
        // Department SALSE Adam Result: 20
        // Department HR Eve Points: 10
        // Department FACTORY Abel Points: 5 RETIRED

        throw new RuntimeException("Not impl");
    }

}
