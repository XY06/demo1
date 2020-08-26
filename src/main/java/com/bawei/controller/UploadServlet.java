/*
package com.bawei.controller;

import org.apache.commons.io.FilenameUtils;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileItemFactory;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller

public class UploadServlet {
    @RequestMapping(value="/upload", method = RequestMethod.POST)
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 验证请求是否满足要求（post 请求 / enctype 是否以multipart打头
        boolean isMultipart = ServletFileUpload.isMultipartContent(req);
        // 如果不满足要求就立即结束对该请求的处理
        if (!isMultipart) {
            return;
        }

        try {
            // FileItem 是表单中的每一个元素的封装
            // 创建一个 FileItem 的工厂类
            FileItemFactory factory = new DiskFileItemFactory();
            // 创建一个文件上传处理器（装饰设计模式）
            ServletFileUpload upload = new ServletFileUpload(factory);
            // 解析请求
            List<FileItem> items = upload.parseRequest((RequestContext) req);
            for (FileItem fileItem :
                    items) {
                // 判断空间是否是普通控件
                if (fileItem.isFormField()) {
                    // 普通控件
                } else {
                    // 上传控件
                    String contentType = fileItem.getContentType();
                    if (!contentType.startsWith("image/")) {
                        // 实现简单的错误提示
                        req.setAttribute("errorMsg", "亲，您上传的文件格式不正确，请重新上传！");
                        req.getRequestDispatcher("upload.jsp").forward(req, resp);
                        return;  // 如果不是图片类型则不再对请求进行处理
                    }
                    // 随机命名文件名
                    String fileName = UUID.randomUUID().toString() + "." + FilenameUtils.getExtension(fileItem.getName());
                    // 将上传的文件保存到服务器
                    fileItem.write(new File("D:/", fileName));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("up")
    public void up(HttpServletRequest request, HttpServletResponse resp) throws IOException {
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        List<MultipartFile> listFile = multipartRequest.getFiles("docfiles");
        String savePath = request.getSession().getServletContext().getRealPath("/") + "/upload/";
//        logger.info("上传地址："+savePath);
        // 遍历并保存文件
        for (MultipartFile file : listFile) {
            file.transferTo(new File(savePath + file.getOriginalFilename()));
        }
    }
}
*/
