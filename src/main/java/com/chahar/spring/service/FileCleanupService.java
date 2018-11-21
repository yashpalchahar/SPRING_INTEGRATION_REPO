package com.chahar.spring.service;

import org.springframework.messaging.support.GenericMessage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FileCleanupService {

    public void clean(GenericMessage message) throws IOException {
        //error -> move file from processing into error folder.
        //success -> move file from processing into archieve folder.


        System.out.println("FileCleanupService.clean() called " + message);

        File file = (File) message.getPayload();

        System.out.println("cleanup/migration started for " + file.getCanonicalPath());


        File successDir = new File(file.getParentFile().getParentFile().getPath()+"\\success");



        /*final StringBuilder builder = new StringBuilder(file.getName());
        final SimpleDateFormat sdf = new SimpleDateFormat("", Locale.getDefault());
        builder.append("_");
        builder.append(sdf.format(new Date()));*/


    }

}
