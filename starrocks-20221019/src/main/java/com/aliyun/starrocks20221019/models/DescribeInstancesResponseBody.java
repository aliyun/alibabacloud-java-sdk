// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeInstancesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>InvalidParams</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>Invalid params: [instance not exists].</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>32A44F0D-BFF6-5664-999A-218BBDE74XXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
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
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
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
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Primary")
        public Boolean primary;

        /**
         * <strong>example:</strong>
         * <p>vsw-bp1p0mldwx5av55v0xXXX</p>
         */
        @NameInMap("VswId")
        public String vswId;

        /**
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
         * <strong>example:</strong>
         * <p>acl-bp1xc6b9vs013jjtp****</p>
         */
        @NameInMap("AclId")
        public String aclId;

        /**
         * <strong>example:</strong>
         * <p>onECS</p>
         */
        @NameInMap("Architecture")
        public String architecture;

        /**
         * <strong>example:</strong>
         * <p>1733292921000</p>
         */
        @NameInMap("BeginTime")
        public Long beginTime;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableAutoMinorVersionUpgrade")
        public Boolean enableAutoMinorVersionUpgrade;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableSSL")
        public Boolean enableSSL;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnabledAuditLoader")
        public Boolean enabledAuditLoader;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Encrypted")
        public Boolean encrypted;

        /**
         * <strong>example:</strong>
         * <p>4889001600000</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <strong>example:</strong>
         * <p>c-d4be777ff5e8cXXX</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>sr_test_1</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsolateLeader")
        public Boolean isolateLeader;

        /**
         * <strong>example:</strong>
         * <p>rewqfds****</p>
         */
        @NameInMap("KmsKeyId")
        public String kmsKeyId;

        /**
         * <strong>example:</strong>
         * <p>00:00-06:00</p>
         */
        @NameInMap("MaintainablePeriod")
        public String maintainablePeriod;

        /**
         * <strong>example:</strong>
         * <p>3.2.11-1.79-1.6.5</p>
         */
        @NameInMap("MinorVersion")
        public String minorVersion;

        /**
         * <strong>example:</strong>
         * <p>cms</p>
         */
        @NameInMap("MonitorType")
        public String monitorType;

        /**
         * <strong>example:</strong>
         * <p>oss://sr-c-****</p>
         */
        @NameInMap("OssLocation")
        public String ossLocation;

        /**
         * <strong>example:</strong>
         * <p>official</p>
         */
        @NameInMap("PackageType")
        public String packageType;

        /**
         * <strong>example:</strong>
         * <p>postPaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>rg-acfmytyuofb****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>shared_nothing</p>
         */
        @NameInMap("RunMode")
        public String runMode;

        /**
         * <strong>example:</strong>
         * <p>3645445</p>
         */
        @NameInMap("RunningTime")
        public Long runningTime;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SecurityGroupManaged")
        public Boolean securityGroupManaged;

        /**
         * <strong>example:</strong>
         * <p>sg-8vbaz2etr66a62b9****</p>
         */
        @NameInMap("SgId")
        public String sgId;

        @NameInMap("Tags")
        public java.util.List<DescribeInstancesResponseBodyDataTags> tags;

        @NameInMap("VSwitches")
        public java.util.List<DescribeInstancesResponseBodyDataVSwitches> vSwitches;

        /**
         * <strong>example:</strong>
         * <p>3.2</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>VPC ID。</p>
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

        public DescribeInstancesResponseBodyData setEnableAutoMinorVersionUpgrade(Boolean enableAutoMinorVersionUpgrade) {
            this.enableAutoMinorVersionUpgrade = enableAutoMinorVersionUpgrade;
            return this;
        }
        public Boolean getEnableAutoMinorVersionUpgrade() {
            return this.enableAutoMinorVersionUpgrade;
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
