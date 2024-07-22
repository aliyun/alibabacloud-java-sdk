// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class CreateDataLimitRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the security audit feature. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: no</li>
     * <li><strong>1</strong>: yes</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AuditStatus")
    public Integer auditStatus;

    /**
     * <p>Specifies whether to automatically trigger a re-scan after a rule is modified. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: no</li>
     * <li><strong>1</strong>: yes</li>
     * </ul>
     * <blockquote>
     * <p>When a re-scan is triggered, DSC scans all data in your data asset.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoScan")
    public Integer autoScan;

    /**
     * <p>The permissions. Valid values:</p>
     * <ul>
     * <li><strong>ReadOnly</strong>: read-only permissions</li>
     * <li><strong>ReadWrite</strong>: read and write permissions</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ReadOnly</p>
     */
    @NameInMap("CertificatePermission")
    public String certificatePermission;

    /**
     * <p>Specifies whether to enable sensitive data detection. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: yes</li>
     * <li><strong>0</strong>: no</li>
     * </ul>
     * <blockquote>
     * <p>If this is your first time to authorize DSC to access the data asset, the default value is 1. If this is not your first time to authorize DSC to access the data asset, the default value is the same as that used in the last authorization operation. Both 1 and 0 are possible.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Enable")
    public Integer enable;

    /**
     * <p>The database engine that is run by the instance. Valid values:</p>
     * <ul>
     * <li><strong>MySQL</strong></li>
     * <li><strong>SQLServer</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("EngineType")
    public String engineType;

    /**
     * <p>Specifies whether to enable anomalous event detection. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: no</li>
     * <li><strong>1</strong>: yes (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EventStatus")
    public Integer eventStatus;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("FeatureType")
    public Integer featureType;

    @NameInMap("InstantlyScan")
    public Boolean instantlyScan;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh_cn</strong>: Chinese</li>
     * <li><strong>en_us</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The retention period of raw logs after you enable the security audit feature. Unit: days. Valid values:</p>
     * <ul>
     * <li><strong>30</strong></li>
     * <li><strong>90</strong></li>
     * <li><strong>180</strong></li>
     * <li><strong>365</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("LogStoreDay")
    public Integer logStoreDay;

    /**
     * <p>Specifies whether to enable optical character recognition (OCR). Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: yes</li>
     * <li><strong>0</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OcrStatus")
    public Integer ocrStatus;

    /**
     * <p>The name of the data asset.</p>
     * 
     * <strong>example:</strong>
     * <p>test-11**</p>
     */
    @NameInMap("ParentId")
    public String parentId;

    /**
     * <p>The password that is used to access the database.</p>
     * 
     * <strong>example:</strong>
     * <p>passwd</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The port that is used to connect to the database.</p>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The type of service to which the data asset belongs. Valid values:</p>
     * <ul>
     * <li><strong>1</strong> :MaxCompute</li>
     * <li><strong>2</strong>: Object Storage Service (OSS)</li>
     * <li><strong>3</strong>: AnalyticDB for MySQL</li>
     * <li><strong>4</strong> :Tablestore</li>
     * <li><strong>5</strong>: ApsaraDB RDS</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ResourceType")
    public Integer resourceType;

    /**
     * <p>The number of sensitive data samples that are collected after sensitive data detection is enabled. Valid values:</p>
     * <ul>
     * <li><strong>0</strong></li>
     * <li><strong>5</strong></li>
     * <li><strong>10</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SamplingSize")
    public Integer samplingSize;

    /**
     * <p>The region in which the data asset resides. Valid values:</p>
     * <ul>
     * <li><strong>cn-beijing</strong>: China (Beijing).</li>
     * <li><strong>cn-zhangjiakou</strong>: China (Zhangjiakou)</li>
     * <li><strong>cn-huhehaote</strong>: China (Hohhot)</li>
     * <li><strong>cn-hangzhou</strong>: China (Hangzhou)</li>
     * <li><strong>cn-shanghai</strong>: China (Shanghai)</li>
     * <li><strong>cn-shenzhen</strong>: China (Shenzhen)</li>
     * <li><strong>cn-hongkong</strong>: China (Hong Kong)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ServiceRegionId")
    public String serviceRegionId;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>39.170.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The username that is used to access the database.</p>
     * 
     * <strong>example:</strong>
     * <p>yhm</p>
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

    public CreateDataLimitRequest setFeatureType(Integer featureType) {
        this.featureType = featureType;
        return this;
    }
    public Integer getFeatureType() {
        return this.featureType;
    }

    public CreateDataLimitRequest setInstantlyScan(Boolean instantlyScan) {
        this.instantlyScan = instantlyScan;
        return this;
    }
    public Boolean getInstantlyScan() {
        return this.instantlyScan;
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

    public CreateDataLimitRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateDataLimitRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
