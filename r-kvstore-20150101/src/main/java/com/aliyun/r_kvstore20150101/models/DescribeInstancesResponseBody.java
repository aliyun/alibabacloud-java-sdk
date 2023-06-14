// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponseBody extends TeaModel {
    /**
     * <p>The network type of the instance. Valid values:</p>
     * <br>
     * <p>*   **CLASSIC**: classic network</p>
     * <p>*   **VPC**: Virtual Private Cloud (VPC)</p>
     */
    @NameInMap("Instances")
    public DescribeInstancesResponseBodyInstances instances;

    /**
     * <p>Indicates whether your Alibaba Cloud account has pending orders for renewal and configuration change. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The zone ID of the instance.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The total number of instances that were queried.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The time when the instance was created.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesResponseBody self = new DescribeInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesResponseBody setInstances(DescribeInstancesResponseBodyInstances instances) {
        this.instances = instances;
        return this;
    }
    public DescribeInstancesResponseBodyInstances getInstances() {
        return this.instances;
    }

    public DescribeInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeInstancesResponseBodyInstancesKVStoreInstanceTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeInstancesResponseBodyInstancesKVStoreInstanceTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesKVStoreInstanceTagsTag self = new DescribeInstancesResponseBodyInstancesKVStoreInstanceTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstanceTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstanceTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesKVStoreInstanceTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeInstancesResponseBodyInstancesKVStoreInstanceTagsTag> tag;

        public static DescribeInstancesResponseBodyInstancesKVStoreInstanceTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesKVStoreInstanceTags self = new DescribeInstancesResponseBodyInstancesKVStoreInstanceTags();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstanceTags setTag(java.util.List<DescribeInstancesResponseBodyInstancesKVStoreInstanceTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesKVStoreInstanceTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesKVStoreInstance extends TeaModel {
        /**
         * <p>The ID of the VPC.</p>
         */
        @NameInMap("ArchitectureType")
        public String architectureType;

        /**
         * <p>The zone ID of the instance.</p>
         */
        @NameInMap("Bandwidth")
        public Long bandwidth;

        /**
         * <p>The value of tag N of the instance.</p>
         */
        @NameInMap("Capacity")
        public Long capacity;

        /**
         * <p>The time when the instance was deleted.</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("CloudType")
        public String cloudType;

        /**
         * <p>The ID of the vSwitch to which the instance is connected.</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The number of data shards in the instance.</p>
         * <br>
         * <p>>  This parameter is returned only if the instance is a cluster instance that uses cloud disks.</p>
         */
        @NameInMap("ConnectionDomain")
        public String connectionDomain;

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <br>
         * <p>*   **CLASSIC**: classic network</p>
         * <p>*   **VPC**: VPC</p>
         */
        @NameInMap("ConnectionMode")
        public String connectionMode;

        @NameInMap("Connections")
        public Long connections;

        /**
         * <p>The ID of the secondary zone.</p>
         * <br>
         * <p>>  If multiple zones are returned for **ZoneId** such as cn-hangzhou-MAZ10(h,i), this parameter is ignored.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DestroyTime")
        public String destroyTime;

        @NameInMap("EditionType")
        public String editionType;

        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>Indicates whether the instance is managed by ApsaraDB RDS. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The value of the tag.</p>
         */
        @NameInMap("GlobalInstanceId")
        public String globalInstanceId;

        @NameInMap("HasRenewChangeOrder")
        public Boolean hasRenewChangeOrder;

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <br>
         * <p>*   **PrePaid**: subscription</p>
         * <p>*   **PostPaid**: pay-as-you-go</p>
         */
        @NameInMap("InstanceClass")
        public String instanceClass;

        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The storage capacity of the instance. Unit: MB.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceStatus")
        public String instanceStatus;

        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The state of the instance. Valid values:</p>
         * <br>
         * <p>*   **Normal**: The instance is normal.</p>
         * <p>*   **Creating**: The instance is being created.</p>
         * <p>*   **Changing**: The configurations of the instance are being changed.</p>
         * <p>*   **Inactive**: The instance is disabled.</p>
         * <p>*   **Flushing**: The instance is being released.</p>
         * <p>*   **Released**: The instance is released.</p>
         * <p>*   **Transforming**: The billing method of the instance is changing.</p>
         * <p>*   **Unavailable**: The instance is suspended.</p>
         * <p>*   **Error**: The instance failed to be created.</p>
         * <p>*   **Migrating**: The instance is being migrated.</p>
         * <p>*   **BackupRecovering**: The instance is being restored from a backup.</p>
         * <p>*   **MinorVersionUpgrading**: The minor version of the instance is being updated.</p>
         * <p>*   **NetworkModifying**: The network type of the instance is being changed.</p>
         * <p>*   **SSLModifying**: The SSL certificate of the instance is being changed.</p>
         * <p>*   **MajorVersionUpgrading**: The major version of the instance is being upgraded. The instance remains available during the upgrade.</p>
         */
        @NameInMap("IsRds")
        public Boolean isRds;

        /**
         * <p>This parameter is returned only if the instance is in a cloud box.</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         */
        @NameInMap("PackageType")
        public String packageType;

        /**
         * <p>The instance type. For more information, see [Instance types](~~107984~~).</p>
         */
        @NameInMap("Port")
        public Long port;

        /**
         * <p>The plan type. Valid values:</p>
         * <br>
         * <p>*   **standard**: standard plan</p>
         * <p>*   **customized**: custom plan</p>
         */
        @NameInMap("PrivateIp")
        public String privateIp;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("QPS")
        public Long QPS;

        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The architecture of the instance. Valid values:</p>
         * <br>
         * <p>*   **cluster**: cluster architecture</p>
         * <p>*   **standard**: standard architecture</p>
         * <p>*   **rwsplit**: read/write splitting architecture</p>
         */
        @NameInMap("ReplacateId")
        public String replacateId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Specifies whether to return the child instances of distributed instances. Valid values:</p>
         * <br>
         * <p>*   **true**: Only child instances are returned.</p>
         * <p>*   **false**: Child instances are not returned.</p>
         */
        @NameInMap("SecondaryZoneId")
        public String secondaryZoneId;

        @NameInMap("ShardClass")
        public String shardClass;

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         * <br>
         * <p>>  You can query resource group IDs by using the ApsaraDB for Redis console or by calling the [ListResourceGroups](~~158855~~) operation. For more information, see [View basic information of a resource group](~~151181~~).</p>
         */
        @NameInMap("ShardCount")
        public Integer shardCount;

        @NameInMap("Tags")
        public DescribeInstancesResponseBodyInstancesKVStoreInstanceTags tags;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("UserName")
        public String userName;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The database engine version of the instance. Valid values: **2.8**, **4.0**, and **5.0**.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeInstancesResponseBodyInstancesKVStoreInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesKVStoreInstance self = new DescribeInstancesResponseBodyInstancesKVStoreInstance();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstance setArchitectureType(String architectureType) {
            this.architectureType = architectureType;
            return this;
        }
        public String getArchitectureType() {
            return this.architectureType;
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstance setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstance setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstance setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstance setCloudType(String cloudType) {
            this.cloudType = cloudType;
            return this;
        }
        public String getCloudType() {
            return this.cloudType;
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstance setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstance setConnectionDomain(String connectionDomain) {
            this.connectionDomain = connectionDomain;
            return this;
        }
        public String getConnectionDomain() {
            return this.connectionDomain;
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstance setConnectionMode(String connectionMode) {
            this.connectionMode = connectionMode;
            return this;
        }
        public String getConnectionMode() {
            return this.connectionMode;
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstance setConnections(Long connections) {
            this.connections = connections;
            return this;
        }
        public Long getConnections() {
            return this.connections;
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstance setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstance setDestroyTime(String destroyTime) {
            this.destroyTime = destroyTime;
            return this;
        }
        public String getDestroyTime() {
            return this.destroyTime;
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstance setEditionType(String editionType) {
            this.editionType = editionType;
            return this;
        }
        public String getEditionType() {
            return this.editionType;
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstance setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstance setGlobalInstanceId(String globalInstanceId) {
            this.globalInstanceId = globalInstanceId;
            return this;
        }
        public String getGlobalInstanceId() {
            return this.globalInstanceId;
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstance setHasRenewChangeOrder(Boolean hasRenewChangeOrder) {
            this.hasRenewChangeOrder = hasRenewChangeOrder;
            return this;
        }
        public Boolean getHasRenewChangeOrder() {
            return this.hasRenewChangeOrder;
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstance setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstance setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstance setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstance setIsRds(Boolean isRds) {
            this.isRds = isRds;
            return this;
        }
        public Boolean getIsRds() {
            return this.isRds;
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstance setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstance setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstance setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstance setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstance setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstance setQPS(Long QPS) {
            this.QPS = QPS;
            return this;
        }
        public Long getQPS() {
            return this.QPS;
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstance setReplacateId(String replacateId) {
            this.replacateId = replacateId;
            return this;
        }
        public String getReplacateId() {
            return this.replacateId;
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstance setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstance setSecondaryZoneId(String secondaryZoneId) {
            this.secondaryZoneId = secondaryZoneId;
            return this;
        }
        public String getSecondaryZoneId() {
            return this.secondaryZoneId;
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstance setShardClass(String shardClass) {
            this.shardClass = shardClass;
            return this;
        }
        public String getShardClass() {
            return this.shardClass;
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstance setShardCount(Integer shardCount) {
            this.shardCount = shardCount;
            return this;
        }
        public Integer getShardCount() {
            return this.shardCount;
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstance setTags(DescribeInstancesResponseBodyInstancesKVStoreInstanceTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesKVStoreInstanceTags getTags() {
            return this.tags;
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstance setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstance setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstance setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeInstancesResponseBodyInstancesKVStoreInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("KVStoreInstance")
        public java.util.List<DescribeInstancesResponseBodyInstancesKVStoreInstance> KVStoreInstance;

        public static DescribeInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstances self = new DescribeInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstances setKVStoreInstance(java.util.List<DescribeInstancesResponseBodyInstancesKVStoreInstance> KVStoreInstance) {
            this.KVStoreInstance = KVStoreInstance;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesKVStoreInstance> getKVStoreInstance() {
            return this.KVStoreInstance;
        }

    }

}
