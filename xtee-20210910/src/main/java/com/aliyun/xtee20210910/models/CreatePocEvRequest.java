// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreatePocEvRequest extends TeaModel {
    @NameInMap("DateFormat")
    public String dateFormat;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileType")
    public String fileType;

    @NameInMap("FileUrl")
    public String fileUrl;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("RegId")
    public String regId;

    @NameInMap("ServiceCode")
    public String serviceCode;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("Tab")
    public String tab;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("Type")
    public String type;

    public static CreatePocEvRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePocEvRequest self = new CreatePocEvRequest();
        return TeaModel.build(map, self);
    }

    public CreatePocEvRequest setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
        return this;
    }
    public String getDateFormat() {
        return this.dateFormat;
    }

    public CreatePocEvRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreatePocEvRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public CreatePocEvRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public CreatePocEvRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreatePocEvRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public CreatePocEvRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public CreatePocEvRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public CreatePocEvRequest setTab(String tab) {
        this.tab = tab;
        return this;
    }
    public String getTab() {
        return this.tab;
    }

    public CreatePocEvRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreatePocEvRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
