// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSmartAccessGatewayAttributeResponseBody extends TeaModel {
    @NameInMap("UpBandwidth4G")
    public Integer upBandwidth4G;

    @NameInMap("Description")
    public String description;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("UserCount")
    public Integer userCount;

    @NameInMap("AssociatedCcnName")
    public String associatedCcnName;

    @NameInMap("MaxBandwidth")
    public String maxBandwidth;

    @NameInMap("VpnStatus")
    public String vpnStatus;

    @NameInMap("BoxControllerIp")
    public String boxControllerIp;

    @NameInMap("UpBandwidthWan")
    public Integer upBandwidthWan;

    @NameInMap("CidrBlock")
    public String cidrBlock;

    @NameInMap("QosIds")
    public DescribeSmartAccessGatewayAttributeResponseBodyQosIds qosIds;

    @NameInMap("Devices")
    public DescribeSmartAccessGatewayAttributeResponseBodyDevices devices;

    @NameInMap("Name")
    public String name;

    @NameInMap("OptimizationType")
    public Boolean optimizationType;

    @NameInMap("IpsecStatus")
    public String ipsecStatus;

    @NameInMap("RoutingStrategy")
    public String routingStrategy;

    @NameInMap("AssociatedCcnId")
    public String associatedCcnId;

    @NameInMap("FlowLogIds")
    public DescribeSmartAccessGatewayAttributeResponseBodyFlowLogIds flowLogIds;

    @NameInMap("SmartAGId")
    public String smartAGId;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("SecurityLockThreshold")
    public Integer securityLockThreshold;

    @NameInMap("Status")
    public String status;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("DataPlan")
    public Long dataPlan;

    @NameInMap("EnableOptimization")
    public Boolean enableOptimization;

    @NameInMap("City")
    public String city;

    @NameInMap("SerialNumber")
    public String serialNumber;

    @NameInMap("BackupBoxControllerIp")
    public String backupBoxControllerIp;

    @NameInMap("TrafficMasterSn")
    public String trafficMasterSn;

    @NameInMap("AccessPointId")
    public String accessPointId;

    @NameInMap("Links")
    public DescribeSmartAccessGatewayAttributeResponseBodyLinks links;

    @NameInMap("AclIds")
    public DescribeSmartAccessGatewayAttributeResponseBodyAclIds aclIds;

    public static DescribeSmartAccessGatewayAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmartAccessGatewayAttributeResponseBody self = new DescribeSmartAccessGatewayAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setUpBandwidth4G(Integer upBandwidth4G) {
        this.upBandwidth4G = upBandwidth4G;
        return this;
    }
    public Integer getUpBandwidth4G() {
        return this.upBandwidth4G;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setUserCount(Integer userCount) {
        this.userCount = userCount;
        return this;
    }
    public Integer getUserCount() {
        return this.userCount;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setAssociatedCcnName(String associatedCcnName) {
        this.associatedCcnName = associatedCcnName;
        return this;
    }
    public String getAssociatedCcnName() {
        return this.associatedCcnName;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setMaxBandwidth(String maxBandwidth) {
        this.maxBandwidth = maxBandwidth;
        return this;
    }
    public String getMaxBandwidth() {
        return this.maxBandwidth;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setVpnStatus(String vpnStatus) {
        this.vpnStatus = vpnStatus;
        return this;
    }
    public String getVpnStatus() {
        return this.vpnStatus;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setBoxControllerIp(String boxControllerIp) {
        this.boxControllerIp = boxControllerIp;
        return this;
    }
    public String getBoxControllerIp() {
        return this.boxControllerIp;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setUpBandwidthWan(Integer upBandwidthWan) {
        this.upBandwidthWan = upBandwidthWan;
        return this;
    }
    public Integer getUpBandwidthWan() {
        return this.upBandwidthWan;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setQosIds(DescribeSmartAccessGatewayAttributeResponseBodyQosIds qosIds) {
        this.qosIds = qosIds;
        return this;
    }
    public DescribeSmartAccessGatewayAttributeResponseBodyQosIds getQosIds() {
        return this.qosIds;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setDevices(DescribeSmartAccessGatewayAttributeResponseBodyDevices devices) {
        this.devices = devices;
        return this;
    }
    public DescribeSmartAccessGatewayAttributeResponseBodyDevices getDevices() {
        return this.devices;
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

    public DescribeSmartAccessGatewayAttributeResponseBody setIpsecStatus(String ipsecStatus) {
        this.ipsecStatus = ipsecStatus;
        return this;
    }
    public String getIpsecStatus() {
        return this.ipsecStatus;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setRoutingStrategy(String routingStrategy) {
        this.routingStrategy = routingStrategy;
        return this;
    }
    public String getRoutingStrategy() {
        return this.routingStrategy;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setAssociatedCcnId(String associatedCcnId) {
        this.associatedCcnId = associatedCcnId;
        return this;
    }
    public String getAssociatedCcnId() {
        return this.associatedCcnId;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setFlowLogIds(DescribeSmartAccessGatewayAttributeResponseBodyFlowLogIds flowLogIds) {
        this.flowLogIds = flowLogIds;
        return this;
    }
    public DescribeSmartAccessGatewayAttributeResponseBodyFlowLogIds getFlowLogIds() {
        return this.flowLogIds;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setSecurityLockThreshold(Integer securityLockThreshold) {
        this.securityLockThreshold = securityLockThreshold;
        return this;
    }
    public Integer getSecurityLockThreshold() {
        return this.securityLockThreshold;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public DescribeSmartAccessGatewayAttributeResponseBody setEnableOptimization(Boolean enableOptimization) {
        this.enableOptimization = enableOptimization;
        return this;
    }
    public Boolean getEnableOptimization() {
        return this.enableOptimization;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setBackupBoxControllerIp(String backupBoxControllerIp) {
        this.backupBoxControllerIp = backupBoxControllerIp;
        return this;
    }
    public String getBackupBoxControllerIp() {
        return this.backupBoxControllerIp;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setTrafficMasterSn(String trafficMasterSn) {
        this.trafficMasterSn = trafficMasterSn;
        return this;
    }
    public String getTrafficMasterSn() {
        return this.trafficMasterSn;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setAccessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
        return this;
    }
    public String getAccessPointId() {
        return this.accessPointId;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setLinks(DescribeSmartAccessGatewayAttributeResponseBodyLinks links) {
        this.links = links;
        return this;
    }
    public DescribeSmartAccessGatewayAttributeResponseBodyLinks getLinks() {
        return this.links;
    }

    public DescribeSmartAccessGatewayAttributeResponseBody setAclIds(DescribeSmartAccessGatewayAttributeResponseBodyAclIds aclIds) {
        this.aclIds = aclIds;
        return this;
    }
    public DescribeSmartAccessGatewayAttributeResponseBodyAclIds getAclIds() {
        return this.aclIds;
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

    public static class DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice extends TeaModel {
        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("HaState")
        public String haState;

        @NameInMap("SecretKey")
        public String secretKey;

        @NameInMap("DpiSignatureDbVersion")
        public String dpiSignatureDbVersion;

        @NameInMap("SoftwareVersion")
        public String softwareVersion;

        @NameInMap("DistributeSkStatus")
        public Integer distributeSkStatus;

        @NameInMap("MonitorVersion")
        public String monitorVersion;

        @NameInMap("HcState")
        public String hcState;

        public static DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice self = new DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice();
            return TeaModel.build(map, self);
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice setHaState(String haState) {
            this.haState = haState;
            return this;
        }
        public String getHaState() {
            return this.haState;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice setDpiSignatureDbVersion(String dpiSignatureDbVersion) {
            this.dpiSignatureDbVersion = dpiSignatureDbVersion;
            return this;
        }
        public String getDpiSignatureDbVersion() {
            return this.dpiSignatureDbVersion;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice setSoftwareVersion(String softwareVersion) {
            this.softwareVersion = softwareVersion;
            return this;
        }
        public String getSoftwareVersion() {
            return this.softwareVersion;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice setDistributeSkStatus(Integer distributeSkStatus) {
            this.distributeSkStatus = distributeSkStatus;
            return this;
        }
        public Integer getDistributeSkStatus() {
            return this.distributeSkStatus;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice setMonitorVersion(String monitorVersion) {
            this.monitorVersion = monitorVersion;
            return this;
        }
        public String getMonitorVersion() {
            return this.monitorVersion;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyDevicesDevice setHcState(String hcState) {
            this.hcState = hcState;
            return this;
        }
        public String getHcState() {
            return this.hcState;
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
        @NameInMap("HealthCheckTargetIp")
        public String healthCheckTargetIp;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("Bandwidth")
        public String bandwidth;

        @NameInMap("RelateInstanceRegionId")
        public String relateInstanceRegionId;

        @NameInMap("RelateInstanceId")
        public String relateInstanceId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("CommodityType")
        public String commodityType;

        public static DescribeSmartAccessGatewayAttributeResponseBodyLinksLink build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartAccessGatewayAttributeResponseBodyLinksLink self = new DescribeSmartAccessGatewayAttributeResponseBodyLinksLink();
            return TeaModel.build(map, self);
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyLinksLink setHealthCheckTargetIp(String healthCheckTargetIp) {
            this.healthCheckTargetIp = healthCheckTargetIp;
            return this;
        }
        public String getHealthCheckTargetIp() {
            return this.healthCheckTargetIp;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyLinksLink setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
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

        public DescribeSmartAccessGatewayAttributeResponseBodyLinksLink setBandwidth(String bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public String getBandwidth() {
            return this.bandwidth;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyLinksLink setRelateInstanceRegionId(String relateInstanceRegionId) {
            this.relateInstanceRegionId = relateInstanceRegionId;
            return this;
        }
        public String getRelateInstanceRegionId() {
            return this.relateInstanceRegionId;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyLinksLink setRelateInstanceId(String relateInstanceId) {
            this.relateInstanceId = relateInstanceId;
            return this;
        }
        public String getRelateInstanceId() {
            return this.relateInstanceId;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyLinksLink setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSmartAccessGatewayAttributeResponseBodyLinksLink setCommodityType(String commodityType) {
            this.commodityType = commodityType;
            return this;
        }
        public String getCommodityType() {
            return this.commodityType;
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

}
