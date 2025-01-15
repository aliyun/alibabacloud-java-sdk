// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCInstanceAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the cluster to which the instance belongs.</p>
     * <blockquote>
     * <p> This parameter will be deprecated. We recommend that you use other parameters to ensure compatibility.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The number of CPU cores.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("Cpu")
    public Integer cpu;

    /**
     * <p>The time when the instance was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-04-22T06:52:23Z</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>The performance mode of the burstable instance.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("CreditSpecification")
    public String creditSpecification;

    /**
     * <p>The details of the data disk.</p>
     */
    @NameInMap("DataDisks")
    public DescribeRCInstanceAttributeResponseBodyDataDisks dataDisks;

    @NameInMap("DbType")
    public String dbType;

    /**
     * <p>The attributes of the dedicated hosts.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("DedicatedHostAttribute")
    public DescribeRCInstanceAttributeResponseBodyDedicatedHostAttribute dedicatedHostAttribute;

    /**
     * <p>The ID of the deployment set.</p>
     * 
     * <strong>example:</strong>
     * <p>ds-uf6c8qerk019bj1l****</p>
     */
    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    /**
     * <p>The instance description.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("DiskType")
    public String diskType;

    /**
     * <p>The Elastic Compute Service (ECS) instance family.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g6.2xlarge</p>
     */
    @NameInMap("EcsInstanceType")
    public String ecsInstanceType;

    /**
     * <p>The elastic IP address (EIP) associated with the instance.</p>
     */
    @NameInMap("EipAddress")
    public DescribeRCInstanceAttributeResponseBodyEipAddress eipAddress;

    /**
     * <p>Indicates whether the Jumbo Frame feature is enabled for the instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableJumboFrame")
    public Boolean enableJumboFrame;

    /**
     * <p>The expiration time. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-08-10T00:00:00Z</p>
     */
    @NameInMap("ExpiredTime")
    public String expiredTime;

    /**
     * <p>The instance hostname.</p>
     * 
     * <strong>example:</strong>
     * <p>iZ2zej1n3cin51rlmby****</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The storage type of the host. Valid values:</p>
     * <ul>
     * <li><strong>dhg_cloud_ssd</strong>: ESSD</li>
     * <li><strong>dhg_local_ssd</strong>: local SSD</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dhg_cloud_ssd</p>
     */
    @NameInMap("HostType")
    public String hostType;

    /**
     * <p>The image ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>m-2oqiu973jwcxe****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The private IP addresses of the instance in the classic network.</p>
     */
    @NameInMap("InnerIpAddress")
    public DescribeRCInstanceAttributeResponseBodyInnerIpAddress innerIpAddress;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rc-dh2jf9n6j4s14926****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The network type. Valid values:</p>
     * <ul>
     * <li><strong>classic</strong></li>
     * <li><strong>vpc</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    /**
     * <p>The instance type of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql.x4.xlarge.6cm</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The billing method for network usage. Valid values:</p>
     * <ul>
     * <li><strong>PayByBandwidth</strong>: pay-by-bandwidth</li>
     * <li><strong>PayByTraffic</strong>: pay-by-data-transfer</li>
     * </ul>
     * <blockquote>
     * <p> If the <strong>pay-by-traffic</strong> billing method is used for network usage, the maximum inbound and outbound bandwidths are used as the upper limits of bandwidths instead of guaranteed performance specifications. In scenarios in which demands exceed resource supplies, the maximum bandwidths may not be reached. If you want guaranteed bandwidths for your instance, use the <strong>pay-by-bandwidth</strong> billing method for network usage.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PayByTraffic</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The maximum inbound bandwidth from the Internet. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("InternetMaxBandwidthIn")
    public Integer internetMaxBandwidthIn;

    /**
     * <p>The maximum outbound bandwidth to the Internet. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    /**
     * <p>Indicates whether the instance is I/O optimized.</p>
     * <ul>
     * <li><strong>optimized</strong>: The instance is I/O optimized.</li>
     * <li><strong>none</strong>: The instance is not I/O optimized.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>optimized</p>
     */
    @NameInMap("IoOptimized")
    public String ioOptimized;

    /**
     * <p>The name of the key pair.</p>
     * 
     * <strong>example:</strong>
     * <p>test_01</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The memory capacity of the instance. Unit: MiB.</p>
     * 
     * <strong>example:</strong>
     * <p>8192</p>
     */
    @NameInMap("Memory")
    public Integer memory;

    /**
     * <p>The reasons why the instance is locked.</p>
     */
    @NameInMap("OperationLocks")
    public DescribeRCInstanceAttributeResponseBodyOperationLocks operationLocks;

    /**
     * <p>The public IP address of the instance.</p>
     */
    @NameInMap("PublicIpAddress")
    public DescribeRCInstanceAttributeResponseBodyPublicIpAddress publicIpAddress;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EA2D4F34-01A7-46EB-A339-D80882135206</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The security groups.</p>
     */
    @NameInMap("SecurityGroupIds")
    public DescribeRCInstanceAttributeResponseBodySecurityGroupIds securityGroupIds;

    /**
     * <p>The serial number of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>b076f6ff-46d1-4234-a608-4e951ed6****</p>
     */
    @NameInMap("SerialNumber")
    public String serialNumber;

    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>The instance status. Valid values:</p>
     * <ul>
     * <li><strong>Pending</strong></li>
     * <li><strong>Running</strong></li>
     * <li><strong>Starting</strong></li>
     * <li><strong>Stopping</strong></li>
     * <li><strong>Stopped</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the billing of the instance continues after the instance is stopped. Valid values:</p>
     * <ul>
     * <li><strong>KeepCharging</strong>: The billing of the instance continues after the instance is stopped, and resources are retained for the instance.</li>
     * <li><strong>StopCharging</strong>: The billing of the instance stops after the instance is stopped. After the instance is stopped, resources such as CPU cores, memory resources, and public IP address are released. The instance may be unable to restart if some required resources are out of stock in the current region.</li>
     * <li><strong>Not-applicable</strong>: The No Fees for Stopped Instances feature is not supported for the instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Not-applicable</p>
     */
    @NameInMap("StoppedMode")
    public String stoppedMode;

    @NameInMap("SystemDisk")
    public DescribeRCInstanceAttributeResponseBodySystemDisk systemDisk;

    @NameInMap("Tags")
    public DescribeRCInstanceAttributeResponseBodyTags tags;

    /**
     * <p>The virtual LAN (VLAN) ID of the instance.</p>
     * <blockquote>
     * <p> This parameter will be deprecated. We recommend that you use other parameters to ensure compatibility.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("VlanId")
    public String vlanId;

    /**
     * <p>The virtual private cloud (VPC) attributes of the instance.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("VpcAttributes")
    public DescribeRCInstanceAttributeResponseBodyVpcAttributes vpcAttributes;

    /**
     * <p>The zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
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

    public DescribeRCInstanceAttributeResponseBody setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
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

    public DescribeRCInstanceAttributeResponseBody setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
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

    public DescribeRCInstanceAttributeResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public DescribeRCInstanceAttributeResponseBody setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
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

    public DescribeRCInstanceAttributeResponseBody setSystemDisk(DescribeRCInstanceAttributeResponseBodySystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public DescribeRCInstanceAttributeResponseBodySystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public DescribeRCInstanceAttributeResponseBody setTags(DescribeRCInstanceAttributeResponseBodyTags tags) {
        this.tags = tags;
        return this;
    }
    public DescribeRCInstanceAttributeResponseBodyTags getTags() {
        return this.tags;
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
        /**
         * <p>The category of the data disk.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Indicates whether the data disk is released when the instance is released. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The data disk is released when the instance is released.</li>
         * <li><strong>false</strong>: The data disk is reserved when the instance is released.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        /**
         * <p>Indicates whether the data disk is encrypted. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Encrypted")
        public String encrypted;

        /**
         * <p>The performance level of data disk. This parameter is available when the data disk is an Enterprise SSD (ESSD).</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The size of the data disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
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
        /**
         * <p>The ID of the dedicated host.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("DedicatedHostId")
        public String dedicatedHostId;

        /**
         * <p>The name of the dedicated host.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
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
        /**
         * <p>The EIP ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-bp14k3rz6cbg6zxbe****</p>
         */
        @NameInMap("AllocationId")
        public String allocationId;

        /**
         * <p>The maximum Internet bandwidth of the EIP. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The billing method of the Internet-facing instance. Valid values:</p>
         * <ul>
         * <li><strong>paybytraffic:</strong> pay-by-data-transfer</li>
         * <li><strong>paybybandwidth</strong>: pay-by-bandwidth</li>
         * </ul>
         * <blockquote>
         * <p> If the <strong>pay-by-traffic</strong> billing method is used for network usage, the maximum inbound and outbound bandwidths are used as the upper limits of bandwidths instead of guaranteed performance specifications. In scenarios in which demands exceed resource supplies, the maximum bandwidths may not be reached. If you want guaranteed bandwidths for your instance, use the <strong>pay-by-bandwidth</strong> billing method for network usage.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>paybytraffic</p>
         */
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        /**
         * <p>The EIP.</p>
         * 
         * <strong>example:</strong>
         * <p>8.147.XXX.XXX</p>
         */
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
        /**
         * <p>The reason why the instance is locked. Valid values:</p>
         * <ul>
         * <li><strong>financial</strong>: The instance is locked due to overdue payments.</li>
         * <li><strong>security</strong>: The instance is locked for security purposes.</li>
         * <li><strong>recycling</strong>: The instance is locked because the instance is a preemptible instance and pending to be released.</li>
         * <li><strong>dedicatedhostfinancial</strong>: The instance is locked due to overdue payments for the dedicated host.</li>
         * <li><strong>refunded</strong>: The instance is locked because a refund was made for the instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
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

    public static class DescribeRCInstanceAttributeResponseBodySystemDisk extends TeaModel {
        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        @NameInMap("Encrypted")
        public String encrypted;

        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        @NameInMap("SystemDiskPerformanceLevel")
        public String systemDiskPerformanceLevel;

        @NameInMap("SystemDiskSize")
        public Long systemDiskSize;

        public static DescribeRCInstanceAttributeResponseBodySystemDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCInstanceAttributeResponseBodySystemDisk self = new DescribeRCInstanceAttributeResponseBodySystemDisk();
            return TeaModel.build(map, self);
        }

        public DescribeRCInstanceAttributeResponseBodySystemDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public DescribeRCInstanceAttributeResponseBodySystemDisk setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public DescribeRCInstanceAttributeResponseBodySystemDisk setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public DescribeRCInstanceAttributeResponseBodySystemDisk setSystemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
            this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
            return this;
        }
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
        }

        public DescribeRCInstanceAttributeResponseBodySystemDisk setSystemDiskSize(Long systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Long getSystemDiskSize() {
            return this.systemDiskSize;
        }

    }

    public static class DescribeRCInstanceAttributeResponseBodyTagsTag extends TeaModel {
        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeRCInstanceAttributeResponseBodyTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCInstanceAttributeResponseBodyTagsTag self = new DescribeRCInstanceAttributeResponseBodyTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeRCInstanceAttributeResponseBodyTagsTag setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeRCInstanceAttributeResponseBodyTagsTag setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeRCInstanceAttributeResponseBodyTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeRCInstanceAttributeResponseBodyTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeRCInstanceAttributeResponseBodyTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeRCInstanceAttributeResponseBodyTagsTag> tag;

        public static DescribeRCInstanceAttributeResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCInstanceAttributeResponseBodyTags self = new DescribeRCInstanceAttributeResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeRCInstanceAttributeResponseBodyTags setTag(java.util.List<DescribeRCInstanceAttributeResponseBodyTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeRCInstanceAttributeResponseBodyTagsTag> getTag() {
            return this.tag;
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
        /**
         * <p>The network address translation (NAT) IP address of the instance. The NAT IP address is used by instances in different VPCs for communication.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("NatIpAddress")
        public String natIpAddress;

        /**
         * <p>The private IP addresses of the instance.</p>
         */
        @NameInMap("PrivateIpAddress")
        public DescribeRCInstanceAttributeResponseBodyVpcAttributesPrivateIpAddress privateIpAddress;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1nt15muovrc5qdj****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zeu747v4765aw2id****</p>
         */
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
