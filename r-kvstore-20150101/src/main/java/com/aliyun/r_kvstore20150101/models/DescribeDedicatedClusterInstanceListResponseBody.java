// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeDedicatedClusterInstanceListResponseBody extends TeaModel {
    @NameInMap("Instances")
    public java.util.List<DescribeDedicatedClusterInstanceListResponseBodyInstances> instances;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("DedicatedHostName")
        public String dedicatedHostName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("NodeId")
        public Integer nodeId;

        @NameInMap("NodeIp")
        public String nodeIp;

        @NameInMap("NodeType")
        public String nodeType;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Role")
        public String role;

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
        @NameInMap("BandWidth")
        public Long bandWidth;

        @NameInMap("CharacterType")
        public String characterType;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("ConnectionDomain")
        public String connectionDomain;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CurrentBandWidth")
        public Long currentBandWidth;

        @NameInMap("CustomId")
        public String customId;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("InstanceClass")
        public String instanceClass;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceNodeList")
        public java.util.List<DescribeDedicatedClusterInstanceListResponseBodyInstancesInstanceNodeList> instanceNodeList;

        @NameInMap("InstanceStatus")
        public String instanceStatus;

        @NameInMap("MaintainEndTime")
        public String maintainEndTime;

        @NameInMap("MaintainStartTime")
        public String maintainStartTime;

        @NameInMap("ProxyCount")
        public Integer proxyCount;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ShardCount")
        public Integer shardCount;

        @NameInMap("StorageType")
        public String storageType;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VswitchId")
        public String vswitchId;

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
