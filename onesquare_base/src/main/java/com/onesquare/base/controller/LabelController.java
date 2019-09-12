package com.onesquare.base.controller;

import com.onesquare.base.pojo.Label;
import com.onesquare.base.service.LabelService;
import com.entity.Result;
import com.entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/label")
//解决跨域
@CrossOrigin
//白名单设置
//@CrossOrigin({"",""})
public class LabelController {

    @Autowired
    private LabelService labelService;

    //查询所有
    @RequestMapping(method = RequestMethod.GET)
    public Result findAll(){
        return new Result(true, StatusCode.OK,"查询成功",labelService.findAll());
    }

    //查询一个
    @RequestMapping(value="/{id}")
    public Result findById(@PathVariable  String id){
        return new Result(true, StatusCode.OK, "查询成功", labelService.findById(id));
    }

    //新增一个
    @RequestMapping(method = RequestMethod.POST)
    public Result add(@RequestBody  Label label){
        labelService.add(label);
        return new Result(true, StatusCode.OK, "添加成功");
    }

    //更新一个
    @RequestMapping(value="/{id}",method = RequestMethod.PUT)
    public Result update(@PathVariable String id, @RequestBody Label label){
        label.setId(id);//以url中的id为主
        labelService.update(label);
        return new Result(true, StatusCode.OK, "修改成功");
    }

    //删除一个
    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public Result deleteById(@PathVariable  String id){
        labelService.delete(id);
        return new Result(true, StatusCode.OK, "删除成功");
    }


}
