// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreatePocRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("configStr")
    public String configStr;

    @NameInMap("fileName")
    public String fileName;

    @NameInMap("fileType")
    public String fileType;

    @NameInMap("fileUrl")
    public String fileUrl;

    @NameInMap("regId")
    public String regId;

    @NameInMap("serviceCode")
    public String serviceCode;

    @NameInMap("serviceName")
    public String serviceName;

    @NameInMap("taskName")
    public String taskName;

    public static CreatePocRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePocRequest self = new CreatePocRequest();
        return TeaModel.build(map, self);
    }

    public CreatePocRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreatePocRequest setConfigStr(String configStr) {
        this.configStr = configStr;
        return this;
    }
    public String getConfigStr() {
        return this.configStr;
    }

    public CreatePocRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreatePocRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public CreatePocRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public CreatePocRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public CreatePocRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public CreatePocRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public CreatePocRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
