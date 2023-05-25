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

    public static class DescribeInstanceResponseBodyInstanceResourceCpu extends TeaModel {
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

        /**
         * <p>Indicates whether the log disk specifications can be upgraded.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

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

        @NameInMap("EnableUpgradeLogDisk")
        public Boolean enableUpgradeLogDisk;

        /**
         * <p>The information of the OceanBase cluster.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

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

        /**
         * <p>The information about cluster resources.</p>
         */
        @NameInMap("Status")
        public String status;

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

        public DescribeInstanceResponseBodyInstance setEnableIsolationOptimization(Boolean enableIsolationOptimization) {
            this.enableIsolationOptimization = enableIsolationOptimization;
            return this;
        }
        public Boolean getEnableIsolationOptimization() {
            return this.enableIsolationOptimization;
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

        public DescribeInstanceResponseBodyInstance setZones(java.util.List<String> zones) {
            this.zones = zones;
            return this;
        }
        public java.util.List<String> getZones() {
            return this.zones;
        }

    }

}
