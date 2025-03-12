// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceResponseBody extends TeaModel {
    /**
     * <p>The information of the OceanBase cluster.</p>
     */
    @NameInMap("Instance")
    public DescribeInstanceResponseBodyInstance instance;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
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
        /**
         * <p>Specifies whether to enable the automatic scaling of the data disk.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoScale")
        public Boolean autoScale;

        /**
         * <p>The maximum size of the disk, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>80000</p>
         */
        @NameInMap("MaxDiskSize")
        public Long maxDiskSize;

        /**
         * <p>The size of scaling step during a major compaction.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ScaleStepInMerge")
        public Long scaleStepInMerge;

        /**
         * <p>The size of scaling step during daily use.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("ScaleStepInNormal")
        public Long scaleStepInNormal;

        /**
         * <p>The maximum usage of the data disk, in percentage, that triggers the scaling of the data disk for major compactions.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("UpperMergeThreshold")
        public Long upperMergeThreshold;

        /**
         * <p>The step size of the scale-out.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("UpperScaleStep")
        public String upperScaleStep;

        /**
         * <p>The scale-out strategy. Valid values: RAW and PERCENTAGE.</p>
         * 
         * <strong>example:</strong>
         * <p>RAW</p>
         */
        @NameInMap("UpperScaleStrategy")
        public String upperScaleStrategy;

        /**
         * <p>The maximum usage of the data disk, in percentage, that triggers the scaling of the data disk for daily use.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("UpperThreshold")
        public Long upperThreshold;

        /**
         * <p>The maximum space, in GB, to which the data disk can be scaled.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
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
        /**
         * <p>The maximum number of capacity units.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("MaxCapacityUnit")
        public Integer maxCapacityUnit;

        /**
         * <p>The minimum number of capacity units.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinCapacityUnit")
        public Integer minCapacityUnit;

        /**
         * <p>The number of used capacity units.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
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
        /**
         * <p>The number of original CPU cores in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        @NameInMap("OriginalTotalCpu")
        public Long originalTotalCpu;

        /**
         * <p>The total number of CPU cores of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        @NameInMap("TotalCpu")
        public Long totalCpu;

        /**
         * <p>The number of CPU cores of each replica node in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("UnitCpu")
        public Long unitCpu;

        /**
         * <p>The number of CPU cores used by the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
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
        /**
         * <p>The size of the data disk, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("DataUsedSize")
        public Double dataUsedSize;

        /**
         * <p>The maximum disk size that can be created.</p>
         * 
         * <strong>example:</strong>
         * <p>80000</p>
         */
        @NameInMap("MaxDiskSize")
        public Double maxDiskSize;

        /**
         * <p>The maximum disk usage of the OBServer node.</p>
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

        /**
         * <p>The original size of the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("OriginalTotalDiskSize")
        public Long originalTotalDiskSize;

        /**
         * <p>The total storage space of the cluster, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("TotalDiskSize")
        public Long totalDiskSize;

        /**
         * <p>The storage space of each replica node in the cluster, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("UnitDiskSize")
        public Long unitDiskSize;

        /**
         * <p>The size of used storage space of the cluster, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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
        /**
         * <p>The allocated disk space for log storage, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("LogAssignedSize")
        public String logAssignedSize;

        /**
         * <p>The maximum storage space allocated for.</p>
         */
        @NameInMap("MaxLogAssignedObServer")
        public java.util.List<String> maxLogAssignedObServer;

        /**
         * <p>The maximum percentage of space allocated for log storage.</p>
         * 
         * <strong>example:</strong>
         * <p>6.68</p>
         */
        @NameInMap("MaxLogAssignedPercent")
        public String maxLogAssignedPercent;

        /**
         * <p>The information about the log disk space of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("TotalDiskSize")
        public Long totalDiskSize;

        /**
         * <p>The log disk space of each replica node in the cluster, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
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
        /**
         * <p>The original memory size of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>72</p>
         */
        @NameInMap("OriginalTotalMemory")
        public Long originalTotalMemory;

        /**
         * <p>The total memory size of the cluster, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        @NameInMap("TotalMemory")
        public Long totalMemory;

        /**
         * <p>The memory size of each replica node in the cluster, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("UnitMemory")
        public Long unitMemory;

        /**
         * <p>The size of memory used by the cluster, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
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
        /**
         * <p>The information about capacity units.</p>
         */
        @NameInMap("CapacityUnit")
        public DescribeInstanceResponseBodyInstanceReadOnlyResourceCapacityUnit capacityUnit;

        /**
         * <p>The information about the CPU resources of the cluster.</p>
         */
        @NameInMap("Cpu")
        public DescribeInstanceResponseBodyInstanceReadOnlyResourceCpu cpu;

        /**
         * <p>The information about the storage resources of the cluster.</p>
         */
        @NameInMap("DiskSize")
        public DescribeInstanceResponseBodyInstanceReadOnlyResourceDiskSize diskSize;

        /**
         * <p>The information about the log disk space of the cluster.</p>
         */
        @NameInMap("LogDiskSize")
        public DescribeInstanceResponseBodyInstanceReadOnlyResourceLogDiskSize logDiskSize;

        /**
         * <p>The information about the memory resources of the cluster.</p>
         */
        @NameInMap("Memory")
        public DescribeInstanceResponseBodyInstanceReadOnlyResourceMemory memory;

        /**
         * <p>The number of resource units in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
        /**
         * <p>The maximum number of capacity units.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("MaxCapacityUnit")
        public Integer maxCapacityUnit;

        /**
         * <p>The minimum number of capacity units.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinCapacityUnit")
        public Integer minCapacityUnit;

        /**
         * <p>The number of used capacity units.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
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
        /**
         * <p>The number of original CPU cores in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        @NameInMap("OriginalTotalCpu")
        public Long originalTotalCpu;

        /**
         * <p>The total number of CPU cores of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        @NameInMap("TotalCpu")
        public Long totalCpu;

        /**
         * <p>The number of CPU cores of each replica node in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("UnitCpu")
        public Long unitCpu;

        /**
         * <p>The number of CPU cores used in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * <p>The size of the data disk, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("DataUsedSize")
        public Double dataUsedSize;

        /**
         * <p>The maximum disk size that can be created.</p>
         * 
         * <strong>example:</strong>
         * <p>80000</p>
         */
        @NameInMap("MaxDiskSize")
        public Double maxDiskSize;

        /**
         * <p>The maximum disk usage of the OBServer node.</p>
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

        /**
         * <p>The original size of the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("OriginalTotalDiskSize")
        public Long originalTotalDiskSize;

        /**
         * <p>The total storage space of the cluster, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("TotalDiskSize")
        public Long totalDiskSize;

        /**
         * <p>The storage space of each replica node in the cluster, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("UnitDiskSize")
        public Long unitDiskSize;

        /**
         * <p>The size of used storage space of the cluster, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
        /**
         * <p>The allocated disk space for log storage, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("LogAssignedSize")
        public String logAssignedSize;

        /**
         * <p>The maximum storage space allocated for.</p>
         */
        @NameInMap("MaxLogAssignedObServer")
        public java.util.List<String> maxLogAssignedObServer;

        /**
         * <p>The maximum percentage of space allocated for log storage.</p>
         * 
         * <strong>example:</strong>
         * <p>6.68</p>
         */
        @NameInMap("MaxLogAssignedPercent")
        public String maxLogAssignedPercent;

        /**
         * <p>The original size of the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("OriginalTotalDiskSize")
        public Integer originalTotalDiskSize;

        /**
         * <p>The total log disk space of the cluster, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("TotalDiskSize")
        public Long totalDiskSize;

        /**
         * <p>The log disk space of each replica node in the cluster. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
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
        /**
         * <p>The original memory size of the cluster, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>72</p>
         */
        @NameInMap("OriginalTotalMemory")
        public Long originalTotalMemory;

        /**
         * <p>The total memory size of the cluster, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        @NameInMap("TotalMemory")
        public Long totalMemory;

        /**
         * <p>The memory size of each replica node in the cluster, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("UnitMemory")
        public Long unitMemory;

        /**
         * <p>The size of used memory in the cluster, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
        /**
         * <p>The information about capacity units.</p>
         */
        @NameInMap("CapacityUnit")
        public DescribeInstanceResponseBodyInstanceResourceCapacityUnit capacityUnit;

        /**
         * <p>The information about the CPU resources of the cluster.</p>
         */
        @NameInMap("Cpu")
        public DescribeInstanceResponseBodyInstanceResourceCpu cpu;

        /**
         * <p>The information about the storage resources of the cluster.</p>
         */
        @NameInMap("DiskSize")
        public DescribeInstanceResponseBodyInstanceResourceDiskSize diskSize;

        /**
         * <p>The information about the log disk space of the cluster.</p>
         */
        @NameInMap("LogDiskSize")
        public DescribeInstanceResponseBodyInstanceResourceLogDiskSize logDiskSize;

        /**
         * <p>The information about the memory resources of the cluster.</p>
         */
        @NameInMap("Memory")
        public DescribeInstanceResponseBodyInstanceResourceMemory memory;

        /**
         * <p>The number of resource units in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
        /**
         * <p>The reason why you cannot create a tenant in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>CPU_NOT_ENOUGH,  MEMORY_NOT_ENOUGH, TENANT_COUNT_EXCEEDS_LIMIT</p>
         */
        @NameInMap("DisableCreateTenantReason")
        public String disableCreateTenantReason;

        /**
         * <p>Specifies whether a tenant can be created.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
        /**
         * <p>Indicates whether the OceanBase Database Proxy (ODP) SQL firewall is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AllowCreateProxySqlFirewallRule")
        public Boolean allowCreateProxySqlFirewallRule;

        /**
         * <p>Indicates whether the maximum number of public connections can be modified.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AllowModifyInternetAddressConnectionLimit")
        public Boolean allowModifyInternetAddressConnectionLimit;

        /**
         * <p>Indicates whether automatic renewal is enabled. </p>
         * <p>This parameter is valid only for clusters whose billing methods are set to PREPAY.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoRenewal")
        public Boolean autoRenewal;

        /**
         * <p>Indicates whether automatic upgrade of the OBServer version is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoUpgradeObVersion")
        public Boolean autoUpgradeObVersion;

        /**
         * <p>The list of zones.</p>
         */
        @NameInMap("AvailableZones")
        public java.util.List<String> availableZones;

        /**
         * <p>The CPU architecture of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>X86</p>
         */
        @NameInMap("CpuArchitecture")
        public String cpuArchitecture;

        /**
         * <p>The time in UTC when the cluster was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-19T07:13:41Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Specifies whether to enable automatic scaling of the data disk.</p>
         * <blockquote>
         * <p><br>This parameter is deprecated.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("DataDiskAutoScale")
        public Boolean dataDiskAutoScale;

        /**
         * <p>Specifies parameters for the automatic scaling of the data disk.</p>
         */
        @NameInMap("DataDiskAutoScaleConfig")
        public DescribeInstanceResponseBodyInstanceDataDiskAutoScaleConfig dataDiskAutoScaleConfig;

        /**
         * <p>The time when the major compaction of cluster data is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>02:00</p>
         */
        @NameInMap("DataMergeTime")
        public String dataMergeTime;

        /**
         * <p>The data replica distribution mode of the cluster. Valid values: </p>
         * <ul>
         * <li>n: indicates the single-IDC mode. </li>
         * <li>n-n: indicates the dual-IDC mode. </li>
         * <li>n-n-n: indicates the multi-IDC mode.</li>
         * </ul>
         * <blockquote>
         * <p><br>The integer n represents the number of OBServer nodes in each IDC.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1-1-1</p>
         */
        @NameInMap("DeployMode")
        public String deployMode;

        /**
         * <p>The deployment type of the cluster. Valid values:  </p>
         * <ul>
         * <li>multiple: multi-IDC deployment   </li>
         * <li>single: single-IDC deployment   </li>
         * <li>dual: dual-IDC deployment</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>multiple</p>
         */
        @NameInMap("DeployType")
        public String deployType;

        /**
         * <p>The type of the storage disk where the cluster is deployed. </p>
         * <p>The default value is cloud_essd_pl1, which indicates an ESSD cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd_pl1</p>
         */
        @NameInMap("DiskType")
        public String diskType;

        /**
         * <p>Specifies whether to enable isolation optimization.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableIsolationOptimization")
        public Boolean enableIsolationOptimization;

        /**
         * <p>Specifies whether to enable the proxy service.</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableProxyService")
        public Boolean enableProxyService;

        /**
         * <p>Indicates whether read-only replicas are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableReadOnlyReplica")
        public Boolean enableReadOnlyReplica;

        /**
         * <p>Indicates whether read-only replicas can be purchased for the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableReadOnlyReplicaManagement")
        public Boolean enableReadOnlyReplicaManagement;

        /**
         * <p>Indicates whether the log disk specifications can be upgraded.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableUpgradeLogDisk")
        public Boolean enableUpgradeLogDisk;

        /**
         * <p>The maximum number of units of the proxy service in exclusive mode.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExclusiveUnitNumLimit")
        public Integer exclusiveUnitNumLimit;

        /**
         * <p>The time in UTC when the cluster expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-17T16:00:00Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>Specifies whether to indicate the temporary status of the capacity.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("InTempCapacityStatus")
        public Boolean inTempCapacityStatus;

        /**
         * <p>The specifications of the cluster.  You can specify one of the following four plans:    </p>
         * <ul>
         * <li>8C32G: indicates 8 CPU cores and 32 GB of memory. </li>
         * <li>14C70G: indicates 14 CPU cores and 70 GB of memory. </li>
         * <li>30C180G: indicates 30 CPU cores and 180 GB of memory. </li>
         * <li>62C400G: indicates 62 CPU cores and 400 GB of memory.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>14C70G</p>
         */
        @NameInMap("InstanceClass")
        public String instanceClass;

        /**
         * <p>The ID of the OceanBase cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>ob317v4uif****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the OceanBase cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>ob4test</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The role of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("InstanceRole")
        public String instanceRole;

        /**
         * <p>Indicates whether the OBServer version is the latest.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsLatestObVersion")
        public Boolean isLatestObVersion;

        /**
         * <p>Indicates whether trusted ECS instances are used.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsTrustEcs")
        public Boolean isTrustEcs;

        /**
         * <p>Specifies whether to enable the control group feature.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsolationOptimization")
        public Boolean isolationOptimization;

        /**
         * <p>The period in UTC for the daily routine maintenance of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>19:00Z-20:00Z</p>
         */
        @NameInMap("MaintainTime")
        public String maintainTime;

        /**
         * <p>The number of nodes in the cluster. If the cluster is deployed in n-n-n mode, the number of nodes in the cluster equals n × 3.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("NodeNum")
        public String nodeNum;

        /**
         * <p>The detailed information of the OBServer version.</p>
         * 
         * <strong>example:</strong>
         * <p>2.2.77-20210526202046</p>
         */
        @NameInMap("ObRpmVersion")
        public String obRpmVersion;

        /**
         * <p>The billing method of the OceanBase cluster. Valid values: </p>
         * <ul>
         * <li>PREPAY: the subscription billing method. </li>
         * <li>POSTPAY: the pay-as-you-go billing method.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PREPAY</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The ID of the primary cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>ob3h8ytroxxxxx</p>
         */
        @NameInMap("PrimaryInstance")
        public String primaryInstance;

        /**
         * <p>The region of the primary cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("PrimaryRegion")
        public String primaryRegion;

        /**
         * <p>The ID of the proxy cluster.</p>
         * <blockquote>
         * <p>This parameter returns a value only if you set the <strong>EnableProxyService</strong> parameter to true.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>proxy-56****a6tg2o</p>
         */
        @NameInMap("ProxyClusterId")
        public String proxyClusterId;

        /**
         * <p>The status of the proxy service.</p>
         * 
         * <strong>example:</strong>
         * <p>ONLINE</p>
         */
        @NameInMap("ProxyServiceStatus")
        public String proxyServiceStatus;

        /**
         * <p>The information about cluster resources.</p>
         */
        @NameInMap("ReadOnlyResource")
        public DescribeInstanceResponseBodyInstanceReadOnlyResource readOnlyResource;

        /**
         * <p>The number of full-featured replicas. Return value: 3 or 2.</p>
         * <ul>
         * <li>3: three full-featured replicas.</li>
         * <li>2: two full-featured replicas.</li>
         * </ul>
         * <p>An OceanBase cluster deployed in three-zone mode supports only three full-featured replicas. An OceanBase cluster deployed in two-zone mode supports only two full-featured replicas. An OceanBase cluster deployed in one single zone supports two or three full-featured replicas.</p>
         * 
         * <strong>example:</strong>
         * <p>2F1A</p>
         */
        @NameInMap("ReplicaMode")
        public String replicaMode;

        /**
         * <p>The information about cluster resources.</p>
         */
        @NameInMap("Resource")
        public DescribeInstanceResponseBodyInstanceResource resource;

        /**
         * <p>The series of the instance. Valid values:</p>
         * <ul>
         * <li><p>normal: Standard Cluster Edition (Cloud Disk). This is the default value.</p>
         * </li>
         * <li><p>normal_ssd: Standard Cluster Edition (Local Disk)</p>
         * </li>
         * <li><p>history: History Database Cluster Edition</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Series")
        public String series;

        /**
         * <p>The maximum number of units of the proxy service in shared mode.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("SharedUnitNumLimit")
        public Integer sharedUnitNumLimit;

        /**
         * <p>The specification type.</p>
         * 
         * <strong>example:</strong>
         * <p>dedicatedspec</p>
         */
        @NameInMap("SpecType")
        public String specType;

        /**
         * <p>The status of the cluster. Valid values: </p>
         * <ul>
         * <li>PENDING_CREATE: The cluster is being created. </li>
         * <li>ONLINE: The cluster is running. </li>
         * <li>TENANT_CREATING: The tenant is being created. </li>
         * <li>TENANT_SPEC_MODIFYING: The tenant specifications are being modified. </li>
         * <li>EXPANDING: Nodes are being added to the cluster to increase its capacity. </li>
         * <li>REDUCING: Nodes are being removed from the cluster to reduce its capacity. </li>
         * <li>SPEC_UPGRADING: The service plan is being upgraded. </li>
         * <li>DISK_UPGRADING: The storage space is being expanded. </li>
         * <li>WHITE_LIST_MODIFYING: The whitelist is being modified. </li>
         * <li>PARAMETER_MODIFYING: Parameters are being modified. </li>
         * <li>SSL_MODIFYING: The SSL certificate is being changed. </li>
         * <li>PREPAID_EXPIRE_CLOSED: The payment is overdue. This parameter is valid for a cluster whose billing method is set to PREPAY. </li>
         * <li>ARREARS_CLOSED: The payment is overdue. This parameter is valid for a cluster whose billing method is set to POSTPAY. </li>
         * <li>PENDING_DELETE: The cluster is being deleted.<br>Generally, the cluster is in the ONLINE state.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ONLINE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Specifies whether a tenant can be created.</p>
         */
        @NameInMap("TenantCreatable")
        public DescribeInstanceResponseBodyInstanceTenantCreatable tenantCreatable;

        /**
         * <p>The unit specification of the proxy service.</p>
         * 
         * <strong>example:</strong>
         * <p>2C4G</p>
         */
        @NameInMap("UnitSpec")
        public String unitSpec;

        /**
         * <p>The version of OceanBase Database.</p>
         * 
         * <strong>example:</strong>
         * <p>2.2.77</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>The ID of the zone to which the instance belongs.
         * &lt;props=&quot;intl&quot;&gt;For more information about how to obtain the list of zones, see <a href="https://www.alibabacloud.com/help/en/apsaradb-for-oceanbase/latest/api-oceanbasepro-2019-09-01-describezones">DescribeZones</a>.</p>
         */
        @NameInMap("Zones")
        public java.util.List<String> zones;

        public static DescribeInstanceResponseBodyInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyInstance self = new DescribeInstanceResponseBodyInstance();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyInstance setAllowCreateProxySqlFirewallRule(Boolean allowCreateProxySqlFirewallRule) {
            this.allowCreateProxySqlFirewallRule = allowCreateProxySqlFirewallRule;
            return this;
        }
        public Boolean getAllowCreateProxySqlFirewallRule() {
            return this.allowCreateProxySqlFirewallRule;
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
