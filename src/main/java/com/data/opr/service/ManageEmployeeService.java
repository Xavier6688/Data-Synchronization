package com.data.opr.service;

import com.data.opr.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Huang Xianming
 * @date 2022-12-02-21:34
 */
@Service
public interface ManageEmployeeService {
    /**
     * 用来批量插入人事系统员工数据（在创建初始数据的时候使用）
     */
    void addManageEmployee();

    /**
     * 查询人事系统所有员工数据
     * @return 查询到的人事系统所有员工数据集合
     */
    List<Employee> queryManageEmployee();
}
