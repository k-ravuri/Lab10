/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/10/">Lab 10 Description</a>
 */
public class Employee {

    /**
     *
     */
    private String name;
    /**
     *
     */
    private String manager;

    /**
     * Constructor for initialization.
     * @param n given,
     * @param m given.
     */
    public Employee(final String n, final String m) {
        this.name = n;
        this.manager = m;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param s we need.
     */
    public void setName(final String s) {
        this.name = s;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param s we need.
     */
    public void setManager(final String s) {
        this.manager = s;
    }
}
