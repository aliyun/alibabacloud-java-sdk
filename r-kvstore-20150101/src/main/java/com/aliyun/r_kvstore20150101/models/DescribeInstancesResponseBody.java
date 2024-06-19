// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponseBody extends TeaModel {
    /**
     * <p>Details about the instances.</p>
     */
    @NameInMap("Instances")
    public DescribeInstancesResponseBodyInstances instances;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1E83311F-0EE4-4922-A3BF-730B312B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of instances.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
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
         * <p>The architecture of the instance. Default value: NULL. Valid values:</p>
         * <ul>
         * <li><strong>cluster</strong>: cluster architecture</li>
         * <li><strong>standard</strong>: standard architecture</li>
         * <li><strong>rwsplit</strong>: read/write splitting architecture</li>
         * <li><strong>NULL</strong>: all of the preceding architectures</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cluster</p>
         */
        @NameInMap("ArchitectureType")
        public String architectureType;

        /**
         * <p>The bandwidth of the instance. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>96</p>
         */
        @NameInMap("Bandwidth")
        public Long bandwidth;

        /**
         * <p>The storage capacity of the instance. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>4096</p>
         */
        @NameInMap("Capacity")
        public Long capacity;

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><strong>PrePaid</strong>: subscription</li>
         * <li><strong>PostPaid</strong>: pay-as-you-go</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>This parameter is returned only when the instance is in a cloud box.</p>
         * 
         * <strong>example:</strong>
         * <p>cloudbox</p>
         */
        @NameInMap("CloudType")
        public String cloudType;

        /**
         * <p>The parameter configurations of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/43885.html">Modify parameters of an instance</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;maxmemory-policy\&quot;:\&quot;volatile-lfu\&quot;,\&quot;EvictionPolicy\&quot;:\&quot;volatile-lru\&quot;,\&quot;hash-max-ziplist-entries\&quot;:512,\&quot;zset-max-ziplist-entries\&quot;:128,\&quot;zset-max-ziplist-value\&quot;:64,\&quot;set-max-intset-entries\&quot;:512,\&quot;hash-max-ziplist-value\&quot;:64,\&quot;#no_loose_disabled-commands\&quot;:\&quot;flushall,flushdb\&quot;,\&quot;lazyfree-lazy-eviction\&quot;:\&quot;yes\&quot;}</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The internal endpoint of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1zxszhcgatnx****.redis.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionDomain")
        public String connectionDomain;

        /**
         * <p>The connection mode of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Standard</strong>: standard mode</li>
         * <li><strong>Safe</strong>: database proxy mode</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("ConnectionMode")
        public String connectionMode;

        /**
         * <p>The maximum number of connections supported by the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>20000</p>
         */
        @NameInMap("Connections")
        public Long connections;

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-11-07T08:49:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the instance was deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-04-28T10:03:01Z</p>
         */
        @NameInMap("DestroyTime")
        public String destroyTime;

        /**
         * <p>The edition of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Community</strong>: ApsaraDB for Redis Community Edition</li>
         * <li><strong>Enterprise</strong>: ApsaraDB for Redis Enhanced Edition (Tair)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enterprise</p>
         */
        @NameInMap("EditionType")
        public String editionType;

        /**
         * <p>The time when the subscription instance expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-06-13T16:00:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The engine version of the instance. Valid values: <strong>2.8</strong>, <strong>4.0</strong>, and <strong>5.0</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>4.0</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The ID of the distributed instance.</p>
         * <blockquote>
         * <p> This parameter is returned only if the instance is a child instance of a distributed instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>gr-bp14rkqrhac****</p>
         */
        @NameInMap("GlobalInstanceId")
        public String globalInstanceId;

        /**
         * <p>Indicates whether your Alibaba Cloud account has pending orders for renewal and configuration change. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasRenewChangeOrder")
        public Boolean hasRenewChangeOrder;

        /**
         * <p>The instance class.</p>
         * 
         * <strong>example:</strong>
         * <p>redis.logic.sharding.2g.2db.0rodb.4proxy.default</p>
         */
        @NameInMap("InstanceClass")
        public String instanceClass;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1zxszhcgatnx****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>apitest</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The state of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: The instance is normal.</li>
         * <li><strong>Creating</strong>: The instance is being created.</li>
         * <li><strong>Changing</strong>: The configurations of the instance are being changed.</li>
         * <li><strong>Inactive</strong>: The instance is disabled.</li>
         * <li><strong>Flushing</strong>: The instance is being released.</li>
         * <li><strong>Released</strong>: The instance is released.</li>
         * <li><strong>Transforming</strong>: The billing method of the instance is being changed.</li>
         * <li><strong>Unavailable</strong>: The instance is unavailable.</li>
         * <li><strong>Error</strong>: The instance failed to be created.</li>
         * <li><strong>Migrating</strong>: The instance is being migrated.</li>
         * <li><strong>BackupRecovering</strong>: The instance is being restored from a backup.</li>
         * <li><strong>MinorVersionUpgrading</strong>: The minor version of the instance is being updated.</li>
         * <li><strong>NetworkModifying</strong>: The network type of the instance is being changed.</li>
         * <li><strong>SSLModifying</strong>: The SSL configurations of the instance are being changed.</li>
         * <li><strong>MajorVersionUpgrading</strong>: The major version of the instance is being upgraded. The instance remains accessible during the upgrade.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        /**
         * <p>The database engine of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Tair</strong></li>
         * <li><strong>Redis</strong></li>
         * <li><strong>Memcache</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Redis</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>Indicates whether the instance is managed by ApsaraDB RDS. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsRds")
        public Boolean isRds;

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>CLASSIC</strong></li>
         * <li><strong>VPC</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CLASSIC</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The node type. Valid values:</p>
         * <ul>
         * <li><strong>double</strong>: The instance contains a master node and a replica node.</li>
         * <li><strong>single</strong>: The instance contains only a master node. This node type is phased out.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>double</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The plan type. Valid values:</p>
         * <ul>
         * <li><strong>standard</strong>: standard plan</li>
         * <li><strong>customized</strong>: custom plan</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("PackageType")
        public String packageType;

        /**
         * <p>The service port of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>6379</p>
         */
        @NameInMap("Port")
        public Long port;

        /**
         * <p>The private IP address.</p>
         * <blockquote>
         * <p> This parameter is not returned when the instance is deployed in the classic network.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.16.49.***</p>
         */
        @NameInMap("PrivateIp")
        public String privateIp;

        /**
         * <p>The number of queries per second (QPS).</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("QPS")
        public Long QPS;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The logical ID of the distributed instance.</p>
         * 
         * <strong>example:</strong>
         * <p>grr-bp11381ebc16****</p>
         */
        @NameInMap("ReplacateId")
        public String replacateId;

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmyiu4ekp****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the secondary zone.</p>
         * <blockquote>
         * <p> If multiple zones are returned for <strong>ZoneId</strong>, such as cn-hangzhou-MAZ10(h,i), this parameter is ignored.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("SecondaryZoneId")
        public String secondaryZoneId;

        /**
         * <p>The shard class. For more information about shard classes, see <a href="https://help.aliyun.com/document_detail/26350.html">Overview</a>.</p>
         * <blockquote>
         * <p> The overall performance of a cluster instance is calculated by multiplying the class of a single shard (ShardClass) by the number of shards (ShardCount).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>redis.shard.small.ce</p>
         */
        @NameInMap("ShardClass")
        public String shardClass;

        /**
         * <p>The number of data shards in the cluster instance.</p>
         * <blockquote>
         * <p> This parameter is returned only for cloud-native cluster instances or read/write splitting instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ShardCount")
        public Integer shardCount;

        /**
         * <p>Details about the tags.</p>
         */
        @NameInMap("Tags")
        public DescribeInstancesResponseBodyInstancesKVStoreInstanceTags tags;

        /**
         * <p>The username used to connect to the instance. By default, a username named after the instance ID is included.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1zxszhcgatnx****</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1e7clcw529l773d****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1nme44gek34slfc****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
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
