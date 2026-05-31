/*
 * You may have a collection of Employee objects and,
 * in one place of your application, you want to remove all such employees whose age is below 50,
 * while in other place, you want to remove all such employees whose salary is above 100,000.
 * In both the cases, you want to go through your collection of employees,
 * and check each Employee object to determine if it fits the criteria.
 * This can be implemented by writing an interface named CheckEmployee and having a method check(Employee )
 * which would return true if the passed object satisfies the criteria.
 * */
@FunctionalInterface
public interface CheckEmployee {
    public abstract boolean check ();
}
