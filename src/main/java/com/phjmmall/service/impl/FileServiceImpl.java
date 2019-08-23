package com.phjmmall.service.impl;

import com.google.common.collect.Lists;
import com.phjmmall.service.IFileService;
import com.phjmmall.util.FTPUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @program: phjmmall
 * @description:
 * @author: Panhuijuan
 * @create: 2019-08-21 21:11
 **/
@Service("iFileService")
public class FileServiceImpl implements IFileService {

    private Logger logger = LoggerFactory.getLogger(FileServiceImpl.class);


    public String upload(MultipartFile file, String path) {
        System.out.println(FileServiceImpl.class + " upload inter");
        String fileName = file.getOriginalFilename();
        System.out.println(FileServiceImpl.class + " upload fileName:"+fileName);

        //扩展名 acb.jpg
        String fileExtensionName = fileName.substring(fileName.lastIndexOf("."));
        String uplaodFileName = UUID.randomUUID().toString()+ "." + fileExtensionName;
        System.out.println(FileServiceImpl.class + " uplaodFileName:" + uplaodFileName);
        logger.info("开始上传文件，上传文件的文件名:{}，上传的路径:{}，新文件名:{}",fileName, path, uplaodFileName);

        File fileDir = new File(path);
        if ( !fileDir.exists()) {
            fileDir.setWritable(true);
            fileDir.mkdirs();
        }
        File targetFile = new File(path, uplaodFileName);

        try {
            file.transferTo(targetFile);
            //文件已上传成功
            //将targetFile上传到我们的FTP服务器上
            FTPUtil.uploadFile(Lists.newArrayList(targetFile));

            // 上传完之后，删除upload下面的文件
            targetFile.delete();

        } catch (IOException e) {
            logger.error("上传文件异常",e);
            return null;
        }
        return targetFile.getName();


    }
}
