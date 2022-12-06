package com.data.opr.mapper;

import com.data.opr.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Huang Xianming
 * @date 2022-12-03-2:03
 */
@Mapper
@Repository
public interface CrmEmployeeMapper {
    /**
     * 插入crm系统员工数据
     * @param CrmEmployeeList 需要插入的crm系统员工数据
     */
    void addAll(@Param(value = "crmlist")List<Employee> CrmEmployeeList);

    /**
     * 获取所有crm系统中的员工数据
     * @return 查询到的crm系统员工数据的集合
     */
    List<Employee> getAllEmployeeFromCrmSys();

    void updateData(@Param("dflist") List<Employee> list);
}
