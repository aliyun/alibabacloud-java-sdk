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
     * <p>The request ID.</p>
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
         * <p>The total number of CPU cores of the cluster.</p>
         */
        @NameInMap("TotalCpu")
        public Long totalCpu;

        /**
         * <p>The number of CPU cores of each replica node in the cluster.</p>
         */
        @NameInMap("UnitCpu")
        public Long unitCpu;

        /**
         * <p>The number of CPU cores used in the cluster.</p>
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
         * <p>The size of the data disk, in GB.</p>
         */
        @NameInMap("DataUsedSize")
        public Double dataUsedSize;

        /**
         * <p>The server with the highest disk usage.</p>
         */
        @NameInMap("MaxDiskUsedObServer")
        public java.util.List<String> maxDiskUsedObServer;

        /**
         * <p>The maximum disk usage, in percentage.</p>
         */
        @NameInMap("MaxDiskUsedPercent")
        public Double maxDiskUsedPercent;

        /**
         * <p>The total storage space of the cluster, in GB.</p>
         */
        @NameInMap("TotalDiskSize")
        public Long totalDiskSize;

        /**
         * <p>The storage space of each replica node in the cluster, in GB.</p>
         */
        @NameInMap("UnitDiskSize")
        public Long unitDiskSize;

        /**
         * <p>The size of used storage space of the cluster, in GB.</p>
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
         * <p>The total log disk space of the cluster, in GB.</p>
         */
        @NameInMap("TotalDiskSize")
        public Long totalDiskSize;

        /**
         * <p>The log disk space of each replica node in the cluster. Unit: GB.</p>
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
         * <p>The total memory size of the cluster, in GB.</p>
         */
        @NameInMap("TotalMemory")
        public Long totalMemory;

        /**
         * <p>The memory size of each replica node in the cluster, in GB.</p>
         */
        @NameInMap("UnitMemory")
        public Long unitMemory;

        /**
         * <p>The size of used memory in the cluster, in GB.</p>
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
         * <p>Indicates whether automatic renewal is enabled. </p>
         * <br>
         * <p>This parameter is valid only for clusters whose billing methods are set to PREPAY.</p>
         */
        @NameInMap("AutoRenewal")
        public Boolean autoRenewal;

        /**
         * <p>Indicates whether automatic upgrade of the OBServer version is enabled.</p>
         */
        @NameInMap("AutoUpgradeObVersion")
        public Boolean autoUpgradeObVersion;

        /**
         * <p>The list of zones.</p>
         */
        @NameInMap("AvailableZones")
        public java.util.List<String> availableZones;

        /**
         * <p>The time in UTC when the cluster was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the major compaction of cluster data is performed.</p>
         */
        @NameInMap("DataMergeTime")
        public String dataMergeTime;

        /**
         * <p>The data replica distribution mode of the cluster. Valid values: </p>
         * <p>- n: indicates the single-IDC mode. </p>
         * <p>- n-n: indicates the dual-IDC mode. </p>
         * <p>- n-n-n: indicates the multi-IDC mode. </p>
         * <br>
         * <p>> <br>The integer n represents the number of OBServer nodes in each IDC.</p>
         */
        @NameInMap("DeployMode")
        public String deployMode;

        /**
         * <p>The deployment type of the cluster. Valid values:  </p>
         * <p>- multiple: multi-IDC deployment   </p>
         * <p>- single: single-IDC deployment   </p>
         * <p>- dual: dual-IDC deployment</p>
         */
        @NameInMap("DeployType")
        public String deployType;

        /**
         * <p>The type of the storage disk where the cluster is deployed. </p>
         * <br>
         * <p>The default value is cloud_essd_pl1, which indicates an ESSD cloud disk.</p>
         */
        @NameInMap("DiskType")
        public String diskType;

        /**
         * <p>Indicates whether the log disk specifications can be upgraded.</p>
         */
        @NameInMap("EnableUpgradeLogDisk")
        public Boolean enableUpgradeLogDisk;

        /**
         * <p>The time in UTC when the cluster expires.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The specifications of the cluster.  You can specify one of the following four plans:    </p>
         * <p>- 8C32G: indicates 8 CPU cores and 32 GB of memory. </p>
         * <p>- 14C70G: indicates 14 CPU cores and 70 GB of memory. </p>
         * <p>- 30C180G: indicates 30 CPU cores and 180 GB of memory. </p>
         * <p>- 62C400G: indicates 62 CPU cores and 400 GB of memory.</p>
         */
        @NameInMap("InstanceClass")
        public String instanceClass;

        /**
         * <p>The ID of the OceanBase cluster.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the OceanBase cluster.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>Indicates whether the OBServer version is the latest.</p>
         */
        @NameInMap("IsLatestObVersion")
        public Boolean isLatestObVersion;

        /**
         * <p>Indicates whether trusted ECS instances are used.</p>
         */
        @NameInMap("IsTrustEcs")
        public Boolean isTrustEcs;

        /**
         * <p>The time period in UTC for the daily routine maintenance of the cluster.</p>
         */
        @NameInMap("MaintainTime")
        public String maintainTime;

        /**
         * <p>The detailed information of the OBServer version.</p>
         */
        @NameInMap("ObRpmVersion")
        public String obRpmVersion;

        /**
         * <p>The billing method of the OceanBase cluster. Valid values: </p>
         * <p>- PREPAY: the subscription billing method. </p>
         * <p>- POSTPAY: the pay-as-you-go billing method.</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The information about cluster resources.</p>
         */
        @NameInMap("Resource")
        public DescribeInstanceResponseBodyInstanceResource resource;

        /**
         * <p>The series of the OceanBase cluster. Valid values:   </p>
         * <p>- NORMAL: the high availability edition.   </p>
         * <p>- BASIC: the basic edition.</p>
         */
        @NameInMap("Series")
        public String series;

        /**
         * <p>The status of the cluster. Valid values: </p>
         * <p> - PENDING_CREATE: The cluster is being created. </p>
         * <p> - ONLINE: The cluster is running. </p>
         * <p> - TENANT_CREATING: The tenant is being created. </p>
         * <p>- TENANT_SPEC_MODIFYING: The tenant specifications are being modified. </p>
         * <p>- EXPANDING: Nodes are being added to the cluster to increase its capacity. </p>
         * <p>- REDUCING: Nodes are being removed from the cluster to reduce its capacity. </p>
         * <p>- SPEC_UPGRADING: The service plan is being upgraded. </p>
         * <p>- DISK_UPGRADING: The storage space is being expanded. </p>
         * <p>- WHITE_LIST_MODIFYING: The whitelist is being modified. </p>
         * <p>- PARAMETER_MODIFYING: Parameters are being modified. </p>
         * <p>- SSL_MODIFYING: The SSL certificate is being changed. </p>
         * <p>- PREPAID_EXPIRE_CLOSED: The payment is overdue. This parameter is valid for a cluster whose billing method is set to PREPAY. </p>
         * <p>- ARREARS_CLOSED: The payment is overdue. This parameter is valid for a cluster whose billing method is set to POSTPAY. </p>
         * <p>- PENDING_DELETE: The cluster is being deleted.    </p>
         * <p>Generally, the cluster is in the ONLINE state.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The OBServer version.</p>
         */
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
