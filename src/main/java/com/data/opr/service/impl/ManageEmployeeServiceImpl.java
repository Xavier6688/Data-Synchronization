package com.data.opr.service.impl;



import com.data.opr.entity.Employee;
import com.data.opr.mapper.ManageEmployeeMapper;
import com.data.opr.service.ManageEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Huang Xianming
 * @date 2022-12-02-19:18
 */
@Service
public class ManageEmployeeServiceImpl implements ManageEmployeeService {
    @Autowired
    private ManageEmployeeMapper manageEmployeeMapper;


    /**
     * 增加人事系统初始数据
     */
    @Override
    public void addManageEmployee() {
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        for (int i = 1; i <= 11000; i++) {
            employeeArrayList.add(new Employee(i,"name" + i,"department"
                    + (i % 3 == 0? 3:i % 3),1));
        }
        manageEmployeeMapper.insertAll(employeeArrayList);
    }

    /**
     * 查询人事系统员工数据
     * @return 人事系统员工数据集合
     */
    @Override
    public List<Employee> queryManageEmployee() {
        return manageEmployeeMapper.getAllEmployeeFromManageSys();
    }

}
