// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSmartAccessGatewayAttributeResponseBody extends TeaModel {
    @NameInMap("AccelerateBandwidth")
    public Long accelerateBandwidth;

    @NameInMap("AccessPointId")
    public String accessPointId;

    @NameInMap("AclIds")
    public DescribeSmartAccessGatewayAttributeResponseBodyAclIds aclIds;

    @NameInMap("ApplicationBandwidthPackageBussinessStatus")
    public String applicationBandwidthPackageBussinessStatus;

    @NameInMap("ApplicationBandwidthPackageId")
    public String applicationBandwidthPackageId;

    @NameInMap("ApplicationBandwidthPackageName")
    public String applicationBandwidthPackageName;

    @NameInMap("ApplicationBandwidthPackageOperationLocks")
    public DescribeSmartAccessGatewayAttributeResponseBodyApplicationBandwidthPackageOperationLocks applicationBandwidthPackageOperationLocks;

    @NameInMap("AssociatedCcnId")
    public String associatedCcnId;

    @NameInMap("AssociatedCcnName")
    public String associatedCcnName;

    @NameInMap("BackupBoxControllerIp")
    public String backupBoxControllerIp;

    @NameInMap("BoxControllerIp")
    public String boxControllerIp;

    @NameInMap("CidrBlock")
    public String cidrBlock;

    @NameInMap("City")
    public String city;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("DataPlan")
    public Long dataPlan;

    @NameInMap("Description")
    public String description;

    @NameInMap("Devices")
    public DescribeSmartAccessGatewayAttributeResponseBodyDevices devices;

    @NameInMap("EnableOptimization")
    public Boolean enableOptimization;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("FlowLogIds")
    public DescribeSmartAccessGatewayAttributeResponseBodyFlowLogIds flowLogIds;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("IpsecStatus")
    public String ipsecStatus;

    @NameInMap("Links")
    public DescribeSmartAccessGatewayAttributeResponseBodyLinks links;

    @NameInMap("MaxBandwidth")
    public String maxBandwidth;

    @NameInMap("Name")
    public String name;

    @NameInMap("OptimizationType")
    public Boolean optimizationType;

    @NameInMap("QosIds")
    public DescribeSmartAccessGatewayAttributeResponseBodyQosIds qosIds;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResellerInstanceId")
    public String resellerInstanceId;

    @NameInMap("ResellerUid")
    public String resellerUid;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("RoutingStrategy")
    public String routingStrategy;

    @NameInMap("SecurityLockThreshold")
    public Integer securityLockThreshold;

    @NameInMap("SerialNumber")
    public String serialNumber;

    @NameInMap("SmartAGId")
    public String smartAGId;

    @NameInMap("Status")
    public String status;

    @NameInMap("TrafficMasterSn")
    public String trafficMasterSn;

    @NameInMap("UpBandwidth4G")
    public Integer upBandwidth4G;

    @NameInMap("UpBandwidthWan")
    public Integer upBandwidthWan;

    @NameInMap("UserCount")
    public Integer userCount;

    @NameInMap("VpnStatus")
    public String vpnStatus;

    public static DescribeSmartAccessGatewayAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmartAccessGatewayAttributeResponseBody self = new DescribeSmartAccessGatewayAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setAccelerateBandwidth(Long accelerateBandwidth) {
        this.accelerateBandwidth = accelerateBandwidth;
        return this;
    }
    public Long getAccelerateBandwidth() {
        return this.accelerateBandwidth;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setAccessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
        return this;
    }
    public String getAccessPointId() {
        return this.accessPointId;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setAclIds(DescribeSmartAccessGatewayAttributeResponseBodyAclIds aclIds) {
        this.aclIds = aclIds;
        return this;
    }
    public DescribeSmartAccessGatewayAttributeResponseBodyAclIds getAclIds() {
        return this.aclIds;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setApplicationBandwidthPackageBussinessStatus(String applicationBandwidthPackageBussinessStatus) {
        this.applicationBandwidthPackageBussinessStatus = applicationBandwidthPackageBussinessStatus;
        return this;
    }
    public String getApplicationBandwidthPackageBussinessStatus() {
        return this.applicationBandwidthPackageBussinessStatus;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setApplicationBandwidthPackageId(String applicationBandwidthPackageId) {
        this.applicationBandwidthPackageId = applicationBandwidthPackageId;
        return this;
    }
    public String getApplicationBandwidthPackageId() {
        return this.applicationBandwidthPackageId;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setApplicationBandwidthPackageName(String applicationBandwidthPackageName) {
        this.applicationBandwidthPackageName = applicationBandwidthPackageName;
        return this;
    }
    public String getApplicationBandwidthPackageName() {
        return this.applicationBandwidthPackageName;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setApplicationBandwidthPackageOperationLocks(DescribeSmartAccessGatewayAttributeResponseBodyApplicationBandwidthPackageOperationLocks applicationBandwidthPackageOperationLocks) {
        this.applicationBandwidthPackageOperationLocks = applicationBandwidthPackageOperationLocks;
        return this;
    }
    public DescribeSmartAccessGatewayAttributeResponseBodyApplicationBandwidthPackageOperationLocks getApplicationBandwidthPackageOperationLocks() {
        return this.applicationBandwidthPackageOperationLocks;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setAssociatedCcnId(String associatedCcnId) {
        this.associatedCcnId = associatedCcnId;
        return this;
    }
    public String getAssociatedCcnId() {
        return this.associatedCcnId;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setAssociatedCcnName(String associatedCcnName) {
        this.associatedCcnName = associatedCcnName;
        return this;
    }
    public String getAssociatedCcnName() {
        return this.associatedCcnName;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setBackupBoxControllerIp(String backupBoxControllerIp) {
        this.backupBoxControllerIp = backupBoxControllerIp;
        return this;
    }
    public String getBackupBoxControllerIp() {
        return this.backupBoxControllerIp;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setBoxControllerIp(String boxControllerIp) {
        this.boxControllerIp = boxControllerIp;
        return this;
    }
    public String getBoxControllerIp() {
        return this.boxControllerIp;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setDataPlan(Long dataPlan) {
        this.dataPlan = dataPlan;
        return this;
    }
    public Long getDataPlan() {
        return this.dataPlan;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setDevices(DescribeSmartAccessGatewayAttributeResponseBodyDevices devices) {
        this.devices = devices;
        return this;
    }
    public DescribeSmartAccessGatewayAttributeResponseBodyDevices getDevices() {
        return this.devices;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setEnableOptimization(Boolean enableOptimization) {
        this.enableOptimization = enableOptimization;
        return this;
    }
    public Boolean getEnableOptimization() {
        return this.enableOptimization;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setFlowLogIds(DescribeSmartAccessGatewayAttributeResponseBodyFlowLogIds flowLogIds) {
        this.flowLogIds = flowLogIds;
        return this;
    }
    public DescribeSmartAccessGatewayAttributeResponseBodyFlowLogIds getFlowLogIds() {
        return this.flowLogIds;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setIpsecStatus(String ipsecStatus) {
        this.ipsecStatus = ipsecStatus;
        return this;
    }
    public String getIpsecStatus() {
        return this.ipsecStatus;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setLinks(DescribeSmartAccessGatewayAttributeResponseBodyLinks links) {
        this.links = links;
        return this;
    }
    public DescribeSmartAccessGatewayAttributeResponseBodyLinks getLinks() {
        return this.links;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setMaxBandwidth(String maxBandwidth) {
        this.maxBandwidth = maxBandwidth;
        return this;
    }
    public String getMaxBandwidth() {
        return this.maxBandwidth;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setOptimizationType(Boolean optimizationType) {
        this.optimizationType = optimizationType;
        return this;
    }
    public Boolean getOptimizationType() {
        return this.optimizationType;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setQosIds(DescribeSmartAccessGatewayAttributeResponseBodyQosIds qosIds) {
        this.qosIds = qosIds;
        return this;
    }
    public DescribeSmartAccessGatewayAttributeResponseBodyQosIds getQosIds() {
        return this.qosIds;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setResellerInstanceId(String resellerInstanceId) {
        this.resellerInstanceId = resellerInstanceId;
        return this;
    }
    public String getResellerInstanceId() {
        return this.resellerInstanceId;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setResellerUid(String resellerUid) {
        this.resellerUid = resellerUid;
        return this;
    }
    public String getResellerUid() {
        return this.resellerUid;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setRoutingStrategy(String routingStrategy) {
        this.routingStrategy = routingStrategy;
        return this;
    }
    public String getRoutingStrategy() {
        return this.routingStrategy;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setSecurityLockThreshold(Integer securityLockThreshold) {
        this.securityLockThreshold = securityLockThreshold;
        return this;
    }
    public Integer getSecurityLockThreshold() {
        return this.securityLockThreshold;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setTrafficMasterSn(String trafficMasterSn) {
        this.trafficMasterSn = trafficMasterSn;
        return this;
    }
    public String getTrafficMasterSn() {
        return this.trafficMasterSn;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setUpBandwidth4G(Integer upBandwidth4G) {
        this.upBandwidth4G = upBandwidth4G;
        return this;
    }
    public Integer getUpBandwidth4G() {
        return this.upBandwidth4G;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setUpBandwidthWan(Integer upBandwidthWan) {
        this.upBandwidthWan = upBandwidthWan;
        return this;
    }
    public Integer getUpBandwidthWan() {
        return this.upBandwidthWan;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setUserCount(Integer userCount) {
        this.userCount = userCount;
        return this;
    }
    public Integer getUserCount() {
        return this.userCount;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setVpnStatus(String vpnStatus) {
        this.vpnStatus = vpnStatus;
        return this;
    }
    public String getVpnStatus() {
        return this.vpnStatus;
    }

    public static class DescribeSmartAccessGatewayAttributeResponseBodyAclIds extends TeaModel {
        @NameInMap("AclId")
        public java.util.List<String> aclId;

        public static DescribeSmartAccessGatewayAttributeResponseBodyAclIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartAccessGatewayAttributeResponseBodyAclIds self = new DescribeSmartAccessGatewayAttributeResponseBodyAclIds();
            return TeaModel.build(map, self);
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyAclIds setAclId(java.util.List<String> aclId) {
            this.aclId = aclId;
            return this;
        }
        public java.util.List<String> getAclId() {
            return this.aclId;
        }

    }

    public static class DescribeSmartAccessGatewayAttributeResponseBodyApplicationBandwidthPackageOperationLocks extends TeaModel {
        @NameInMap("LockReason")
        public String lockReason;

        @NameInMap("LockType")
        public String lockType;

        public static DescribeSmartAccessGatewayAttributeResponseBodyApplicationBandwidthPackageOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartAccessGatewayAttributeResponseBodyApplicationBandwidthPackageOperationLocks self = new DescribeSmartAccessGatewayAttributeResponseBodyApplicationBandwidthPackageOperationLocks();
            return TeaModel.build(map, self);
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyApplicationBandwidthPackageOperationLocks setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyApplicationBandwidthPackageOperationLocks setLockType(String lockType) {
            this.lockType = lockType;
            return this;
        }
        public String getLockType() {
            return this.lockType;
        }

    }

    public static class DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice extends TeaModel {
        @NameInMap("DistributeSkStatus")
        public Integer distributeSkStatus;

        @NameInMap("DpiSignatureDbVersion")
        public String dpiSignatureDbVersion;

        @NameInMap("HaState")
        public String haState;

        @NameInMap("HcState")
        public String hcState;

        @NameInMap("MonitorVersion")
        public String monitorVersion;

        @NameInMap("SecretKey")
        public String secretKey;

        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("SoftwareVersion")
        public String softwareVersion;

        public static DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice self = new DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice();
            return TeaModel.build(map, self);
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice setDistributeSkStatus(Integer distributeSkStatus) {
            this.distributeSkStatus = distributeSkStatus;
            return this;
        }
        public Integer getDistributeSkStatus() {
            return this.distributeSkStatus;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice setDpiSignatureDbVersion(String dpiSignatureDbVersion) {
            this.dpiSignatureDbVersion = dpiSignatureDbVersion;
            return this;
        }
        public String getDpiSignatureDbVersion() {
            return this.dpiSignatureDbVersion;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice setHaState(String haState) {
            this.haState = haState;
            return this;
        }
        public String getHaState() {
            return this.haState;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice setHcState(String hcState) {
            this.hcState = hcState;
            return this;
        }
        public String getHcState() {
            return this.hcState;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice setMonitorVersion(String monitorVersion) {
            this.monitorVersion = monitorVersion;
            return this;
        }
        public String getMonitorVersion() {
            return this.monitorVersion;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice setSoftwareVersion(String softwareVersion) {
            this.softwareVersion = softwareVersion;
            return this;
        }
        public String getSoftwareVersion() {
            return this.softwareVersion;
        }

    }

    public static class DescribeSmartAccessGatewayAttributeResponseBodyDevices extends TeaModel {
        @NameInMap("Device")
        public java.util.List<DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice> device;

        public static DescribeSmartAccessGatewayAttributeResponseBodyDevices build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartAccessGatewayAttributeResponseBodyDevices self = new DescribeSmartAccessGatewayAttributeResponseBodyDevices();
            return TeaModel.build(map, self);
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyDevices setDevice(java.util.List<DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice> device) {
            this.device = device;
            return this;
        }
        public java.util.List<DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice> getDevice() {
            return this.device;
        }

    }

    public static class DescribeSmartAccessGatewayAttributeResponseBodyFlowLogIds extends TeaModel {
        @NameInMap("FlowLogId")
        public java.util.List<String> flowLogId;

        public static DescribeSmartAccessGatewayAttributeResponseBodyFlowLogIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartAccessGatewayAttributeResponseBodyFlowLogIds self = new DescribeSmartAccessGatewayAttributeResponseBodyFlowLogIds();
            return TeaModel.build(map, self);
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyFlowLogIds setFlowLogId(java.util.List<String> flowLogId) {
            this.flowLogId = flowLogId;
            return this;
        }
        public java.util.List<String> getFlowLogId() {
            return this.flowLogId;
        }

    }

    public static class DescribeSmartAccessGatewayAttributeResponseBodyLinksLink extends TeaModel {
        @NameInMap("Bandwidth")
        public String bandwidth;

        @NameInMap("CommodityType")
        public String commodityType;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("HealthCheckTargetIp")
        public String healthCheckTargetIp;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RelateInstanceId")
        public String relateInstanceId;

        @NameInMap("RelateInstanceRegionId")
        public String relateInstanceRegionId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        public static DescribeSmartAccessGatewayAttributeResponseBodyLinksLink build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartAccessGatewayAttributeResponseBodyLinksLink self = new DescribeSmartAccessGatewayAttributeResponseBodyLinksLink();
            return TeaModel.build(map, self);
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyLinksLink setBandwidth(String bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public String getBandwidth() {
            return this.bandwidth;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyLinksLink setCommodityType(String commodityType) {
            this.commodityType = commodityType;
            return this;
        }
        public String getCommodityType() {
            return this.commodityType;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyLinksLink setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyLinksLink setHealthCheckTargetIp(String healthCheckTargetIp) {
            this.healthCheckTargetIp = healthCheckTargetIp;
            return this;
        }
        public String getHealthCheckTargetIp() {
            return this.healthCheckTargetIp;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyLinksLink setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyLinksLink setRelateInstanceId(String relateInstanceId) {
            this.relateInstanceId = relateInstanceId;
            return this;
        }
        public String getRelateInstanceId() {
            return this.relateInstanceId;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyLinksLink setRelateInstanceRegionId(String relateInstanceRegionId) {
            this.relateInstanceRegionId = relateInstanceRegionId;
            return this;
        }
        public String getRelateInstanceRegionId() {
            return this.relateInstanceRegionId;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyLinksLink setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyLinksLink setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeSmartAccessGatewayAttributeResponseBodyLinks extends TeaModel {
        @NameInMap("Link")
        public java.util.List<DescribeSmartAccessGatewayAttributeResponseBodyLinksLink> link;

        public static DescribeSmartAccessGatewayAttributeResponseBodyLinks build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartAccessGatewayAttributeResponseBodyLinks self = new DescribeSmartAccessGatewayAttributeResponseBodyLinks();
            return TeaModel.build(map, self);
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyLinks setLink(java.util.List<DescribeSmartAccessGatewayAttributeResponseBodyLinksLink> link) {
            this.link = link;
            return this;
        }
        public java.util.List<DescribeSmartAccessGatewayAttributeResponseBodyLinksLink> getLink() {
            return this.link;
        }

    }

    public static class DescribeSmartAccessGatewayAttributeResponseBodyQosIds extends TeaModel {
        @NameInMap("QosId")
        public java.util.List<String> qosId;

        public static DescribeSmartAccessGatewayAttributeResponseBodyQosIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartAccessGatewayAttributeResponseBodyQosIds self = new DescribeSmartAccessGatewayAttributeResponseBodyQosIds();
            return TeaModel.build(map, self);
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyQosIds setQosId(java.util.List<String> qosId) {
            this.qosId = qosId;
            return this;
        }
        public java.util.List<String> getQosId() {
            return this.qosId;
        }

    }

}
