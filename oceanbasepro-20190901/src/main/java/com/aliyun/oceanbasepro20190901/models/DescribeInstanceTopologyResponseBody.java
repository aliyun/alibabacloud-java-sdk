// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceTopologyResponseBody extends TeaModel {
    /**
     * <p>The topology of the cluster.</p>
     */
    @NameInMap("InstanceTopology")
    public DescribeInstanceTopologyResponseBodyInstanceTopology instanceTopology;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EE205C00-30E4-<strong><strong>-</strong></strong>-87E3A8A2AA0C</p>
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

    public static class DescribeInstanceTopologyResponseBodyInstanceTopologyReplicasReplicaResourceCpu extends TeaModel {
        /**
         * <p>The total number of CPU cores of the replica.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("TotalCpu")
        public Integer totalCpu;

        /**
         * <p>The number of CPU cores used by the replica.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("UsedCpu")
        public Integer usedCpu;

        public static DescribeInstanceTopologyResponseBodyInstanceTopologyReplicasReplicaResourceCpu build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTopologyResponseBodyInstanceTopologyReplicasReplicaResourceCpu self = new DescribeInstanceTopologyResponseBodyInstanceTopologyReplicasReplicaResourceCpu();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyReplicasReplicaResourceCpu setTotalCpu(Integer totalCpu) {
            this.totalCpu = totalCpu;
            return this;
        }
        public Integer getTotalCpu() {
            return this.totalCpu;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyReplicasReplicaResourceCpu setUsedCpu(Integer usedCpu) {
            this.usedCpu = usedCpu;
            return this;
        }
        public Integer getUsedCpu() {
            return this.usedCpu;
        }

    }

    public static class DescribeInstanceTopologyResponseBodyInstanceTopologyReplicasReplicaResourceDiskSize extends TeaModel {
        /**
         * <p>The total disk space of the replica, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalDiskSize")
        public Long totalDiskSize;

        /**
         * <p>The disk space used by the replica, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("UsedDiskSize")
        public Float usedDiskSize;

        public static DescribeInstanceTopologyResponseBodyInstanceTopologyReplicasReplicaResourceDiskSize build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTopologyResponseBodyInstanceTopologyReplicasReplicaResourceDiskSize self = new DescribeInstanceTopologyResponseBodyInstanceTopologyReplicasReplicaResourceDiskSize();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyReplicasReplicaResourceDiskSize setTotalDiskSize(Long totalDiskSize) {
            this.totalDiskSize = totalDiskSize;
            return this;
        }
        public Long getTotalDiskSize() {
            return this.totalDiskSize;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyReplicasReplicaResourceDiskSize setUsedDiskSize(Float usedDiskSize) {
            this.usedDiskSize = usedDiskSize;
            return this;
        }
        public Float getUsedDiskSize() {
            return this.usedDiskSize;
        }

    }

    public static class DescribeInstanceTopologyResponseBodyInstanceTopologyReplicasReplicaResourceMemory extends TeaModel {
        /**
         * <p>The total memory size of the replica, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("TotalMemory")
        public Long totalMemory;

        /**
         * <p>The size of memory used by the replica, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("UsedMemory")
        public Long usedMemory;

        public static DescribeInstanceTopologyResponseBodyInstanceTopologyReplicasReplicaResourceMemory build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTopologyResponseBodyInstanceTopologyReplicasReplicaResourceMemory self = new DescribeInstanceTopologyResponseBodyInstanceTopologyReplicasReplicaResourceMemory();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyReplicasReplicaResourceMemory setTotalMemory(Long totalMemory) {
            this.totalMemory = totalMemory;
            return this;
        }
        public Long getTotalMemory() {
            return this.totalMemory;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyReplicasReplicaResourceMemory setUsedMemory(Long usedMemory) {
            this.usedMemory = usedMemory;
            return this;
        }
        public Long getUsedMemory() {
            return this.usedMemory;
        }

    }

    public static class DescribeInstanceTopologyResponseBodyInstanceTopologyReplicasReplicaResource extends TeaModel {
        /**
         * <p>The information about the CPU resources of the replica.</p>
         */
        @NameInMap("Cpu")
        public DescribeInstanceTopologyResponseBodyInstanceTopologyReplicasReplicaResourceCpu cpu;

        /**
         * <p>The information about the data disk of the replica.</p>
         */
        @NameInMap("DiskSize")
        public DescribeInstanceTopologyResponseBodyInstanceTopologyReplicasReplicaResourceDiskSize diskSize;

        /**
         * <p>The information about the memory resources of the replica.</p>
         */
        @NameInMap("Memory")
        public DescribeInstanceTopologyResponseBodyInstanceTopologyReplicasReplicaResourceMemory memory;

        public static DescribeInstanceTopologyResponseBodyInstanceTopologyReplicasReplicaResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTopologyResponseBodyInstanceTopologyReplicasReplicaResource self = new DescribeInstanceTopologyResponseBodyInstanceTopologyReplicasReplicaResource();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyReplicasReplicaResource setCpu(DescribeInstanceTopologyResponseBodyInstanceTopologyReplicasReplicaResourceCpu cpu) {
            this.cpu = cpu;
            return this;
        }
        public DescribeInstanceTopologyResponseBodyInstanceTopologyReplicasReplicaResourceCpu getCpu() {
            return this.cpu;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyReplicasReplicaResource setDiskSize(DescribeInstanceTopologyResponseBodyInstanceTopologyReplicasReplicaResourceDiskSize diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public DescribeInstanceTopologyResponseBodyInstanceTopologyReplicasReplicaResourceDiskSize getDiskSize() {
            return this.diskSize;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyReplicasReplicaResource setMemory(DescribeInstanceTopologyResponseBodyInstanceTopologyReplicasReplicaResourceMemory memory) {
            this.memory = memory;
            return this;
        }
        public DescribeInstanceTopologyResponseBodyInstanceTopologyReplicasReplicaResourceMemory getMemory() {
            return this.memory;
        }

    }

    public static class DescribeInstanceTopologyResponseBodyInstanceTopologyReplicas extends TeaModel {
        /**
         * <p>The ID of the replica.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h-z0</p>
         */
        @NameInMap("LogicalZone")
        public String logicalZone;

        /**
         * <p>The number of nodes of the replica.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NodeNum")
        public Integer nodeNum;

        /**
         * <p>The type of the read-only replica.</p>
         * 
         * <strong>example:</strong>
         * <p>ROW_STORE</p>
         */
        @NameInMap("ReadOnlyReplicaType")
        public String readOnlyReplicaType;

        /**
         * <p>The information about the replica resources.</p>
         */
        @NameInMap("ReplicaResource")
        public DescribeInstanceTopologyResponseBodyInstanceTopologyReplicasReplicaResource replicaResource;

        /**
         * <p>The type of the replica.</p>
         * 
         * <strong>example:</strong>
         * <p>FULL</p>
         */
        @NameInMap("ReplicaType")
        public String replicaType;

        /**
         * <p>The status of the replica. Valid values: ACTIVE, INACTIVE, and UNKNOWN.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The serial number of the replica.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ZoneLogicalId")
        public Integer zoneLogicalId;

        /**
         * <p>The region of the replica.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("ZoneLogicalName")
        public String zoneLogicalName;

        /**
         * <p>The zone of the replica.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("ZoneRegionName")
        public String zoneRegionName;

        public static DescribeInstanceTopologyResponseBodyInstanceTopologyReplicas build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTopologyResponseBodyInstanceTopologyReplicas self = new DescribeInstanceTopologyResponseBodyInstanceTopologyReplicas();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyReplicas setLogicalZone(String logicalZone) {
            this.logicalZone = logicalZone;
            return this;
        }
        public String getLogicalZone() {
            return this.logicalZone;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyReplicas setNodeNum(Integer nodeNum) {
            this.nodeNum = nodeNum;
            return this;
        }
        public Integer getNodeNum() {
            return this.nodeNum;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyReplicas setReadOnlyReplicaType(String readOnlyReplicaType) {
            this.readOnlyReplicaType = readOnlyReplicaType;
            return this;
        }
        public String getReadOnlyReplicaType() {
            return this.readOnlyReplicaType;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyReplicas setReplicaResource(DescribeInstanceTopologyResponseBodyInstanceTopologyReplicasReplicaResource replicaResource) {
            this.replicaResource = replicaResource;
            return this;
        }
        public DescribeInstanceTopologyResponseBodyInstanceTopologyReplicasReplicaResource getReplicaResource() {
            return this.replicaResource;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyReplicas setReplicaType(String replicaType) {
            this.replicaType = replicaType;
            return this;
        }
        public String getReplicaType() {
            return this.replicaType;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyReplicas setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyReplicas setZoneLogicalId(Integer zoneLogicalId) {
            this.zoneLogicalId = zoneLogicalId;
            return this;
        }
        public Integer getZoneLogicalId() {
            return this.zoneLogicalId;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyReplicas setZoneLogicalName(String zoneLogicalName) {
            this.zoneLogicalName = zoneLogicalName;
            return this;
        }
        public String getZoneLogicalName() {
            return this.zoneLogicalName;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyReplicas setZoneRegionName(String zoneRegionName) {
            this.zoneRegionName = zoneRegionName;
            return this;
        }
        public String getZoneRegionName() {
            return this.zoneRegionName;
        }

    }

    public static class DescribeInstanceTopologyResponseBodyInstanceTopologyTenantsTenantZonesUnits extends TeaModel {
        /**
         * <p>Indicates whether the migration can be canceled. This parameter is valid only for resource units that are being manually immigrated or emigrated.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableCancelMigrateUnit")
        public Boolean enableCancelMigrateUnit;

        /**
         * <p>Indicates whether the resource unit can be migrated.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableMigrateUnit")
        public Boolean enableMigrateUnit;

        /**
         * <p>Indicates whether the resource unit is manually migrated.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ManualMigrate")
        public Boolean manualMigrate;

        /**
         * <p>The ID of the OBServer node in which the resource unit resides.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp16niirq4zdmgvm****</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The type of the replica. Node filtering conditions are configured based on the replica type when you query the monitoring data of the OceanBase cluster. </p>
         * <ul>
         * <li>By default, the replica type is not specified when you query the monitoring data of OceanBase clusters or the access proxy. If you do not specify the replica type when you query the monitoring data of an OceanBase cluster, the monitoring data of all nodes is queried. </li>
         * <li>If you set the replica type to FULL when you query the monitoring data of an OceanBase cluster, the monitoring data of only the full-featured replica nodes is queried. </li>
         * <li>If you set the replica type to READONLY when you query the monitoring data of an OceanBase cluster, the monitoring data of only the read-only replica nodes is queried.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FULL</p>
         */
        @NameInMap("ReplicaType")
        public String replicaType;

        /**
         * <p>The number of CPU cores of the resource unit.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("UnitCpu")
        public Float unitCpu;

        /**
         * <p>The data size of the resource unit.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("UnitDataSize")
        public Long unitDataSize;

        /**
         * <p>The ID of the resource unit.</p>
         * 
         * <strong>example:</strong>
         * <p>1002</p>
         */
        @NameInMap("UnitId")
        public String unitId;

        /**
         * <p>The memory size of the resource unit, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("UnitMemory")
        public Float unitMemory;

        /**
         * <p>The status of the resource unit. Valid values: </p>
         * <ul>
         * <li>ONLINE: The resource unit is running. </li>
         * <li>IMMIGRATING: The resource unit is being immigrated. </li>
         * <li>EMIGRATING: The resource unit is being emigrated. </li>
         * <li>CANCEL_EMIGRATING: The immigration of the resource unit is being canceled. </li>
         * <li>CANCEL_EMIGRATING: The emigration of the resource unit is being canceled. </li>
         * <li>DELETING: The resource unit is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ONLINE</p>
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
         * <p>Indicates whether the zone is the primary zone.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsPrimaryTenantZone")
        public Boolean isPrimaryTenantZone;

        /**
         * <p>The ID of the replica.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h-z0</p>
         */
        @NameInMap("LogicalZone")
        public String logicalZone;

        /**
         * <p>The type of the read-only replica.</p>
         * 
         * <strong>example:</strong>
         * <p>ROW_STORE</p>
         */
        @NameInMap("ReadOnlyReplicaType")
        public String readOnlyReplicaType;

        /**
         * <p>The replica type of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>FULL</p>
         */
        @NameInMap("ReplicaType")
        public String replicaType;

        /**
         * <p>The ID of the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("TenantZoneId")
        public String tenantZoneId;

        /**
         * <p>The role to access the zone. Valid values: </p>
         * <ul>
         * <li>ReadWrite: a role that has the read and write privileges. </li>
         * <li>ReadOnly: a role that has only the read-only privilege.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ReadWrite</p>
         */
        @NameInMap("TenantZoneRole")
        public String tenantZoneRole;

        /**
         * <p>The information about the resource units.</p>
         */
        @NameInMap("Units")
        public java.util.List<DescribeInstanceTopologyResponseBodyInstanceTopologyTenantsTenantZonesUnits> units;

        public static DescribeInstanceTopologyResponseBodyInstanceTopologyTenantsTenantZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTopologyResponseBodyInstanceTopologyTenantsTenantZones self = new DescribeInstanceTopologyResponseBodyInstanceTopologyTenantsTenantZones();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyTenantsTenantZones setIsPrimaryTenantZone(Boolean isPrimaryTenantZone) {
            this.isPrimaryTenantZone = isPrimaryTenantZone;
            return this;
        }
        public Boolean getIsPrimaryTenantZone() {
            return this.isPrimaryTenantZone;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyTenantsTenantZones setLogicalZone(String logicalZone) {
            this.logicalZone = logicalZone;
            return this;
        }
        public String getLogicalZone() {
            return this.logicalZone;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyTenantsTenantZones setReadOnlyReplicaType(String readOnlyReplicaType) {
            this.readOnlyReplicaType = readOnlyReplicaType;
            return this;
        }
        public String getReadOnlyReplicaType() {
            return this.readOnlyReplicaType;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyTenantsTenantZones setReplicaType(String replicaType) {
            this.replicaType = replicaType;
            return this;
        }
        public String getReplicaType() {
            return this.replicaType;
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
         * <p>The deployment mode of the primary zone. Valid values: </p>
         * <ul>
         * <li>RANDOM. </li>
         * <li>STATIC.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RANDOM</p>
         */
        @NameInMap("PrimaryZoneDeployType")
        public String primaryZoneDeployType;

        /**
         * <p>The number of CPU cores of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TenantCpu")
        public Float tenantCpu;

        /**
         * <p>The deployment type of the tenant. Valid values: </p>
         * <ul>
         * <li>multiple: multi-IDC deployment. </li>
         * <li>single: single-IDC deployment. </li>
         * <li>dual: dual-IDC deployment.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>multiple</p>
         */
        @NameInMap("TenantDeployType")
        public String tenantDeployType;

        /**
         * <p>The disk space of the tenant, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TenantDiskSize")
        public Float tenantDiskSize;

        /**
         * <p>The ID of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>t33h8y08k****</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The memory size of the tenant, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TenantMemory")
        public Float tenantMemory;

        /**
         * <p>The mode of the tenant. Valid values: </p>
         * <ul>
         * <li>Oracle  </li>
         * <li>MySQL</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Oracle</p>
         */
        @NameInMap("TenantMode")
        public String tenantMode;

        /**
         * <p>The name of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>pay_online</p>
         */
        @NameInMap("TenantName")
        public String tenantName;

        /**
         * <p>The status of the tenant. Valid values: </p>
         * <ul>
         * <li>PENDING_CREATE: The tenant is being created. </li>
         * <li>RESTORE: The tenant is being restored. </li>
         * <li>ONLINE: The tenant is running. </li>
         * <li>SPEC_MODIFYING: The specification of the tenant is being modified. </li>
         * <li>ALLOCATING_INTERNET_ADDRESS: A public IP address is being allocated to the tenant. </li>
         * <li>PENDING_OFFLINE_INTERNET_ADDRESS: The public IP address is being disabled. </li>
         * <li>PRIMARY_ZONE_MODIFYING: The tenant is being switched to a new primary zone. </li>
         * <li>PARAMETER_MODIFYING: Parameters are being modified. </li>
         * <li>WHITE_LIST_MODIFYING: The allowlist is being modified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ONLINE</p>
         */
        @NameInMap("TenantStatus")
        public String tenantStatus;

        /**
         * <p>The number of CPU cores of a single node in the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TenantUnitCpu")
        public Float tenantUnitCpu;

        /**
         * <p>The memory size of a single node in the tenant, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("TenantUnitMemory")
        public Float tenantUnitMemory;

        /**
         * <p>The number of resource units in the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TenantUnitNum")
        public Integer tenantUnitNum;

        /**
         * <p>The information about the zones.</p>
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

        public DescribeInstanceTopologyResponseBodyInstanceTopologyTenants setTenantDiskSize(Float tenantDiskSize) {
            this.tenantDiskSize = tenantDiskSize;
            return this;
        }
        public Float getTenantDiskSize() {
            return this.tenantDiskSize;
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

        public DescribeInstanceTopologyResponseBodyInstanceTopologyTenants setTenantUnitCpu(Float tenantUnitCpu) {
            this.tenantUnitCpu = tenantUnitCpu;
            return this;
        }
        public Float getTenantUnitCpu() {
            return this.tenantUnitCpu;
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopologyTenants setTenantUnitMemory(Float tenantUnitMemory) {
            this.tenantUnitMemory = tenantUnitMemory;
            return this;
        }
        public Float getTenantUnitMemory() {
            return this.tenantUnitMemory;
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
         * <p>The total number of CPU cores of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        @NameInMap("TotalCpu")
        public Integer totalCpu;

        /**
         * <p>The number of CPU cores used by the node.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
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
         * <p>The total storage space of the node, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalDiskSize")
        public Double totalDiskSize;

        /**
         * <p>The size of storage space used by the node, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
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
         * <p>The total memory size of the node, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        @NameInMap("TotalMemory")
        public Long totalMemory;

        /**
         * <p>The size of memory used by the node, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * <p>The information about the CPU resources of the node.</p>
         */
        @NameInMap("Cpu")
        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResourceCpu cpu;

        /**
         * <p>The information about the storage resources of the node.</p>
         */
        @NameInMap("DiskSize")
        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResourceDiskSize diskSize;

        /**
         * <p>The information about the memory resources of the node.</p>
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
        /**
         * <p>The ID of the full-featured replica.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FullCopyId")
        public Long fullCopyId;

        /**
         * <p>The ID of the replica.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h-z0</p>
         */
        @NameInMap("LogicalZone")
        public String logicalZone;

        /**
         * <p>The ID of the replica node.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NodeCopyId")
        public Long nodeCopyId;

        /**
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp16niirq4zdmgvm****</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The information about node resources.</p>
         */
        @NameInMap("NodeResource")
        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResource nodeResource;

        /**
         * <p>The status of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>ONLINE</p>
         */
        @NameInMap("NodeStatus")
        public String nodeStatus;

        /**
         * <p>The ID of the read-only replica.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReadOnlyCopyId")
        public Long readOnlyCopyId;

        /**
         * <p>The type of the read-only replica.</p>
         * 
         * <strong>example:</strong>
         * <p>ROW_STORE</p>
         */
        @NameInMap("ReadOnlyReplicaType")
        public String readOnlyReplicaType;

        /**
         * <p>The type of the replica. Valid values: </p>
         * <ul>
         * <li>FULL. </li>
         * <li>READONLY.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FULL</p>
         */
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

        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodes setLogicalZone(String logicalZone) {
            this.logicalZone = logicalZone;
            return this;
        }
        public String getLogicalZone() {
            return this.logicalZone;
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

        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodes setNodeResource(DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResource nodeResource) {
            this.nodeResource = nodeResource;
            return this;
        }
        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodesNodeResource getNodeResource() {
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

        public DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodes setReadOnlyReplicaType(String readOnlyReplicaType) {
            this.readOnlyReplicaType = readOnlyReplicaType;
            return this;
        }
        public String getReadOnlyReplicaType() {
            return this.readOnlyReplicaType;
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
        /**
         * <p>The IDs of OBServer nodes that use the maximum disk space.</p>
         */
        @NameInMap("MaxDiskUsedObServer")
        public java.util.List<String> maxDiskUsedObServer;

        /**
         * <p>The maximum disk usage, in percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.14</p>
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
        /**
         * <p>The information about the storage resources of the node.</p>
         */
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
         * <p>The information about the nodes.</p>
         */
        @NameInMap("Nodes")
        public java.util.List<DescribeInstanceTopologyResponseBodyInstanceTopologyZonesNodes> nodes;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The storage capacity of the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>200 GB</p>
         */
        @NameInMap("ZoneDisk")
        public String zoneDisk;

        /**
         * <p>The ID of the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        /**
         * <p>The information about zones.</p>
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
         * <p>The information about replicas.</p>
         */
        @NameInMap("Replicas")
        public java.util.List<DescribeInstanceTopologyResponseBodyInstanceTopologyReplicas> replicas;

        /**
         * <p>The information about the tenants.</p>
         */
        @NameInMap("Tenants")
        public java.util.List<DescribeInstanceTopologyResponseBodyInstanceTopologyTenants> tenants;

        /**
         * <p>The information about the zones in which the cluster is deployed.</p>
         */
        @NameInMap("Zones")
        public java.util.List<DescribeInstanceTopologyResponseBodyInstanceTopologyZones> zones;

        public static DescribeInstanceTopologyResponseBodyInstanceTopology build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTopologyResponseBodyInstanceTopology self = new DescribeInstanceTopologyResponseBodyInstanceTopology();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTopologyResponseBodyInstanceTopology setReplicas(java.util.List<DescribeInstanceTopologyResponseBodyInstanceTopologyReplicas> replicas) {
            this.replicas = replicas;
            return this;
        }
        public java.util.List<DescribeInstanceTopologyResponseBodyInstanceTopologyReplicas> getReplicas() {
            return this.replicas;
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
