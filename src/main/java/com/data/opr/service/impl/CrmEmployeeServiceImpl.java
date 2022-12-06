package com.data.opr.service.impl;

import com.data.opr.entity.Employee;
import com.data.opr.mapper.CrmEmployeeMapper;
import com.data.opr.service.CrmEmployeeService;
import com.data.opr.service.ManageEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Huang Xianming
 * @date 2022-12-03-2:00
 */
@Service
public class CrmEmployeeServiceImpl implements CrmEmployeeService {
    @Autowired
    private CrmEmployeeMapper crmEmployeeMapper;

    /**
     * 增加crm系统初始数据
     */
    @Override
    public void addCrmEmployee() {
        ArrayList<Employee> crmEmployeeArrayList = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            crmEmployeeArrayList.add(new Employee(i,"name" + i,"department"
                    + (i % 3 == 0? 3:i % 3),1));
        }
        crmEmployeeMapper.addAll(crmEmployeeArrayList);
    }

    /**
     * 查询crm系统员工数据
     * @return crm系统员工数据集合
     */
    @Override
    public List<Employee> queryCrmEmployeeList() {
        return crmEmployeeMapper.getAllEmployeeFromCrmSys();
    }


    /**
     * 根据人事系统中查询的数据更新crm系统数据
     * @param list
     */
    @Override
    public void updateData(List<Employee> list) {
        crmEmployeeMapper.updateData(list);
    }
}
