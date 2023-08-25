// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponseBody extends TeaModel {
    /**
     * <p>The total storage space of the cluster, in GB.</p>
     */
    @NameInMap("Instances")
    public java.util.List<DescribeInstancesResponseBodyInstances> instances;

    @NameInMap("RequestId")
    public String requestId;

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

        @NameInMap("UpperThreshold")
        public Long upperThreshold;

        @NameInMap("Upperbound")
        public Long upperbound;

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

        public DescribeInstancesResponseBodyInstancesDataDiskAutoScaleConfig setScaleStepInMerge(Long scaleStepInMerge) {
            this.scaleStepInMerge = scaleStepInMerge;
            return this;
        }
        public Long getScaleStepInMerge() {
            return this.scaleStepInMerge;
        }

        public DescribeInstancesResponseBodyInstancesDataDiskAutoScaleConfig setScaleStepInNormal(Long scaleStepInNormal) {
            this.scaleStepInNormal = scaleStepInNormal;
            return this;
        }
        public Long getScaleStepInNormal() {
            return this.scaleStepInNormal;
        }

        public DescribeInstancesResponseBodyInstancesDataDiskAutoScaleConfig setUpperMergeThreshold(Long upperMergeThreshold) {
            this.upperMergeThreshold = upperMergeThreshold;
            return this;
        }
        public Long getUpperMergeThreshold() {
            return this.upperMergeThreshold;
        }

        public DescribeInstancesResponseBodyInstancesDataDiskAutoScaleConfig setUpperThreshold(Long upperThreshold) {
            this.upperThreshold = upperThreshold;
            return this;
        }
        public Long getUpperThreshold() {
            return this.upperThreshold;
        }

        public DescribeInstancesResponseBodyInstancesDataDiskAutoScaleConfig setUpperbound(Long upperbound) {
            this.upperbound = upperbound;
            return this;
        }
        public Long getUpperbound() {
            return this.upperbound;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesResourceCapacityUnit extends TeaModel {
        @NameInMap("MaxCapacityUnit")
        public Integer maxCapacityUnit;

        @NameInMap("MinCapacityUnit")
        public Integer minCapacityUnit;

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
        @NameInMap("OriginalTotalCpu")
        public Long originalTotalCpu;

        /**
         * <p>The name of the OceanBase cluster.    </p>
         * <p>It must be 1 to 20 characters in length.   </p>
         * <p>If this parameter is not specified, the value is the instance ID of the cluster by default.</p>
         */
        @NameInMap("TotalCpu")
        public Long totalCpu;

        /**
         * <p>The data replica distribution mode of the cluster. Valid values:    </p>
         * <br>
         * <p>- n: indicates the single-IDC mode.  </p>
         * <p>- n-n: indicates the dual-IDC mode.  </p>
         * <p>- n-n-n: indicates the multi-IDC mode. The integer n represents the number of OBServer nodes in each IDC.</p>
         */
        @NameInMap("UnitCpu")
        public Long unitCpu;

        /**
         * <p>The search keyword.</p>
         */
        @NameInMap("UsedCpu")
        public Long usedCpu;

        public static DescribeInstancesResponseBodyInstancesResourceCpu build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesResourceCpu self = new DescribeInstancesResponseBodyInstancesResourceCpu();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesResourceCpu setOriginalTotalCpu(Long originalTotalCpu) {
            this.originalTotalCpu = originalTotalCpu;
            return this;
        }
        public Long getOriginalTotalCpu() {
            return this.originalTotalCpu;
        }

        public DescribeInstancesResponseBodyInstancesResourceCpu setTotalCpu(Long totalCpu) {
            this.totalCpu = totalCpu;
            return this;
        }
        public Long getTotalCpu() {
            return this.totalCpu;
        }

        public DescribeInstancesResponseBodyInstancesResourceCpu setUnitCpu(Long unitCpu) {
            this.unitCpu = unitCpu;
            return this;
        }
        public Long getUnitCpu() {
            return this.unitCpu;
        }

        public DescribeInstancesResponseBodyInstancesResourceCpu setUsedCpu(Long usedCpu) {
            this.usedCpu = usedCpu;
            return this;
        }
        public Long getUsedCpu() {
            return this.usedCpu;
        }

    }

    public static class DescribeInstancesResponseBodyInstancesResourceDiskSize extends TeaModel {
        @NameInMap("OriginalTotalDiskSize")
        public Long originalTotalDiskSize;

        /**
         * <p>The request ID.</p>
         */
        @NameInMap("TotalDiskSize")
        public Long totalDiskSize;

        /**
         * <p>Example 1</p>
         */
        @NameInMap("UnitDiskSize")
        public Long unitDiskSize;

        /**
         * <p>$.parameters[7].schema.example</p>
         */
        @NameInMap("UsedDiskSize")
        public Long usedDiskSize;

        public static DescribeInstancesResponseBodyInstancesResourceDiskSize build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesResourceDiskSize self = new DescribeInstancesResponseBodyInstancesResourceDiskSize();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesResourceDiskSize setOriginalTotalDiskSize(Long originalTotalDiskSize) {
            this.originalTotalDiskSize = originalTotalDiskSize;
            return this;
        }
        public Long getOriginalTotalDiskSize() {
            return this.originalTotalDiskSize;
        }

        public DescribeInstancesResponseBodyInstancesResourceDiskSize setTotalDiskSize(Long totalDiskSize) {
            this.totalDiskSize = totalDiskSize;
            return this;
        }
        public Long getTotalDiskSize() {
            return this.totalDiskSize;
        }

        public DescribeInstancesResponseBodyInstancesResourceDiskSize setUnitDiskSize(Long unitDiskSize) {
            this.unitDiskSize = unitDiskSize;
            return this;
        }
        public Long getUnitDiskSize() {
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
        @NameInMap("OriginalTotalMemory")
        public Long originalTotalMemory;

        /**
         * <p>The number of CPU cores of the cluster.</p>
         */
        @NameInMap("TotalMemory")
        public Long totalMemory;

        /**
         * <p>The size of used storage space of the cluster, in GB.</p>
         */
        @NameInMap("UnitMemory")
        public Long unitMemory;

        /**
         * <p>The size of used memory in the cluster, in GB.</p>
         */
        @NameInMap("UsedMemory")
        public Long usedMemory;

        public static DescribeInstancesResponseBodyInstancesResourceMemory build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesResourceMemory self = new DescribeInstancesResponseBodyInstancesResourceMemory();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesResourceMemory setOriginalTotalMemory(Long originalTotalMemory) {
            this.originalTotalMemory = originalTotalMemory;
            return this;
        }
        public Long getOriginalTotalMemory() {
            return this.originalTotalMemory;
        }

        public DescribeInstancesResponseBodyInstancesResourceMemory setTotalMemory(Long totalMemory) {
            this.totalMemory = totalMemory;
            return this;
        }
        public Long getTotalMemory() {
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
        @NameInMap("CapacityUnit")
        public DescribeInstancesResponseBodyInstancesResourceCapacityUnit capacityUnit;

        /**
         * <p>Indicates whether new nodes can be added.</p>
         */
        @NameInMap("Cpu")
        public DescribeInstancesResponseBodyInstancesResourceCpu cpu;

        /**
         * <p>The time elapsed since the expiration of the cluster, in seconds.</p>
         */
        @NameInMap("DiskSize")
        public DescribeInstancesResponseBodyInstancesResourceDiskSize diskSize;

        /**
         * <p>The status of the cluster. Valid values:   </p>
         * <p>- PENDING_CREATE: The cluster is being created.  </p>
         * <p>- ONLINE: The cluster is running.  </p>
         * <p>- TENANT_CREATING: The tenant is being created.  </p>
         * <p>- TENANT_SPEC_MODIFYING: The tenant specifications are being modified.  </p>
         * <p>- EXPANDING: Nodes are being added to the cluster to increase its capacity.  </p>
         * <p>- REDUCING: Nodes are being removed from the cluster to reduce its capacity.  </p>
         * <p>- SPEC_UPGRADING: The service plan is being upgraded.  </p>
         * <p>- DISK_UPGRADING: The storage space is being expanded.  </p>
         * <p>- WHITE_LIST_MODIFYING: The whitelist is being modified.  </p>
         * <p>- PARAMETER_MODIFYING: Parameters are being modified.  </p>
         * <p>- SSL_MODIFYING: The SSL certificate is being changed.  </p>
         * <p>- PREPAID_EXPIRE_CLOSED: The payment is overdue. This parameter is valid for a cluster whose billing method is set to PREPAY.  </p>
         * <p>- ARREARS_CLOSED: The payment is overdue. This parameter is valid for a cluster whose billing method is set to POSTPAY.  </p>
         * <p>- PENDING_DELETE: The cluster is being deleted.   </p>
         * <p>Generally, the cluster is in the ONLINE state.</p>
         */
        @NameInMap("Memory")
        public DescribeInstancesResponseBodyInstancesResourceMemory memory;

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
         * <p>The time in UTC when the cluster expires.</p>
         */
        @NameInMap("AvailableZones")
        public java.util.List<String> availableZones;

        /**
         * <p>The storage space of each replica node in the cluster, in GB.</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The product code of the OceanBase cluster.   </p>
         * <p>- oceanbase_oceanbasepre_public_cn: indicates an OceanBase cluster that is billed based on the subscription plan and that is deployed in a China site.  </p>
         * <p>- oceanbase_oceanbasepost_public_cn: indicates an OceanBase cluster that is billed based on the pay-as-you-go plan and that is deployed in a China site.  </p>
         * <p>- oceanbase_obpre_public_intl: indicates an OceanBase cluster that is billed based on the subscription plan and that is deployed in an international site.</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The number of OceanBase clusters queried.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DataDiskAutoScaleConfig")
        public DescribeInstancesResponseBodyInstancesDataDiskAutoScaleConfig dataDiskAutoScaleConfig;

        /**
         * <p>The request ID.</p>
         */
        @NameInMap("DeployMode")
        public String deployMode;

        /**
         * <p>Alibaba Cloud provides SDKs in different languages to help you quickly integrate Alibaba Cloud products and services by using APIs. We recommend that you use an SDK to call APIs. In this way, you do not need to sign for verification.</p>
         */
        @NameInMap("DeployType")
        public String deployType;

        /**
         * <p>The information about the memory resources of the cluster.</p>
         */
        @NameInMap("DiskSize")
        public String diskSize;

        /**
         * <p>The number of CPU cores used in the cluster.</p>
         */
        @NameInMap("DiskType")
        public String diskType;

        /**
         * <p>The ID of the OceanBase cluster.</p>
         */
        @NameInMap("EnableUpgradeNodes")
        public Boolean enableUpgradeNodes;

        /**
         * <p>The whitelist information of the cluster.</p>
         */
        @NameInMap("ExpireSeconds")
        public Integer expireSeconds;

        /**
         * <p>The information about the storage resources of the cluster.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("InTempCapacityStatus")
        public Boolean inTempCapacityStatus;

        /**
         * <p>The instance type.</p>
         */
        @NameInMap("InstanceClass")
        public String instanceClass;

        /**
         * <p>The total storage space of the cluster, in GB.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The return result of the request.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceRole")
        public String instanceRole;

        /**
         * <p>You can call this operation to obtain the list of OceanBase clusters.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The return result of the request.</p>
         */
        @NameInMap("MaintainTime")
        public String maintainTime;

        /**
         * <p>The information about the CPU resources of the cluster.</p>
         */
        @NameInMap("Mem")
        public Long mem;

        /**
         * <p>It is an Alibaba Cloud asset management and configuration tool, with which you can manage multiple Alibaba Cloud products and services by using commands. It is easy to use and a good helper in migration to cloud.</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The type of the storage disk where the cluster is deployed.   </p>
         * <p>The default value is cloud_essd_pl1, which indicates an ESSD cloud disk.</p>
         */
        @NameInMap("Resource")
        public DescribeInstancesResponseBodyInstancesResource resource;

        /**
         * <p>The number of OceanBase clusters queried.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The billing method for the OceanBase cluster. Valid values:  </p>
         * <p>- PREPAY: the subscription billing method.  </p>
         * <p>- POSTPAY: the pay-as-you-go billing method.</p>
         */
        @NameInMap("Series")
        public String series;

        /**
         * <p>The number of resource units in the cluster.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The number of resource units in the cluster.</p>
         */
        @NameInMap("UsedDiskSize")
        public Long usedDiskSize;

        /**
         * <p>The total number of CPU cores of the cluster.</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>vpcId</p>
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

        public DescribeInstancesResponseBodyInstances setDiskSize(String diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public String getDiskSize() {
            return this.diskSize;
        }

        public DescribeInstancesResponseBodyInstances setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
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

        public DescribeInstancesResponseBodyInstances setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
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
