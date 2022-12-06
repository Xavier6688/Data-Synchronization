import com.data.MyApplication;
import com.data.opr.service.CrmEmployeeService;
import com.data.opr.service.DataOperation;
import com.data.opr.service.ManageEmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Huang Xianming
 * @date 2022-12-02-23:53
 */
@SpringBootTest(classes = MyApplication.class)
public class applicationTest {
    @Autowired
    private ManageEmployeeService manageEmployeeService;

    @Autowired
    private CrmEmployeeService crmEmployeeService;

    @Autowired
    private DataOperation dataOperation;

    /**
     * 添加人事系统初始员工数据
     */
    @Test
    public void testAddManageEmployee(){
        manageEmployeeService.addManageEmployee();
    }

    /**
     * 添加crm系统初始数据
     */
    @Test
    public void testAddCrmEmployee(){
        crmEmployeeService.addCrmEmployee();
    }

    /**
     * 数据同步功能测试
     */
    @Test
    public void testSyncDataToCrm(){
        dataOperation.syncDifferentDataWithManageSys();
    }

}
