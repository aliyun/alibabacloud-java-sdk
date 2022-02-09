// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceResponseBody extends TeaModel {
    // OceanBase 集群信息。
    @NameInMap("Instance")
    public DescribeInstanceResponseBodyInstance instance;

    // 请求 ID。
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

    public static class DescribeInstanceResponseBodyInstanceResourceCpu extends TeaModel {
        // 集群总CPU，单位：核数
        @NameInMap("TotalCpu")
        public Long totalCpu;

        // 集群中每个副本节点的CPU，单位：核数
        @NameInMap("UnitCpu")
        public Long unitCpu;

        // 集群已使用的CPU，单位：核数
        @NameInMap("UsedCpu")
        public Long usedCpu;

        public static DescribeInstanceResponseBodyInstanceResourceCpu build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyInstanceResourceCpu self = new DescribeInstanceResponseBodyInstanceResourceCpu();
            return TeaModel.build(map, self);
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
        // 集群总存储空间，单位：GB
        @NameInMap("TotalDiskSize")
        public Long totalDiskSize;

        // 集群每个副本的存储空间，单位：GB
        @NameInMap("UnitDiskSize")
        public Long unitDiskSize;

        // 集群已使用的存储空间，单位：GB
        @NameInMap("UsedDiskSize")
        public Long usedDiskSize;

        public static DescribeInstanceResponseBodyInstanceResourceDiskSize build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyInstanceResourceDiskSize self = new DescribeInstanceResponseBodyInstanceResourceDiskSize();
            return TeaModel.build(map, self);
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

    public static class DescribeInstanceResponseBodyInstanceResourceMemory extends TeaModel {
        // 集群总内存，单位：GB
        @NameInMap("TotalMemory")
        public Long totalMemory;

        // 集群中每个副本的内存，单位：GB
        @NameInMap("UnitMemory")
        public Long unitMemory;

        // 集群已使用的内存，单位：GB
        @NameInMap("UsedMemory")
        public Long usedMemory;

        public static DescribeInstanceResponseBodyInstanceResourceMemory build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyInstanceResourceMemory self = new DescribeInstanceResponseBodyInstanceResourceMemory();
            return TeaModel.build(map, self);
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
        // 集群的CPU资源信息
        @NameInMap("Cpu")
        public DescribeInstanceResponseBodyInstanceResourceCpu cpu;

        // 集群的存储资源信息
        @NameInMap("DiskSize")
        public DescribeInstanceResponseBodyInstanceResourceDiskSize diskSize;

        // 集群的内存资源信息
        @NameInMap("Memory")
        public DescribeInstanceResponseBodyInstanceResourceMemory memory;

        // 集群的资源Unit数量。
        @NameInMap("UnitCount")
        public Long unitCount;

        public static DescribeInstanceResponseBodyInstanceResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyInstanceResource self = new DescribeInstanceResponseBodyInstanceResource();
            return TeaModel.build(map, self);
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

    public static class DescribeInstanceResponseBodyInstance extends TeaModel {
        // 是否开启自动续费。该参数只在预付费（PREPAY）集群有意义。
        @NameInMap("AutoRenewal")
        public Boolean autoRenewal;

        // 是否开启自动升级 OBServer 版本。
        @NameInMap("AutoUpgradeObVersion")
        public Boolean autoUpgradeObVersion;

        // 可用区列表。
        @NameInMap("AvailableZones")
        public java.util.List<String> availableZones;

        // 集群的创建时间（UTC时间）。
        @NameInMap("CreateTime")
        public String createTime;

        // 集群的数据合并时间。
        @NameInMap("DataMergeTime")
        public String dataMergeTime;

        // 集群的数据副本模式。 单机房为n，双机房为n-n，多机房为n-n-n，其中n为各机房的observer节点数。
        @NameInMap("DeployMode")
        public String deployMode;

        // 集群的部署类型。<br> - multiple：多机房 <br>- single：单机房 <br>- dual：双机房
        @NameInMap("DeployType")
        public String deployType;

        // 集群部署的存储类型。默认为cloud_essd_pl1：ESSD云盘。
        @NameInMap("DiskType")
        public String diskType;

        // 集群过期时间（UTC格式）。
        @NameInMap("ExpireTime")
        public String expireTime;

        // 集群规格信息。<br> 当前支持四种套餐：<br> - 8C32G：8核 32GB <br>- 14C70G：14核 70GB<br> - 30C180G：30核 180GB<br> - 62C400G：62核 400GB。
        @NameInMap("InstanceClass")
        public String instanceClass;

        // OceanBase 集群 ID。
        @NameInMap("InstanceId")
        public String instanceId;

        // OceanBase 集群名称。
        @NameInMap("InstanceName")
        public String instanceName;

        // OBServer版本是否为最新版本。
        @NameInMap("IsLatestObVersion")
        public Boolean isLatestObVersion;

        // 集群的每天例行维护时间，UTC时间。
        @NameInMap("MaintainTime")
        public String maintainTime;

        // OBServer 详细版本信息。
        @NameInMap("ObRpmVersion")
        public String obRpmVersion;

        // OceanBase 集群的付费类型 <br>- PREPAY：预付费 <br>- POSTPAY：按量付费
        @NameInMap("PayType")
        public String payType;

        // 集群的资源信息
        @NameInMap("Resource")
        public DescribeInstanceResponseBodyInstanceResource resource;

        // OceanBase 集群的系列 <br>- NORMAL：高可用版本 <br>- BASIC：基础版本
        @NameInMap("Series")
        public String series;

        // 集群状态。 <br>- PENDING_CREATE: 创建中 <br>- ONLINE: 运行中 <br>- TENANT_CREATING：租户创建中 <br>- TENANT_SPEC_MODIFYING：租户规格修改中 <br>- EXPANDING: 节点扩容中 <br>- REDUCING: 节点缩容中 <br>- SPEC_UPGRADING:套餐规格扩容中 <br>- DISK_UPGRADING:存储规格扩容中 <br>- WHITE_LIST_MODIFYING: 修改白名单中 <br>- PARAMETER_MODIFYING: 修改参数中 <br>- SSL_MODIFYING: SSL变更中 <br>- PREPAID_EXPIRE_CLOSED: 预付费集群欠费中 <br>- ARREARS_CLOSED: 后付费集群欠费中 <br>- PENDING_DELETE: 删除中。 集群一般为运行中的状态（ONLINE）。
        @NameInMap("Status")
        public String status;

        // OBServer 版本信息。
        @NameInMap("Version")
        public String version;

        public static DescribeInstanceResponseBodyInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyInstance self = new DescribeInstanceResponseBodyInstance();
            return TeaModel.build(map, self);
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

        public DescribeInstanceResponseBodyInstance setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
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

        public DescribeInstanceResponseBodyInstance setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
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

        public DescribeInstanceResponseBodyInstance setIsLatestObVersion(Boolean isLatestObVersion) {
            this.isLatestObVersion = isLatestObVersion;
            return this;
        }
        public Boolean getIsLatestObVersion() {
            return this.isLatestObVersion;
        }

        public DescribeInstanceResponseBodyInstance setMaintainTime(String maintainTime) {
            this.maintainTime = maintainTime;
            return this;
        }
        public String getMaintainTime() {
            return this.maintainTime;
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

        public DescribeInstanceResponseBodyInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInstanceResponseBodyInstance setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
