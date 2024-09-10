// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCInstanceAttributeResponseBody extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Cpu")
    public Integer cpu;

    @NameInMap("CreationTime")
    public String creationTime;

    @NameInMap("CreditSpecification")
    public String creditSpecification;

    @NameInMap("DataDisks")
    public DescribeRCInstanceAttributeResponseBodyDataDisks dataDisks;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("DedicatedHostAttribute")
    public DescribeRCInstanceAttributeResponseBodyDedicatedHostAttribute dedicatedHostAttribute;

    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    @NameInMap("Description")
    public String description;

    @NameInMap("DiskType")
    public String diskType;

    @NameInMap("EcsInstanceType")
    public String ecsInstanceType;

    @NameInMap("EipAddress")
    public DescribeRCInstanceAttributeResponseBodyEipAddress eipAddress;

    @NameInMap("EnableJumboFrame")
    public Boolean enableJumboFrame;

    @NameInMap("ExpiredTime")
    public String expiredTime;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("HostType")
    public String hostType;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("InnerIpAddress")
    public DescribeRCInstanceAttributeResponseBodyInnerIpAddress innerIpAddress;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("InternetMaxBandwidthIn")
    public Integer internetMaxBandwidthIn;

    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    @NameInMap("IoOptimized")
    public String ioOptimized;

    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("Memory")
    public Integer memory;

    @NameInMap("OperationLocks")
    public DescribeRCInstanceAttributeResponseBodyOperationLocks operationLocks;

    @NameInMap("PublicIpAddress")
    public DescribeRCInstanceAttributeResponseBodyPublicIpAddress publicIpAddress;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityGroupIds")
    public DescribeRCInstanceAttributeResponseBodySecurityGroupIds securityGroupIds;

    @NameInMap("SerialNumber")
    public String serialNumber;

    @NameInMap("Status")
    public String status;

    @NameInMap("StoppedMode")
    public String stoppedMode;

    @NameInMap("VlanId")
    public String vlanId;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("VpcAttributes")
    public DescribeRCInstanceAttributeResponseBodyVpcAttributes vpcAttributes;

    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeRCInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCInstanceAttributeResponseBody self = new DescribeRCInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRCInstanceAttributeResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeRCInstanceAttributeResponseBody setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public DescribeRCInstanceAttributeResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeRCInstanceAttributeResponseBody setCreditSpecification(String creditSpecification) {
        this.creditSpecification = creditSpecification;
        return this;
    }
    public String getCreditSpecification() {
        return this.creditSpecification;
    }

    public DescribeRCInstanceAttributeResponseBody setDataDisks(DescribeRCInstanceAttributeResponseBodyDataDisks dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }
    public DescribeRCInstanceAttributeResponseBodyDataDisks getDataDisks() {
        return this.dataDisks;
    }

    public DescribeRCInstanceAttributeResponseBody setDedicatedHostAttribute(DescribeRCInstanceAttributeResponseBodyDedicatedHostAttribute dedicatedHostAttribute) {
        this.dedicatedHostAttribute = dedicatedHostAttribute;
        return this;
    }
    public DescribeRCInstanceAttributeResponseBodyDedicatedHostAttribute getDedicatedHostAttribute() {
        return this.dedicatedHostAttribute;
    }

    public DescribeRCInstanceAttributeResponseBody setDeploymentSetId(String deploymentSetId) {
        this.deploymentSetId = deploymentSetId;
        return this;
    }
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    public DescribeRCInstanceAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeRCInstanceAttributeResponseBody setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public DescribeRCInstanceAttributeResponseBody setEcsInstanceType(String ecsInstanceType) {
        this.ecsInstanceType = ecsInstanceType;
        return this;
    }
    public String getEcsInstanceType() {
        return this.ecsInstanceType;
    }

    public DescribeRCInstanceAttributeResponseBody setEipAddress(DescribeRCInstanceAttributeResponseBodyEipAddress eipAddress) {
        this.eipAddress = eipAddress;
        return this;
    }
    public DescribeRCInstanceAttributeResponseBodyEipAddress getEipAddress() {
        return this.eipAddress;
    }

    public DescribeRCInstanceAttributeResponseBody setEnableJumboFrame(Boolean enableJumboFrame) {
        this.enableJumboFrame = enableJumboFrame;
        return this;
    }
    public Boolean getEnableJumboFrame() {
        return this.enableJumboFrame;
    }

    public DescribeRCInstanceAttributeResponseBody setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public DescribeRCInstanceAttributeResponseBody setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public DescribeRCInstanceAttributeResponseBody setHostType(String hostType) {
        this.hostType = hostType;
        return this;
    }
    public String getHostType() {
        return this.hostType;
    }

    public DescribeRCInstanceAttributeResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeRCInstanceAttributeResponseBody setInnerIpAddress(DescribeRCInstanceAttributeResponseBodyInnerIpAddress innerIpAddress) {
        this.innerIpAddress = innerIpAddress;
        return this;
    }
    public DescribeRCInstanceAttributeResponseBodyInnerIpAddress getInnerIpAddress() {
        return this.innerIpAddress;
    }

    public DescribeRCInstanceAttributeResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeRCInstanceAttributeResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeRCInstanceAttributeResponseBody setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public DescribeRCInstanceAttributeResponseBody setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeRCInstanceAttributeResponseBody setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public DescribeRCInstanceAttributeResponseBody setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
        this.internetMaxBandwidthIn = internetMaxBandwidthIn;
        return this;
    }
    public Integer getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    public DescribeRCInstanceAttributeResponseBody setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public DescribeRCInstanceAttributeResponseBody setIoOptimized(String ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    public DescribeRCInstanceAttributeResponseBody setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public DescribeRCInstanceAttributeResponseBody setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public DescribeRCInstanceAttributeResponseBody setOperationLocks(DescribeRCInstanceAttributeResponseBodyOperationLocks operationLocks) {
        this.operationLocks = operationLocks;
        return this;
    }
    public DescribeRCInstanceAttributeResponseBodyOperationLocks getOperationLocks() {
        return this.operationLocks;
    }

    public DescribeRCInstanceAttributeResponseBody setPublicIpAddress(DescribeRCInstanceAttributeResponseBodyPublicIpAddress publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }
    public DescribeRCInstanceAttributeResponseBodyPublicIpAddress getPublicIpAddress() {
        return this.publicIpAddress;
    }

    public DescribeRCInstanceAttributeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRCInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRCInstanceAttributeResponseBody setSecurityGroupIds(DescribeRCInstanceAttributeResponseBodySecurityGroupIds securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public DescribeRCInstanceAttributeResponseBodySecurityGroupIds getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public DescribeRCInstanceAttributeResponseBody setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public DescribeRCInstanceAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeRCInstanceAttributeResponseBody setStoppedMode(String stoppedMode) {
        this.stoppedMode = stoppedMode;
        return this;
    }
    public String getStoppedMode() {
        return this.stoppedMode;
    }

    public DescribeRCInstanceAttributeResponseBody setVlanId(String vlanId) {
        this.vlanId = vlanId;
        return this;
    }
    public String getVlanId() {
        return this.vlanId;
    }

    public DescribeRCInstanceAttributeResponseBody setVpcAttributes(DescribeRCInstanceAttributeResponseBodyVpcAttributes vpcAttributes) {
        this.vpcAttributes = vpcAttributes;
        return this;
    }
    public DescribeRCInstanceAttributeResponseBodyVpcAttributes getVpcAttributes() {
        return this.vpcAttributes;
    }

    public DescribeRCInstanceAttributeResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribeRCInstanceAttributeResponseBodyDataDisksDataDisk extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        @NameInMap("Encrypted")
        public String encrypted;

        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        @NameInMap("Size")
        public Long size;

        public static DescribeRCInstanceAttributeResponseBodyDataDisksDataDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCInstanceAttributeResponseBodyDataDisksDataDisk self = new DescribeRCInstanceAttributeResponseBodyDataDisksDataDisk();
            return TeaModel.build(map, self);
        }

        public DescribeRCInstanceAttributeResponseBodyDataDisksDataDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeRCInstanceAttributeResponseBodyDataDisksDataDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public DescribeRCInstanceAttributeResponseBodyDataDisksDataDisk setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public DescribeRCInstanceAttributeResponseBodyDataDisksDataDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DescribeRCInstanceAttributeResponseBodyDataDisksDataDisk setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

    public static class DescribeRCInstanceAttributeResponseBodyDataDisks extends TeaModel {
        @NameInMap("DataDisk")
        public java.util.List<DescribeRCInstanceAttributeResponseBodyDataDisksDataDisk> dataDisk;

        public static DescribeRCInstanceAttributeResponseBodyDataDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCInstanceAttributeResponseBodyDataDisks self = new DescribeRCInstanceAttributeResponseBodyDataDisks();
            return TeaModel.build(map, self);
        }

        public DescribeRCInstanceAttributeResponseBodyDataDisks setDataDisk(java.util.List<DescribeRCInstanceAttributeResponseBodyDataDisksDataDisk> dataDisk) {
            this.dataDisk = dataDisk;
            return this;
        }
        public java.util.List<DescribeRCInstanceAttributeResponseBodyDataDisksDataDisk> getDataDisk() {
            return this.dataDisk;
        }

    }

    public static class DescribeRCInstanceAttributeResponseBodyDedicatedHostAttribute extends TeaModel {
        @NameInMap("DedicatedHostId")
        public String dedicatedHostId;

        @NameInMap("DedicatedHostName")
        public String dedicatedHostName;

        public static DescribeRCInstanceAttributeResponseBodyDedicatedHostAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCInstanceAttributeResponseBodyDedicatedHostAttribute self = new DescribeRCInstanceAttributeResponseBodyDedicatedHostAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeRCInstanceAttributeResponseBodyDedicatedHostAttribute setDedicatedHostId(String dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        public DescribeRCInstanceAttributeResponseBodyDedicatedHostAttribute setDedicatedHostName(String dedicatedHostName) {
            this.dedicatedHostName = dedicatedHostName;
            return this;
        }
        public String getDedicatedHostName() {
            return this.dedicatedHostName;
        }

    }

    public static class DescribeRCInstanceAttributeResponseBodyEipAddress extends TeaModel {
        @NameInMap("AllocationId")
        public String allocationId;

        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("InternetChargeType")
        public String internetChargeType;

        @NameInMap("IpAddress")
        public String ipAddress;

        public static DescribeRCInstanceAttributeResponseBodyEipAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCInstanceAttributeResponseBodyEipAddress self = new DescribeRCInstanceAttributeResponseBodyEipAddress();
            return TeaModel.build(map, self);
        }

        public DescribeRCInstanceAttributeResponseBodyEipAddress setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public DescribeRCInstanceAttributeResponseBodyEipAddress setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeRCInstanceAttributeResponseBodyEipAddress setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeRCInstanceAttributeResponseBodyEipAddress setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class DescribeRCInstanceAttributeResponseBodyInnerIpAddress extends TeaModel {
        @NameInMap("IpAddress")
        public java.util.List<String> ipAddress;

        public static DescribeRCInstanceAttributeResponseBodyInnerIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCInstanceAttributeResponseBodyInnerIpAddress self = new DescribeRCInstanceAttributeResponseBodyInnerIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeRCInstanceAttributeResponseBodyInnerIpAddress setIpAddress(java.util.List<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class DescribeRCInstanceAttributeResponseBodyOperationLocksLockReason extends TeaModel {
        @NameInMap("LockReason")
        public String lockReason;

        public static DescribeRCInstanceAttributeResponseBodyOperationLocksLockReason build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCInstanceAttributeResponseBodyOperationLocksLockReason self = new DescribeRCInstanceAttributeResponseBodyOperationLocksLockReason();
            return TeaModel.build(map, self);
        }

        public DescribeRCInstanceAttributeResponseBodyOperationLocksLockReason setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

    }

    public static class DescribeRCInstanceAttributeResponseBodyOperationLocks extends TeaModel {
        @NameInMap("LockReason")
        public java.util.List<DescribeRCInstanceAttributeResponseBodyOperationLocksLockReason> lockReason;

        public static DescribeRCInstanceAttributeResponseBodyOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCInstanceAttributeResponseBodyOperationLocks self = new DescribeRCInstanceAttributeResponseBodyOperationLocks();
            return TeaModel.build(map, self);
        }

        public DescribeRCInstanceAttributeResponseBodyOperationLocks setLockReason(java.util.List<DescribeRCInstanceAttributeResponseBodyOperationLocksLockReason> lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public java.util.List<DescribeRCInstanceAttributeResponseBodyOperationLocksLockReason> getLockReason() {
            return this.lockReason;
        }

    }

    public static class DescribeRCInstanceAttributeResponseBodyPublicIpAddress extends TeaModel {
        @NameInMap("IpAddress")
        public java.util.List<String> ipAddress;

        public static DescribeRCInstanceAttributeResponseBodyPublicIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCInstanceAttributeResponseBodyPublicIpAddress self = new DescribeRCInstanceAttributeResponseBodyPublicIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeRCInstanceAttributeResponseBodyPublicIpAddress setIpAddress(java.util.List<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class DescribeRCInstanceAttributeResponseBodySecurityGroupIds extends TeaModel {
        @NameInMap("SecurityGroupId")
        public java.util.List<String> securityGroupId;

        public static DescribeRCInstanceAttributeResponseBodySecurityGroupIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCInstanceAttributeResponseBodySecurityGroupIds self = new DescribeRCInstanceAttributeResponseBodySecurityGroupIds();
            return TeaModel.build(map, self);
        }

        public DescribeRCInstanceAttributeResponseBodySecurityGroupIds setSecurityGroupId(java.util.List<String> securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public java.util.List<String> getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

    public static class DescribeRCInstanceAttributeResponseBodyVpcAttributesPrivateIpAddress extends TeaModel {
        @NameInMap("IpAddress")
        public java.util.List<String> ipAddress;

        public static DescribeRCInstanceAttributeResponseBodyVpcAttributesPrivateIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCInstanceAttributeResponseBodyVpcAttributesPrivateIpAddress self = new DescribeRCInstanceAttributeResponseBodyVpcAttributesPrivateIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeRCInstanceAttributeResponseBodyVpcAttributesPrivateIpAddress setIpAddress(java.util.List<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class DescribeRCInstanceAttributeResponseBodyVpcAttributes extends TeaModel {
        @NameInMap("NatIpAddress")
        public String natIpAddress;

        @NameInMap("PrivateIpAddress")
        public DescribeRCInstanceAttributeResponseBodyVpcAttributesPrivateIpAddress privateIpAddress;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeRCInstanceAttributeResponseBodyVpcAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCInstanceAttributeResponseBodyVpcAttributes self = new DescribeRCInstanceAttributeResponseBodyVpcAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeRCInstanceAttributeResponseBodyVpcAttributes setNatIpAddress(String natIpAddress) {
            this.natIpAddress = natIpAddress;
            return this;
        }
        public String getNatIpAddress() {
            return this.natIpAddress;
        }

        public DescribeRCInstanceAttributeResponseBodyVpcAttributes setPrivateIpAddress(DescribeRCInstanceAttributeResponseBodyVpcAttributesPrivateIpAddress privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public DescribeRCInstanceAttributeResponseBodyVpcAttributesPrivateIpAddress getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public DescribeRCInstanceAttributeResponseBodyVpcAttributes setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeRCInstanceAttributeResponseBodyVpcAttributes setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
