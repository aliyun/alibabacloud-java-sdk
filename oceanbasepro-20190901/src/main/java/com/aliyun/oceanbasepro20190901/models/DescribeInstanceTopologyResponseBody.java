// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceTopologyResponseBody extends TeaModel {
    /**
     * <p>The number of CPU cores used by the node.</p>
     */
    @NameInMap("InstanceTopology")
    public DescribeInstanceTopologyResponseBodyInstanceTopology instanceTopology;

    /**
     * <p>The information about the CPU resources of the node.</p>
     */
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
        /**
         * <p>Indicates whether the migration can be canceled.   </p>
         * <p>This field is valid only for units that are being manually immigrated or emigrated.</p>
         */
        @NameInMap("EnableCancelMigrateUnit")
        public Boolean enableCancelMigrateUnit;

        /**
         * <p>The return result of the request.</p>
         */
        @NameInMap("EnableMigrateUnit")
        public Boolean enableMigrateUnit;

        /**
         * <p>The return result of the request.</p>
         */
        @NameInMap("ManualMigrate")
        public Boolean manualMigrate;

        /**
         * <p>It is an online CLI tool that allows you to quickly retrieve and debug APIs. It can dynamically generate executable SDK code samples.</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("ReplicaType")
        public String replicaType;

        /**
         * <p>Alibaba Cloud CLI</p>
         */
        @NameInMap("UnitCpu")
        public Float unitCpu;

        /**
         * <p>The operation that you want to perform.   </p>
         * <p>Set the value to **DescribeInstanceTopology**.</p>
         */
        @NameInMap("UnitDataSize")
        public Long unitDataSize;

        /**
         * <p>The topology of the cluster.</p>
         */
        @NameInMap("UnitId")
        public String unitId;

        /**
         * <p>The ID of the tenant.</p>
         */
        @NameInMap("UnitMemory")
        public Float unitMemory;

        /**
         * <p>You can call this operation to query the topology of an OceanBase cluster.</p>
         */
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

        public DescribeInstanceTopologyResponseBodyInstanceTopologyTenantsTenantZonesUnits setReplicaType(String replicaType) {
            this.replicaType = replicaType;
            return this;
        }
        public String getReplicaType() {
            return this.replicaType;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyTenantsTenantZonesUnits setUnitCpu(Float unitCpu) {
            this.unitCpu = unitCpu;
            return this;
        }
        public Float getUnitCpu() {
            return this.unitCpu;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyTenantsTenantZonesUnits setUnitDataSize(Long unitDataSize) {
            this.unitDataSize = unitDataSize;
            return this;
        }
        public Long getUnitDataSize() {
            return this.unitDataSize;
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
        /**
         * <p>The maximum disk usage, in percentage.</p>
         */
        @NameInMap("IsPrimaryTenantZone")
        public String isPrimaryTenantZone;

        /**
         * <p>The server with the highest disk usage.</p>
         */
        @NameInMap("TenantZoneId")
        public String tenantZoneId;

        /**
         * <p>The information of zones.</p>
         */
        @NameInMap("TenantZoneRole")
        public String tenantZoneRole;

        /**
         * <p>The information about the storage resources.</p>
         */
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
        /**
         * <p>The server with the highest disk usage.</p>
         */
        @NameInMap("PrimaryZoneDeployType")
        public String primaryZoneDeployType;

        /**
         * <p>The information about the memory resources of the node.</p>
         */
        @NameInMap("TenantCpu")
        public Float tenantCpu;

        /**
         * <p>The name of the tenant.</p>
         */
        @NameInMap("TenantDeployType")
        public String tenantDeployType;

        /**
         * <p>The size of used memory of the node, in GB.</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The total storage space of the node, in GB.</p>
         */
        @NameInMap("TenantMemory")
        public Float tenantMemory;

        /**
         * <p>The size of used storage space of the node, in GB.</p>
         */
        @NameInMap("TenantMode")
        public String tenantMode;

        /**
         * <p>The total memory size of the node, in GB.</p>
         */
        @NameInMap("TenantName")
        public String tenantName;

        /**
         * <p>The size of used memory of the node, in GB.</p>
         */
        @NameInMap("TenantStatus")
        public String tenantStatus;

        /**
         * <p>The number of CPU cores of the tenant.</p>
         */
        @NameInMap("TenantUnitNum")
        public Integer tenantUnitNum;

        /**
         * <p>The information about the storage resources of the node.</p>
         */
        @NameInMap("TenantZones")
        public java.util.List<DescribeInstanceTopologyResponseBodyInstanceTopologyTenantsTenantZones> tenantZones;

        public static DescribeInstanceTopologyResponseBodyInstanceTopologyTenants build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTopologyResponseBodyInstanceTopologyTenants self = new DescribeInstanceTopologyResponseBodyInstanceTopologyTenants();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyTenants setPrimaryZoneDeployType(String primaryZoneDeployType) {
            this.primaryZoneDeployType = primaryZoneDeployType;
            return this;
        }
        public String getPrimaryZoneDeployType() {
            return this.primaryZoneDeployType;
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
        /**
         * <p>The size of used storage space of the node, in GB.</p>
         */
        @NameInMap("TotalCpu")
        public Integer totalCpu;

        /**
         * <p>Indicates whether migration can be performed.</p>
         */
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
        /**
         * <p>The deployment type of the primary zone.</p>
         */
        @NameInMap("TotalDiskSize")
        public Double totalDiskSize;

        /**
         * <p>The status of the tenant.   </p>
         * <p>- PENDING_CREATE: The tenant is being created.   </p>
         * <p>- RESTORE: The tenant is being recovered.   </p>
         * <p>- ONLINE: The tenant is running.   </p>
         * <p>- SPEC_MODIFYING: The specification of the tenant is being modified.   </p>
         * <p>- ALLOCATING_INTERNET_ADDRESS: An Internet address is being allocated.   </p>
         * <p>- PENDING_OFFLINE_INTERNET_ADDRESS: The Internet address is being disabled.   </p>
         * <p>- PRIMARY_ZONE_MODIFYING: The tenant is switching to a new primary zone.   </p>
         * <p>- PARAMETER_MODIFYING: Parameters are being modified.   </p>
         * <p>- WHITE_LIST_MODIFYING: The whitelist is being modified.</p>
         */
        @NameInMap("UsedDiskSize")
        public Double usedDiskSize;

        public static DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResourceDiskSize build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResourceDiskSize self = new DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResourceDiskSize();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResourceDiskSize setTotalDiskSize(Double totalDiskSize) {
            this.totalDiskSize = totalDiskSize;
            return this;
        }
        public Double getTotalDiskSize() {
            return this.totalDiskSize;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResourceDiskSize setUsedDiskSize(Double usedDiskSize) {
            this.usedDiskSize = usedDiskSize;
            return this;
        }
        public Double getUsedDiskSize() {
            return this.usedDiskSize;
        }

    }

    public static class DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResourceMemory extends TeaModel {
        /**
         * <p>The ID of the replica node.</p>
         */
        @NameInMap("TotalMemory")
        public Long totalMemory;

        /**
         * <p>The information of node resources.</p>
         */
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
        /**
         * <p>The memory size of the tenant, in GB.</p>
         */
        @NameInMap("Cpu")
        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResourceCpu cpu;

        /**
         * <p>The information about the CPU resources of the node.</p>
         */
        @NameInMap("DiskSize")
        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResourceDiskSize diskSize;

        /**
         * <p>The role to access the zone. Valid values:   </p>
         * <p> - ReadWrite: a role that has the read and write privileges.</p>
         * <p> - ReadOnly: a role that has only the read-only privilege.</p>
         */
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
        @NameInMap("FullCopyId")
        public Long fullCopyId;

        /**
         * <p>The information of zones.</p>
         */
        @NameInMap("NodeCopyId")
        public Long nodeCopyId;

        /**
         * <p>The ID of the resource unit.</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The ID of the node.</p>
         */
        @NameInMap("NodeResource")
        public java.util.List<DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResource> nodeResource;

        /**
         * <p>The ID of the OBServer where the resource unit resides.</p>
         */
        @NameInMap("NodeStatus")
        public String nodeStatus;

        @NameInMap("ReadOnlyCopyId")
        public Long readOnlyCopyId;

        @NameInMap("ReplicaType")
        public String replicaType;

        public static DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodes self = new DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodes();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodes setFullCopyId(Long fullCopyId) {
            this.fullCopyId = fullCopyId;
            return this;
        }
        public Long getFullCopyId() {
            return this.fullCopyId;
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

        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodes setReadOnlyCopyId(Long readOnlyCopyId) {
            this.readOnlyCopyId = readOnlyCopyId;
            return this;
        }
        public Long getReadOnlyCopyId() {
            return this.readOnlyCopyId;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodes setReplicaType(String replicaType) {
            this.replicaType = replicaType;
            return this;
        }
        public String getReplicaType() {
            return this.replicaType;
        }

    }

    public static class DescribeInstanceTopologyResponseBodyInstanceTopologyZonesZoneResourceDiskSize extends TeaModel {
        @NameInMap("MaxDiskUsedObServer")
        public java.util.List<String> maxDiskUsedObServer;

        /**
         * <p>DescribeInstanceTopology</p>
         */
        @NameInMap("MaxDiskUsedPercent")
        public Double maxDiskUsedPercent;

        public static DescribeInstanceTopologyResponseBodyInstanceTopologyZonesZoneResourceDiskSize build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTopologyResponseBodyInstanceTopologyZonesZoneResourceDiskSize self = new DescribeInstanceTopologyResponseBodyInstanceTopologyZonesZoneResourceDiskSize();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesZoneResourceDiskSize setMaxDiskUsedObServer(java.util.List<String> maxDiskUsedObServer) {
            this.maxDiskUsedObServer = maxDiskUsedObServer;
            return this;
        }
        public java.util.List<String> getMaxDiskUsedObServer() {
            return this.maxDiskUsedObServer;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesZoneResourceDiskSize setMaxDiskUsedPercent(Double maxDiskUsedPercent) {
            this.maxDiskUsedPercent = maxDiskUsedPercent;
            return this;
        }
        public Double getMaxDiskUsedPercent() {
            return this.maxDiskUsedPercent;
        }

    }

    public static class DescribeInstanceTopologyResponseBodyInstanceTopologyZonesZoneResource extends TeaModel {
        @NameInMap("DiskSize")
        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesZoneResourceDiskSize diskSize;

        public static DescribeInstanceTopologyResponseBodyInstanceTopologyZonesZoneResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTopologyResponseBodyInstanceTopologyZonesZoneResource self = new DescribeInstanceTopologyResponseBodyInstanceTopologyZonesZoneResource();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesZoneResource setDiskSize(DescribeInstanceTopologyResponseBodyInstanceTopologyZonesZoneResourceDiskSize diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesZoneResourceDiskSize getDiskSize() {
            return this.diskSize;
        }

    }

    public static class DescribeInstanceTopologyResponseBodyInstanceTopologyZones extends TeaModel {
        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("Nodes")
        public java.util.List<DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodes> nodes;

        /**
         * <p>The zone information of the cluster.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The information about the memory resources of the node.</p>
         */
        @NameInMap("ZoneDisk")
        public String zoneDisk;

        /**
         * <p>The information of the tenant.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        /**
         * <p>Example 1</p>
         */
        @NameInMap("ZoneResource")
        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesZoneResource zoneResource;

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

        public DescribeInstanceTopologyResponseBodyInstanceTopologyZones setZoneResource(DescribeInstanceTopologyResponseBodyInstanceTopologyZonesZoneResource zoneResource) {
            this.zoneResource = zoneResource;
            return this;
        }
        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesZoneResource getZoneResource() {
            return this.zoneResource;
        }

    }

    public static class DescribeInstanceTopologyResponseBodyInstanceTopology extends TeaModel {
        /**
         * <p>The total number of CPU cores for the node.</p>
         */
        @NameInMap("Tenants")
        public java.util.List<DescribeInstanceTopologyResponseBodyInstanceTopologyTenants> tenants;

        /**
         * <p>The information about resource units.</p>
         */
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
