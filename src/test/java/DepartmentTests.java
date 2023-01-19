import management.Department;
import management.employees.Manager;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DepartmentTests {
    @Test
    public void departmentTest() {
        Manager manager = new Manager(5001, "Karl-Heinz Geye", 5000, 0.2);

        Department department = new Department("AE", manager);

        assertEquals("AE", department.getName());
        assertEquals(manager, department.getLeader());

        Manager newManager = new Manager(5002, "Hans Böckler", 5100, 0.2);

        assertEquals(newManager, department.getLeader());
    }
}