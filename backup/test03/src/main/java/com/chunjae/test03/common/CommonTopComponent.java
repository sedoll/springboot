package com.chunjae.test03.common;

import com.google.gson.JsonObject;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.MediaType;
import java.io.IOException;
import java.io.PrintWriter;

public abstract class CommonTopComponent {
    protected void writeResponse(HttpServletResponse res, JsonObject jsonObject) throws IOException {
        writeResponse(res, jsonObject.toString());
    }

    protected void writeResponse(HttpServletResponse res, String message) throws IOException{
        res.setHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE);
        PrintWriter pw = res.getWriter();
        pw.write(message);
        pw.close();
    }
}
