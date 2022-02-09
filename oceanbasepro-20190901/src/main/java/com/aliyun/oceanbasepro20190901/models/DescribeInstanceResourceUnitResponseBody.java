// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceResourceUnitResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 资源节点信息
    @NameInMap("Unit")
    public DescribeInstanceResourceUnitResponseBodyUnit unit;

    public static DescribeInstanceResourceUnitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceResourceUnitResponseBody self = new DescribeInstanceResourceUnitResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceResourceUnitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceResourceUnitResponseBody setUnit(DescribeInstanceResourceUnitResponseBodyUnit unit) {
        this.unit = unit;
        return this;
    }
    public DescribeInstanceResourceUnitResponseBodyUnit getUnit() {
        return this.unit;
    }

    public static class DescribeInstanceResourceUnitResponseBodyUnitAvailableMigrateNodes extends TeaModel {
        // 节点ID
        @NameInMap("NodeId")
        public String nodeId;

        // 可用区ID
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeInstanceResourceUnitResponseBodyUnitAvailableMigrateNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResourceUnitResponseBodyUnitAvailableMigrateNodes self = new DescribeInstanceResourceUnitResponseBodyUnitAvailableMigrateNodes();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResourceUnitResponseBodyUnitAvailableMigrateNodes setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeInstanceResourceUnitResponseBodyUnitAvailableMigrateNodes setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeInstanceResourceUnitResponseBodyUnitUnitResourceCpu extends TeaModel {
        // 节点总的CPU，单位：核
        @NameInMap("TotalCpu")
        public Integer totalCpu;

        // 节点已使用的CPU，单位：核
        @NameInMap("UsedCpu")
        public Float usedCpu;

        public static DescribeInstanceResourceUnitResponseBodyUnitUnitResourceCpu build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResourceUnitResponseBodyUnitUnitResourceCpu self = new DescribeInstanceResourceUnitResponseBodyUnitUnitResourceCpu();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResourceUnitResponseBodyUnitUnitResourceCpu setTotalCpu(Integer totalCpu) {
            this.totalCpu = totalCpu;
            return this;
        }
        public Integer getTotalCpu() {
            return this.totalCpu;
        }

        public DescribeInstanceResourceUnitResponseBodyUnitUnitResourceCpu setUsedCpu(Float usedCpu) {
            this.usedCpu = usedCpu;
            return this;
        }
        public Float getUsedCpu() {
            return this.usedCpu;
        }

    }

    public static class DescribeInstanceResourceUnitResponseBodyUnitUnitResourceDiskSize extends TeaModel {
        // 节点总存储空间，单位：GB
        @NameInMap("TotalDiskSize")
        public Long totalDiskSize;

        // 节点已使用的存储空间，单位：GB
        @NameInMap("UsedDiskSize")
        public Long usedDiskSize;

        public static DescribeInstanceResourceUnitResponseBodyUnitUnitResourceDiskSize build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResourceUnitResponseBodyUnitUnitResourceDiskSize self = new DescribeInstanceResourceUnitResponseBodyUnitUnitResourceDiskSize();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResourceUnitResponseBodyUnitUnitResourceDiskSize setTotalDiskSize(Long totalDiskSize) {
            this.totalDiskSize = totalDiskSize;
            return this;
        }
        public Long getTotalDiskSize() {
            return this.totalDiskSize;
        }

        public DescribeInstanceResourceUnitResponseBodyUnitUnitResourceDiskSize setUsedDiskSize(Long usedDiskSize) {
            this.usedDiskSize = usedDiskSize;
            return this;
        }
        public Long getUsedDiskSize() {
            return this.usedDiskSize;
        }

    }

    public static class DescribeInstanceResourceUnitResponseBodyUnitUnitResourceMemory extends TeaModel {
        // 节点的总内存，单位：GB
        @NameInMap("TotalMemory")
        public Long totalMemory;

        // 节点已使用的内存，单位：GB
        @NameInMap("UsedMemory")
        public Float usedMemory;

        public static DescribeInstanceResourceUnitResponseBodyUnitUnitResourceMemory build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResourceUnitResponseBodyUnitUnitResourceMemory self = new DescribeInstanceResourceUnitResponseBodyUnitUnitResourceMemory();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResourceUnitResponseBodyUnitUnitResourceMemory setTotalMemory(Long totalMemory) {
            this.totalMemory = totalMemory;
            return this;
        }
        public Long getTotalMemory() {
            return this.totalMemory;
        }

        public DescribeInstanceResourceUnitResponseBodyUnitUnitResourceMemory setUsedMemory(Float usedMemory) {
            this.usedMemory = usedMemory;
            return this;
        }
        public Float getUsedMemory() {
            return this.usedMemory;
        }

    }

    public static class DescribeInstanceResourceUnitResponseBodyUnitUnitResource extends TeaModel {
        // 节点CPU资源信息
        @NameInMap("Cpu")
        public DescribeInstanceResourceUnitResponseBodyUnitUnitResourceCpu cpu;

        // 节点存储资源信息
        @NameInMap("DiskSize")
        public DescribeInstanceResourceUnitResponseBodyUnitUnitResourceDiskSize diskSize;

        // 节点内存资源信息
        @NameInMap("Memory")
        public DescribeInstanceResourceUnitResponseBodyUnitUnitResourceMemory memory;

        public static DescribeInstanceResourceUnitResponseBodyUnitUnitResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResourceUnitResponseBodyUnitUnitResource self = new DescribeInstanceResourceUnitResponseBodyUnitUnitResource();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResourceUnitResponseBodyUnitUnitResource setCpu(DescribeInstanceResourceUnitResponseBodyUnitUnitResourceCpu cpu) {
            this.cpu = cpu;
            return this;
        }
        public DescribeInstanceResourceUnitResponseBodyUnitUnitResourceCpu getCpu() {
            return this.cpu;
        }

        public DescribeInstanceResourceUnitResponseBodyUnitUnitResource setDiskSize(DescribeInstanceResourceUnitResponseBodyUnitUnitResourceDiskSize diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public DescribeInstanceResourceUnitResponseBodyUnitUnitResourceDiskSize getDiskSize() {
            return this.diskSize;
        }

        public DescribeInstanceResourceUnitResponseBodyUnitUnitResource setMemory(DescribeInstanceResourceUnitResponseBodyUnitUnitResourceMemory memory) {
            this.memory = memory;
            return this;
        }
        public DescribeInstanceResourceUnitResponseBodyUnitUnitResourceMemory getMemory() {
            return this.memory;
        }

    }

    public static class DescribeInstanceResourceUnitResponseBodyUnit extends TeaModel {
        // 可迁移至的ob server节点列表，只有在UnitStatus为ONLINE状态下才会返回可迁移的节点列表
        @NameInMap("AvailableMigrateNodes")
        public java.util.List<DescribeInstanceResourceUnitResponseBodyUnitAvailableMigrateNodes> availableMigrateNodes;

        // 是否可以取消迁移。该字段只对正在手动迁入中或手动迁出中的unit有效。
        @NameInMap("EnableCancelMigrateUnit")
        public Boolean enableCancelMigrateUnit;

        // 是否可迁移unit。- true：可发起迁移；- false：不可发起迁移。
        @NameInMap("EnableMigrateUnit")
        public Boolean enableMigrateUnit;

        // OceanBase 集群ID
        @NameInMap("InstanceId")
        public String instanceId;

        // 是否手动发起的迁移。
        @NameInMap("ManualMigrate")
        public Boolean manualMigrate;

        // 资源节点被迁移的源ob server节点。只有UnitStatus为IMMIGRATING状态时，该字段才有值。
        @NameInMap("MigrateFromNodeId")
        public String migrateFromNodeId;

        // 资源节点被迁移的源ob server节点。只有UnitStatus为EMMIGRATING状态时，该字段才有值。
        @NameInMap("MigrateToNodeId")
        public String migrateToNodeId;

        // 节点ID
        @NameInMap("NodeId")
        public String nodeId;

        // OceanBase 租户ID
        @NameInMap("TenantId")
        public String tenantId;

        // OceanBase 租户名称
        @NameInMap("TenantName")
        public String tenantName;

        // 资源节点的ID
        @NameInMap("UnitId")
        public Long unitId;

        // 节点资源信息
        @NameInMap("UnitResource")
        public DescribeInstanceResourceUnitResponseBodyUnitUnitResource unitResource;

        // 资源节点的状态。 ONLINE: 运行中 IMMIGRATING 迁入中 EMIGRATING: 迁出中 CANCEL_EMIGRATING: 取消迁入中 CANCEL_EMIGRATING：取消迁出中 DELETING：删除中
        @NameInMap("UnitStatus")
        public String unitStatus;

        // 可用区ID
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeInstanceResourceUnitResponseBodyUnit build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResourceUnitResponseBodyUnit self = new DescribeInstanceResourceUnitResponseBodyUnit();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResourceUnitResponseBodyUnit setAvailableMigrateNodes(java.util.List<DescribeInstanceResourceUnitResponseBodyUnitAvailableMigrateNodes> availableMigrateNodes) {
            this.availableMigrateNodes = availableMigrateNodes;
            return this;
        }
        public java.util.List<DescribeInstanceResourceUnitResponseBodyUnitAvailableMigrateNodes> getAvailableMigrateNodes() {
            return this.availableMigrateNodes;
        }

        public DescribeInstanceResourceUnitResponseBodyUnit setEnableCancelMigrateUnit(Boolean enableCancelMigrateUnit) {
            this.enableCancelMigrateUnit = enableCancelMigrateUnit;
            return this;
        }
        public Boolean getEnableCancelMigrateUnit() {
            return this.enableCancelMigrateUnit;
        }

        public DescribeInstanceResourceUnitResponseBodyUnit setEnableMigrateUnit(Boolean enableMigrateUnit) {
            this.enableMigrateUnit = enableMigrateUnit;
            return this;
        }
        public Boolean getEnableMigrateUnit() {
            return this.enableMigrateUnit;
        }

        public DescribeInstanceResourceUnitResponseBodyUnit setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceResourceUnitResponseBodyUnit setManualMigrate(Boolean manualMigrate) {
            this.manualMigrate = manualMigrate;
            return this;
        }
        public Boolean getManualMigrate() {
            return this.manualMigrate;
        }

        public DescribeInstanceResourceUnitResponseBodyUnit setMigrateFromNodeId(String migrateFromNodeId) {
            this.migrateFromNodeId = migrateFromNodeId;
            return this;
        }
        public String getMigrateFromNodeId() {
            return this.migrateFromNodeId;
        }

        public DescribeInstanceResourceUnitResponseBodyUnit setMigrateToNodeId(String migrateToNodeId) {
            this.migrateToNodeId = migrateToNodeId;
            return this;
        }
        public String getMigrateToNodeId() {
            return this.migrateToNodeId;
        }

        public DescribeInstanceResourceUnitResponseBodyUnit setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeInstanceResourceUnitResponseBodyUnit setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public DescribeInstanceResourceUnitResponseBodyUnit setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public DescribeInstanceResourceUnitResponseBodyUnit setUnitId(Long unitId) {
            this.unitId = unitId;
            return this;
        }
        public Long getUnitId() {
            return this.unitId;
        }

        public DescribeInstanceResourceUnitResponseBodyUnit setUnitResource(DescribeInstanceResourceUnitResponseBodyUnitUnitResource unitResource) {
            this.unitResource = unitResource;
            return this;
        }
        public DescribeInstanceResourceUnitResponseBodyUnitUnitResource getUnitResource() {
            return this.unitResource;
        }

        public DescribeInstanceResourceUnitResponseBodyUnit setUnitStatus(String unitStatus) {
            this.unitStatus = unitStatus;
            return this;
        }
        public String getUnitStatus() {
            return this.unitStatus;
        }

        public DescribeInstanceResourceUnitResponseBodyUnit setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
