package com.foxconn.menu.mapper;

import com.foxconn.menu.model.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
//@Repository
public interface MenuMapper {
    @Select("SELECT A.M_NO, A.M_NAME, A.M_TYPE, A.ABSOLUTE_URL\n" +
        "  FROM SYS_MENU A\n" +
        " WHERE A.M_UPNO = #{M_UPNO}\n" +
        " ORDER BY A.RES_ORDER")
    public List<Menu> findByUpMenuNo(String M_UPNO);
}
