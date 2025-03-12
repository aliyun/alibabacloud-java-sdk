// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponseBody extends TeaModel {
    /**
     * <p>The information of the OceanBase cluster.</p>
     */
    @NameInMap("Instances")
    public java.util.List<DescribeInstancesResponseBodyInstances> instances;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of OceanBase clusters queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesResponseBody self = new DescribeInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesResponseBody setInstances(java.util.List<DescribeInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<DescribeInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public DescribeInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeInstancesResponseBodyInstancesDataDiskAutoScaleConfig extends TeaModel {
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
        public Double scaleStepInMerge;

        /**
         * <p>The size of scaling step during daily use.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("ScaleStepInNormal")
        public Double scaleStepInNormal;

        /**
         * <p>The maximum usage of the data disk, in percentage, that triggers the scaling of the data disk for major compactions.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("UpperMergeThreshold")
        public Double upperMergeThreshold;

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
        public Double upperThreshold;

        /**
         * <p>The maximum space, in GB, to which the data disk can be scaled.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("Upperbound")
        public Double upperbound;

        public static DescribeInstancesResponseBodyInstancesDataDiskAutoScaleConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesDataDiskAutoScaleConfig self = new DescribeInstancesResponseBodyInstancesDataDiskAutoScaleConfig();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesDataDiskAutoScaleConfig setAutoScale(Boolean autoScale) {
            this.autoScale = autoScale;
            return this;
        }
        public Boolean getAutoScale() {
            return this.autoScale;
        }

        public DescribeInstancesResponseBodyInstancesDataDiskAutoScaleConfig setMaxDiskSize(Long maxDiskSize) {
            this.maxDiskSize = maxDiskSize;
            return this;
        }
        public Long getMaxDiskSize() {
            return this.maxDiskSize;
        }

        public DescribeInstancesResponseBodyInstancesDataDiskAutoScaleConfig setScaleStepInMerge(Double scaleStepInMerge) {
            this.scaleStepInMerge = scaleStepInMerge;
            return this;
        }
        public Double getScaleStepInMerge() {
            return this.scaleStepInMerge;
        }

        public DescribeInstancesResponseBodyInstancesDataDiskAutoScaleConfig setScaleStepInNormal(Double scaleStepInNormal) {
            this.scaleStepInNormal = scaleStepInNormal;
            return this;
        }
        public Double getScaleStepInNormal() {
            return this.scaleStepInNormal;
        }

        public DescribeInstancesResponseBodyInstancesDataDiskAutoScaleConfig setUpperMergeThreshold(Double upperMergeThreshold) {
            this.upperMergeThreshold = upperMergeThreshold;
            return this;
        }
        public Double getUpperMergeThreshold() {
            return this.upperMergeThreshold;
        }

        public DescribeInstancesResponseBodyInstancesDataDiskAutoScaleConfig setUpperScaleStrategy(String upperScaleStrategy) {
            this.upperScaleStrategy = upperScaleStrategy;
            return this;
        }
        public String getUpperScaleStrategy() {
            return this.upperScaleStrategy;
        }

        public DescribeInstancesResponseBodyInstancesDataDiskAutoScaleConfig setUpperThreshold(Double upperThreshold) {
            this.upperThreshold = upperThreshold;
            return this;
        }
        public Double getUpperThreshold() {
            return this.upperThreshold;
        }

        public DescribeInstancesResponseBodyInstancesDataDiskAutoScaleConfig setUpperbound(Double upperbound) {
            this.upperbound = upperbound;
            return this;
        }
        public Double getUpperbound() {
            return this.upperbound;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesResourceCapacityUnit extends TeaModel {
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
        public Integer usedCapacityUnit;

        public static DescribeInstancesResponseBodyInstancesResourceCapacityUnit build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesResourceCapacityUnit self = new DescribeInstancesResponseBodyInstancesResourceCapacityUnit();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesResourceCapacityUnit setMaxCapacityUnit(Integer maxCapacityUnit) {
            this.maxCapacityUnit = maxCapacityUnit;
            return this;
        }
        public Integer getMaxCapacityUnit() {
            return this.maxCapacityUnit;
        }

        public DescribeInstancesResponseBodyInstancesResourceCapacityUnit setMinCapacityUnit(Integer minCapacityUnit) {
            this.minCapacityUnit = minCapacityUnit;
            return this;
        }
        public Integer getMinCapacityUnit() {
            return this.minCapacityUnit;
        }

        public DescribeInstancesResponseBodyInstancesResourceCapacityUnit setUsedCapacityUnit(Integer usedCapacityUnit) {
            this.usedCapacityUnit = usedCapacityUnit;
            return this;
        }
        public Integer getUsedCapacityUnit() {
            return this.usedCapacityUnit;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesResourceCpu extends TeaModel {
        /**
         * <p>The number of original CPU cores in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        @NameInMap("OriginalTotalCpu")
        public Double originalTotalCpu;

        /**
         * <p>The total number of CPU cores of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        @NameInMap("TotalCpu")
        public Double totalCpu;

        /**
         * <p>The number of CPU cores of each replica node in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("UnitCpu")
        public Double unitCpu;

        /**
         * <p>The number of CPU cores used in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("UsedCpu")
        public Double usedCpu;

        public static DescribeInstancesResponseBodyInstancesResourceCpu build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesResourceCpu self = new DescribeInstancesResponseBodyInstancesResourceCpu();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesResourceCpu setOriginalTotalCpu(Double originalTotalCpu) {
            this.originalTotalCpu = originalTotalCpu;
            return this;
        }
        public Double getOriginalTotalCpu() {
            return this.originalTotalCpu;
        }

        public DescribeInstancesResponseBodyInstancesResourceCpu setTotalCpu(Double totalCpu) {
            this.totalCpu = totalCpu;
            return this;
        }
        public Double getTotalCpu() {
            return this.totalCpu;
        }

        public DescribeInstancesResponseBodyInstancesResourceCpu setUnitCpu(Double unitCpu) {
            this.unitCpu = unitCpu;
            return this;
        }
        public Double getUnitCpu() {
            return this.unitCpu;
        }

        public DescribeInstancesResponseBodyInstancesResourceCpu setUsedCpu(Double usedCpu) {
            this.usedCpu = usedCpu;
            return this;
        }
        public Double getUsedCpu() {
            return this.usedCpu;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesResourceDiskSize extends TeaModel {
        /**
         * <p>The original size of the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("OriginalTotalDiskSize")
        public Double originalTotalDiskSize;

        /**
         * <p>The total storage space of the cluster, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("TotalDiskSize")
        public Double totalDiskSize;

        /**
         * <p>The storage space of each replica node in the cluster, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("UnitDiskSize")
        public Double unitDiskSize;

        /**
         * <p>The size of used storage space of the cluster, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("UsedDiskSize")
        public Long usedDiskSize;

        public static DescribeInstancesResponseBodyInstancesResourceDiskSize build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesResourceDiskSize self = new DescribeInstancesResponseBodyInstancesResourceDiskSize();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesResourceDiskSize setOriginalTotalDiskSize(Double originalTotalDiskSize) {
            this.originalTotalDiskSize = originalTotalDiskSize;
            return this;
        }
        public Double getOriginalTotalDiskSize() {
            return this.originalTotalDiskSize;
        }

        public DescribeInstancesResponseBodyInstancesResourceDiskSize setTotalDiskSize(Double totalDiskSize) {
            this.totalDiskSize = totalDiskSize;
            return this;
        }
        public Double getTotalDiskSize() {
            return this.totalDiskSize;
        }

        public DescribeInstancesResponseBodyInstancesResourceDiskSize setUnitDiskSize(Double unitDiskSize) {
            this.unitDiskSize = unitDiskSize;
            return this;
        }
        public Double getUnitDiskSize() {
            return this.unitDiskSize;
        }

        public DescribeInstancesResponseBodyInstancesResourceDiskSize setUsedDiskSize(Long usedDiskSize) {
            this.usedDiskSize = usedDiskSize;
            return this;
        }
        public Long getUsedDiskSize() {
            return this.usedDiskSize;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesResourceMemory extends TeaModel {
        /**
         * <p>The original memory size of the cluster, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>72</p>
         */
        @NameInMap("OriginalTotalMemory")
        public Double originalTotalMemory;

        /**
         * <p>The total memory size of the cluster, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        @NameInMap("TotalMemory")
        public Double totalMemory;

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

        public static DescribeInstancesResponseBodyInstancesResourceMemory build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesResourceMemory self = new DescribeInstancesResponseBodyInstancesResourceMemory();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesResourceMemory setOriginalTotalMemory(Double originalTotalMemory) {
            this.originalTotalMemory = originalTotalMemory;
            return this;
        }
        public Double getOriginalTotalMemory() {
            return this.originalTotalMemory;
        }

        public DescribeInstancesResponseBodyInstancesResourceMemory setTotalMemory(Double totalMemory) {
            this.totalMemory = totalMemory;
            return this;
        }
        public Double getTotalMemory() {
            return this.totalMemory;
        }

        public DescribeInstancesResponseBodyInstancesResourceMemory setUnitMemory(Long unitMemory) {
            this.unitMemory = unitMemory;
            return this;
        }
        public Long getUnitMemory() {
            return this.unitMemory;
        }

        public DescribeInstancesResponseBodyInstancesResourceMemory setUsedMemory(Long usedMemory) {
            this.usedMemory = usedMemory;
            return this;
        }
        public Long getUsedMemory() {
            return this.usedMemory;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesResource extends TeaModel {
        /**
         * <p>The information about capacity units.</p>
         */
        @NameInMap("CapacityUnit")
        public DescribeInstancesResponseBodyInstancesResourceCapacityUnit capacityUnit;

        /**
         * <p>The information about the CPU resources of the cluster.</p>
         */
        @NameInMap("Cpu")
        public DescribeInstancesResponseBodyInstancesResourceCpu cpu;

        /**
         * <p>The information about the storage resources of the cluster.</p>
         */
        @NameInMap("DiskSize")
        public DescribeInstancesResponseBodyInstancesResourceDiskSize diskSize;

        /**
         * <p>The information about the memory resources of the cluster.</p>
         */
        @NameInMap("Memory")
        public DescribeInstancesResponseBodyInstancesResourceMemory memory;

        /**
         * <p>The number of resource units in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UnitCount")
        public Long unitCount;

        public static DescribeInstancesResponseBodyInstancesResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesResource self = new DescribeInstancesResponseBodyInstancesResource();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesResource setCapacityUnit(DescribeInstancesResponseBodyInstancesResourceCapacityUnit capacityUnit) {
            this.capacityUnit = capacityUnit;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesResourceCapacityUnit getCapacityUnit() {
            return this.capacityUnit;
        }

        public DescribeInstancesResponseBodyInstancesResource setCpu(DescribeInstancesResponseBodyInstancesResourceCpu cpu) {
            this.cpu = cpu;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesResourceCpu getCpu() {
            return this.cpu;
        }

        public DescribeInstancesResponseBodyInstancesResource setDiskSize(DescribeInstancesResponseBodyInstancesResourceDiskSize diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesResourceDiskSize getDiskSize() {
            return this.diskSize;
        }

        public DescribeInstancesResponseBodyInstancesResource setMemory(DescribeInstancesResponseBodyInstancesResourceMemory memory) {
            this.memory = memory;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesResourceMemory getMemory() {
            return this.memory;
        }

        public DescribeInstancesResponseBodyInstancesResource setUnitCount(Long unitCount) {
            this.unitCount = unitCount;
            return this;
        }
        public Long getUnitCount() {
            return this.unitCount;
        }

    }

    public static class DescribeInstancesResponseBodyInstances extends TeaModel {
        /**
         * <p>The information about the zone in which the cluster is deployed.</p>
         */
        @NameInMap("AvailableZones")
        public java.util.List<String> availableZones;

        /**
         * <p>The product code of the OceanBase cluster.   </p>
         * <ul>
         * <li>oceanbase_oceanbasepre_public_cn: indicates an OceanBase cluster that is billed based on the subscription plan and that is deployed in a China site.  </li>
         * <li>oceanbase_oceanbasepost_public_cn: indicates an OceanBase cluster that is billed based on the pay-as-you-go plan and that is deployed in a China site.  </li>
         * <li>oceanbase_obpre_public_intl: indicates an OceanBase cluster that is billed based on the subscription plan and that is deployed in an international site.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oceanbase_oceanbasepost_public_cn</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The number of CPU cores of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The CPU architecture of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>X86_64, AARCH64</p>
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
         * <p>Specifies parameters for the automatic scaling of the data disk.</p>
         */
        @NameInMap("DataDiskAutoScaleConfig")
        public DescribeInstancesResponseBodyInstancesDataDiskAutoScaleConfig dataDiskAutoScaleConfig;

        /**
         * <p>The data replica distribution mode of the cluster. The value is in the n-n-n format, where n is the number of OBServer nodes in each IDC.</p>
         * 
         * <strong>example:</strong>
         * <p>1-1-1</p>
         */
        @NameInMap("DeployMode")
        public String deployMode;

        /**
         * <p>The deployment type of the cluster. Valid values:   </p>
         * <ul>
         * <li>multiple: multi-IDC deployment  </li>
         * <li>single: single-IDC deployment  </li>
         * <li>dual: dual-IDC deployment</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>multiple</p>
         */
        @NameInMap("DeployType")
        public String deployType;

        /**
         * <p>The size of the storage space, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("DiskSize")
        public Long diskSize;

        /**
         * <p>The type of the storage disk where the cluster is deployed.<br>The default value is cloud_essd_pl1, which indicates an ESSD cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd_pl1</p>
         */
        @NameInMap("DiskType")
        public String diskType;

        /**
         * <p>Indicates whether the cluster supports read-only replicas.</p>
         * 
         * <strong>example:</strong>
         * <p>yes</p>
         */
        @NameInMap("EnableReadOnlyReplicaManagement")
        public Boolean enableReadOnlyReplicaManagement;

        /**
         * <p>Indicates whether new nodes can be added.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableUpgradeNodes")
        public Boolean enableUpgradeNodes;

        /**
         * <p>The time elapsed since the expiration of the cluster, in seconds. </p>
         * <blockquote>
         * <p>In subscription mode, if the cluster has not expired, this parameter indicates the remaining validity period of the cluster. If the cluster has expired, this parameter indicates the time elapsed since the expiration.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2606682</p>
         */
        @NameInMap("ExpireSeconds")
        public Integer expireSeconds;

        /**
         * <p>The time in UTC when the cluster expires. </p>
         * <blockquote>
         * <p>This parameter is valid only for subscription instances.</p>
         * </blockquote>
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
         * <p>The specifications of the cluster.  You can specify one of the following four plans:  </p>
         * <ul>
         * <li>8C32G: indicates 8 CPU cores and 32 GB of memory.  </li>
         * <li>14C70G: indicates 14 CPU cores and 70 GB of memory.  </li>
         * <li>30C180G: indicates 30 CPU cores and 180 GB of memory.  </li>
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
         * <p>The instance type.</p>
         * <ul>
         * <li>cluster: indicates a cluster instance.</li>
         * <li>mtenant: indicates a tenant instance in MySQL mode.</li>
         * <li>mtenant_serverless: indicates a serverless instance in MySQL mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CLUSTER</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The time period in UTC for the daily routine maintenance of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-19T07:13:41Z</p>
         */
        @NameInMap("MaintainTime")
        public String maintainTime;

        /**
         * <p>The memory size of the instance, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        @NameInMap("Mem")
        public Long mem;

        /**
         * <p>The version of the OceanBase Database RedHat Package Managerment (RPM) package.</p>
         * 
         * <strong>example:</strong>
         * <p>4.2.1.7-107030032024062709</p>
         */
        @NameInMap("ObRpmVersion")
        public String obRpmVersion;

        /**
         * <p>The billing method for the OceanBase cluster. Valid values:  </p>
         * <ul>
         * <li>PREPAY: the subscription billing method.  </li>
         * <li>POSTPAY: the pay-as-you-go billing method.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PREPAY</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <strong>example:</strong>
         * <p>3F、2F1A</p>
         */
        @NameInMap("ReplicaMode")
        public String replicaMode;

        /**
         * <p>The information about cluster resources.</p>
         */
        @NameInMap("Resource")
        public DescribeInstancesResponseBodyInstancesResource resource;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>group1</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The series of the OceanBase cluster. Valid values:   </p>
         * <ul>
         * <li>NORMAL: the high availability edition.   </li>
         * <li>BASIC: the basic edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Series")
        public String series;

        /**
         * <p>The specification type.</p>
         * 
         * <strong>example:</strong>
         * <p>dedicatedspec</p>
         */
        @NameInMap("SpecType")
        public String specType;

        /**
         * <p>The status of the cluster. Valid values:   </p>
         * <ul>
         * <li>ONLINE: The cluster is running.  </li>
         * <li>PENDING_CREATE: The cluster is being created.  </li>
         * <li>ARREARS_CLOSED(&quot;arrears_closed&quot;): The cluster is suspended due to insufficient balance.</li>
         * <li>PREPAID_EXPIRE_CLOSED(&quot;prepaid_expire_closed&quot;): The cluster is suspended because the subscription has expired.</li>
         * <li>WHITE_LIST_MODIFYING(&quot;white_list_modifying&quot;): The allowlist of the cluster is being modified.</li>
         * <li>SSL_MODIFYING(&quot;ssl_modifying&quot;): The Secure Sockets Layer (SSL) settings of the cluster are being modified.</li>
         * <li>PARAMETER_MODIFYING(&quot;parameter_modifying&quot;): Parameters of the cluster are being modified.</li>
         * <li>TENANT_CREATING(&quot;tenant_creating&quot;): A tenant is being created in the cluster.</li>
         * <li>TENANT_SPEC_MODIFYING(&quot;tenant_spec_modifying&quot;): The specifications of a tenant in the cluster are being modified.</li>
         * <li>EXPANDING(&quot;expanding&quot;): Nodes are being added to the cluster.</li>
         * <li>REDUCING(&quot;reducing&quot;): Nodes are being removed from the cluster.</li>
         * <li>ZONE_CHANGING(&quot;zone_changing&quot;): Zones of the cluster are being modified.</li>
         * <li>SPEC_UPGRADING: The service plan is being upgraded.</li>
         * <li>SPEC_DOWNGRADING(&quot;spec_downgrading&quot;): The plan specification is being downgraded.</li>
         * <li>DISK_UPGRADING: The storage space is being expanded.</li>
         * <li>UPGRADING(&quot;upgrading&quot;): The version of the cluster is being upgraded.</li>
         * <li>PENDING_DELETE(&quot;pending_delete&quot;): The cluster is being deleted.</li>
         * <li>DELETED(&quot;deleted&quot;): The cluster has been deleted.</li>
         * <li>ABNORMAL(&quot;abnormal&quot;): The cluster is abnormal.</li>
         * <li>OFFLINE(&quot;offline&quot;): The cluster is offline.</li>
         * <li>STANDBY_CREATING(&quot;standby_creating&quot;): A standby cluster is being created for the cluster.</li>
         * <li>STANDBY_DELETING(&quot;standby_deleting&quot;): A standby cluster of the cluster is being deleted.</li>
         * <li>SWITCHOVER_SWITCHING(&quot;switchover_switching&quot;): The cluster is undergoing a primary/standby switchover.</li>
         * <li>STANDBY_DISCONNECTING(&quot;standby_disconnecting&quot;): The cluster is being decoupled from its standby cluster.</li>
         * <li>LOG_DISK_UPGRADING(&quot;log_disk_upgrading&quot;): The log disk of the cluster is being scaled out.</li>
         * <li>ISOLATION_OPTIMIZATION_MODIFYING(&quot;isolation_optimization_modifying&quot;): The isolation optimization settings of the cluster are being modified.</li>
         * <li>DISKTYPE_MODIFYING(&quot;disktype_modifying&quot;): The data disk type of the cluster is being modified.</li>
         * <li>PROXY_SERVICE_CREATING(&quot;proxy_service_creating&quot;): The proxy service is being enabled for the cluster.</li>
         * <li>PROXY_SERVICE_DELETING(&quot;proxy_service_deleting&quot;): The proxy service is being disabled for the cluster.</li>
         * <li>PROXY_SERVICE_SPEC_MODIFYING(&quot;proxy_service_spec_modifying&quot;): The proxy service specification is being modified for the cluster.</li>
         * <li>READONLY_ADD_NODE(&quot;readonly_add_node&quot;): A read-only node is being added to the cluster.</li>
         * <li>READONLY_REDUCE_NODE(&quot;readonly_reduce_node&quot;): A read-only node is being removed from the cluster.</li>
         * <li>READONLY_REDUCE_ZONE(&quot;readonly_reduce_zone&quot;): A read-only zone is being removed from the cluster.</li>
         * <li>READONLY_ADD_ZONE(&quot;readonly_add_zone&quot;): A read-only zone is being added to the cluster.</li>
         * <li>READONLY_UPGRADE_SPEC(&quot;readonly_upgrade_spec&quot;): The specification of read-only replicas is being upgraded.</li>
         * <li>READONLY_UPGRADE_DISK(&quot;readonly_upgrade_disk&quot;): The disk space of read-only replicas is being scaled out.</li>
         * <li>READONLY_DOWNGRADE_SPEC(&quot;readonly_downgrade_spec&quot;): The specification of read-only replicas is being downgraded.</li>
         * <li>READONLY_DOWNGRADE_DISK(&quot;readonly_downgrade_disk&quot;): The disk space of read-only replicas is being scaled in.</li>
         * <li>CREATING_TENANT_READONLY_REPLICA(&quot;creating_tenant_readonly_replica&quot;): A read-only replica is being created for a tenant in the cluster.</li>
         * <li>DELETING_TENANT_READONLY_REPLICA(&quot;deleting_tenant_readonly_replica&quot;): A read-only replica is being deleted for a tenant in the cluster.</li>
         * <li>DISK_DOWNGRADING(&quot;disk_downgrading&quot;): The disk space of the cluster is being scaled in.</li>
         * <li>DEPLOY_MODE_MODIFYING(&quot;deploy_mode_modifying&quot;): The deployment mode of the cluster is being modified.<blockquote>
         * <p>Generally, the cluster is in the ONLINE state.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ONLINE</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The size of used storage space of the cluster, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("UsedDiskSize")
        public Long usedDiskSize;

        /**
         * <p>The OBServer version.</p>
         * 
         * <strong>example:</strong>
         * <p>2.2.77</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>vpcId</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-8vb8qjrixzovjpy******</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstances self = new DescribeInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstances setAvailableZones(java.util.List<String> availableZones) {
            this.availableZones = availableZones;
            return this;
        }
        public java.util.List<String> getAvailableZones() {
            return this.availableZones;
        }

        public DescribeInstancesResponseBodyInstances setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeInstancesResponseBodyInstances setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeInstancesResponseBodyInstances setCpuArchitecture(String cpuArchitecture) {
            this.cpuArchitecture = cpuArchitecture;
            return this;
        }
        public String getCpuArchitecture() {
            return this.cpuArchitecture;
        }

        public DescribeInstancesResponseBodyInstances setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeInstancesResponseBodyInstances setDataDiskAutoScaleConfig(DescribeInstancesResponseBodyInstancesDataDiskAutoScaleConfig dataDiskAutoScaleConfig) {
            this.dataDiskAutoScaleConfig = dataDiskAutoScaleConfig;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesDataDiskAutoScaleConfig getDataDiskAutoScaleConfig() {
            return this.dataDiskAutoScaleConfig;
        }

        public DescribeInstancesResponseBodyInstances setDeployMode(String deployMode) {
            this.deployMode = deployMode;
            return this;
        }
        public String getDeployMode() {
            return this.deployMode;
        }

        public DescribeInstancesResponseBodyInstances setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public DescribeInstancesResponseBodyInstances setDiskSize(Long diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Long getDiskSize() {
            return this.diskSize;
        }

        public DescribeInstancesResponseBodyInstances setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public DescribeInstancesResponseBodyInstances setEnableReadOnlyReplicaManagement(Boolean enableReadOnlyReplicaManagement) {
            this.enableReadOnlyReplicaManagement = enableReadOnlyReplicaManagement;
            return this;
        }
        public Boolean getEnableReadOnlyReplicaManagement() {
            return this.enableReadOnlyReplicaManagement;
        }

        public DescribeInstancesResponseBodyInstances setEnableUpgradeNodes(Boolean enableUpgradeNodes) {
            this.enableUpgradeNodes = enableUpgradeNodes;
            return this;
        }
        public Boolean getEnableUpgradeNodes() {
            return this.enableUpgradeNodes;
        }

        public DescribeInstancesResponseBodyInstances setExpireSeconds(Integer expireSeconds) {
            this.expireSeconds = expireSeconds;
            return this;
        }
        public Integer getExpireSeconds() {
            return this.expireSeconds;
        }

        public DescribeInstancesResponseBodyInstances setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeInstancesResponseBodyInstances setInTempCapacityStatus(Boolean inTempCapacityStatus) {
            this.inTempCapacityStatus = inTempCapacityStatus;
            return this;
        }
        public Boolean getInTempCapacityStatus() {
            return this.inTempCapacityStatus;
        }

        public DescribeInstancesResponseBodyInstances setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public DescribeInstancesResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstancesResponseBodyInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeInstancesResponseBodyInstances setInstanceRole(String instanceRole) {
            this.instanceRole = instanceRole;
            return this;
        }
        public String getInstanceRole() {
            return this.instanceRole;
        }

        public DescribeInstancesResponseBodyInstances setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeInstancesResponseBodyInstances setMaintainTime(String maintainTime) {
            this.maintainTime = maintainTime;
            return this;
        }
        public String getMaintainTime() {
            return this.maintainTime;
        }

        public DescribeInstancesResponseBodyInstances setMem(Long mem) {
            this.mem = mem;
            return this;
        }
        public Long getMem() {
            return this.mem;
        }

        public DescribeInstancesResponseBodyInstances setObRpmVersion(String obRpmVersion) {
            this.obRpmVersion = obRpmVersion;
            return this;
        }
        public String getObRpmVersion() {
            return this.obRpmVersion;
        }

        public DescribeInstancesResponseBodyInstances setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeInstancesResponseBodyInstances setReplicaMode(String replicaMode) {
            this.replicaMode = replicaMode;
            return this;
        }
        public String getReplicaMode() {
            return this.replicaMode;
        }

        public DescribeInstancesResponseBodyInstances setResource(DescribeInstancesResponseBodyInstancesResource resource) {
            this.resource = resource;
            return this;
        }
        public DescribeInstancesResponseBodyInstancesResource getResource() {
            return this.resource;
        }

        public DescribeInstancesResponseBodyInstances setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeInstancesResponseBodyInstances setSeries(String series) {
            this.series = series;
            return this;
        }
        public String getSeries() {
            return this.series;
        }

        public DescribeInstancesResponseBodyInstances setSpecType(String specType) {
            this.specType = specType;
            return this;
        }
        public String getSpecType() {
            return this.specType;
        }

        public DescribeInstancesResponseBodyInstances setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeInstancesResponseBodyInstances setUsedDiskSize(Long usedDiskSize) {
            this.usedDiskSize = usedDiskSize;
            return this;
        }
        public Long getUsedDiskSize() {
            return this.usedDiskSize;
        }

        public DescribeInstancesResponseBodyInstances setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeInstancesResponseBodyInstances setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
