// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceResponseBody extends TeaModel {
    /**
     * <p>The log disk space of each replica node in the cluster. Unit: GB.</p>
     */
    @NameInMap("Instance")
    public DescribeInstanceResponseBodyInstance instance;

    /**
     * <p>The total log disk space of the cluster, in GB.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceResponseBody self = new DescribeInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceResponseBody setInstance(DescribeInstanceResponseBodyInstance instance) {
        this.instance = instance;
        return this;
    }
    public DescribeInstanceResponseBodyInstance getInstance() {
        return this.instance;
    }

    public DescribeInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceResponseBodyInstanceDataDiskAutoScaleConfig extends TeaModel {
        @NameInMap("AutoScale")
        public Boolean autoScale;

        @NameInMap("MaxDiskSize")
        public Long maxDiskSize;

        @NameInMap("ScaleStepInMerge")
        public Long scaleStepInMerge;

        @NameInMap("ScaleStepInNormal")
        public Long scaleStepInNormal;

        @NameInMap("UpperMergeThreshold")
        public Long upperMergeThreshold;

        @NameInMap("UpperScaleStep")
        public String upperScaleStep;

        @NameInMap("UpperScaleStrategy")
        public String upperScaleStrategy;

        @NameInMap("UpperThreshold")
        public Long upperThreshold;

        @NameInMap("Upperbound")
        public Long upperbound;

        public static DescribeInstanceResponseBodyInstanceDataDiskAutoScaleConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyInstanceDataDiskAutoScaleConfig self = new DescribeInstanceResponseBodyInstanceDataDiskAutoScaleConfig();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyInstanceDataDiskAutoScaleConfig setAutoScale(Boolean autoScale) {
            this.autoScale = autoScale;
            return this;
        }
        public Boolean getAutoScale() {
            return this.autoScale;
        }

        public DescribeInstanceResponseBodyInstanceDataDiskAutoScaleConfig setMaxDiskSize(Long maxDiskSize) {
            this.maxDiskSize = maxDiskSize;
            return this;
        }
        public Long getMaxDiskSize() {
            return this.maxDiskSize;
        }

        public DescribeInstanceResponseBodyInstanceDataDiskAutoScaleConfig setScaleStepInMerge(Long scaleStepInMerge) {
            this.scaleStepInMerge = scaleStepInMerge;
            return this;
        }
        public Long getScaleStepInMerge() {
            return this.scaleStepInMerge;
        }

        public DescribeInstanceResponseBodyInstanceDataDiskAutoScaleConfig setScaleStepInNormal(Long scaleStepInNormal) {
            this.scaleStepInNormal = scaleStepInNormal;
            return this;
        }
        public Long getScaleStepInNormal() {
            return this.scaleStepInNormal;
        }

        public DescribeInstanceResponseBodyInstanceDataDiskAutoScaleConfig setUpperMergeThreshold(Long upperMergeThreshold) {
            this.upperMergeThreshold = upperMergeThreshold;
            return this;
        }
        public Long getUpperMergeThreshold() {
            return this.upperMergeThreshold;
        }

        public DescribeInstanceResponseBodyInstanceDataDiskAutoScaleConfig setUpperScaleStep(String upperScaleStep) {
            this.upperScaleStep = upperScaleStep;
            return this;
        }
        public String getUpperScaleStep() {
            return this.upperScaleStep;
        }

        public DescribeInstanceResponseBodyInstanceDataDiskAutoScaleConfig setUpperScaleStrategy(String upperScaleStrategy) {
            this.upperScaleStrategy = upperScaleStrategy;
            return this;
        }
        public String getUpperScaleStrategy() {
            return this.upperScaleStrategy;
        }

        public DescribeInstanceResponseBodyInstanceDataDiskAutoScaleConfig setUpperThreshold(Long upperThreshold) {
            this.upperThreshold = upperThreshold;
            return this;
        }
        public Long getUpperThreshold() {
            return this.upperThreshold;
        }

        public DescribeInstanceResponseBodyInstanceDataDiskAutoScaleConfig setUpperbound(Long upperbound) {
            this.upperbound = upperbound;
            return this;
        }
        public Long getUpperbound() {
            return this.upperbound;
        }

    }

    public static class DescribeInstanceResponseBodyInstanceReadOnlyResourceCapacityUnit extends TeaModel {
        @NameInMap("MaxCapacityUnit")
        public Integer maxCapacityUnit;

        @NameInMap("MinCapacityUnit")
        public Integer minCapacityUnit;

        @NameInMap("UsedCapacityUnit")
        public String usedCapacityUnit;

        public static DescribeInstanceResponseBodyInstanceReadOnlyResourceCapacityUnit build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyInstanceReadOnlyResourceCapacityUnit self = new DescribeInstanceResponseBodyInstanceReadOnlyResourceCapacityUnit();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyInstanceReadOnlyResourceCapacityUnit setMaxCapacityUnit(Integer maxCapacityUnit) {
            this.maxCapacityUnit = maxCapacityUnit;
            return this;
        }
        public Integer getMaxCapacityUnit() {
            return this.maxCapacityUnit;
        }

        public DescribeInstanceResponseBodyInstanceReadOnlyResourceCapacityUnit setMinCapacityUnit(Integer minCapacityUnit) {
            this.minCapacityUnit = minCapacityUnit;
            return this;
        }
        public Integer getMinCapacityUnit() {
            return this.minCapacityUnit;
        }

        public DescribeInstanceResponseBodyInstanceReadOnlyResourceCapacityUnit setUsedCapacityUnit(String usedCapacityUnit) {
            this.usedCapacityUnit = usedCapacityUnit;
            return this;
        }
        public String getUsedCapacityUnit() {
            return this.usedCapacityUnit;
        }

    }

    public static class DescribeInstanceResponseBodyInstanceReadOnlyResourceCpu extends TeaModel {
        @NameInMap("OriginalTotalCpu")
        public Long originalTotalCpu;

        @NameInMap("TotalCpu")
        public Long totalCpu;

        @NameInMap("UnitCpu")
        public Long unitCpu;

        @NameInMap("UsedCpu")
        public Long usedCpu;

        public static DescribeInstanceResponseBodyInstanceReadOnlyResourceCpu build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyInstanceReadOnlyResourceCpu self = new DescribeInstanceResponseBodyInstanceReadOnlyResourceCpu();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyInstanceReadOnlyResourceCpu setOriginalTotalCpu(Long originalTotalCpu) {
            this.originalTotalCpu = originalTotalCpu;
            return this;
        }
        public Long getOriginalTotalCpu() {
            return this.originalTotalCpu;
        }

        public DescribeInstanceResponseBodyInstanceReadOnlyResourceCpu setTotalCpu(Long totalCpu) {
            this.totalCpu = totalCpu;
            return this;
        }
        public Long getTotalCpu() {
            return this.totalCpu;
        }

        public DescribeInstanceResponseBodyInstanceReadOnlyResourceCpu setUnitCpu(Long unitCpu) {
            this.unitCpu = unitCpu;
            return this;
        }
        public Long getUnitCpu() {
            return this.unitCpu;
        }

        public DescribeInstanceResponseBodyInstanceReadOnlyResourceCpu setUsedCpu(Long usedCpu) {
            this.usedCpu = usedCpu;
            return this;
        }
        public Long getUsedCpu() {
            return this.usedCpu;
        }

    }

    public static class DescribeInstanceResponseBodyInstanceReadOnlyResourceDiskSize extends TeaModel {
        @NameInMap("DataUsedSize")
        public Double dataUsedSize;

        @NameInMap("MaxDiskSize")
        public Double maxDiskSize;

        @NameInMap("MaxDiskUsedObServer")
        public java.util.List<String> maxDiskUsedObServer;

        @NameInMap("MaxDiskUsedPercent")
        public Double maxDiskUsedPercent;

        @NameInMap("OriginalTotalDiskSize")
        public Long originalTotalDiskSize;

        @NameInMap("TotalDiskSize")
        public Long totalDiskSize;

        @NameInMap("UnitDiskSize")
        public Long unitDiskSize;

        @NameInMap("UsedDiskSize")
        public Long usedDiskSize;

        public static DescribeInstanceResponseBodyInstanceReadOnlyResourceDiskSize build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyInstanceReadOnlyResourceDiskSize self = new DescribeInstanceResponseBodyInstanceReadOnlyResourceDiskSize();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyInstanceReadOnlyResourceDiskSize setDataUsedSize(Double dataUsedSize) {
            this.dataUsedSize = dataUsedSize;
            return this;
        }
        public Double getDataUsedSize() {
            return this.dataUsedSize;
        }

        public DescribeInstanceResponseBodyInstanceReadOnlyResourceDiskSize setMaxDiskSize(Double maxDiskSize) {
            this.maxDiskSize = maxDiskSize;
            return this;
        }
        public Double getMaxDiskSize() {
            return this.maxDiskSize;
        }

        public DescribeInstanceResponseBodyInstanceReadOnlyResourceDiskSize setMaxDiskUsedObServer(java.util.List<String> maxDiskUsedObServer) {
            this.maxDiskUsedObServer = maxDiskUsedObServer;
            return this;
        }
        public java.util.List<String> getMaxDiskUsedObServer() {
            return this.maxDiskUsedObServer;
        }

        public DescribeInstanceResponseBodyInstanceReadOnlyResourceDiskSize setMaxDiskUsedPercent(Double maxDiskUsedPercent) {
            this.maxDiskUsedPercent = maxDiskUsedPercent;
            return this;
        }
        public Double getMaxDiskUsedPercent() {
            return this.maxDiskUsedPercent;
        }

        public DescribeInstanceResponseBodyInstanceReadOnlyResourceDiskSize setOriginalTotalDiskSize(Long originalTotalDiskSize) {
            this.originalTotalDiskSize = originalTotalDiskSize;
            return this;
        }
        public Long getOriginalTotalDiskSize() {
            return this.originalTotalDiskSize;
        }

        public DescribeInstanceResponseBodyInstanceReadOnlyResourceDiskSize setTotalDiskSize(Long totalDiskSize) {
            this.totalDiskSize = totalDiskSize;
            return this;
        }
        public Long getTotalDiskSize() {
            return this.totalDiskSize;
        }

        public DescribeInstanceResponseBodyInstanceReadOnlyResourceDiskSize setUnitDiskSize(Long unitDiskSize) {
            this.unitDiskSize = unitDiskSize;
            return this;
        }
        public Long getUnitDiskSize() {
            return this.unitDiskSize;
        }

        public DescribeInstanceResponseBodyInstanceReadOnlyResourceDiskSize setUsedDiskSize(Long usedDiskSize) {
            this.usedDiskSize = usedDiskSize;
            return this;
        }
        public Long getUsedDiskSize() {
            return this.usedDiskSize;
        }

    }

    public static class DescribeInstanceResponseBodyInstanceReadOnlyResourceLogDiskSize extends TeaModel {
        @NameInMap("LogAssignedSize")
        public String logAssignedSize;

        @NameInMap("MaxLogAssignedObServer")
        public java.util.List<String> maxLogAssignedObServer;

        @NameInMap("MaxLogAssignedPercent")
        public String maxLogAssignedPercent;

        @NameInMap("TotalDiskSize")
        public Long totalDiskSize;

        @NameInMap("UnitDiskSize")
        public Long unitDiskSize;

        public static DescribeInstanceResponseBodyInstanceReadOnlyResourceLogDiskSize build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyInstanceReadOnlyResourceLogDiskSize self = new DescribeInstanceResponseBodyInstanceReadOnlyResourceLogDiskSize();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyInstanceReadOnlyResourceLogDiskSize setLogAssignedSize(String logAssignedSize) {
            this.logAssignedSize = logAssignedSize;
            return this;
        }
        public String getLogAssignedSize() {
            return this.logAssignedSize;
        }

        public DescribeInstanceResponseBodyInstanceReadOnlyResourceLogDiskSize setMaxLogAssignedObServer(java.util.List<String> maxLogAssignedObServer) {
            this.maxLogAssignedObServer = maxLogAssignedObServer;
            return this;
        }
        public java.util.List<String> getMaxLogAssignedObServer() {
            return this.maxLogAssignedObServer;
        }

        public DescribeInstanceResponseBodyInstanceReadOnlyResourceLogDiskSize setMaxLogAssignedPercent(String maxLogAssignedPercent) {
            this.maxLogAssignedPercent = maxLogAssignedPercent;
            return this;
        }
        public String getMaxLogAssignedPercent() {
            return this.maxLogAssignedPercent;
        }

        public DescribeInstanceResponseBodyInstanceReadOnlyResourceLogDiskSize setTotalDiskSize(Long totalDiskSize) {
            this.totalDiskSize = totalDiskSize;
            return this;
        }
        public Long getTotalDiskSize() {
            return this.totalDiskSize;
        }

        public DescribeInstanceResponseBodyInstanceReadOnlyResourceLogDiskSize setUnitDiskSize(Long unitDiskSize) {
            this.unitDiskSize = unitDiskSize;
            return this;
        }
        public Long getUnitDiskSize() {
            return this.unitDiskSize;
        }

    }

    public static class DescribeInstanceResponseBodyInstanceReadOnlyResourceMemory extends TeaModel {
        @NameInMap("OriginalTotalMemory")
        public Long originalTotalMemory;

        @NameInMap("TotalMemory")
        public Long totalMemory;

        @NameInMap("UnitMemory")
        public Long unitMemory;

        @NameInMap("UsedMemory")
        public Long usedMemory;

        public static DescribeInstanceResponseBodyInstanceReadOnlyResourceMemory build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyInstanceReadOnlyResourceMemory self = new DescribeInstanceResponseBodyInstanceReadOnlyResourceMemory();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyInstanceReadOnlyResourceMemory setOriginalTotalMemory(Long originalTotalMemory) {
            this.originalTotalMemory = originalTotalMemory;
            return this;
        }
        public Long getOriginalTotalMemory() {
            return this.originalTotalMemory;
        }

        public DescribeInstanceResponseBodyInstanceReadOnlyResourceMemory setTotalMemory(Long totalMemory) {
            this.totalMemory = totalMemory;
            return this;
        }
        public Long getTotalMemory() {
            return this.totalMemory;
        }

        public DescribeInstanceResponseBodyInstanceReadOnlyResourceMemory setUnitMemory(Long unitMemory) {
            this.unitMemory = unitMemory;
            return this;
        }
        public Long getUnitMemory() {
            return this.unitMemory;
        }

        public DescribeInstanceResponseBodyInstanceReadOnlyResourceMemory setUsedMemory(Long usedMemory) {
            this.usedMemory = usedMemory;
            return this;
        }
        public Long getUsedMemory() {
            return this.usedMemory;
        }

    }

    public static class DescribeInstanceResponseBodyInstanceReadOnlyResource extends TeaModel {
        @NameInMap("CapacityUnit")
        public DescribeInstanceResponseBodyInstanceReadOnlyResourceCapacityUnit capacityUnit;

        @NameInMap("Cpu")
        public DescribeInstanceResponseBodyInstanceReadOnlyResourceCpu cpu;

        @NameInMap("DiskSize")
        public DescribeInstanceResponseBodyInstanceReadOnlyResourceDiskSize diskSize;

        @NameInMap("LogDiskSize")
        public DescribeInstanceResponseBodyInstanceReadOnlyResourceLogDiskSize logDiskSize;

        @NameInMap("Memory")
        public DescribeInstanceResponseBodyInstanceReadOnlyResourceMemory memory;

        @NameInMap("UnitCount")
        public Long unitCount;

        public static DescribeInstanceResponseBodyInstanceReadOnlyResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyInstanceReadOnlyResource self = new DescribeInstanceResponseBodyInstanceReadOnlyResource();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyInstanceReadOnlyResource setCapacityUnit(DescribeInstanceResponseBodyInstanceReadOnlyResourceCapacityUnit capacityUnit) {
            this.capacityUnit = capacityUnit;
            return this;
        }
        public DescribeInstanceResponseBodyInstanceReadOnlyResourceCapacityUnit getCapacityUnit() {
            return this.capacityUnit;
        }

        public DescribeInstanceResponseBodyInstanceReadOnlyResource setCpu(DescribeInstanceResponseBodyInstanceReadOnlyResourceCpu cpu) {
            this.cpu = cpu;
            return this;
        }
        public DescribeInstanceResponseBodyInstanceReadOnlyResourceCpu getCpu() {
            return this.cpu;
        }

        public DescribeInstanceResponseBodyInstanceReadOnlyResource setDiskSize(DescribeInstanceResponseBodyInstanceReadOnlyResourceDiskSize diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public DescribeInstanceResponseBodyInstanceReadOnlyResourceDiskSize getDiskSize() {
            return this.diskSize;
        }

        public DescribeInstanceResponseBodyInstanceReadOnlyResource setLogDiskSize(DescribeInstanceResponseBodyInstanceReadOnlyResourceLogDiskSize logDiskSize) {
            this.logDiskSize = logDiskSize;
            return this;
        }
        public DescribeInstanceResponseBodyInstanceReadOnlyResourceLogDiskSize getLogDiskSize() {
            return this.logDiskSize;
        }

        public DescribeInstanceResponseBodyInstanceReadOnlyResource setMemory(DescribeInstanceResponseBodyInstanceReadOnlyResourceMemory memory) {
            this.memory = memory;
            return this;
        }
        public DescribeInstanceResponseBodyInstanceReadOnlyResourceMemory getMemory() {
            return this.memory;
        }

        public DescribeInstanceResponseBodyInstanceReadOnlyResource setUnitCount(Long unitCount) {
            this.unitCount = unitCount;
            return this;
        }
        public Long getUnitCount() {
            return this.unitCount;
        }

    }

    public static class DescribeInstanceResponseBodyInstanceResourceCapacityUnit extends TeaModel {
        @NameInMap("MaxCapacityUnit")
        public Integer maxCapacityUnit;

        @NameInMap("MinCapacityUnit")
        public Integer minCapacityUnit;

        @NameInMap("UsedCapacityUnit")
        public String usedCapacityUnit;

        public static DescribeInstanceResponseBodyInstanceResourceCapacityUnit build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyInstanceResourceCapacityUnit self = new DescribeInstanceResponseBodyInstanceResourceCapacityUnit();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyInstanceResourceCapacityUnit setMaxCapacityUnit(Integer maxCapacityUnit) {
            this.maxCapacityUnit = maxCapacityUnit;
            return this;
        }
        public Integer getMaxCapacityUnit() {
            return this.maxCapacityUnit;
        }

        public DescribeInstanceResponseBodyInstanceResourceCapacityUnit setMinCapacityUnit(Integer minCapacityUnit) {
            this.minCapacityUnit = minCapacityUnit;
            return this;
        }
        public Integer getMinCapacityUnit() {
            return this.minCapacityUnit;
        }

        public DescribeInstanceResponseBodyInstanceResourceCapacityUnit setUsedCapacityUnit(String usedCapacityUnit) {
            this.usedCapacityUnit = usedCapacityUnit;
            return this;
        }
        public String getUsedCapacityUnit() {
            return this.usedCapacityUnit;
        }

    }

    public static class DescribeInstanceResponseBodyInstanceResourceCpu extends TeaModel {
        @NameInMap("OriginalTotalCpu")
        public Long originalTotalCpu;

        /**
         * <p>The series of the OceanBase cluster. Valid values:   </p>
         * <p>- NORMAL: the high availability edition.   </p>
         * <p>- BASIC: the basic edition.</p>
         */
        @NameInMap("TotalCpu")
        public Long totalCpu;

        /**
         * <p>The type of the storage disk where the cluster is deployed. </p>
         * <br>
         * <p>The default value is cloud_essd_pl1, which indicates an ESSD cloud disk.</p>
         */
        @NameInMap("UnitCpu")
        public Long unitCpu;

        /**
         * <p>Indicates whether automatic upgrade of the OBServer version is enabled.</p>
         */
        @NameInMap("UsedCpu")
        public Long usedCpu;

        public static DescribeInstanceResponseBodyInstanceResourceCpu build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyInstanceResourceCpu self = new DescribeInstanceResponseBodyInstanceResourceCpu();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyInstanceResourceCpu setOriginalTotalCpu(Long originalTotalCpu) {
            this.originalTotalCpu = originalTotalCpu;
            return this;
        }
        public Long getOriginalTotalCpu() {
            return this.originalTotalCpu;
        }

        public DescribeInstanceResponseBodyInstanceResourceCpu setTotalCpu(Long totalCpu) {
            this.totalCpu = totalCpu;
            return this;
        }
        public Long getTotalCpu() {
            return this.totalCpu;
        }

        public DescribeInstanceResponseBodyInstanceResourceCpu setUnitCpu(Long unitCpu) {
            this.unitCpu = unitCpu;
            return this;
        }
        public Long getUnitCpu() {
            return this.unitCpu;
        }

        public DescribeInstanceResponseBodyInstanceResourceCpu setUsedCpu(Long usedCpu) {
            this.usedCpu = usedCpu;
            return this;
        }
        public Long getUsedCpu() {
            return this.usedCpu;
        }

    }

    public static class DescribeInstanceResponseBodyInstanceResourceDiskSize extends TeaModel {
        /**
         * <p>The ID of the OceanBase cluster.</p>
         */
        @NameInMap("DataUsedSize")
        public Double dataUsedSize;

        @NameInMap("MaxDiskSize")
        public Double maxDiskSize;

        /**
         * <p>The time in UTC when the cluster expires.</p>
         */
        @NameInMap("MaxDiskUsedObServer")
        public java.util.List<String> maxDiskUsedObServer;

        /**
         * <p>The maximum disk usage, in percentage.</p>
         */
        @NameInMap("MaxDiskUsedPercent")
        public Double maxDiskUsedPercent;

        @NameInMap("OriginalTotalDiskSize")
        public Long originalTotalDiskSize;

        /**
         * <p>The data replica distribution mode of the cluster. Valid values: </p>
         * <p>- n: indicates the single-IDC mode. </p>
         * <p>- n-n: indicates the dual-IDC mode. </p>
         * <p>- n-n-n: indicates the multi-IDC mode. </p>
         * <br>
         * <p>> <br>The integer n represents the number of OBServer nodes in each IDC.</p>
         */
        @NameInMap("TotalDiskSize")
        public Long totalDiskSize;

        /**
         * <p>The list of zones.</p>
         */
        @NameInMap("UnitDiskSize")
        public Long unitDiskSize;

        /**
         * <p>The specifications of the cluster.  You can specify one of the following four plans:    </p>
         * <p>- 8C32G: indicates 8 CPU cores and 32 GB of memory. </p>
         * <p>- 14C70G: indicates 14 CPU cores and 70 GB of memory. </p>
         * <p>- 30C180G: indicates 30 CPU cores and 180 GB of memory. </p>
         * <p>- 62C400G: indicates 62 CPU cores and 400 GB of memory.</p>
         */
        @NameInMap("UsedDiskSize")
        public Long usedDiskSize;

        public static DescribeInstanceResponseBodyInstanceResourceDiskSize build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyInstanceResourceDiskSize self = new DescribeInstanceResponseBodyInstanceResourceDiskSize();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyInstanceResourceDiskSize setDataUsedSize(Double dataUsedSize) {
            this.dataUsedSize = dataUsedSize;
            return this;
        }
        public Double getDataUsedSize() {
            return this.dataUsedSize;
        }

        public DescribeInstanceResponseBodyInstanceResourceDiskSize setMaxDiskSize(Double maxDiskSize) {
            this.maxDiskSize = maxDiskSize;
            return this;
        }
        public Double getMaxDiskSize() {
            return this.maxDiskSize;
        }

        public DescribeInstanceResponseBodyInstanceResourceDiskSize setMaxDiskUsedObServer(java.util.List<String> maxDiskUsedObServer) {
            this.maxDiskUsedObServer = maxDiskUsedObServer;
            return this;
        }
        public java.util.List<String> getMaxDiskUsedObServer() {
            return this.maxDiskUsedObServer;
        }

        public DescribeInstanceResponseBodyInstanceResourceDiskSize setMaxDiskUsedPercent(Double maxDiskUsedPercent) {
            this.maxDiskUsedPercent = maxDiskUsedPercent;
            return this;
        }
        public Double getMaxDiskUsedPercent() {
            return this.maxDiskUsedPercent;
        }

        public DescribeInstanceResponseBodyInstanceResourceDiskSize setOriginalTotalDiskSize(Long originalTotalDiskSize) {
            this.originalTotalDiskSize = originalTotalDiskSize;
            return this;
        }
        public Long getOriginalTotalDiskSize() {
            return this.originalTotalDiskSize;
        }

        public DescribeInstanceResponseBodyInstanceResourceDiskSize setTotalDiskSize(Long totalDiskSize) {
            this.totalDiskSize = totalDiskSize;
            return this;
        }
        public Long getTotalDiskSize() {
            return this.totalDiskSize;
        }

        public DescribeInstanceResponseBodyInstanceResourceDiskSize setUnitDiskSize(Long unitDiskSize) {
            this.unitDiskSize = unitDiskSize;
            return this;
        }
        public Long getUnitDiskSize() {
            return this.unitDiskSize;
        }

        public DescribeInstanceResponseBodyInstanceResourceDiskSize setUsedDiskSize(Long usedDiskSize) {
            this.usedDiskSize = usedDiskSize;
            return this;
        }
        public Long getUsedDiskSize() {
            return this.usedDiskSize;
        }

    }

    public static class DescribeInstanceResponseBodyInstanceResourceLogDiskSize extends TeaModel {
        @NameInMap("LogAssignedSize")
        public String logAssignedSize;

        @NameInMap("MaxLogAssignedObServer")
        public java.util.List<String> maxLogAssignedObServer;

        @NameInMap("MaxLogAssignedPercent")
        public String maxLogAssignedPercent;

        @NameInMap("OriginalTotalDiskSize")
        public Integer originalTotalDiskSize;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("TotalDiskSize")
        public Long totalDiskSize;

        /**
         * <p>The request ID.</p>
         */
        @NameInMap("UnitDiskSize")
        public Long unitDiskSize;

        public static DescribeInstanceResponseBodyInstanceResourceLogDiskSize build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyInstanceResourceLogDiskSize self = new DescribeInstanceResponseBodyInstanceResourceLogDiskSize();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyInstanceResourceLogDiskSize setLogAssignedSize(String logAssignedSize) {
            this.logAssignedSize = logAssignedSize;
            return this;
        }
        public String getLogAssignedSize() {
            return this.logAssignedSize;
        }

        public DescribeInstanceResponseBodyInstanceResourceLogDiskSize setMaxLogAssignedObServer(java.util.List<String> maxLogAssignedObServer) {
            this.maxLogAssignedObServer = maxLogAssignedObServer;
            return this;
        }
        public java.util.List<String> getMaxLogAssignedObServer() {
            return this.maxLogAssignedObServer;
        }

        public DescribeInstanceResponseBodyInstanceResourceLogDiskSize setMaxLogAssignedPercent(String maxLogAssignedPercent) {
            this.maxLogAssignedPercent = maxLogAssignedPercent;
            return this;
        }
        public String getMaxLogAssignedPercent() {
            return this.maxLogAssignedPercent;
        }

        public DescribeInstanceResponseBodyInstanceResourceLogDiskSize setOriginalTotalDiskSize(Integer originalTotalDiskSize) {
            this.originalTotalDiskSize = originalTotalDiskSize;
            return this;
        }
        public Integer getOriginalTotalDiskSize() {
            return this.originalTotalDiskSize;
        }

        public DescribeInstanceResponseBodyInstanceResourceLogDiskSize setTotalDiskSize(Long totalDiskSize) {
            this.totalDiskSize = totalDiskSize;
            return this;
        }
        public Long getTotalDiskSize() {
            return this.totalDiskSize;
        }

        public DescribeInstanceResponseBodyInstanceResourceLogDiskSize setUnitDiskSize(Long unitDiskSize) {
            this.unitDiskSize = unitDiskSize;
            return this;
        }
        public Long getUnitDiskSize() {
            return this.unitDiskSize;
        }

    }

    public static class DescribeInstanceResponseBodyInstanceResourceMemory extends TeaModel {
        @NameInMap("OriginalTotalMemory")
        public Long originalTotalMemory;

        /**
         * <p>Indicates whether trusted ECS instances are used.</p>
         */
        @NameInMap("TotalMemory")
        public Long totalMemory;

        /**
         * <p>The log disk space of each replica node in the cluster. Unit: GB.</p>
         */
        @NameInMap("UnitMemory")
        public Long unitMemory;

        /**
         * <p>The time in UTC when the cluster was created.</p>
         */
        @NameInMap("UsedMemory")
        public Long usedMemory;

        public static DescribeInstanceResponseBodyInstanceResourceMemory build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyInstanceResourceMemory self = new DescribeInstanceResponseBodyInstanceResourceMemory();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyInstanceResourceMemory setOriginalTotalMemory(Long originalTotalMemory) {
            this.originalTotalMemory = originalTotalMemory;
            return this;
        }
        public Long getOriginalTotalMemory() {
            return this.originalTotalMemory;
        }

        public DescribeInstanceResponseBodyInstanceResourceMemory setTotalMemory(Long totalMemory) {
            this.totalMemory = totalMemory;
            return this;
        }
        public Long getTotalMemory() {
            return this.totalMemory;
        }

        public DescribeInstanceResponseBodyInstanceResourceMemory setUnitMemory(Long unitMemory) {
            this.unitMemory = unitMemory;
            return this;
        }
        public Long getUnitMemory() {
            return this.unitMemory;
        }

        public DescribeInstanceResponseBodyInstanceResourceMemory setUsedMemory(Long usedMemory) {
            this.usedMemory = usedMemory;
            return this;
        }
        public Long getUsedMemory() {
            return this.usedMemory;
        }

    }

    public static class DescribeInstanceResponseBodyInstanceResource extends TeaModel {
        @NameInMap("CapacityUnit")
        public DescribeInstanceResponseBodyInstanceResourceCapacityUnit capacityUnit;

        /**
         * <p>The information of the OceanBase cluster.</p>
         */
        @NameInMap("Cpu")
        public DescribeInstanceResponseBodyInstanceResourceCpu cpu;

        /**
         * <p>The number of the page to return. </p>
         * <p>- Start value: 1  </p>
         * <p>- Default value: 1</p>
         */
        @NameInMap("DiskSize")
        public DescribeInstanceResponseBodyInstanceResourceDiskSize diskSize;

        /**
         * <p>The server with the highest disk usage.</p>
         */
        @NameInMap("LogDiskSize")
        public DescribeInstanceResponseBodyInstanceResourceLogDiskSize logDiskSize;

        /**
         * <p>The name of the OceanBase cluster.</p>
         */
        @NameInMap("Memory")
        public DescribeInstanceResponseBodyInstanceResourceMemory memory;

        /**
         * <p>The number of CPU cores used in the cluster.</p>
         */
        @NameInMap("UnitCount")
        public Long unitCount;

        public static DescribeInstanceResponseBodyInstanceResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyInstanceResource self = new DescribeInstanceResponseBodyInstanceResource();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyInstanceResource setCapacityUnit(DescribeInstanceResponseBodyInstanceResourceCapacityUnit capacityUnit) {
            this.capacityUnit = capacityUnit;
            return this;
        }
        public DescribeInstanceResponseBodyInstanceResourceCapacityUnit getCapacityUnit() {
            return this.capacityUnit;
        }

        public DescribeInstanceResponseBodyInstanceResource setCpu(DescribeInstanceResponseBodyInstanceResourceCpu cpu) {
            this.cpu = cpu;
            return this;
        }
        public DescribeInstanceResponseBodyInstanceResourceCpu getCpu() {
            return this.cpu;
        }

        public DescribeInstanceResponseBodyInstanceResource setDiskSize(DescribeInstanceResponseBodyInstanceResourceDiskSize diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public DescribeInstanceResponseBodyInstanceResourceDiskSize getDiskSize() {
            return this.diskSize;
        }

        public DescribeInstanceResponseBodyInstanceResource setLogDiskSize(DescribeInstanceResponseBodyInstanceResourceLogDiskSize logDiskSize) {
            this.logDiskSize = logDiskSize;
            return this;
        }
        public DescribeInstanceResponseBodyInstanceResourceLogDiskSize getLogDiskSize() {
            return this.logDiskSize;
        }

        public DescribeInstanceResponseBodyInstanceResource setMemory(DescribeInstanceResponseBodyInstanceResourceMemory memory) {
            this.memory = memory;
            return this;
        }
        public DescribeInstanceResponseBodyInstanceResourceMemory getMemory() {
            return this.memory;
        }

        public DescribeInstanceResponseBodyInstanceResource setUnitCount(Long unitCount) {
            this.unitCount = unitCount;
            return this;
        }
        public Long getUnitCount() {
            return this.unitCount;
        }

    }

    public static class DescribeInstanceResponseBodyInstanceTenantCreatable extends TeaModel {
        @NameInMap("DisableCreateTenantReason")
        public String disableCreateTenantReason;

        @NameInMap("EnableCreateTenant")
        public Boolean enableCreateTenant;

        public static DescribeInstanceResponseBodyInstanceTenantCreatable build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyInstanceTenantCreatable self = new DescribeInstanceResponseBodyInstanceTenantCreatable();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyInstanceTenantCreatable setDisableCreateTenantReason(String disableCreateTenantReason) {
            this.disableCreateTenantReason = disableCreateTenantReason;
            return this;
        }
        public String getDisableCreateTenantReason() {
            return this.disableCreateTenantReason;
        }

        public DescribeInstanceResponseBodyInstanceTenantCreatable setEnableCreateTenant(Boolean enableCreateTenant) {
            this.enableCreateTenant = enableCreateTenant;
            return this;
        }
        public Boolean getEnableCreateTenant() {
            return this.enableCreateTenant;
        }

    }

    public static class DescribeInstanceResponseBodyInstance extends TeaModel {
        @NameInMap("AllowModifyInternetAddressConnectionLimit")
        public Boolean allowModifyInternetAddressConnectionLimit;

        /**
         * <p>The operation that you want to perform. <br>Set the value to **DescribeInstance**.</p>
         */
        @NameInMap("AutoRenewal")
        public Boolean autoRenewal;

        /**
         * <p>Example 1</p>
         */
        @NameInMap("AutoUpgradeObVersion")
        public Boolean autoUpgradeObVersion;

        @NameInMap("AvailableZones")
        public java.util.List<String> availableZones;

        @NameInMap("CpuArchitecture")
        public String cpuArchitecture;

        /**
         * <p>Indicates whether the log disk specifications can be upgraded.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DataDiskAutoScale")
        public Boolean dataDiskAutoScale;

        @NameInMap("DataDiskAutoScaleConfig")
        public DescribeInstanceResponseBodyInstanceDataDiskAutoScaleConfig dataDiskAutoScaleConfig;

        /**
         * <p>The total number of CPU cores of the cluster.</p>
         */
        @NameInMap("DataMergeTime")
        public String dataMergeTime;

        /**
         * <p>Alibaba Cloud CLI</p>
         */
        @NameInMap("DeployMode")
        public String deployMode;

        /**
         * <p>It is an online CLI tool that allows you to quickly retrieve and debug APIs. It can dynamically generate executable SDK code samples.</p>
         */
        @NameInMap("DeployType")
        public String deployType;

        /**
         * <p>The total storage space of the cluster, in GB.</p>
         */
        @NameInMap("DiskType")
        public String diskType;

        @NameInMap("EnableIsolationOptimization")
        public Boolean enableIsolationOptimization;

        @NameInMap("EnableProxyService")
        public Boolean enableProxyService;

        @NameInMap("EnableReadOnlyReplica")
        public Boolean enableReadOnlyReplica;

        @NameInMap("EnableReadOnlyReplicaManagement")
        public Boolean enableReadOnlyReplicaManagement;

        @NameInMap("EnableUpgradeLogDisk")
        public Boolean enableUpgradeLogDisk;

        @NameInMap("ExclusiveUnitNumLimit")
        public Integer exclusiveUnitNumLimit;

        /**
         * <p>The information of the OceanBase cluster.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("InTempCapacityStatus")
        public Boolean inTempCapacityStatus;

        /**
         * <p>The detailed information of the OBServer version.</p>
         */
        @NameInMap("InstanceClass")
        public String instanceClass;

        /**
         * <p>The information about the log disk space of the cluster.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Indicates whether automatic upgrade of the OBServer version is enabled.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceRole")
        public String instanceRole;

        @NameInMap("IsLatestObVersion")
        public Boolean isLatestObVersion;

        /**
         * <p>The information about the CPU resources of the cluster.</p>
         */
        @NameInMap("IsTrustEcs")
        public Boolean isTrustEcs;

        @NameInMap("IsolationOptimization")
        public Boolean isolationOptimization;

        /**
         * <p>The time when the major compaction of cluster data is performed.</p>
         */
        @NameInMap("MaintainTime")
        public String maintainTime;

        @NameInMap("NodeNum")
        public String nodeNum;

        @NameInMap("ObRpmVersion")
        public String obRpmVersion;

        /**
         * <p>The list of zones.</p>
         */
        @NameInMap("PayType")
        public String payType;

        @NameInMap("PrimaryInstance")
        public String primaryInstance;

        @NameInMap("PrimaryRegion")
        public String primaryRegion;

        @NameInMap("ProxyClusterId")
        public String proxyClusterId;

        @NameInMap("ProxyServiceStatus")
        public String proxyServiceStatus;

        @NameInMap("ReadOnlyResource")
        public DescribeInstanceResponseBodyInstanceReadOnlyResource readOnlyResource;

        @NameInMap("ReplicaMode")
        public String replicaMode;

        /**
         * <p>The size of used memory in the cluster, in GB.</p>
         */
        @NameInMap("Resource")
        public DescribeInstanceResponseBodyInstanceResource resource;

        /**
         * <p>Indicates whether the OBServer version is the latest.</p>
         */
        @NameInMap("Series")
        public String series;

        @NameInMap("SharedUnitNumLimit")
        public Integer sharedUnitNumLimit;

        @NameInMap("SpecType")
        public String specType;

        /**
         * <p>The information about cluster resources.</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("TenantCreatable")
        public DescribeInstanceResponseBodyInstanceTenantCreatable tenantCreatable;

        @NameInMap("UnitSpec")
        public String unitSpec;

        /**
         * <p>You can call this operation to query the detailed information of an OceanBase cluster.</p>
         */
        @NameInMap("Version")
        public String version;

        @NameInMap("Zones")
        public java.util.List<String> zones;

        public static DescribeInstanceResponseBodyInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyInstance self = new DescribeInstanceResponseBodyInstance();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyInstance setAllowModifyInternetAddressConnectionLimit(Boolean allowModifyInternetAddressConnectionLimit) {
            this.allowModifyInternetAddressConnectionLimit = allowModifyInternetAddressConnectionLimit;
            return this;
        }
        public Boolean getAllowModifyInternetAddressConnectionLimit() {
            return this.allowModifyInternetAddressConnectionLimit;
        }

        public DescribeInstanceResponseBodyInstance setAutoRenewal(Boolean autoRenewal) {
            this.autoRenewal = autoRenewal;
            return this;
        }
        public Boolean getAutoRenewal() {
            return this.autoRenewal;
        }

        public DescribeInstanceResponseBodyInstance setAutoUpgradeObVersion(Boolean autoUpgradeObVersion) {
            this.autoUpgradeObVersion = autoUpgradeObVersion;
            return this;
        }
        public Boolean getAutoUpgradeObVersion() {
            return this.autoUpgradeObVersion;
        }

        public DescribeInstanceResponseBodyInstance setAvailableZones(java.util.List<String> availableZones) {
            this.availableZones = availableZones;
            return this;
        }
        public java.util.List<String> getAvailableZones() {
            return this.availableZones;
        }

        public DescribeInstanceResponseBodyInstance setCpuArchitecture(String cpuArchitecture) {
            this.cpuArchitecture = cpuArchitecture;
            return this;
        }
        public String getCpuArchitecture() {
            return this.cpuArchitecture;
        }

        public DescribeInstanceResponseBodyInstance setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeInstanceResponseBodyInstance setDataDiskAutoScale(Boolean dataDiskAutoScale) {
            this.dataDiskAutoScale = dataDiskAutoScale;
            return this;
        }
        public Boolean getDataDiskAutoScale() {
            return this.dataDiskAutoScale;
        }

        public DescribeInstanceResponseBodyInstance setDataDiskAutoScaleConfig(DescribeInstanceResponseBodyInstanceDataDiskAutoScaleConfig dataDiskAutoScaleConfig) {
            this.dataDiskAutoScaleConfig = dataDiskAutoScaleConfig;
            return this;
        }
        public DescribeInstanceResponseBodyInstanceDataDiskAutoScaleConfig getDataDiskAutoScaleConfig() {
            return this.dataDiskAutoScaleConfig;
        }

        public DescribeInstanceResponseBodyInstance setDataMergeTime(String dataMergeTime) {
            this.dataMergeTime = dataMergeTime;
            return this;
        }
        public String getDataMergeTime() {
            return this.dataMergeTime;
        }

        public DescribeInstanceResponseBodyInstance setDeployMode(String deployMode) {
            this.deployMode = deployMode;
            return this;
        }
        public String getDeployMode() {
            return this.deployMode;
        }

        public DescribeInstanceResponseBodyInstance setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public DescribeInstanceResponseBodyInstance setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public DescribeInstanceResponseBodyInstance setEnableIsolationOptimization(Boolean enableIsolationOptimization) {
            this.enableIsolationOptimization = enableIsolationOptimization;
            return this;
        }
        public Boolean getEnableIsolationOptimization() {
            return this.enableIsolationOptimization;
        }

        public DescribeInstanceResponseBodyInstance setEnableProxyService(Boolean enableProxyService) {
            this.enableProxyService = enableProxyService;
            return this;
        }
        public Boolean getEnableProxyService() {
            return this.enableProxyService;
        }

        public DescribeInstanceResponseBodyInstance setEnableReadOnlyReplica(Boolean enableReadOnlyReplica) {
            this.enableReadOnlyReplica = enableReadOnlyReplica;
            return this;
        }
        public Boolean getEnableReadOnlyReplica() {
            return this.enableReadOnlyReplica;
        }

        public DescribeInstanceResponseBodyInstance setEnableReadOnlyReplicaManagement(Boolean enableReadOnlyReplicaManagement) {
            this.enableReadOnlyReplicaManagement = enableReadOnlyReplicaManagement;
            return this;
        }
        public Boolean getEnableReadOnlyReplicaManagement() {
            return this.enableReadOnlyReplicaManagement;
        }

        public DescribeInstanceResponseBodyInstance setEnableUpgradeLogDisk(Boolean enableUpgradeLogDisk) {
            this.enableUpgradeLogDisk = enableUpgradeLogDisk;
            return this;
        }
        public Boolean getEnableUpgradeLogDisk() {
            return this.enableUpgradeLogDisk;
        }

        public DescribeInstanceResponseBodyInstance setExclusiveUnitNumLimit(Integer exclusiveUnitNumLimit) {
            this.exclusiveUnitNumLimit = exclusiveUnitNumLimit;
            return this;
        }
        public Integer getExclusiveUnitNumLimit() {
            return this.exclusiveUnitNumLimit;
        }

        public DescribeInstanceResponseBodyInstance setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeInstanceResponseBodyInstance setInTempCapacityStatus(Boolean inTempCapacityStatus) {
            this.inTempCapacityStatus = inTempCapacityStatus;
            return this;
        }
        public Boolean getInTempCapacityStatus() {
            return this.inTempCapacityStatus;
        }

        public DescribeInstanceResponseBodyInstance setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public DescribeInstanceResponseBodyInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceResponseBodyInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeInstanceResponseBodyInstance setInstanceRole(String instanceRole) {
            this.instanceRole = instanceRole;
            return this;
        }
        public String getInstanceRole() {
            return this.instanceRole;
        }

        public DescribeInstanceResponseBodyInstance setIsLatestObVersion(Boolean isLatestObVersion) {
            this.isLatestObVersion = isLatestObVersion;
            return this;
        }
        public Boolean getIsLatestObVersion() {
            return this.isLatestObVersion;
        }

        public DescribeInstanceResponseBodyInstance setIsTrustEcs(Boolean isTrustEcs) {
            this.isTrustEcs = isTrustEcs;
            return this;
        }
        public Boolean getIsTrustEcs() {
            return this.isTrustEcs;
        }

        public DescribeInstanceResponseBodyInstance setIsolationOptimization(Boolean isolationOptimization) {
            this.isolationOptimization = isolationOptimization;
            return this;
        }
        public Boolean getIsolationOptimization() {
            return this.isolationOptimization;
        }

        public DescribeInstanceResponseBodyInstance setMaintainTime(String maintainTime) {
            this.maintainTime = maintainTime;
            return this;
        }
        public String getMaintainTime() {
            return this.maintainTime;
        }

        public DescribeInstanceResponseBodyInstance setNodeNum(String nodeNum) {
            this.nodeNum = nodeNum;
            return this;
        }
        public String getNodeNum() {
            return this.nodeNum;
        }

        public DescribeInstanceResponseBodyInstance setObRpmVersion(String obRpmVersion) {
            this.obRpmVersion = obRpmVersion;
            return this;
        }
        public String getObRpmVersion() {
            return this.obRpmVersion;
        }

        public DescribeInstanceResponseBodyInstance setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeInstanceResponseBodyInstance setPrimaryInstance(String primaryInstance) {
            this.primaryInstance = primaryInstance;
            return this;
        }
        public String getPrimaryInstance() {
            return this.primaryInstance;
        }

        public DescribeInstanceResponseBodyInstance setPrimaryRegion(String primaryRegion) {
            this.primaryRegion = primaryRegion;
            return this;
        }
        public String getPrimaryRegion() {
            return this.primaryRegion;
        }

        public DescribeInstanceResponseBodyInstance setProxyClusterId(String proxyClusterId) {
            this.proxyClusterId = proxyClusterId;
            return this;
        }
        public String getProxyClusterId() {
            return this.proxyClusterId;
        }

        public DescribeInstanceResponseBodyInstance setProxyServiceStatus(String proxyServiceStatus) {
            this.proxyServiceStatus = proxyServiceStatus;
            return this;
        }
        public String getProxyServiceStatus() {
            return this.proxyServiceStatus;
        }

        public DescribeInstanceResponseBodyInstance setReadOnlyResource(DescribeInstanceResponseBodyInstanceReadOnlyResource readOnlyResource) {
            this.readOnlyResource = readOnlyResource;
            return this;
        }
        public DescribeInstanceResponseBodyInstanceReadOnlyResource getReadOnlyResource() {
            return this.readOnlyResource;
        }

        public DescribeInstanceResponseBodyInstance setReplicaMode(String replicaMode) {
            this.replicaMode = replicaMode;
            return this;
        }
        public String getReplicaMode() {
            return this.replicaMode;
        }

        public DescribeInstanceResponseBodyInstance setResource(DescribeInstanceResponseBodyInstanceResource resource) {
            this.resource = resource;
            return this;
        }
        public DescribeInstanceResponseBodyInstanceResource getResource() {
            return this.resource;
        }

        public DescribeInstanceResponseBodyInstance setSeries(String series) {
            this.series = series;
            return this;
        }
        public String getSeries() {
            return this.series;
        }

        public DescribeInstanceResponseBodyInstance setSharedUnitNumLimit(Integer sharedUnitNumLimit) {
            this.sharedUnitNumLimit = sharedUnitNumLimit;
            return this;
        }
        public Integer getSharedUnitNumLimit() {
            return this.sharedUnitNumLimit;
        }

        public DescribeInstanceResponseBodyInstance setSpecType(String specType) {
            this.specType = specType;
            return this;
        }
        public String getSpecType() {
            return this.specType;
        }

        public DescribeInstanceResponseBodyInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInstanceResponseBodyInstance setTenantCreatable(DescribeInstanceResponseBodyInstanceTenantCreatable tenantCreatable) {
            this.tenantCreatable = tenantCreatable;
            return this;
        }
        public DescribeInstanceResponseBodyInstanceTenantCreatable getTenantCreatable() {
            return this.tenantCreatable;
        }

        public DescribeInstanceResponseBodyInstance setUnitSpec(String unitSpec) {
            this.unitSpec = unitSpec;
            return this;
        }
        public String getUnitSpec() {
            return this.unitSpec;
        }

        public DescribeInstanceResponseBodyInstance setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeInstanceResponseBodyInstance setZones(java.util.List<String> zones) {
            this.zones = zones;
            return this;
        }
        public java.util.List<String> getZones() {
            return this.zones;
        }

    }

}
