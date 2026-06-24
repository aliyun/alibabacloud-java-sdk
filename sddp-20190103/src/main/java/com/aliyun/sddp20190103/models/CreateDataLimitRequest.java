// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class CreateDataLimitRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auditing. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Do not enable auditing.</p>
     * </li>
     * <li><p><strong>1</strong>: Enable auditing.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AuditStatus")
    public Integer auditStatus;

    /**
     * <p>Specifies whether to automatically trigger a rescan when a rule changes. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Do not trigger an automatic scan.</p>
     * </li>
     * <li><p><strong>1</strong>: Trigger an automatic scan.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you enable this feature, a rule change triggers a full scan of all data in the data source.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoScan")
    public Integer autoScan;

    /**
     * <p>The permission level of the credential. Valid values:</p>
     * <ul>
     * <li><p><strong>ReadOnly</strong>: Read-only permissions.</p>
     * </li>
     * <li><p><strong>ReadWrite</strong>: Read and write permissions.</p>
     * </li>
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
     * <li><p><strong>1</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>0</strong>: Disabled.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The default value is 1 for the first authorization. For later authorizations, the value from the previous authorization is used. Set this parameter to 1 to detect sensitive data.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Enable")
    public Integer enable;

    /**
     * <p>The database engine type. Valid values:</p>
     * <ul>
     * <li><p><strong>MySQL</strong></p>
     * </li>
     * <li><p><strong>SQLServer</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("EngineType")
    public String engineType;

    /**
     * <p>Specifies whether to enable anomalous activity detection. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Disabled.</p>
     * </li>
     * <li><p><strong>1</strong>: Enabled. This is the default value.</p>
     * </li>
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
     * <p>Specifies whether to immediately scan the authorized data asset. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong>: Do not scan immediately.</p>
     * </li>
     * <li><p><strong>true</strong>: Scan immediately.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("InstantlyScan")
    public Boolean instantlyScan;

    /**
     * <p>The language of the content that is returned in the response. Default value: <strong>zh_cn</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>zh_cn</strong>: Chinese</p>
     * </li>
     * <li><p><strong>en_us</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The retention period of raw logs after you enable auditing. Unit: days. Valid values:</p>
     * <ul>
     * <li><p><strong>30</strong></p>
     * </li>
     * <li><p><strong>90</strong></p>
     * </li>
     * <li><p><strong>180</strong></p>
     * </li>
     * <li><p><strong>365</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("LogStoreDay")
    public Integer logStoreDay;

    /**
     * <p>Specifies whether to enable Optical Character Recognition (OCR). Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>0</strong>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OcrStatus")
    public Integer ocrStatus;

    /**
     * <p>The name of the data asset. The name consists of the instance ID and the database name, separated by a period (.).</p>
     * 
     * <strong>example:</strong>
     * <p>rm-****34.******name</p>
     */
    @NameInMap("ParentId")
    public String parentId;

    /**
     * <p>The password to access the database.</p>
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
     * <p>The service to which the data asset belongs. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: MaxCompute</p>
     * </li>
     * <li><p><strong>2</strong>: OSS</p>
     * </li>
     * <li><p><strong>3</strong>: ADS</p>
     * </li>
     * <li><p><strong>4</strong>: OTS</p>
     * </li>
     * <li><p><strong>5</strong>: RDS</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ResourceType")
    public Integer resourceType;

    /**
     * <p>The number of sensitive data samples to return after a scan. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong></p>
     * </li>
     * <li><p><strong>5</strong></p>
     * </li>
     * <li><p><strong>10</strong></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The default value is 10.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SamplingSize")
    public Integer samplingSize;

    /**
     * <p>The region where the data asset is located. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-beijing</strong>: China (Beijing)</p>
     * </li>
     * <li><p><strong>cn-zhangjiakou</strong>: China (Zhangjiakou)</p>
     * </li>
     * <li><p><strong>cn-huhehaote</strong>: China (Hohhot)</p>
     * </li>
     * <li><p><strong>cn-hangzhou</strong>: China (Hangzhou)</p>
     * </li>
     * <li><p><strong>cn-shanghai</strong>: China (Shanghai)</p>
     * </li>
     * <li><p><strong>cn-shenzhen</strong>: China (Shenzhen)</p>
     * </li>
     * <li><p><strong>cn-hongkong</strong>: China (Hong Kong)</p>
     * </li>
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
     * <p>The username for the database.</p>
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
