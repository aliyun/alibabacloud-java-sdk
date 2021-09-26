// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class CreateDataLimitRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ResourceType")
    public Integer resourceType;

    @NameInMap("ServiceRegionId")
    public String serviceRegionId;

    @NameInMap("ParentId")
    public String parentId;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("Password")
    public String password;

    @NameInMap("AuditStatus")
    public Integer auditStatus;

    @NameInMap("AutoScan")
    public Integer autoScan;

    @NameInMap("LogStoreDay")
    public Integer logStoreDay;

    @NameInMap("EngineType")
    public String engineType;

    @NameInMap("Port")
    public Integer port;

    @NameInMap("OcrStatus")
    public Integer ocrStatus;

    @NameInMap("EventStatus")
    public Integer eventStatus;

    public static CreateDataLimitRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataLimitRequest self = new CreateDataLimitRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataLimitRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateDataLimitRequest setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Integer getResourceType() {
        return this.resourceType;
    }

    public CreateDataLimitRequest setServiceRegionId(String serviceRegionId) {
        this.serviceRegionId = serviceRegionId;
        return this;
    }
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

    public CreateDataLimitRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public CreateDataLimitRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CreateDataLimitRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateDataLimitRequest setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public Integer getAuditStatus() {
        return this.auditStatus;
    }

    public CreateDataLimitRequest setAutoScan(Integer autoScan) {
        this.autoScan = autoScan;
        return this;
    }
    public Integer getAutoScan() {
        return this.autoScan;
    }

    public CreateDataLimitRequest setLogStoreDay(Integer logStoreDay) {
        this.logStoreDay = logStoreDay;
        return this;
    }
    public Integer getLogStoreDay() {
        return this.logStoreDay;
    }

    public CreateDataLimitRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public CreateDataLimitRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public CreateDataLimitRequest setOcrStatus(Integer ocrStatus) {
        this.ocrStatus = ocrStatus;
        return this;
    }
    public Integer getOcrStatus() {
        return this.ocrStatus;
    }

    public CreateDataLimitRequest setEventStatus(Integer eventStatus) {
        this.eventStatus = eventStatus;
        return this;
    }
    public Integer getEventStatus() {
        return this.eventStatus;
    }

}
