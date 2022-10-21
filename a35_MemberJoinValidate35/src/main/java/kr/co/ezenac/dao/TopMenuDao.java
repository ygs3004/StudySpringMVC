package kr.co.ezenac.dao;

import kr.co.ezenac.beans.BoardInfoBean;
import kr.co.ezenac.mapper.TopMenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TopMenuDao {

    @Autowired
    private TopMenuMapper topMenuMapper;


    public List<BoardInfoBean> getTopMenuList(){
        List<BoardInfoBean> topMenuList = topMenuMapper.getTopMenuList();
        return topMenuList;
    };

}
