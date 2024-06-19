// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeDedicatedClusterInstanceListResponseBody extends TeaModel {
    /**
     * <p>Details of the instances.</p>
     */
    @NameInMap("Instances")
    public java.util.List<DescribeDedicatedClusterInstanceListResponseBodyInstances> instances;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
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
     * <p>712CCF2A-16BD-411B-93F7-E978BEF2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDedicatedClusterInstanceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedClusterInstanceListResponseBody self = new DescribeDedicatedClusterInstanceListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedClusterInstanceListResponseBody setInstances(java.util.List<DescribeDedicatedClusterInstanceListResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<DescribeDedicatedClusterInstanceListResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public DescribeDedicatedClusterInstanceListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDedicatedClusterInstanceListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDedicatedClusterInstanceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDedicatedClusterInstanceListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDedicatedClusterInstanceListResponseBodyInstancesInstanceNodeList extends TeaModel {
        /**
         * <p>The ID of the host in the dedicated cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>ch-bp13vf0y9gx3c****</p>
         */
        @NameInMap("DedicatedHostName")
        public String dedicatedHostName;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1e7vl6ygf1yq****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>17921111</p>
         */
        @NameInMap("NodeId")
        public Integer nodeId;

        /**
         * <p>The IP address of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.33.***</p>
         */
        @NameInMap("NodeIp")
        public String nodeIp;

        /**
         * <p>The node type. Valid values:</p>
         * <ul>
         * <li><strong>db</strong>: data node.</li>
         * <li><strong>proxy</strong>: proxy node.</li>
         * <li><strong>normal</strong>: regular node. This value is returned when the instance runs in the standard architecture.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The port number that is used to connect to the node.</p>
         * 
         * <strong>example:</strong>
         * <p>3001</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The role of the node. Valid values:</p>
         * <ul>
         * <li><strong>master</strong>: master node</li>
         * <li><strong>slave</strong>: replica node</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>master</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The zone ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDedicatedClusterInstanceListResponseBodyInstancesInstanceNodeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedClusterInstanceListResponseBodyInstancesInstanceNodeList self = new DescribeDedicatedClusterInstanceListResponseBodyInstancesInstanceNodeList();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstancesInstanceNodeList setDedicatedHostName(String dedicatedHostName) {
            this.dedicatedHostName = dedicatedHostName;
            return this;
        }
        public String getDedicatedHostName() {
            return this.dedicatedHostName;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstancesInstanceNodeList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstancesInstanceNodeList setNodeId(Integer nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Integer getNodeId() {
            return this.nodeId;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstancesInstanceNodeList setNodeIp(String nodeIp) {
            this.nodeIp = nodeIp;
            return this;
        }
        public String getNodeIp() {
            return this.nodeIp;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstancesInstanceNodeList setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstancesInstanceNodeList setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstancesInstanceNodeList setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstancesInstanceNodeList setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDedicatedClusterInstanceListResponseBodyInstances extends TeaModel {
        /**
         * <p>The default bandwidth of the instance. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("BandWidth")
        public Long bandWidth;

        /**
         * <p>The architecture of the instance. Valid values:</p>
         * <ul>
         * <li><strong>logic</strong>: cluster</li>
         * <li><strong>normal</strong>: standard</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>logic</p>
         */
        @NameInMap("CharacterType")
        public String characterType;

        /**
         * <p>The ID of the dedicated cluster to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>dhg-rx71fc5ndh9o****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the dedicated cluster to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>testname</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The private endpoint of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>r-t4ncdi1dgi0ja8****.redis.hangzhou.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionDomain")
        public String connectionDomain;

        /**
         * <p>The time when the instance was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-06T07:09:40Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The current bandwidth of the instance, which is the sum of the default bandwidth and any extra bandwidth that is purchased. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("CurrentBandWidth")
        public Long currentBandWidth;

        /**
         * <p>An internal parameter used for the maintenance and management of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>4652****</p>
         */
        @NameInMap("CustomId")
        public String customId;

        /**
         * <p>The database engine. The return value is <strong>redis</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>redis</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The database engine version of the instance. The return value is <strong>5.0</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>5.0</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>redis.cluster.sharding.common.ce</p>
         */
        @NameInMap("InstanceClass")
        public String instanceClass;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1e7vl6ygf1yq****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>testdb</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The nodes.</p>
         */
        @NameInMap("InstanceNodeList")
        public java.util.List<DescribeDedicatedClusterInstanceListResponseBodyInstancesInstanceNodeList> instanceNodeList;

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
         * <p>The end time of the maintenance window. The time is in the <em>HH:mm</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>17:00Z</p>
         */
        @NameInMap("MaintainEndTime")
        public String maintainEndTime;

        /**
         * <p>The start time of the maintenance window. The time is in the <em>HH:mm</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>16:00Z</p>
         */
        @NameInMap("MaintainStartTime")
        public String maintainStartTime;

        /**
         * <p>The number of proxy nodes.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If the return value is <strong>0</strong>, the proxy mode is disabled for the instance. If the return value is an integer greater than <strong>0</strong>, such as <strong>1</strong>, the proxy mode is enabled for the instance.</p>
         * </li>
         * <li><p>This parameter is returned only when the instance is a cluster instance. For more information about cluster instances, see <a href="https://help.aliyun.com/document_detail/52228.html">Cluster master-replica instances</a>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ProxyCount")
        public Integer proxyCount;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The number of shards.</p>
         * <blockquote>
         * <p> This parameter is returned only when the instance is a cluster instance. For more information about cluster instances, see <a href="https://help.aliyun.com/document_detail/52228.html">Cluster master-replica instances</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ShardCount")
        public Integer shardCount;

        /**
         * <p>The storage type of the instance. The return value is LOCAL_SSD, which indicates <a href="https://help.aliyun.com/document_detail/122389.html">enhanced SSDs (ESSDs)</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>LOCAL_SSD</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-t4n2clc70t3hqwsrr****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-t4nvrca24dczppq44****</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-e</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDedicatedClusterInstanceListResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedClusterInstanceListResponseBodyInstances self = new DescribeDedicatedClusterInstanceListResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstances setBandWidth(Long bandWidth) {
            this.bandWidth = bandWidth;
            return this;
        }
        public Long getBandWidth() {
            return this.bandWidth;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstances setCharacterType(String characterType) {
            this.characterType = characterType;
            return this;
        }
        public String getCharacterType() {
            return this.characterType;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstances setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstances setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstances setConnectionDomain(String connectionDomain) {
            this.connectionDomain = connectionDomain;
            return this;
        }
        public String getConnectionDomain() {
            return this.connectionDomain;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstances setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstances setCurrentBandWidth(Long currentBandWidth) {
            this.currentBandWidth = currentBandWidth;
            return this;
        }
        public Long getCurrentBandWidth() {
            return this.currentBandWidth;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstances setCustomId(String customId) {
            this.customId = customId;
            return this;
        }
        public String getCustomId() {
            return this.customId;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstances setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstances setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstances setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstances setInstanceNodeList(java.util.List<DescribeDedicatedClusterInstanceListResponseBodyInstancesInstanceNodeList> instanceNodeList) {
            this.instanceNodeList = instanceNodeList;
            return this;
        }
        public java.util.List<DescribeDedicatedClusterInstanceListResponseBodyInstancesInstanceNodeList> getInstanceNodeList() {
            return this.instanceNodeList;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstances setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstances setMaintainEndTime(String maintainEndTime) {
            this.maintainEndTime = maintainEndTime;
            return this;
        }
        public String getMaintainEndTime() {
            return this.maintainEndTime;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstances setMaintainStartTime(String maintainStartTime) {
            this.maintainStartTime = maintainStartTime;
            return this;
        }
        public String getMaintainStartTime() {
            return this.maintainStartTime;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstances setProxyCount(Integer proxyCount) {
            this.proxyCount = proxyCount;
            return this;
        }
        public Integer getProxyCount() {
            return this.proxyCount;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstances setShardCount(Integer shardCount) {
            this.shardCount = shardCount;
            return this;
        }
        public Integer getShardCount() {
            return this.shardCount;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstances setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstances setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstances setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public DescribeDedicatedClusterInstanceListResponseBodyInstances setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
