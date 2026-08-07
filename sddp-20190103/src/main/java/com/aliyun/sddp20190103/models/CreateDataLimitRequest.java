// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class CreateDataLimitRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auditing. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Auditing is disabled.</li>
     * <li><strong>1</strong>: Auditing is enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AuditStatus")
    public Integer auditStatus;

    /**
     * <p>Specifies whether to automatically trigger a rescan when rules are changed. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Automatic rescan is not triggered.</li>
     * <li><strong>1</strong>: Automatic rescan is triggered.</li>
     * </ul>
     * <blockquote>
     * <p>When a rule change triggers an automatic rescan, a full scan is performed on all data in the data source.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoScan")
    public Integer autoScan;

    /**
     * <p>The credential permission. Valid values:</p>
     * <ul>
     * <li><strong>ReadOnly</strong>: read-only permission.</li>
     * <li><strong>ReadWrite</strong>: read and write permission.</li>
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
     * <li><strong>1</strong>: Enabled.</li>
     * <li><strong>0</strong>: Disabled.</li>
     * </ul>
     * <blockquote>
     * <p>If the asset is authorized for the first time, the default value is 1. If the asset has been previously authorized, the value from the last authorization is used, which may be 0 or 1. To perform sensitive data detection on the asset, set this parameter to 1.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Enable")
    public Integer enable;

    /**
     * <p>The type of the database. Valid values:</p>
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
     * <p>The anomalous activity detection status. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Disabled.</li>
     * <li><strong>1</strong>: Enabled (default).</li>
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

    /**
     * <p>Specifies whether to immediately scan the authorized asset. Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: The asset is not immediately scanned.</li>
     * <li><strong>true</strong>: The asset is immediately scanned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("InstantlyScan")
    public Boolean instantlyScan;

    /**
     * <p>The language of the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh_cn</strong>: Chinese.</li>
     * <li><strong>en_us</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The retention period of raw logs after auditing is enabled. Unit: days. Valid values:</p>
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
     * <p>The OCR status. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Enabled.</li>
     * <li><strong>0</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OcrStatus")
    public Integer ocrStatus;

    /**
     * <p>Required. The name of the asset, which consists of the instance ID and the database connection string separated by a period (.).</p>
     * 
     * <strong>example:</strong>
     * <p>rm-****34.******name</p>
     */
    @NameInMap("ParentId")
    public String parentId;

    /**
     * <p>The password used to access the database asset.</p>
     * 
     * <strong>example:</strong>
     * <p>p****d</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The database connection port.</p>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The type of the service to which the asset to be scanned belongs. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: MaxCompute.</li>
     * <li><strong>2</strong>: OSS.</li>
     * <li><strong>3</strong>: ADS.</li>
     * <li><strong>4</strong>: OTS.</li>
     * <li><strong>5</strong>: RDS.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ResourceType")
    public Integer resourceType;

    /**
     * <p>The number of sample entries for sensitive data detection after data detection is enabled. Valid values:</p>
     * <ul>
     * <li><strong>0</strong></li>
     * <li><strong>5</strong></li>
     * <li><strong>10</strong><blockquote>
     * <p>Default value: 10.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SamplingSize")
    public Integer samplingSize;

    /**
     * <p>Required. The region in which the asset resides. Valid values:</p>
     * <ul>
     * <li><strong>cn-beijing</strong>: China (Beijing).</li>
     * <li><strong>cn-zhangjiakou</strong>: China (Zhangjiakou).</li>
     * <li><strong>cn-huhehaote</strong>: China (Hohhot).</li>
     * <li><strong>cn-hangzhou</strong>: China (Hangzhou).</li>
     * <li><strong>cn-shanghai</strong>: China (Shanghai).</li>
     * <li><strong>cn-shenzhen</strong>: China (Shenzhen).</li>
     * <li><strong>cn-hongkong</strong>: Hong Kong (China).</li>
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
     * <p>106.11.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The username of the database asset.</p>
     * 
     * <strong>example:</strong>
     * <p>y*****m</p>
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
