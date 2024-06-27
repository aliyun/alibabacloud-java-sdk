// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class FileUploadRequest extends TeaModel {
    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileUrl")
    public String fileUrl;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Tab")
    public String tab;

    public static FileUploadRequest build(java.util.Map<String, ?> map) throws Exception {
        FileUploadRequest self = new FileUploadRequest();
        return TeaModel.build(map, self);
    }

    public FileUploadRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public FileUploadRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public FileUploadRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public FileUploadRequest setTab(String tab) {
        this.tab = tab;
        return this;
    }
    public String getTab() {
        return this.tab;
    }

}
