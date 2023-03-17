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
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
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
         */
        @NameInMap("DedicatedHostName")
        public String dedicatedHostName;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the node.</p>
         */
        @NameInMap("NodeId")
        public Integer nodeId;

        /**
         * <p>The IP address of the node.</p>
         */
        @NameInMap("NodeIp")
        public String nodeIp;

        /**
         * <p>The node type. Valid values:</p>
         * <br>
         * <p>*   **db**: data node.</p>
         * <p>*   **proxy**: proxy node.</p>
         * <p>*   **normal**: regular node. This value is returned when the instance runs in the standard architecture.</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The port number that is used to connect to the node.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The role of the node. Valid values:</p>
         * <br>
         * <p>*   **master**: master node</p>
         * <p>*   **slave**: replica node</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The zone ID of the node.</p>
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
         */
        @NameInMap("BandWidth")
        public Long bandWidth;

        /**
         * <p>The architecture of the instance. Valid values:</p>
         * <br>
         * <p>*   **logic**: cluster</p>
         * <p>*   **normal**: standard</p>
         */
        @NameInMap("CharacterType")
        public String characterType;

        /**
         * <p>The ID of the dedicated cluster.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the dedicated cluster to which the instance belongs.</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The private endpoint of the instance.</p>
         */
        @NameInMap("ConnectionDomain")
        public String connectionDomain;

        /**
         * <p>The time when the instance was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The current bandwidth of the instance, which consists of the default bandwidth and the additional bandwidth. Unit: Mbit/s.</p>
         */
        @NameInMap("CurrentBandWidth")
        public Long currentBandWidth;

        /**
         * <p>The custom ID that is used for instance internal maintenance.</p>
         */
        @NameInMap("CustomId")
        public String customId;

        /**
         * <p>The database engine of the instance. The return value is **Redis**.</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The database engine version of the instance. The return value is **5.0**.</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The instance type of the instance.</p>
         */
        @NameInMap("InstanceClass")
        public String instanceClass;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the instance.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>Details about the nodes.</p>
         */
        @NameInMap("InstanceNodeList")
        public java.util.List<DescribeDedicatedClusterInstanceListResponseBodyInstancesInstanceNodeList> instanceNodeList;

        /**
         * <p>The state of the instance. Valid values:</p>
         * <br>
         * <p>*   **Normal**: The instance is normal.</p>
         * <p>*   **Creating**: The instance is being created.</p>
         * <p>*   **Changing**: The configurations of the instance are being changed.</p>
         * <p>*   **Inactive**: The instance is disabled.</p>
         * <p>*   **Flushing**: The instance is being released.</p>
         * <p>*   **Released**: The instance is released.</p>
         * <p>*   **Transforming**: The billing method of the instance is being changed.</p>
         * <p>*   **Unavailable**: The instance is suspended.</p>
         * <p>*   **Error**: The instance failed to be created.</p>
         * <p>*   **Migrating**: The instance is being migrated.</p>
         * <p>*   **BackupRecovering**: The instance is being restored from a backup.</p>
         * <p>*   **MinorVersionUpgrading**: The minor version of the instance is being updated.</p>
         * <p>*   **NetworkModifying**: The network type of the instance is being changed.</p>
         * <p>*   **SSLModifying**: The SSL certificate of the instance is being changed.</p>
         * <p>*   **MajorVersionUpgrading**: The major version of the instance is being upgraded. The instance remains accessible during the upgrade.</p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        /**
         * <p>The end time of the maintenance window. The time is in the *HH:mm*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("MaintainEndTime")
        public String maintainEndTime;

        /**
         * <p>The start time of the maintenance window. The time is in the *HH:mm*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("MaintainStartTime")
        public String maintainStartTime;

        /**
         * <p>The number of proxy nodes.</p>
         * <br>
         * <p>> *   If the return value is **0**, the proxy mode is disabled. If the return value is an integer that is greater than **0**, the proxy mode is enabled. This integer indicates the number of proxy nodes in the instance. For example, a value of **1** indicates that the instance has one proxy node.</p>
         * <p>> *   This parameter is returned only when the instance is a [cluster instance](~~52228~~).</p>
         */
        @NameInMap("ProxyCount")
        public Integer proxyCount;

        /**
         * <p>The region ID of the instance.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The number of shards.</p>
         * <br>
         * <p>> This parameter is returned only when the ApsaraDB for Redis instance is a [cluster instance](~~52228~~).</p>
         */
        @NameInMap("ShardCount")
        public Integer shardCount;

        /**
         * <p>The storage type of the instance. The return value is LOCAL_SSD, which indicates [enhanced SSDs (ESSDs)](~~122389~~).</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>The ID of the VPC.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the vSwitch.</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        /**
         * <p>The zone ID of the instance.</p>
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
