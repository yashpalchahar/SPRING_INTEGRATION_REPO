package com.chahar.spring.service;

import org.springframework.messaging.support.GenericMessage;

import java.util.Date;

public class FileImporterService {

    public GenericMessage doImport(GenericMessage message){
        System.out.println("FileImporterService.doImport() called " + message);

        try {
            Thread.sleep(10000);
        }catch (Exception e){
            System.out.println(e);
        }

        return message;
    }

}
