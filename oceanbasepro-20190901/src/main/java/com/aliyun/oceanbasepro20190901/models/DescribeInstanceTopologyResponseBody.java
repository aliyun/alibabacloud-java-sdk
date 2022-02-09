// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceTopologyResponseBody extends TeaModel {
    // 集群的拓扑信息。
    @NameInMap("InstanceTopology")
    public DescribeInstanceTopologyResponseBodyInstanceTopology instanceTopology;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceTopologyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTopologyResponseBody self = new DescribeInstanceTopologyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTopologyResponseBody setInstanceTopology(DescribeInstanceTopologyResponseBodyInstanceTopology instanceTopology) {
        this.instanceTopology = instanceTopology;
        return this;
    }
    public DescribeInstanceTopologyResponseBodyInstanceTopology getInstanceTopology() {
        return this.instanceTopology;
    }

    public DescribeInstanceTopologyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceTopologyResponseBodyInstanceTopologyTenantsTenantZonesUnits extends TeaModel {
        // 是否可以取消迁移。该字段只对正在手动迁入中或手动迁出中的unit有效。
        @NameInMap("EnableCancelMigrateUnit")
        public Boolean enableCancelMigrateUnit;

        // 是否可做迁移。
        @NameInMap("EnableMigrateUnit")
        public Boolean enableMigrateUnit;

        // 是否为手动迁移。
        @NameInMap("ManualMigrate")
        public Boolean manualMigrate;

        // 资源节点所在的observer节点ID
        @NameInMap("NodeId")
        public String nodeId;

        // 资源节点CPU，单位：核。
        @NameInMap("UnitCpu")
        public Float unitCpu;

        // 资源节点ID
        @NameInMap("UnitId")
        public String unitId;

        // 资源节点内存大小，单位：GB。
        @NameInMap("UnitMemory")
        public Float unitMemory;

        // 资源节点的状态。 ONLINE: 运行中 IMMIGRATING 迁入中 EMIGRATING: 迁出中 CANCEL_EMIGRATING: 取消迁入中 CANCEL_EMIGRATING：取消迁出中 DELETING：删除中
        @NameInMap("UnitStatus")
        public String unitStatus;

        public static DescribeInstanceTopologyResponseBodyInstanceTopologyTenantsTenantZonesUnits build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTopologyResponseBodyInstanceTopologyTenantsTenantZonesUnits self = new DescribeInstanceTopologyResponseBodyInstanceTopologyTenantsTenantZonesUnits();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyTenantsTenantZonesUnits setEnableCancelMigrateUnit(Boolean enableCancelMigrateUnit) {
            this.enableCancelMigrateUnit = enableCancelMigrateUnit;
            return this;
        }
        public Boolean getEnableCancelMigrateUnit() {
            return this.enableCancelMigrateUnit;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyTenantsTenantZonesUnits setEnableMigrateUnit(Boolean enableMigrateUnit) {
            this.enableMigrateUnit = enableMigrateUnit;
            return this;
        }
        public Boolean getEnableMigrateUnit() {
            return this.enableMigrateUnit;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyTenantsTenantZonesUnits setManualMigrate(Boolean manualMigrate) {
            this.manualMigrate = manualMigrate;
            return this;
        }
        public Boolean getManualMigrate() {
            return this.manualMigrate;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyTenantsTenantZonesUnits setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyTenantsTenantZonesUnits setUnitCpu(Float unitCpu) {
            this.unitCpu = unitCpu;
            return this;
        }
        public Float getUnitCpu() {
            return this.unitCpu;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyTenantsTenantZonesUnits setUnitId(String unitId) {
            this.unitId = unitId;
            return this;
        }
        public String getUnitId() {
            return this.unitId;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyTenantsTenantZonesUnits setUnitMemory(Float unitMemory) {
            this.unitMemory = unitMemory;
            return this;
        }
        public Float getUnitMemory() {
            return this.unitMemory;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyTenantsTenantZonesUnits setUnitStatus(String unitStatus) {
            this.unitStatus = unitStatus;
            return this;
        }
        public String getUnitStatus() {
            return this.unitStatus;
        }

    }

    public static class DescribeInstanceTopologyResponseBodyInstanceTopologyTenantsTenantZones extends TeaModel {
        // 是否为主可用区
        @NameInMap("IsPrimaryTenantZone")
        public String isPrimaryTenantZone;

        // 可用区ID。
        @NameInMap("TenantZoneId")
        public String tenantZoneId;

        // 可用区的访问角色。 - ReadWrite：可读可写 - ReadOnly：只读。
        @NameInMap("TenantZoneRole")
        public String tenantZoneRole;

        // 资源节点信息列表
        @NameInMap("Units")
        public java.util.List<DescribeInstanceTopologyResponseBodyInstanceTopologyTenantsTenantZonesUnits> units;

        public static DescribeInstanceTopologyResponseBodyInstanceTopologyTenantsTenantZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTopologyResponseBodyInstanceTopologyTenantsTenantZones self = new DescribeInstanceTopologyResponseBodyInstanceTopologyTenantsTenantZones();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyTenantsTenantZones setIsPrimaryTenantZone(String isPrimaryTenantZone) {
            this.isPrimaryTenantZone = isPrimaryTenantZone;
            return this;
        }
        public String getIsPrimaryTenantZone() {
            return this.isPrimaryTenantZone;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyTenantsTenantZones setTenantZoneId(String tenantZoneId) {
            this.tenantZoneId = tenantZoneId;
            return this;
        }
        public String getTenantZoneId() {
            return this.tenantZoneId;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyTenantsTenantZones setTenantZoneRole(String tenantZoneRole) {
            this.tenantZoneRole = tenantZoneRole;
            return this;
        }
        public String getTenantZoneRole() {
            return this.tenantZoneRole;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyTenantsTenantZones setUnits(java.util.List<DescribeInstanceTopologyResponseBodyInstanceTopologyTenantsTenantZonesUnits> units) {
            this.units = units;
            return this;
        }
        public java.util.List<DescribeInstanceTopologyResponseBodyInstanceTopologyTenantsTenantZonesUnits> getUnits() {
            return this.units;
        }

    }

    public static class DescribeInstanceTopologyResponseBodyInstanceTopologyTenants extends TeaModel {
        // 租户CPU，单位：核。
        @NameInMap("TenantCpu")
        public Float tenantCpu;

        // 租户的部署类型。 - multiple：多机房 - single：单机房 - dual：双机房。
        @NameInMap("TenantDeployType")
        public String tenantDeployType;

        // 租户ID。
        @NameInMap("TenantId")
        public String tenantId;

        // 租户内存大小，单位：GB。
        @NameInMap("TenantMemory")
        public Float tenantMemory;

        // 租户模式。 - Oracle：Oracle模式 - MySQL：MySQL模式。
        @NameInMap("TenantMode")
        public String tenantMode;

        // 租户名称。
        @NameInMap("TenantName")
        public String tenantName;

        // 租户状态。 - PENDING_CREATE: 创建中 - RESTORE: 恢复中 - ONLINE: 运行中 - SPEC_MODIFYING: 规格修改中 - ALLOCATING_INTERNET_ADDRESS: 公网地址分配中 - PENDING_OFFLINE_INTERNET_ADDRESS: 公网地址关闭中 - PRIMARY_ZONE_MODIFYING: 切主可用区中 - PARAMETER_MODIFYING: 参数修改中 - WHITE_LIST_MODIFING: 白名单修改中
        @NameInMap("TenantStatus")
        public String tenantStatus;

        // 租户的unit个数。
        @NameInMap("TenantUnitNum")
        public Integer tenantUnitNum;

        // 租户的可用区信息。
        @NameInMap("TenantZones")
        public java.util.List<DescribeInstanceTopologyResponseBodyInstanceTopologyTenantsTenantZones> tenantZones;

        public static DescribeInstanceTopologyResponseBodyInstanceTopologyTenants build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTopologyResponseBodyInstanceTopologyTenants self = new DescribeInstanceTopologyResponseBodyInstanceTopologyTenants();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyTenants setTenantCpu(Float tenantCpu) {
            this.tenantCpu = tenantCpu;
            return this;
        }
        public Float getTenantCpu() {
            return this.tenantCpu;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyTenants setTenantDeployType(String tenantDeployType) {
            this.tenantDeployType = tenantDeployType;
            return this;
        }
        public String getTenantDeployType() {
            return this.tenantDeployType;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyTenants setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyTenants setTenantMemory(Float tenantMemory) {
            this.tenantMemory = tenantMemory;
            return this;
        }
        public Float getTenantMemory() {
            return this.tenantMemory;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyTenants setTenantMode(String tenantMode) {
            this.tenantMode = tenantMode;
            return this;
        }
        public String getTenantMode() {
            return this.tenantMode;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyTenants setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyTenants setTenantStatus(String tenantStatus) {
            this.tenantStatus = tenantStatus;
            return this;
        }
        public String getTenantStatus() {
            return this.tenantStatus;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyTenants setTenantUnitNum(Integer tenantUnitNum) {
            this.tenantUnitNum = tenantUnitNum;
            return this;
        }
        public Integer getTenantUnitNum() {
            return this.tenantUnitNum;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyTenants setTenantZones(java.util.List<DescribeInstanceTopologyResponseBodyInstanceTopologyTenantsTenantZones> tenantZones) {
            this.tenantZones = tenantZones;
            return this;
        }
        public java.util.List<DescribeInstanceTopologyResponseBodyInstanceTopologyTenantsTenantZones> getTenantZones() {
            return this.tenantZones;
        }

    }

    public static class DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResourceCpu extends TeaModel {
        // 节点总的CPU，单位：核。
        @NameInMap("TotalCpu")
        public Integer totalCpu;

        // 节点已使用的CPU，单位：核。
        @NameInMap("UsedCpu")
        public Float usedCpu;

        public static DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResourceCpu build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResourceCpu self = new DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResourceCpu();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResourceCpu setTotalCpu(Integer totalCpu) {
            this.totalCpu = totalCpu;
            return this;
        }
        public Integer getTotalCpu() {
            return this.totalCpu;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResourceCpu setUsedCpu(Float usedCpu) {
            this.usedCpu = usedCpu;
            return this;
        }
        public Float getUsedCpu() {
            return this.usedCpu;
        }

    }

    public static class DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResourceDiskSize extends TeaModel {
        // 节点总存储空间，单位：GB。
        @NameInMap("TotalDiskSize")
        public Long totalDiskSize;

        // 节点已使用的存储空间，单位：GB。
        @NameInMap("UsedDiskSize")
        public Long usedDiskSize;

        public static DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResourceDiskSize build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResourceDiskSize self = new DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResourceDiskSize();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResourceDiskSize setTotalDiskSize(Long totalDiskSize) {
            this.totalDiskSize = totalDiskSize;
            return this;
        }
        public Long getTotalDiskSize() {
            return this.totalDiskSize;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResourceDiskSize setUsedDiskSize(Long usedDiskSize) {
            this.usedDiskSize = usedDiskSize;
            return this;
        }
        public Long getUsedDiskSize() {
            return this.usedDiskSize;
        }

    }

    public static class DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResourceMemory extends TeaModel {
        // 节点的总内存，单位：GB。
        @NameInMap("TotalMemory")
        public Long totalMemory;

        // 节点已使用的内存，单位：GB。
        @NameInMap("UsedMemory")
        public Float usedMemory;

        public static DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResourceMemory build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResourceMemory self = new DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResourceMemory();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResourceMemory setTotalMemory(Long totalMemory) {
            this.totalMemory = totalMemory;
            return this;
        }
        public Long getTotalMemory() {
            return this.totalMemory;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResourceMemory setUsedMemory(Float usedMemory) {
            this.usedMemory = usedMemory;
            return this;
        }
        public Float getUsedMemory() {
            return this.usedMemory;
        }

    }

    public static class DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResource extends TeaModel {
        // 节点CPU资源信息。
        @NameInMap("Cpu")
        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResourceCpu cpu;

        // 节点存储资源信息。
        @NameInMap("DiskSize")
        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResourceDiskSize diskSize;

        // 节点内存资源信息。
        @NameInMap("Memory")
        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResourceMemory memory;

        public static DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResource self = new DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResource();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResource setCpu(DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResourceCpu cpu) {
            this.cpu = cpu;
            return this;
        }
        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResourceCpu getCpu() {
            return this.cpu;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResource setDiskSize(DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResourceDiskSize diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResourceDiskSize getDiskSize() {
            return this.diskSize;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResource setMemory(DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResourceMemory memory) {
            this.memory = memory;
            return this;
        }
        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResourceMemory getMemory() {
            return this.memory;
        }

    }

    public static class DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodes extends TeaModel {
        // 节点归属的副本ID。
        @NameInMap("NodeCopyId")
        public Long nodeCopyId;

        // 节点ID。
        @NameInMap("NodeId")
        public String nodeId;

        // 节点资源信息。
        @NameInMap("NodeResource")
        public java.util.List<DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResource> nodeResource;

        // 节点运行状态。
        @NameInMap("NodeStatus")
        public String nodeStatus;

        public static DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodes self = new DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodes();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodes setNodeCopyId(Long nodeCopyId) {
            this.nodeCopyId = nodeCopyId;
            return this;
        }
        public Long getNodeCopyId() {
            return this.nodeCopyId;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodes setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodes setNodeResource(java.util.List<DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResource> nodeResource) {
            this.nodeResource = nodeResource;
            return this;
        }
        public java.util.List<DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResource> getNodeResource() {
            return this.nodeResource;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodes setNodeStatus(String nodeStatus) {
            this.nodeStatus = nodeStatus;
            return this;
        }
        public String getNodeStatus() {
            return this.nodeStatus;
        }

    }

    public static class DescribeInstanceTopologyResponseBodyInstanceTopologyZones extends TeaModel {
        // 节点信息。
        @NameInMap("Nodes")
        public java.util.List<DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodes> nodes;

        // 地域ID。
        @NameInMap("Region")
        public String region;

        // 可用区的存储容量。
        @NameInMap("ZoneDisk")
        public String zoneDisk;

        // 可用区ID。
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeInstanceTopologyResponseBodyInstanceTopologyZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTopologyResponseBodyInstanceTopologyZones self = new DescribeInstanceTopologyResponseBodyInstanceTopologyZones();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyZones setNodes(java.util.List<DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodes> getNodes() {
            return this.nodes;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyZones setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyZones setZoneDisk(String zoneDisk) {
            this.zoneDisk = zoneDisk;
            return this;
        }
        public String getZoneDisk() {
            return this.zoneDisk;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeInstanceTopologyResponseBodyInstanceTopology extends TeaModel {
        // 租户信息。
        @NameInMap("Tenants")
        public java.util.List<DescribeInstanceTopologyResponseBodyInstanceTopologyTenants> tenants;

        // 集群的可用区信息。
        @NameInMap("Zones")
        public java.util.List<DescribeInstanceTopologyResponseBodyInstanceTopologyZones> zones;

        public static DescribeInstanceTopologyResponseBodyInstanceTopology build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTopologyResponseBodyInstanceTopology self = new DescribeInstanceTopologyResponseBodyInstanceTopology();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopology setTenants(java.util.List<DescribeInstanceTopologyResponseBodyInstanceTopologyTenants> tenants) {
            this.tenants = tenants;
            return this;
        }
        public java.util.List<DescribeInstanceTopologyResponseBodyInstanceTopologyTenants> getTenants() {
            return this.tenants;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopology setZones(java.util.List<DescribeInstanceTopologyResponseBodyInstanceTopologyZones> zones) {
            this.zones = zones;
            return this;
        }
        public java.util.List<DescribeInstanceTopologyResponseBodyInstanceTopologyZones> getZones() {
            return this.zones;
        }

    }

}
