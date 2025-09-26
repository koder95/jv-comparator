package core.basesyntax;

import java.util.*;

public class EmployeeService {
    private static final Comparator<Employee> AGE_NAME_COMPARATOR = new Comparator<Employee>() {
        @Override
        public int compare(Employee first, Employee second) {
            return first == second || first.equals(second) ? 0
                    : first.getAge() > second.getAge() ? 1
                    : first.getAge() < second.getAge() ? -1
                    : first.getName() == null ? -1 : first.getName().compareTo(second.getName());
        }
    };

    public Set<Employee> getEmployeeByOrder(List<Employee> employees) {
        SortedSet<Employee> employeeSortedSet = new TreeSet<>(AGE_NAME_COMPARATOR);
        employeeSortedSet.addAll(employees);
        return employeeSortedSet;
    }
}
