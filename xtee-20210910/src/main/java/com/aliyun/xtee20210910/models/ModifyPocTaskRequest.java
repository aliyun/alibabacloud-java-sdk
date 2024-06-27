// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModifyPocTaskRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("accessType")
    public String accessType;

    @NameInMap("config")
    public String config;

    @NameInMap("fileName")
    public String fileName;

    @NameInMap("fileType")
    public String fileType;

    @NameInMap("fileUrl")
    public String fileUrl;

    @NameInMap("reason")
    public String reason;

    @NameInMap("regId")
    public String regId;

    @NameInMap("serviceCode")
    public String serviceCode;

    @NameInMap("serviceName")
    public String serviceName;

    @NameInMap("taskId")
    public String taskId;

    @NameInMap("taskName")
    public String taskName;

    @NameInMap("type")
    public String type;

    public static ModifyPocTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPocTaskRequest self = new ModifyPocTaskRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPocTaskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyPocTaskRequest setAccessType(String accessType) {
        this.accessType = accessType;
        return this;
    }
    public String getAccessType() {
        return this.accessType;
    }

    public ModifyPocTaskRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public ModifyPocTaskRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ModifyPocTaskRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public ModifyPocTaskRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public ModifyPocTaskRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public ModifyPocTaskRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public ModifyPocTaskRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public ModifyPocTaskRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public ModifyPocTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ModifyPocTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public ModifyPocTaskRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
