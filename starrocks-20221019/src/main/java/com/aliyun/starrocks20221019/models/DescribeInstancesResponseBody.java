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
     * <p>Indicates whether the request is successful.</p>
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
         * <p>Specifies whether the vSwitch is the primary vSwitch.</p>
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
         * <p>The network access control list (ACL) ID.</p>
         * 
         * <strong>example:</strong>
         * <p>acl-bp1xc6b9vs013jjtp****</p>
         */
        @NameInMap("AclId")
        public String aclId;

        /**
         * <p>The AI dedicated cluster ID. The ID is prefixed with af-. This parameter is returned if an unreleased dedicated cluster exists, including those being created. If no dedicated cluster is created, this parameter is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>af-498ae4af</p>
         */
        @NameInMap("AiFunctionClusterId")
        public String aiFunctionClusterId;

        /**
         * <p>The internal network connection endpoint of the AI dedicated cluster. The format is fe-{AiFunctionClusterId}-internal.starrocks.aliyuncs.com. This parameter is returned only after the dedicated cluster is created. If no dedicated cluster is created, this parameter is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>fe-af-498ae4af-internal.starrocks.aliyuncs.com</p>
         */
        @NameInMap("AiFunctionEndpoint")
        public String aiFunctionEndpoint;

        /**
         * <p>The AI function billing instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>aif-xxxxxxxx</p>
         */
        @NameInMap("AiFunctionInstanceId")
        public String aiFunctionInstanceId;

        /**
         * <p>The instance architecture. Valid values:</p>
         * <ul>
         * <li>onEci: Deployed based on Elastic Container Instance (ECI).</li>
         * <li>onECS: Deployed based on Elastic Compute Service (ECS).</li>
         * <li>onBareMetal: Deployed based on bare metal resource pools.</li>
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

        /**
         * <p>Specifies whether the AI center is enabled. Default value: false.</p>
         */
        @NameInMap("EnableAiFunction")
        public Boolean enableAiFunction;

        /**
         * <p>Specifies whether automatic minor version upgrades are allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableAutoMinorVersionUpgrade")
        public Boolean enableAutoMinorVersionUpgrade;

        /**
         * <p>Specifies whether disaster recovery is enabled.</p>
         */
        @NameInMap("EnableMultiAz")
        public Boolean enableMultiAz;

        /**
         * <p>Specifies whether SSL is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableSSL")
        public Boolean enableSSL;

        /**
         * <p>Specifies whether the audit plug-in is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnabledAuditLoader")
        public Boolean enabledAuditLoader;

        /**
         * <p>Specifies whether encryption is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Encrypted")
        public Boolean encrypted;

        /**
         * <strong>example:</strong>
         * <p>2026-07</p>
         */
        @NameInMap("EosDate")
        public String eosDate;

        /**
         * <p>The expiration time of the cluster.</p>
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
         * <li>not_init: Not initialized.</li>
         * <li>unpaid: Pending payment.</li>
         * <li>paid: Paid.</li>
         * <li>creating: Creating.</li>
         * <li>creating_failed: Creation failed.</li>
         * <li>created: Created.</li>
         * <li>running: Running.</li>
         * <li>updating: Updating.</li>
         * <li>agent_creating: Creating the agent.</li>
         * <li>agent_scaling_up: Scaling up the agent.</li>
         * <li>modifying_config: Updating configurations.</li>
         * <li>scaling_out: Scaling out.</li>
         * <li>restarting: Restarting.</li>
         * <li>scaling_in: Scaling in.</li>
         * <li>scaling_up: Scaling up.</li>
         * <li>scaling_down: Scaling down.</li>
         * <li>upgrading: Upgrading.</li>
         * <li>enable_public_network: Enabling public network access.</li>
         * <li>disable_public_network: Disabling public network access.</li>
         * <li>convert_from_trial_to_official: Converting the edition.</li>
         * <li>migration_cluster_to_serverless: Migrating the cluster.</li>
         * <li>modifying_timezone: Modifying the time zone.</li>
         * <li>switch_az: Switching the primary and secondary zones.</li>
         * <li>enabling: Resuming.</li>
         * <li>disable: Unavailable.</li>
         * <li>actively_disabled: Unavailable.</li>
         * <li>deleting: Deleting.</li>
         * <li>deleting_failed: Deletion failed.</li>
         * <li>deleted_with_error: Ended due to creation failure.</li>
         * <li>deleted: Deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        /**
         * <p>Specifies whether read/write splitting is enabled. If enabled, the leader FE node processes write requests and other nodes process read requests.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsolateLeader")
        public Boolean isolateLeader;

        /**
         * <p>The KMS key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rewqfds****</p>
         */
        @NameInMap("KmsKeyId")
        public String kmsKeyId;

        /**
         * <p>The maintenance window of the instance. Valid values:</p>
         * <ul>
         * <li>00:00-06:00</li>
         * <li>06:00-07:00</li>
         * <li>07:00-08:00</li>
         * <li>08:00-09:00</li>
         * <li>09:00-10:00</li>
         * <li>10:00-11:00</li>
         * <li>11:00-12:00</li>
         * <li>12:00-13:00</li>
         * <li>13:00-14:00</li>
         * <li>14:00-15:00</li>
         * <li>15:00-16:00</li>
         * <li>16:00-17:00</li>
         * <li>17:00-18:00</li>
         * <li>18:00-19:00</li>
         * <li>19:00-20:00</li>
         * <li>20:00-21:00</li>
         * <li>21:00-22:00</li>
         * <li>22:00-23:00</li>
         * <li>23:00-24:00</li>
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
         * <p>The monitoring service type.</p>
         * 
         * <strong>example:</strong>
         * <p>cms</p>
         */
        @NameInMap("MonitorType")
        public String monitorType;

        /**
         * <p>The OSS address.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://sr-c-****</p>
         */
        @NameInMap("OssLocation")
        public String ossLocation;

        /**
         * <p>The instance edition. Valid values:</p>
         * <ul>
         * <li>trial: Trial Edition.</li>
         * <li>official: Standard Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>official</p>
         */
        @NameInMap("PackageType")
        public String packageType;

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li>prePaid: Subscription.</li>
         * <li>postPaid: Pay-as-you-go.</li>
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
         * <p>The running mode of the cluster. Valid values:</p>
         * <ul>
         * <li>shared_nothing: Shared-nothing architecture.</li>
         * <li>shared_data: Shared-data architecture.</li>
         * <li>lakehouse: Lakehouse.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>shared_nothing</p>
         */
        @NameInMap("RunMode")
        public String runMode;

        /**
         * <p>The running time of the cluster. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3645445</p>
         */
        @NameInMap("RunningTime")
        public Long runningTime;

        /**
         * <p>Specifies whether the security group is a managed security group.</p>
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
         * <p>The tags bound to the instance.</p>
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
         * <strong>example:</strong>
         * <p>长期支持</p>
         */
        @NameInMap("VersionLifecycleStatus")
        public String versionLifecycleStatus;

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

        public DescribeInstancesResponseBodyData setAiFunctionClusterId(String aiFunctionClusterId) {
            this.aiFunctionClusterId = aiFunctionClusterId;
            return this;
        }
        public String getAiFunctionClusterId() {
            return this.aiFunctionClusterId;
        }

        public DescribeInstancesResponseBodyData setAiFunctionEndpoint(String aiFunctionEndpoint) {
            this.aiFunctionEndpoint = aiFunctionEndpoint;
            return this;
        }
        public String getAiFunctionEndpoint() {
            return this.aiFunctionEndpoint;
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

        public DescribeInstancesResponseBodyData setEosDate(String eosDate) {
            this.eosDate = eosDate;
            return this;
        }
        public String getEosDate() {
            return this.eosDate;
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

        public DescribeInstancesResponseBodyData setVersionLifecycleStatus(String versionLifecycleStatus) {
            this.versionLifecycleStatus = versionLifecycleStatus;
            return this;
        }
        public String getVersionLifecycleStatus() {
            return this.versionLifecycleStatus;
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
