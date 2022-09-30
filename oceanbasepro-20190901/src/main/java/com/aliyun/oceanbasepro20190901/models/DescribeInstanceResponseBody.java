// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceResponseBody extends TeaModel {
    @NameInMap("Instance")
    public DescribeInstanceResponseBodyInstance instance;

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
        @NameInMap("TotalCpu")
        public Long totalCpu;

        @NameInMap("UnitCpu")
        public Long unitCpu;

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
        @NameInMap("DataUsedSize")
        public Double dataUsedSize;

        @NameInMap("MaxDiskUsedObServer")
        public java.util.List<String> maxDiskUsedObServer;

        @NameInMap("MaxDiskUsedPercent")
        public Double maxDiskUsedPercent;

        @NameInMap("TotalDiskSize")
        public Long totalDiskSize;

        @NameInMap("UnitDiskSize")
        public Long unitDiskSize;

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
        @NameInMap("TotalDiskSize")
        public Long totalDiskSize;

        @NameInMap("UnitDiskSize")
        public Long unitDiskSize;

        public static DescribeInstanceResponseBodyInstanceResourceLogDiskSize build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyInstanceResourceLogDiskSize self = new DescribeInstanceResponseBodyInstanceResourceLogDiskSize();
            return TeaModel.build(map, self);
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
        @NameInMap("TotalMemory")
        public Long totalMemory;

        @NameInMap("UnitMemory")
        public Long unitMemory;

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
        @NameInMap("Cpu")
        public DescribeInstanceResponseBodyInstanceResourceCpu cpu;

        @NameInMap("DiskSize")
        public DescribeInstanceResponseBodyInstanceResourceDiskSize diskSize;

        @NameInMap("LogDiskSize")
        public DescribeInstanceResponseBodyInstanceResourceLogDiskSize logDiskSize;

        @NameInMap("Memory")
        public DescribeInstanceResponseBodyInstanceResourceMemory memory;

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

    public static class DescribeInstanceResponseBodyInstance extends TeaModel {
        @NameInMap("AutoRenewal")
        public Boolean autoRenewal;

        @NameInMap("AutoUpgradeObVersion")
        public Boolean autoUpgradeObVersion;

        @NameInMap("AvailableZones")
        public java.util.List<String> availableZones;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DataMergeTime")
        public String dataMergeTime;

        @NameInMap("DeployMode")
        public String deployMode;

        @NameInMap("DeployType")
        public String deployType;

        @NameInMap("DiskType")
        public String diskType;

        @NameInMap("EnableUpgradeLogDisk")
        public Boolean enableUpgradeLogDisk;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("InstanceClass")
        public String instanceClass;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("IsLatestObVersion")
        public Boolean isLatestObVersion;

        @NameInMap("IsTrustEcs")
        public Boolean isTrustEcs;

        @NameInMap("MaintainTime")
        public String maintainTime;

        @NameInMap("ObRpmVersion")
        public String obRpmVersion;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("Resource")
        public DescribeInstanceResponseBodyInstanceResource resource;

        @NameInMap("Series")
        public String series;

        @NameInMap("Status")
        public String status;

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

        public DescribeInstanceResponseBodyInstance setEnableUpgradeLogDisk(Boolean enableUpgradeLogDisk) {
            this.enableUpgradeLogDisk = enableUpgradeLogDisk;
            return this;
        }
        public Boolean getEnableUpgradeLogDisk() {
            return this.enableUpgradeLogDisk;
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

        public DescribeInstanceResponseBodyInstance setIsTrustEcs(Boolean isTrustEcs) {
            this.isTrustEcs = isTrustEcs;
            return this;
        }
        public Boolean getIsTrustEcs() {
            return this.isTrustEcs;
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
