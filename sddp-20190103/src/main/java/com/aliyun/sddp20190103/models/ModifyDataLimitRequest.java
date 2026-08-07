// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyDataLimitRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auditing. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Disable auditing.</li>
     * <li><strong>1</strong>: Enable auditing.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AuditStatus")
    public Integer auditStatus;

    /**
     * <p>Specifies whether to automatically trigger a rescan when rules change. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Do not trigger an automatic scan.</li>
     * <li><strong>1</strong>: Trigger an automatic scan.</li>
     * </ul>
     * <blockquote>
     * <p>When a rule change triggers an automatic scan, a full scan is performed on all data in the data source.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoScan")
    public Integer autoScan;

    /**
     * <p>The database type. Valid values:</p>
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
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FeatureType")
    public Integer featureType;

    /**
     * <p>The unique ID of the data asset that belongs to the product associated with the DSC connection authorization configuration item.</p>
     * <blockquote>
     * <p>To modify a DSC connection authorization configuration item, you must provide the unique ID of the data asset that belongs to the associated product. You can call the <a href="~~DescribeDataLimits~~">DescribeDataLimits</a> operation to obtain the ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The language of the request and response messages. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese (default)</li>
     * <li><strong>en</strong>: English</li>
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
     * <p>Specifies whether to modify the username and password for connecting to the database. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Modify.</li>
     * <li><strong>false</strong>: Do not modify.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ModifyPassword")
    public Boolean modifyPassword;

    /**
     * <p>The password used for the DSC connection authorization to the RDS database.</p>
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
     * <p>The name of the product to which the data of the DSC connection authorization configuration item belongs. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: MaxCompute</li>
     * <li><strong>2</strong>: OSS</li>
     * <li><strong>3</strong>: ADS</li>
     * <li><strong>4</strong>: OTS</li>
     * <li><strong>5</strong>: RDS</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ResourceType")
    public Integer resourceType;

    /**
     * <p>The number of sample entries for sensitive data detection after data detection is enabled. Valid values:</p>
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
     * <p>The security groups used by PrivateLink in agent-based auditing.</p>
     */
    @NameInMap("SecurityGroupIdList")
    public java.util.List<String> securityGroupIdList;

    /**
     * <p>The region where the asset resides. Valid values:</p>
     * <ul>
     * <li><strong>cn-beijing</strong>: China (Beijing)</li>
     * <li><strong>cn-zhangjiakou</strong>: China (Zhangjiakou)</li>
     * <li><strong>cn-huhehaote</strong>: China (Hohhot)</li>
     * <li><strong>cn-hangzhou</strong>: China (Hangzhou)</li>
     * <li><strong>cn-shanghai</strong>: China (Shanghai)</li>
     * <li><strong>cn-shenzhen</strong>: China (Shenzhen)</li>
     * <li><strong>cn-hongkong</strong>: Hong Kong (China)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ServiceRegionId")
    public String serviceRegionId;

    /**
     * <p>The username used for the DSC connection authorization to the RDS database.</p>
     * 
     * <strong>example:</strong>
     * <p>User01</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>The vSwitches used by PrivateLink in agent-based auditing.</p>
     */
    @NameInMap("VSwitchIdList")
    public java.util.List<String> vSwitchIdList;

    /**
     * <p>The VPC ID to which the data asset belongs.</p>
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
