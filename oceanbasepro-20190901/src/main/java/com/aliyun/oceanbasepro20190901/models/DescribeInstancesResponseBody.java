// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponseBody extends TeaModel {
    // Oceanbase集群列表。
    @NameInMap("Instances")
    public java.util.List<DescribeInstancesResponseBodyInstances> instances;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    // 查询到的Oceanbase集群个数。
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

    public static class DescribeInstancesResponseBodyInstancesResourceCpu extends TeaModel {
        // 集群总CPU，单位：核数
        @NameInMap("TotalCpu")
        public Long totalCpu;

        // 集群中每个副本节点的CPU，单位：核数
        @NameInMap("UnitCpu")
        public Long unitCpu;

        // 集群已使用的CPU，单位：核数
        @NameInMap("UsedCpu")
        public Long usedCpu;

        public static DescribeInstancesResponseBodyInstancesResourceCpu build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesResourceCpu self = new DescribeInstancesResponseBodyInstancesResourceCpu();
            return TeaModel.build(map, self);
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
        // 集群总存储空间，单位：GB
        @NameInMap("TotalDiskSize")
        public Long totalDiskSize;

        // 集群每个副本的存储空间，单位：GB
        @NameInMap("UnitDiskSize")
        public Long unitDiskSize;

        // 集群已使用的存储空间，单位：GB
        @NameInMap("UsedDiskSize")
        public Long usedDiskSize;

        public static DescribeInstancesResponseBodyInstancesResourceDiskSize build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesResourceDiskSize self = new DescribeInstancesResponseBodyInstancesResourceDiskSize();
            return TeaModel.build(map, self);
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
        // 集群总内存，单位：GB
        @NameInMap("TotalMemory")
        public Long totalMemory;

        // 集群中每个副本的内存，单位：GB
        @NameInMap("UnitMemory")
        public Long unitMemory;

        // 集群已使用的内存，单位：GB
        @NameInMap("UsedMemory")
        public Long usedMemory;

        public static DescribeInstancesResponseBodyInstancesResourceMemory build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesResourceMemory self = new DescribeInstancesResponseBodyInstancesResourceMemory();
            return TeaModel.build(map, self);
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
        // 集群的CPU资源信息
        @NameInMap("Cpu")
        public DescribeInstancesResponseBodyInstancesResourceCpu cpu;

        // 集群的存储资源信息
        @NameInMap("DiskSize")
        public DescribeInstancesResponseBodyInstancesResourceDiskSize diskSize;

        // 集群的内存资源信息
        @NameInMap("Memory")
        public DescribeInstancesResponseBodyInstancesResourceMemory memory;

        // 集群的资源Unit数量。
        @NameInMap("UnitCount")
        public Long unitCount;

        public static DescribeInstancesResponseBodyInstancesResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesResource self = new DescribeInstancesResponseBodyInstancesResource();
            return TeaModel.build(map, self);
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
        // 集群部署所在的可用区信息。
        @NameInMap("AvailableZones")
        public java.util.List<String> availableZones;

        // Oceanbase集群的产品码。 - oceanbase_oceanbasepre_public_cn：国内站云数据库包年包月套餐。 - oceanbase_oceanbasepost_public_cn：国内站云数据库按小时付费套餐。 - oceanbase_obpre_public_intl：国际站云数据库包年包月套餐。
        @NameInMap("CommodityCode")
        public String commodityCode;

        // 集群的CPU核数。
        @NameInMap("Cpu")
        public Integer cpu;

        // 集群的创建时间，UTC时间。
        @NameInMap("CreateTime")
        public String createTime;

        // 集群的数据副本模式。 单机房为n，双机房为n-n，多机房为n-n-n，其中n为各机房的observer节点数。
        @NameInMap("DeployMode")
        public String deployMode;

        // 集群的部署类型。 - multiple：多机房 - single：单机房 - dual：双机房
        @NameInMap("DeployType")
        public String deployType;

        // 存储空间大小，单位GB。
        @NameInMap("DiskSize")
        public String diskSize;

        // 集群部署的存储类型。默认为cloud_essd_pl1：ESSD云盘。
        @NameInMap("DiskType")
        public String diskType;

        // 是否允许新增节点。
        @NameInMap("EnableUpgradeNodes")
        public Boolean enableUpgradeNodes;

        // 集群已过期时间，单位：秒(s)。
        @NameInMap("ExpireSeconds")
        public Integer expireSeconds;

        // 集群过期时间（UTC格式）。
        @NameInMap("ExpireTime")
        public String expireTime;

        // 集群规格信息。 当前支持四种套餐： - 8C32G：8核 32GB - 14C70G：14核 70GB - 30C180G：30核 180GB - 62C400G：62核 400GB。
        @NameInMap("InstanceClass")
        public String instanceClass;

        // Oceanbase集群ID。
        @NameInMap("InstanceId")
        public String instanceId;

        // Oceanbase集群名称。
        @NameInMap("InstanceName")
        public String instanceName;

        // 集群的每天例行维护时间，UTC时间。
        @NameInMap("MaintainTime")
        public String maintainTime;

        // 实例的内存大小，单位GB。
        @NameInMap("Mem")
        public Long mem;

        // Oceanbase集群的付费类型 - PREPAY：预付费 - POSTPAY：按量付费
        @NameInMap("PayType")
        public String payType;

        // 集群的资源信息
        @NameInMap("Resource")
        public DescribeInstancesResponseBodyInstancesResource resource;

        // 资源组ID信息。
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        // 集群的白名单信息。（待废弃）
        @NameInMap("SecurityIps")
        public java.util.List<String> securityIps;

        // Oceanbase集群的系列 - NORMAL：高可用版本 - BASIC：基础版本
        @NameInMap("Series")
        public String series;

        // 集群状态。 - PENDING_CREATE: 创建中 - ONLINE: 运行中 - TENANT_CREATING：租户创建中 - TENANT_SPEC_MODIFYING：租户规格修改中 - EXPANDING: 节点扩容中 - REDUCING: 节点缩容中 - SPEC_UPGRADING:套餐规格扩容中 - DISK_UPGRADING:存储规格扩容中 - WHITE_LIST_MODIFYING: 修改白名单中 - PARAMETER_MODIFYING: 修改参数中 - SSL_MODIFYING: SSL变更中 - PREPAID_EXPIRE_CLOSED: 预付费集群欠费中 - ARREARS_CLOSED: 后付费集群欠费中 - PENDING_DELETE: 删除中。 集群一般为运行中的状态（ONLINE）。
        @NameInMap("State")
        public String state;

        // 已使用的存储空间，单位GB。
        @NameInMap("UsedDiskSize")
        public Long usedDiskSize;

        // Observer版本信息。
        @NameInMap("Version")
        public String version;

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

        public DescribeInstancesResponseBodyInstances setSecurityIps(java.util.List<String> securityIps) {
            this.securityIps = securityIps;
            return this;
        }
        public java.util.List<String> getSecurityIps() {
            return this.securityIps;
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
