package com.data.opr.service;

import com.data.opr.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Huang Xianming
 * @date 2022-12-03-1:46
 */

@Service
public interface CrmEmployeeService {
    /**
     * 用来批量插入crm系统员工数据（在创建初始数据的时候使用）
     */
    void addCrmEmployee();

    /**
     * 获取crm系统全部员工数据
     * @return
     */
    List<Employee> queryCrmEmployeeList();

    /**
     * crm系统插入查询到的需要进行更新和添加的员工数据
     * @param list
     */
    void updateData(List<Employee> list);
}
