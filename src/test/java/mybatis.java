import com.sguigu.entity.Employee;
import com.sguigu.entity.controller.EmployeeController;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class mybatis {
    @Autowired
    private EmployeeController employeeController;

    @Test
    public void test() {


        List<Employee> list = employeeController.emps();
        for (Employee e : list
                ) {
            System.out.println(e.toString());
        }
    }
}
