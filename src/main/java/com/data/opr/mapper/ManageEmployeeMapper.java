package com.data.opr.mapper;



import com.data.opr.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Huang Xianming
 * @date 2022-12-02-19:19
 */
@Mapper
@Repository
public interface ManageEmployeeMapper {
    /**
     * 插入人事系统员工数据
     * @param manageEmployeeList 需要插入的人事系统员工数据
     */
    void insertAll(@Param(value = "mglist")List<Employee> manageEmployeeList);

    /**
     * 获取所有人事系统中的员工数据
     * @return 查询到的人事系统员工数据的集合
     */
    List<Employee> getAllEmployeeFromManageSys();
}
