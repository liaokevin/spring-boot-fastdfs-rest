package com.enjoysoft.fastdfsboot.web.api;

import com.enjoysoft.fastdfsboot.service.FastDfsService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by liaokevin on 2016/12/25.
 */
@RestController
@RequestMapping(value="/v1/fastdfs/")
@Api(value = "/v1/fastdfs", description = "FastClient API")
public class FastDfsController extends AbstractRestHandler{
    @Autowired
    private FastDfsService fastDfsService;

    @RequestMapping(value="",method = RequestMethod.GET,produces = {"application/json", "application/xml"})
    @ApiOperation(value = "Create a hotel resource.", notes = "Returns the URL of the new resource in the Location header.")
    public @ResponseBody String demo(){
        return "helloword";
    }

}
