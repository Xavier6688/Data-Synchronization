package com.data.opr.service;

import com.data.opr.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Huang Xianming
 * @date 2022-12-03-2:40
 */
@Service
public class DataOperation {
    @Autowired
    private CrmEmployeeService crmEmployeeService;

    @Autowired
    private ManageEmployeeService manageEmployeeService;

    public void syncDifferentDataWithManageSys(){
        //查询人事系统最新员工数据
        List<Employee> manageEmployeeList = manageEmployeeService.queryManageEmployee();
        //查询crm系统最新员工数据
        List<Employee> crmEmployeeList = crmEmployeeService.queryCrmEmployeeList();
        //人事系统对比crm系统更新或者增加的员工数据
        List<Employee> toUpdateList = manageEmployeeList.stream().
                filter(item -> !crmEmployeeList.contains(item)).collect(Collectors.toList());
        //执行crm系统的添加与更新的方法
        crmEmployeeService.updateData(toUpdateList);
    }
}
