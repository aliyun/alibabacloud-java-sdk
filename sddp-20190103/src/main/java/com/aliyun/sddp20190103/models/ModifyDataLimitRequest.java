// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyDataLimitRequest extends TeaModel {
    @NameInMap("AuditStatus")
    public Integer auditStatus;

    @NameInMap("AutoScan")
    public Integer autoScan;

    @NameInMap("EngineType")
    public String engineType;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("LogStoreDay")
    public Integer logStoreDay;

    @NameInMap("ModifyPassword")
    public Boolean modifyPassword;

    @NameInMap("Password")
    public String password;

    @NameInMap("Port")
    public Integer port;

    @NameInMap("ResourceType")
    public Integer resourceType;

    @NameInMap("SamplingSize")
    public Integer samplingSize;

    @NameInMap("ServiceRegionId")
    public String serviceRegionId;

    @NameInMap("UserName")
    public String userName;

    public static ModifyDataLimitRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDataLimitRequest self = new ModifyDataLimitRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDataLimitRequest setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public Integer getAuditStatus() {
        return this.auditStatus;
    }

    public ModifyDataLimitRequest setAutoScan(Integer autoScan) {
        this.autoScan = autoScan;
        return this;
    }
    public Integer getAutoScan() {
        return this.autoScan;
    }

    public ModifyDataLimitRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public ModifyDataLimitRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ModifyDataLimitRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyDataLimitRequest setLogStoreDay(Integer logStoreDay) {
        this.logStoreDay = logStoreDay;
        return this;
    }
    public Integer getLogStoreDay() {
        return this.logStoreDay;
    }

    public ModifyDataLimitRequest setModifyPassword(Boolean modifyPassword) {
        this.modifyPassword = modifyPassword;
        return this;
    }
    public Boolean getModifyPassword() {
        return this.modifyPassword;
    }

    public ModifyDataLimitRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ModifyDataLimitRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public ModifyDataLimitRequest setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Integer getResourceType() {
        return this.resourceType;
    }

    public ModifyDataLimitRequest setSamplingSize(Integer samplingSize) {
        this.samplingSize = samplingSize;
        return this;
    }
    public Integer getSamplingSize() {
        return this.samplingSize;
    }

    public ModifyDataLimitRequest setServiceRegionId(String serviceRegionId) {
        this.serviceRegionId = serviceRegionId;
        return this;
    }
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

    public ModifyDataLimitRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
