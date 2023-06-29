// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class CreateDataLimitRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the security audit feature. Valid values:</p>
     * <br>
     * <p>*   **0**: no</p>
     * <p>*   **1**: yes</p>
     */
    @NameInMap("AuditStatus")
    public Integer auditStatus;

    /**
     * <p>Specifies whether to automatically trigger a re-scan after a rule is modified. Valid values:</p>
     * <br>
     * <p>*   **0**: no</p>
     * <p>*   **1**: yes</p>
     * <br>
     * <p>> When a re-scan is triggered, DSC scans all data in your data asset.</p>
     */
    @NameInMap("AutoScan")
    public Integer autoScan;

    /**
     * <p>The permissions. Valid values:</p>
     * <br>
     * <p>*   **ReadOnly**: read-only permissions</p>
     * <p>*   **ReadWrite**: read and write permissions</p>
     */
    @NameInMap("CertificatePermission")
    public String certificatePermission;

    /**
     * <p>Specifies whether to enable sensitive data detection. Valid values:</p>
     * <br>
     * <p>*   **1**: yes</p>
     * <p>*   **0**: no</p>
     * <br>
     * <p>> If this is your first time to authorize DSC to access the data asset, the default value is 1. If this is not your first time to authorize DSC to access the data asset, the default value is the same as that used in the last authorization operation. Both 1 and 0 are possible.</p>
     */
    @NameInMap("Enable")
    public Integer enable;

    /**
     * <p>The database engine that is run by the instance. Valid values:</p>
     * <br>
     * <p>*   **MySQL**</p>
     * <p>*   **SQLServer**</p>
     */
    @NameInMap("EngineType")
    public String engineType;

    /**
     * <p>Specifies whether to enable anomalous event detection. Valid values:</p>
     * <br>
     * <p>*   **0**: no</p>
     * <p>*   **1**: yes (default)</p>
     */
    @NameInMap("EventStatus")
    public Integer eventStatus;

    /**
     * <p>The language of the content within the request and response. Default value: **zh_cn**. Valid values:</p>
     * <br>
     * <p>*   **zh_cn**: Chinese</p>
     * <p>*   **en_us**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The retention period of raw logs after you enable the security audit feature. Unit: days. Valid values:</p>
     * <br>
     * <p>*   **30**</p>
     * <p>*   **90**</p>
     * <p>*   **180**</p>
     * <p>*   **365**</p>
     */
    @NameInMap("LogStoreDay")
    public Integer logStoreDay;

    /**
     * <p>Specifies whether to enable optical character recognition (OCR). Valid values:</p>
     * <br>
     * <p>*   **1**: yes</p>
     * <p>*   **0**: no</p>
     */
    @NameInMap("OcrStatus")
    public Integer ocrStatus;

    /**
     * <p>The name of the data asset.</p>
     */
    @NameInMap("ParentId")
    public String parentId;

    /**
     * <p>The password that is used to access the database.</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The port that is used to connect to the database.</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The type of service to which the data asset belongs. Valid values:</p>
     * <br>
     * <p>*   **1** :MaxCompute</p>
     * <p>*   **2**: Object Storage Service (OSS)</p>
     * <p>*   **3**: AnalyticDB for MySQL</p>
     * <p>*   **4** :Tablestore</p>
     * <p>*   **5**: ApsaraDB RDS</p>
     */
    @NameInMap("ResourceType")
    public Integer resourceType;

    /**
     * <p>The number of sensitive data samples that are collected after sensitive data detection is enabled. Valid values:</p>
     * <br>
     * <p>*   **0**</p>
     * <p>*   **5**</p>
     * <p>*   **10**</p>
     */
    @NameInMap("SamplingSize")
    public Integer samplingSize;

    /**
     * <p>The region in which the data asset resides. Valid values:</p>
     * <br>
     * <p>*   **cn-beijing**: China (Beijing).</p>
     * <p>*   **cn-zhangjiakou**: China (Zhangjiakou)</p>
     * <p>*   **cn-huhehaote**: China (Hohhot)</p>
     * <p>*   **cn-hangzhou**: China (Hangzhou)</p>
     * <p>*   **cn-shanghai**: China (Shanghai)</p>
     * <p>*   **cn-shenzhen**: China (Shenzhen)</p>
     * <p>*   **cn-hongkong**: China (Hong Kong)</p>
     */
    @NameInMap("ServiceRegionId")
    public String serviceRegionId;

    /**
     * <p>The username that is used to access the database.</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static CreateDataLimitRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataLimitRequest self = new CreateDataLimitRequest();
        return TeaModel.build(map, self);
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

    public CreateDataLimitRequest setCertificatePermission(String certificatePermission) {
        this.certificatePermission = certificatePermission;
        return this;
    }
    public String getCertificatePermission() {
        return this.certificatePermission;
    }

    public CreateDataLimitRequest setEnable(Integer enable) {
        this.enable = enable;
        return this;
    }
    public Integer getEnable() {
        return this.enable;
    }

    public CreateDataLimitRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public CreateDataLimitRequest setEventStatus(Integer eventStatus) {
        this.eventStatus = eventStatus;
        return this;
    }
    public Integer getEventStatus() {
        return this.eventStatus;
    }

    public CreateDataLimitRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateDataLimitRequest setLogStoreDay(Integer logStoreDay) {
        this.logStoreDay = logStoreDay;
        return this;
    }
    public Integer getLogStoreDay() {
        return this.logStoreDay;
    }

    public CreateDataLimitRequest setOcrStatus(Integer ocrStatus) {
        this.ocrStatus = ocrStatus;
        return this;
    }
    public Integer getOcrStatus() {
        return this.ocrStatus;
    }

    public CreateDataLimitRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public CreateDataLimitRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateDataLimitRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public CreateDataLimitRequest setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Integer getResourceType() {
        return this.resourceType;
    }

    public CreateDataLimitRequest setSamplingSize(Integer samplingSize) {
        this.samplingSize = samplingSize;
        return this;
    }
    public Integer getSamplingSize() {
        return this.samplingSize;
    }

    public CreateDataLimitRequest setServiceRegionId(String serviceRegionId) {
        this.serviceRegionId = serviceRegionId;
        return this;
    }
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

    public CreateDataLimitRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
