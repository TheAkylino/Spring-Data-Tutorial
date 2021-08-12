package com.example.utility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Utils {


    public static String getTime() {
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        return sdfDate.format(now);
    }

    public static String getSessionId() {
        String sessionId = "";
        try {
            UUID uuid = UUID.randomUUID();
            MD5Hash md5Hash = new MD5Hash();
            sessionId = md5Hash.doHash(uuid.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sessionId;
    }

    public static String getClientName() {
        return "Api-Demo-v1-App";
    }
}
