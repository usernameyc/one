package com.onesquare.base.service;

import com.onesquare.base.dao.LabelDao;
import com.onesquare.base.pojo.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.utils.IdWorker;

import java.util.List;

/**
 * service代码
 */
@Service
public class LabelService {

    @Autowired
    private LabelDao  labelDao;

    @Autowired
    private IdWorker idWorker;

    /**
     * 查询所有
     */
    public List<Label> findAll(){
        return labelDao.findAll();
    }
    /**
     * 查询一个
     */
    public Label findById(String id){
        return labelDao.findById(id).get();
    }

    /**
     * 新增一个
     */
    public void add(Label label){
        //设置雪花id
        label.setId(idWorker.nextId()+"");
        labelDao.save(label);
    }

    /**
     * 更新一个
     */
    public void update(Label label){
        labelDao.save(label);
    }

    /**
     * 删除一个
     */
    public void delete(String id){
        labelDao.deleteById(id);
    }
}
