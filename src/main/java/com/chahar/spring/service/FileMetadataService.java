package com.chahar.spring.service;

import org.springframework.messaging.support.GenericMessage;

import java.util.Date;

public class FileMetadataService {

    public GenericMessage execute1(GenericMessage message){
      System.out.println("FileMetadataService.execute1() called: " + message);

        try {
            Thread.sleep(5000);
        }catch (Exception e){
            System.out.println(e);
        }

      return message;
    }
}
