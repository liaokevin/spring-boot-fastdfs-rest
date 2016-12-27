package com.enjoysoft.fastdfsboot.misc;

import org.apache.commons.lang3.StringUtils;
import org.csource.fastdfs.ClientGlobal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;


/**
 * Created by liaokevin on 2016/12/24.
 */
@Component
//@Order(value = 1)
public class ApplicationLoader implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(ApplicationLoader.class);
    @Override
    public void run(String... strings) throws Exception {
     fastDfsClientInit();
    }

    private void fastDfsClientInit() throws IOException{
        String fastDfsClientConf = System.getProperty("FASTDFS_CONF");//read from system environment
        Resource conf = null;
        if(StringUtils.isNotBlank(fastDfsClientConf)){
            try {
                conf = new FileSystemResource(fastDfsClientConf);
            }catch(Exception e){
                e.printStackTrace();
                logger.error("从【{}】读取FastDFS客户端配置失败!...", fastDfsClientConf);
                conf = new ClassPathResource("/fastdfs_client.conf");//读取默认的fastdfs配置
            }
        }else{
            conf = new ClassPathResource("/fastdfs_client.conf");//读取默认的fastdfs配置
        }
        logger.debug("从【{}】初始化FastDFS客户端配置...",conf.getFile().getAbsolutePath());
        //加载配置文件的方式
        String configFileName = conf.getFile().getAbsolutePath();
        try {
            ClientGlobal.init(configFileName);
        } catch (Exception e) {
            logger.error("FastDFS客户端初始化失败[{}]",e.getMessage());
            e.printStackTrace();
        }

    }

}
