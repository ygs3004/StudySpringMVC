package kr.co.ezenac.mapper;

import kr.co.ezenac.beans.BoardInfoBean;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TopMenuMapper {

    @Select("select board_info_idx, board_info_name from board_info_table order by board_info_idx")
    public List<BoardInfoBean> getTopMenuList();
}
