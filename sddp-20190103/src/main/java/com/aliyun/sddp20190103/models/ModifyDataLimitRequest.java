// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyDataLimitRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auditing. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Disable auditing.</p>
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
     * <p>Specifies whether to automatically trigger a rescan when a rule is changed. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Do not automatically trigger a rescan.</p>
     * </li>
     * <li><p><strong>1</strong>: Automatically trigger a rescan.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If a rescan is automatically triggered, a full scan is performed on the data asset.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoScan")
    public Integer autoScan;

    /**
     * <p>The type of the database. Valid values:</p>
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
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FeatureType")
    public Integer featureType;

    /**
     * <p>The unique ID of the data asset.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeDataLimits~~">DescribeDataLimits</a> operation to query the ID of the data asset.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese (default)</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The retention period of raw logs after auditing is enabled. Unit: days. Valid values:</p>
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
     * <p>Specifies whether to modify the username and password that are used to connect to the database. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Modify the username and password.</p>
     * </li>
     * <li><p><strong>false</strong>: Do not modify the username and password.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ModifyPassword")
    public Boolean modifyPassword;

    /**
     * <p>The password for the ApsaraDB RDS database.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The port used to connect to the database.</p>
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
     * <p>5</p>
     */
    @NameInMap("ResourceType")
    public Integer resourceType;

    /**
     * <p>The number of sensitive data samples to return. This parameter takes effect only after data detection is enabled. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong></p>
     * </li>
     * <li><p><strong>5</strong></p>
     * </li>
     * <li><p><strong>10</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SamplingSize")
    public Integer samplingSize;

    /**
     * <p>The security groups for agent-based auditing that uses PrivateLink.</p>
     */
    @NameInMap("SecurityGroupIdList")
    public java.util.List<String> securityGroupIdList;

    /**
     * <p>The ID of the region in which the data asset is located. Valid values:</p>
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
     * <p>The username for the ApsaraDB RDS database.</p>
     * 
     * <strong>example:</strong>
     * <p>User01</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>The vSwitches for agent-based auditing that uses PrivateLink.</p>
     */
    @NameInMap("VSwitchIdList")
    public java.util.List<String> vSwitchIdList;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the data asset belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-2zevcqke6hh09c41****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

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

    public ModifyDataLimitRequest setFeatureType(Integer featureType) {
        this.featureType = featureType;
        return this;
    }
    public Integer getFeatureType() {
        return this.featureType;
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

    public ModifyDataLimitRequest setSecurityGroupIdList(java.util.List<String> securityGroupIdList) {
        this.securityGroupIdList = securityGroupIdList;
        return this;
    }
    public java.util.List<String> getSecurityGroupIdList() {
        return this.securityGroupIdList;
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

    public ModifyDataLimitRequest setVSwitchIdList(java.util.List<String> vSwitchIdList) {
        this.vSwitchIdList = vSwitchIdList;
        return this;
    }
    public java.util.List<String> getVSwitchIdList() {
        return this.vSwitchIdList;
    }

    public ModifyDataLimitRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
