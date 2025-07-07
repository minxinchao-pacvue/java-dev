package org.example.database.dao;

import com.mybatisflex.core.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.example.database.dto.StudentDto;
import org.example.database.entity.Company;
import org.example.database.entity.Student;

import java.util.List;

public interface CompanyMapper extends BaseMapper<Company> {


}