// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponseBody extends TeaModel {
    /**
     * <p>The query results.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeInstancesResponseBodyData> data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParams</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid params: [instance not exists].</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>32A44F0D-BFF6-5664-999A-218BBDE74XXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of instances.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static DescribeInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesResponseBody self = new DescribeInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesResponseBody setData(java.util.List<DescribeInstancesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeInstancesResponseBodyData> getData() {
        return this.data;
    }

    public DescribeInstancesResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeInstancesResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeInstancesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeInstancesResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeInstancesResponseBodyDataTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeInstancesResponseBodyDataTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyDataTags self = new DescribeInstancesResponseBodyDataTags();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyDataTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeInstancesResponseBodyDataTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeInstancesResponseBodyDataVSwitches extends TeaModel {
        /**
         * <p>Indicates whether the vSwitch is the primary vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Primary")
        public Boolean primary;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1p0mldwx5av55v0xXXX</p>
         */
        @NameInMap("VswId")
        public String vswId;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeInstancesResponseBodyDataVSwitches build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyDataVSwitches self = new DescribeInstancesResponseBodyDataVSwitches();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyDataVSwitches setPrimary(Boolean primary) {
            this.primary = primary;
            return this;
        }
        public Boolean getPrimary() {
            return this.primary;
        }

        public DescribeInstancesResponseBodyDataVSwitches setVswId(String vswId) {
            this.vswId = vswId;
            return this;
        }
        public String getVswId() {
            return this.vswId;
        }

        public DescribeInstancesResponseBodyDataVSwitches setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeInstancesResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the network access control list (ACL).</p>
         * 
         * <strong>example:</strong>
         * <p>acl-bp1xc6b9vs013jjtp****</p>
         */
        @NameInMap("AclId")
        public String aclId;

        @NameInMap("AiFunctionInstanceId")
        public String aiFunctionInstanceId;

        /**
         * <p>The instance architecture. Valid values:</p>
         * <ul>
         * <li><p>onEci: deployed on ECI.</p>
         * </li>
         * <li><p>onECS: deployed on ECS.</p>
         * </li>
         * <li><p>onBareMetal: deployed on a bare metal resource pool.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>onECS</p>
         */
        @NameInMap("Architecture")
        public String architecture;

        /**
         * <p>The time when the cluster was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1733292921000</p>
         */
        @NameInMap("BeginTime")
        public Long beginTime;

        @NameInMap("EnableAiFunction")
        public Boolean enableAiFunction;

        /**
         * <p>Indicates whether automatic minor version upgrades are enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableAutoMinorVersionUpgrade")
        public Boolean enableAutoMinorVersionUpgrade;

        @NameInMap("EnableMultiAz")
        public Boolean enableMultiAz;

        /**
         * <p>Indicates whether SSL is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableSSL")
        public Boolean enableSSL;

        /**
         * <p>Indicates whether the audit plugin is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnabledAuditLoader")
        public Boolean enabledAuditLoader;

        /**
         * <p>Indicates whether encryption is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Encrypted")
        public Boolean encrypted;

        /**
         * <p>The time when the cluster expires.</p>
         * 
         * <strong>example:</strong>
         * <p>4889001600000</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c-d4be777ff5e8cXXX</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>sr_test_1</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The instance status. Valid values:</p>
         * <ul>
         * <li><p>not_init: The instance is not initialized.</p>
         * </li>
         * <li><p>unpaid: The instance is pending payment.</p>
         * </li>
         * <li><p>paid: The payment is made.</p>
         * </li>
         * <li><p>creating: The instance is being created.</p>
         * </li>
         * <li><p>creating_failed: The instance failed to be created.</p>
         * </li>
         * <li><p>created: The instance is created.</p>
         * </li>
         * <li><p>running: The instance is running.</p>
         * </li>
         * <li><p>updating: The instance is being upgraded.</p>
         * </li>
         * <li><p>agent_creating: The agent is being created.</p>
         * </li>
         * <li><p>agent_scaling_up: The agent is being upgraded.</p>
         * </li>
         * <li><p>modifying_config: The configurations are being updated.</p>
         * </li>
         * <li><p>scaling_out: The instance is being scaled out.</p>
         * </li>
         * <li><p>restarting: The instance is restarting.</p>
         * </li>
         * <li><p>scaling_in: The instance is being scaled in.</p>
         * </li>
         * <li><p>scaling_up: The instance is being upgraded.</p>
         * </li>
         * <li><p>scaling_down: The instance is being downgraded.</p>
         * </li>
         * <li><p>upgrading: The instance is being upgraded.</p>
         * </li>
         * <li><p>enable_public_network: The public endpoint is being enabled.</p>
         * </li>
         * <li><p>disable_public_network: The public endpoint is being disabled.</p>
         * </li>
         * <li><p>convert_from_trial_to_official: The instance edition is being changed.</p>
         * </li>
         * <li><p>migration_cluster_to_serverless: The cluster is being migrated.</p>
         * </li>
         * <li><p>modifying_timezone: The time zone is being modified.</p>
         * </li>
         * <li><p>switch_az: The primary and secondary zones are being switched.</p>
         * </li>
         * <li><p>enabling: The instance is being resumed.</p>
         * </li>
         * <li><p>disable: The instance is unavailable.</p>
         * </li>
         * <li><p>actively_disabled: The instance is unavailable.</p>
         * </li>
         * <li><p>deleting: The instance is being deleted.</p>
         * </li>
         * <li><p>deleting_failed: The instance failed to be deleted.</p>
         * </li>
         * <li><p>deleted_with_error: The instance is deleted due to a creation failure.</p>
         * </li>
         * <li><p>deleted: The instance is deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        /**
         * <p>Indicates whether read/write splitting is enabled. If this parameter is set to true, the leader FE node processes write requests, and the other FE nodes process read requests.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsolateLeader")
        public Boolean isolateLeader;

        /**
         * <p>The ID of the KMS key.</p>
         * 
         * <strong>example:</strong>
         * <p>rewqfds****</p>
         */
        @NameInMap("KmsKeyId")
        public String kmsKeyId;

        /**
         * <p>The maintenance window of the instance. Valid values:</p>
         * <ul>
         * <li><p>00:00-06:00</p>
         * </li>
         * <li><p>06:00-07:00</p>
         * </li>
         * <li><p>07:00-08:00</p>
         * </li>
         * <li><p>08:00-09:00</p>
         * </li>
         * <li><p>09:00-10:00</p>
         * </li>
         * <li><p>10:00-11:00</p>
         * </li>
         * <li><p>11:00-12:00</p>
         * </li>
         * <li><p>12:00-13:00</p>
         * </li>
         * <li><p>13:00-14:00</p>
         * </li>
         * <li><p>14:00-15:00</p>
         * </li>
         * <li><p>15:00-16:00</p>
         * </li>
         * <li><p>16:00-17:00</p>
         * </li>
         * <li><p>17:00-18:00</p>
         * </li>
         * <li><p>18:00-19:00</p>
         * </li>
         * <li><p>19:00-20:00</p>
         * </li>
         * <li><p>20:00-21:00</p>
         * </li>
         * <li><p>21:00-22:00</p>
         * </li>
         * <li><p>22:00-23:00</p>
         * </li>
         * <li><p>23:00-24:00</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>00:00-06:00</p>
         */
        @NameInMap("MaintainablePeriod")
        public String maintainablePeriod;

        /**
         * <p>The minor version number.</p>
         * 
         * <strong>example:</strong>
         * <p>3.2.11-1.79-1.6.5</p>
         */
        @NameInMap("MinorVersion")
        public String minorVersion;

        /**
         * <p>The type of the monitoring service.</p>
         * 
         * <strong>example:</strong>
         * <p>cms</p>
         */
        @NameInMap("MonitorType")
        public String monitorType;

        /**
         * <p>The OSS URL.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://sr-c-****</p>
         */
        @NameInMap("OssLocation")
        public String ossLocation;

        /**
         * <p>The instance edition. Valid values:</p>
         * <ul>
         * <li><p>trial: Trial Edition.</p>
         * </li>
         * <li><p>official: Standard Edition.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>official</p>
         */
        @NameInMap("PackageType")
        public String packageType;

        /**
         * <p>The billing method:</p>
         * <ul>
         * <li><p>prePaid: subscription.</p>
         * </li>
         * <li><p>postPaid: pay-as-you-go.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>postPaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmytyuofb****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The running mode of the cluster:</p>
         * <ul>
         * <li><p>shared_nothing: all-in-one.</p>
         * </li>
         * <li><p>shared_data: storage-compute separation.</p>
         * </li>
         * <li><p>lakehouse: data lake analytics.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>shared_nothing</p>
         */
        @NameInMap("RunMode")
        public String runMode;

        /**
         * <p>The duration for which the cluster has been running. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3645445</p>
         */
        @NameInMap("RunningTime")
        public Long runningTime;

        /**
         * <p>Indicates whether the security group is a managed security group.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SecurityGroupManaged")
        public Boolean securityGroupManaged;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-8vbaz2etr66a62b9****</p>
         */
        @NameInMap("SgId")
        public String sgId;

        /**
         * <p>The tags attached to the instance.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeInstancesResponseBodyDataTags> tags;

        /**
         * <p>The list of vSwitches.</p>
         */
        @NameInMap("VSwitches")
        public java.util.List<DescribeInstancesResponseBodyDataVSwitches> vSwitches;

        /**
         * <p>The cluster version.</p>
         * 
         * <strong>example:</strong>
         * <p>3.2</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1rbvag1cafkj4prwXXX</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyData self = new DescribeInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyData setAclId(String aclId) {
            this.aclId = aclId;
            return this;
        }
        public String getAclId() {
            return this.aclId;
        }

        public DescribeInstancesResponseBodyData setAiFunctionInstanceId(String aiFunctionInstanceId) {
            this.aiFunctionInstanceId = aiFunctionInstanceId;
            return this;
        }
        public String getAiFunctionInstanceId() {
            return this.aiFunctionInstanceId;
        }

        public DescribeInstancesResponseBodyData setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public DescribeInstancesResponseBodyData setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Long getBeginTime() {
            return this.beginTime;
        }

        public DescribeInstancesResponseBodyData setEnableAiFunction(Boolean enableAiFunction) {
            this.enableAiFunction = enableAiFunction;
            return this;
        }
        public Boolean getEnableAiFunction() {
            return this.enableAiFunction;
        }

        public DescribeInstancesResponseBodyData setEnableAutoMinorVersionUpgrade(Boolean enableAutoMinorVersionUpgrade) {
            this.enableAutoMinorVersionUpgrade = enableAutoMinorVersionUpgrade;
            return this;
        }
        public Boolean getEnableAutoMinorVersionUpgrade() {
            return this.enableAutoMinorVersionUpgrade;
        }

        public DescribeInstancesResponseBodyData setEnableMultiAz(Boolean enableMultiAz) {
            this.enableMultiAz = enableMultiAz;
            return this;
        }
        public Boolean getEnableMultiAz() {
            return this.enableMultiAz;
        }

        public DescribeInstancesResponseBodyData setEnableSSL(Boolean enableSSL) {
            this.enableSSL = enableSSL;
            return this;
        }
        public Boolean getEnableSSL() {
            return this.enableSSL;
        }

        public DescribeInstancesResponseBodyData setEnabledAuditLoader(Boolean enabledAuditLoader) {
            this.enabledAuditLoader = enabledAuditLoader;
            return this;
        }
        public Boolean getEnabledAuditLoader() {
            return this.enabledAuditLoader;
        }

        public DescribeInstancesResponseBodyData setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        public DescribeInstancesResponseBodyData setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public DescribeInstancesResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstancesResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeInstancesResponseBodyData setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public DescribeInstancesResponseBodyData setIsolateLeader(Boolean isolateLeader) {
            this.isolateLeader = isolateLeader;
            return this;
        }
        public Boolean getIsolateLeader() {
            return this.isolateLeader;
        }

        public DescribeInstancesResponseBodyData setKmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public String getKmsKeyId() {
            return this.kmsKeyId;
        }

        public DescribeInstancesResponseBodyData setMaintainablePeriod(String maintainablePeriod) {
            this.maintainablePeriod = maintainablePeriod;
            return this;
        }
        public String getMaintainablePeriod() {
            return this.maintainablePeriod;
        }

        public DescribeInstancesResponseBodyData setMinorVersion(String minorVersion) {
            this.minorVersion = minorVersion;
            return this;
        }
        public String getMinorVersion() {
            return this.minorVersion;
        }

        public DescribeInstancesResponseBodyData setMonitorType(String monitorType) {
            this.monitorType = monitorType;
            return this;
        }
        public String getMonitorType() {
            return this.monitorType;
        }

        public DescribeInstancesResponseBodyData setOssLocation(String ossLocation) {
            this.ossLocation = ossLocation;
            return this;
        }
        public String getOssLocation() {
            return this.ossLocation;
        }

        public DescribeInstancesResponseBodyData setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public DescribeInstancesResponseBodyData setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeInstancesResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeInstancesResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeInstancesResponseBodyData setRunMode(String runMode) {
            this.runMode = runMode;
            return this;
        }
        public String getRunMode() {
            return this.runMode;
        }

        public DescribeInstancesResponseBodyData setRunningTime(Long runningTime) {
            this.runningTime = runningTime;
            return this;
        }
        public Long getRunningTime() {
            return this.runningTime;
        }

        public DescribeInstancesResponseBodyData setSecurityGroupManaged(Boolean securityGroupManaged) {
            this.securityGroupManaged = securityGroupManaged;
            return this;
        }
        public Boolean getSecurityGroupManaged() {
            return this.securityGroupManaged;
        }

        public DescribeInstancesResponseBodyData setSgId(String sgId) {
            this.sgId = sgId;
            return this;
        }
        public String getSgId() {
            return this.sgId;
        }

        public DescribeInstancesResponseBodyData setTags(java.util.List<DescribeInstancesResponseBodyDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyDataTags> getTags() {
            return this.tags;
        }

        public DescribeInstancesResponseBodyData setVSwitches(java.util.List<DescribeInstancesResponseBodyDataVSwitches> vSwitches) {
            this.vSwitches = vSwitches;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyDataVSwitches> getVSwitches() {
            return this.vSwitches;
        }

        public DescribeInstancesResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeInstancesResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
