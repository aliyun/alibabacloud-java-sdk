// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInstanceAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Instances")
    public DescribeInstanceAttributeResponseBodyInstances instances;

    public static DescribeInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAttributeResponseBody self = new DescribeInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceAttributeResponseBody setInstances(DescribeInstanceAttributeResponseBodyInstances instances) {
        this.instances = instances;
        return this;
    }
    public DescribeInstanceAttributeResponseBodyInstances getInstances() {
        return this.instances;
    }

    public static class DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttributeTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttributeTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttributeTagsTag self = new DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttributeTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttributeTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttributeTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttributeTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttributeTagsTag> tag;

        public static DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttributeTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttributeTags self = new DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttributeTags();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttributeTags setTag(java.util.List<DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttributeTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttributeTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("ConnectionDomain")
        public String connectionDomain;

        @NameInMap("Port")
        public Long port;

        @NameInMap("InstanceStatus")
        public String instanceStatus;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Capacity")
        public Long capacity;

        @NameInMap("InstanceClass")
        public String instanceClass;

        @NameInMap("QPS")
        public Long QPS;

        @NameInMap("Bandwidth")
        public Long bandwidth;

        @NameInMap("Connections")
        public Long connections;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("Config")
        public String config;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("NodeType")
        public String nodeType;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("PrivateIp")
        public String privateIp;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("HasRenewChangeOrder")
        public String hasRenewChangeOrder;

        @NameInMap("IsRds")
        public Boolean isRds;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("MaintainStartTime")
        public String maintainStartTime;

        @NameInMap("MaintainEndTime")
        public String maintainEndTime;

        @NameInMap("AvailabilityValue")
        public String availabilityValue;

        @NameInMap("SecurityIPList")
        public String securityIPList;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("ArchitectureType")
        public String architectureType;

        @NameInMap("PackageType")
        public String packageType;

        @NameInMap("ReplicaId")
        public String replicaId;

        @NameInMap("VpcAuthMode")
        public String vpcAuthMode;

        @NameInMap("AuditLogRetention")
        public String auditLogRetention;

        @NameInMap("ReplicationMode")
        public String replicationMode;

        @NameInMap("VpcCloudInstanceId")
        public String vpcCloudInstanceId;

        @NameInMap("InstanceReleaseProtection")
        public Boolean instanceReleaseProtection;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ShardCount")
        public Integer shardCount;

        @NameInMap("GlobalInstanceId")
        public String globalInstanceId;

        @NameInMap("Tags")
        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttributeTags tags;

        public static DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute self = new DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setConnectionDomain(String connectionDomain) {
            this.connectionDomain = connectionDomain;
            return this;
        }
        public String getConnectionDomain() {
            return this.connectionDomain;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setQPS(Long QPS) {
            this.QPS = QPS;
            return this;
        }
        public Long getQPS() {
            return this.QPS;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setConnections(Long connections) {
            this.connections = connections;
            return this;
        }
        public Long getConnections() {
            return this.connections;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setHasRenewChangeOrder(String hasRenewChangeOrder) {
            this.hasRenewChangeOrder = hasRenewChangeOrder;
            return this;
        }
        public String getHasRenewChangeOrder() {
            return this.hasRenewChangeOrder;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setIsRds(Boolean isRds) {
            this.isRds = isRds;
            return this;
        }
        public Boolean getIsRds() {
            return this.isRds;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setMaintainStartTime(String maintainStartTime) {
            this.maintainStartTime = maintainStartTime;
            return this;
        }
        public String getMaintainStartTime() {
            return this.maintainStartTime;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setMaintainEndTime(String maintainEndTime) {
            this.maintainEndTime = maintainEndTime;
            return this;
        }
        public String getMaintainEndTime() {
            return this.maintainEndTime;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setAvailabilityValue(String availabilityValue) {
            this.availabilityValue = availabilityValue;
            return this;
        }
        public String getAvailabilityValue() {
            return this.availabilityValue;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setArchitectureType(String architectureType) {
            this.architectureType = architectureType;
            return this;
        }
        public String getArchitectureType() {
            return this.architectureType;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setReplicaId(String replicaId) {
            this.replicaId = replicaId;
            return this;
        }
        public String getReplicaId() {
            return this.replicaId;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setVpcAuthMode(String vpcAuthMode) {
            this.vpcAuthMode = vpcAuthMode;
            return this;
        }
        public String getVpcAuthMode() {
            return this.vpcAuthMode;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setAuditLogRetention(String auditLogRetention) {
            this.auditLogRetention = auditLogRetention;
            return this;
        }
        public String getAuditLogRetention() {
            return this.auditLogRetention;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setReplicationMode(String replicationMode) {
            this.replicationMode = replicationMode;
            return this;
        }
        public String getReplicationMode() {
            return this.replicationMode;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setVpcCloudInstanceId(String vpcCloudInstanceId) {
            this.vpcCloudInstanceId = vpcCloudInstanceId;
            return this;
        }
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setInstanceReleaseProtection(Boolean instanceReleaseProtection) {
            this.instanceReleaseProtection = instanceReleaseProtection;
            return this;
        }
        public Boolean getInstanceReleaseProtection() {
            return this.instanceReleaseProtection;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setShardCount(Integer shardCount) {
            this.shardCount = shardCount;
            return this;
        }
        public Integer getShardCount() {
            return this.shardCount;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setGlobalInstanceId(String globalInstanceId) {
            this.globalInstanceId = globalInstanceId;
            return this;
        }
        public String getGlobalInstanceId() {
            return this.globalInstanceId;
        }

        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute setTags(DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttributeTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttributeTags getTags() {
            return this.tags;
        }

    }

    public static class DescribeInstanceAttributeResponseBodyInstances extends TeaModel {
        @NameInMap("DBInstanceAttribute")
        public java.util.List<DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute> DBInstanceAttribute;

        public static DescribeInstanceAttributeResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseBodyInstances self = new DescribeInstanceAttributeResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAttributeResponseBodyInstances setDBInstanceAttribute(java.util.List<DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute> DBInstanceAttribute) {
            this.DBInstanceAttribute = DBInstanceAttribute;
            return this;
        }
        public java.util.List<DescribeInstanceAttributeResponseBodyInstancesDBInstanceAttribute> getDBInstanceAttribute() {
            return this.DBInstanceAttribute;
        }

    }

}
