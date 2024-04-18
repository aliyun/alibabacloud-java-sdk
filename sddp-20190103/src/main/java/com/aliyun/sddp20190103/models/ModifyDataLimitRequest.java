// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyDataLimitRequest extends TeaModel {
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
     * <p>The database engine that is run by the instance. Valid values:</p>
     * <br>
     * <p>*   **MySQL**</p>
     * <p>*   **SQLServer**</p>
     */
    @NameInMap("EngineType")
    public String engineType;

    /**
     * <p>This parameter is deprecated.</p>
     */
    @NameInMap("FeatureType")
    public Integer featureType;

    /**
     * <p>The unique ID of the data asset for which you want to modify configuration items.</p>
     * <br>
     * <p>> You can call the [DescribeDataLimits](~~DescribeDataLimits~~) operation to query the ID of the data asset.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese (default)</p>
     * <p>*   **en**: English</p>
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
     * <p>Specifies whether to change the username and password that are used to log on to the ApsaraDB RDS database. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("ModifyPassword")
    public Boolean modifyPassword;

    /**
     * <p>The password used to log on to the ApsaraDB RDS database that you authorize DSC to access.</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The port that is used to connect to the database.</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The name of the service to which the data asset belongs. Valid values:</p>
     * <br>
     * <p>*   **1**: MaxCompute</p>
     * <p>*   **2**: Object Storage Service (OSS)</p>
     * <p>*   **3**: AnalyticDB for MySQL</p>
     * <p>*   **4**: Tablestore</p>
     * <p>*   **5**: ApsaraDB RDS</p>
     */
    @NameInMap("ResourceType")
    public Integer resourceType;

    /**
     * <p>The number of sensitive data samples tht are collected after sensitive data detection is enabled. Valid values:</p>
     * <br>
     * <p>*   **0**</p>
     * <p>*   **5**</p>
     * <p>*   **10**</p>
     */
    @NameInMap("SamplingSize")
    public Integer samplingSize;

    /**
     * <p>The security group that is used by PrivateLink when you install the DSC agent.</p>
     */
    @NameInMap("SecurityGroupIdList")
    public java.util.List<String> securityGroupIdList;

    /**
     * <p>The region in which the data asset resides. Valid values:</p>
     * <br>
     * <p>*   **cn-beijing**: China (Beijing)</p>
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
     * <p>The username used to log on to the ApsaraDB RDS database that you authorize DSC to access.</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>The vSwitch that is used by PrivateLink when you install the DSC agent.</p>
     */
    @NameInMap("VSwitchIdList")
    public java.util.List<String> vSwitchIdList;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the data asset belongs.</p>
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
