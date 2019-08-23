package com.phjmmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author: Panhuijuan
 * @create: 2019-08-21 21:11
 **/
public interface IFileService {
    String upload(MultipartFile file, String path);
}
