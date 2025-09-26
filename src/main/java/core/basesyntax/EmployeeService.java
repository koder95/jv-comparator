package core.basesyntax;

import java.util.*;

public class EmployeeService {
    private static final Comparator<Employee> AGE_NAME_COMPARATOR = Comparator
            .comparingInt(Employee::getAge)
            .thenComparing(Employee::getName, Comparator.nullsFirst(String::compareTo));

    public Set<Employee> getEmployeeByOrder(List<Employee> employees) {
        SortedSet<Employee> employeeSortedSet = new TreeSet<>(AGE_NAME_COMPARATOR);
        if (employees != null) {
            employeeSortedSet.addAll(employees);
        }
        return employeeSortedSet;
    }
}
