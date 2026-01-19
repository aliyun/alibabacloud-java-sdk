// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceAttributeResponseBody extends TeaModel {
    /**
     * <p>The information returned.</p>
     */
    @NameInMap("CanUpgradeVersions")
    public java.util.List<String> canUpgradeVersions;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
     * <li><strong>Prepaid</strong>: subscription.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("ConfigPatternType")
    public String configPatternType;

    /**
     * <p>The time when the instance was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-08-14T03:00:42Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The information about each cluster returned.</p>
     */
    @NameInMap("DBClusterList")
    public java.util.List<DescribeDBInstanceAttributeResponseBodyDBClusterList> DBClusterList;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb-cn-7213cjv****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <strong>example:</strong>
     * <p>multi_az</p>
     */
    @NameInMap("DeployScheme")
    public String deployScheme;

    /**
     * <p>The description of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The database engine of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The minor kernel version number of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>3.0.1</p>
     */
    @NameInMap("EngineMinorVersion")
    public String engineMinorVersion;

    /**
     * <p>The database engine version of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>2.4</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The time when the instance expires.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-09-17T00:00Z</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>The time when the instance was last modified, such as when you restarted the instance or applied for a public endpoint for the instance. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-08-17T09:58Z</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <p>The lock mode of the instance. Set the value to <strong>lock</strong>, which specifies that the instance is locked when it automatically expires or has an overdue payment.</p>
     * 
     * <strong>example:</strong>
     * <p>lock</p>
     */
    @NameInMap("LockMode")
    public Long lockMode;

    /**
     * <p>The reason why the instance is locked.</p>
     * 
     * <strong>example:</strong>
     * <p>nolock</p>
     */
    @NameInMap("LockReason")
    public String lockReason;

    /**
     * <p>The end time of the instance maintenance window.</p>
     * 
     * <strong>example:</strong>
     * <p>1970-01-01T05:00Z</p>
     */
    @NameInMap("MaintainEndtime")
    public String maintainEndtime;

    /**
     * <p>The start time of the instance maintenance window.</p>
     * 
     * <strong>example:</strong>
     * <p>1970-01-01T02:00Z</p>
     */
    @NameInMap("MaintainStarttime")
    public String maintainStarttime;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("MultiZone")
    public java.util.List<DescribeDBInstanceAttributeResponseBodyMultiZone> multiZone;

    /**
     * <p>The storage capacity of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ObjectStoreSize")
    public Long objectStoreSize;

    /**
     * <p>The Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>06758CAB-1204-5852-A471-29C87D5C1D0F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of CPU cores of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("ResourceCpu")
    public Long resourceCpu;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzbck4asz3dsa</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SecGroupConnValid")
    public String secGroupConnValid;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Serverless")
    public Boolean serverless;

    /**
     * <p>The state of the instance. Valid values:</p>
     * <ul>
     * <li><strong>CREATING</strong>: The instance is being created.</li>
     * <li><strong>ACTIVATION</strong>: The instance is running.</li>
     * <li><strong>RESOURCE_CHANGING</strong>: The resource configuration of the instance is being changed.</li>
     * <li><strong>ORDER_PREPARING</strong>: The order is being confirmed.</li>
     * <li><strong>READONLY_RESOURCE_CHANGING</strong>: The resource configuration of the instance is being changed and the instance is write-locked.</li>
     * <li><strong>DELETING</strong>: The instance is being deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ACTIVATION</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The cache size.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("StorageSize")
    public Long storageSize;

    /**
     * <p>The subdomain zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-h-aliyun</p>
     */
    @NameInMap("SubDomain")
    public String subDomain;

    /**
     * <p>The tags that are added to the instances. Each tag is a key-value pair that consists of two parts: TagKey and TagValue. Format: <code>{&quot;key1&quot;:&quot;value1&quot;}</code>.</p>
     */
    @NameInMap("Tags")
    public java.util.List<DescribeDBInstanceAttributeResponseBodyTags> tags;

    /**
     * <strong>example:</strong>
     * <p>vsw-bp18iztwqrs8qj2nc6nyu</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("VirtualClusterList")
    public java.util.List<DescribeDBInstanceAttributeResponseBodyVirtualClusterList> virtualClusterList;

    /**
     * <p>The VPC ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp175iuvg8nxqraf2****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The Zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-h</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeDBInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceAttributeResponseBody self = new DescribeDBInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceAttributeResponseBody setCanUpgradeVersions(java.util.List<String> canUpgradeVersions) {
        this.canUpgradeVersions = canUpgradeVersions;
        return this;
    }
    public java.util.List<String> getCanUpgradeVersions() {
        return this.canUpgradeVersions;
    }

    public DescribeDBInstanceAttributeResponseBody setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribeDBInstanceAttributeResponseBody setConfigPatternType(String configPatternType) {
        this.configPatternType = configPatternType;
        return this;
    }
    public String getConfigPatternType() {
        return this.configPatternType;
    }

    public DescribeDBInstanceAttributeResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeDBInstanceAttributeResponseBody setDBClusterList(java.util.List<DescribeDBInstanceAttributeResponseBodyDBClusterList> DBClusterList) {
        this.DBClusterList = DBClusterList;
        return this;
    }
    public java.util.List<DescribeDBInstanceAttributeResponseBodyDBClusterList> getDBClusterList() {
        return this.DBClusterList;
    }

    public DescribeDBInstanceAttributeResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstanceAttributeResponseBody setDeployScheme(String deployScheme) {
        this.deployScheme = deployScheme;
        return this;
    }
    public String getDeployScheme() {
        return this.deployScheme;
    }

    public DescribeDBInstanceAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeDBInstanceAttributeResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeDBInstanceAttributeResponseBody setEngineMinorVersion(String engineMinorVersion) {
        this.engineMinorVersion = engineMinorVersion;
        return this;
    }
    public String getEngineMinorVersion() {
        return this.engineMinorVersion;
    }

    public DescribeDBInstanceAttributeResponseBody setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeDBInstanceAttributeResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DescribeDBInstanceAttributeResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public DescribeDBInstanceAttributeResponseBody setLockMode(Long lockMode) {
        this.lockMode = lockMode;
        return this;
    }
    public Long getLockMode() {
        return this.lockMode;
    }

    public DescribeDBInstanceAttributeResponseBody setLockReason(String lockReason) {
        this.lockReason = lockReason;
        return this;
    }
    public String getLockReason() {
        return this.lockReason;
    }

    public DescribeDBInstanceAttributeResponseBody setMaintainEndtime(String maintainEndtime) {
        this.maintainEndtime = maintainEndtime;
        return this;
    }
    public String getMaintainEndtime() {
        return this.maintainEndtime;
    }

    public DescribeDBInstanceAttributeResponseBody setMaintainStarttime(String maintainStarttime) {
        this.maintainStarttime = maintainStarttime;
        return this;
    }
    public String getMaintainStarttime() {
        return this.maintainStarttime;
    }

    public DescribeDBInstanceAttributeResponseBody setMultiZone(java.util.List<DescribeDBInstanceAttributeResponseBodyMultiZone> multiZone) {
        this.multiZone = multiZone;
        return this;
    }
    public java.util.List<DescribeDBInstanceAttributeResponseBodyMultiZone> getMultiZone() {
        return this.multiZone;
    }

    public DescribeDBInstanceAttributeResponseBody setObjectStoreSize(Long objectStoreSize) {
        this.objectStoreSize = objectStoreSize;
        return this;
    }
    public Long getObjectStoreSize() {
        return this.objectStoreSize;
    }

    public DescribeDBInstanceAttributeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDBInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceAttributeResponseBody setResourceCpu(Long resourceCpu) {
        this.resourceCpu = resourceCpu;
        return this;
    }
    public Long getResourceCpu() {
        return this.resourceCpu;
    }

    public DescribeDBInstanceAttributeResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDBInstanceAttributeResponseBody setSecGroupConnValid(String secGroupConnValid) {
        this.secGroupConnValid = secGroupConnValid;
        return this;
    }
    public String getSecGroupConnValid() {
        return this.secGroupConnValid;
    }

    public DescribeDBInstanceAttributeResponseBody setServerless(Boolean serverless) {
        this.serverless = serverless;
        return this;
    }
    public Boolean getServerless() {
        return this.serverless;
    }

    public DescribeDBInstanceAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeDBInstanceAttributeResponseBody setStorageSize(Long storageSize) {
        this.storageSize = storageSize;
        return this;
    }
    public Long getStorageSize() {
        return this.storageSize;
    }

    public DescribeDBInstanceAttributeResponseBody setSubDomain(String subDomain) {
        this.subDomain = subDomain;
        return this;
    }
    public String getSubDomain() {
        return this.subDomain;
    }

    public DescribeDBInstanceAttributeResponseBody setTags(java.util.List<DescribeDBInstanceAttributeResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeDBInstanceAttributeResponseBodyTags> getTags() {
        return this.tags;
    }

    public DescribeDBInstanceAttributeResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeDBInstanceAttributeResponseBody setVirtualClusterList(java.util.List<DescribeDBInstanceAttributeResponseBodyVirtualClusterList> virtualClusterList) {
        this.virtualClusterList = virtualClusterList;
        return this;
    }
    public java.util.List<DescribeDBInstanceAttributeResponseBodyVirtualClusterList> getVirtualClusterList() {
        return this.virtualClusterList;
    }

    public DescribeDBInstanceAttributeResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeDBInstanceAttributeResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribeDBInstanceAttributeResponseBodyDBClusterList extends TeaModel {
        /**
         * <p>The cache size. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("CacheStorageSizeGB")
        public String cacheStorageSizeGB;

        /**
         * <p>The cache type.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("CacheStorageType")
        public String cacheStorageType;

        /**
         * <p>The billing method of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
         * <li><strong>Prepaid</strong>: subscription.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prepaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <strong>example:</strong>
         * <p>selectdb-cn-7213cjv****-be</p>
         */
        @NameInMap("ClusterBinding")
        public String clusterBinding;

        @NameInMap("ClusterNodeCount")
        public Integer clusterNodeCount;

        @NameInMap("ClusterNodeType")
        public String clusterNodeType;

        /**
         * <p>The number of CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("CpuCores")
        public Long cpuCores;

        /**
         * <p>The time when the cluster was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-08-14T09:24:13Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The specifications of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>selectdb.xlarge</strong>: 4 CPU cores and 32 GB of memory.</li>
         * <li><strong>selectdb.2xlarge</strong>: 8 CPU cores and 64 GB of memory.</li>
         * <li><strong>selectdb.4xlarge</strong>: 16 CPU cores and 128 GB of memory.</li>
         * <li><strong>selectdb.8xlarge</strong>: 32 CPU cores and 256 GB of memory.</li>
         * <li><strong>selectdb.16xlarge</strong>: 64 CPU cores and 512 GB of memory.</li>
         * <li><strong>selectdb.24xlarge</strong>: 96 CPU cores and 768 GB of memory.</li>
         * <li><strong>selectdb.32xlarge</strong>: 128 CPU cores and 1,024 GB of memory.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>selectdb.2xlarge</p>
         */
        @NameInMap("DbClusterClass")
        public String dbClusterClass;

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-cn-h033cjs****-be</p>
         */
        @NameInMap("DbClusterId")
        public String dbClusterId;

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>test01</p>
         */
        @NameInMap("DbClusterName")
        public String dbClusterName;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>test instance</p>
         */
        @NameInMap("DbInstanceName")
        public String dbInstanceName;

        /**
         * <p>The memory size.</p>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("Memory")
        public Long memory;

        /**
         * <p>The modified time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-02T16:35:44+08:00</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The performance level.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("ScaleMax")
        public Double scaleMax;

        /**
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("ScaleMin")
        public Double scaleMin;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ScalingRulesEnable")
        public Boolean scalingRulesEnable;

        /**
         * <p>The time when the cluster started.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-08-14T09:24:13Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The state of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>CREATING</strong>: The cluster is being created.</li>
         * <li><strong>ACTIVATION</strong>: The cluster is running.</li>
         * <li><strong>RESOURCE_CHANGING</strong>: The resource configuration of the cluster is being changed.</li>
         * <li><strong>ORDER_PREPARING</strong>: The order is being confirmed.</li>
         * <li><strong>READONLY_RESOURCE_CHANGING</strong>: The resource configuration of the cluster is being changed and the cluster is write-locked.</li>
         * <li><strong>DELETING</strong>: The cluster is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACTIVATION</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>预留参数，暂不返回。</p>
         */
        @NameInMap("SubDomain")
        public String subDomain;

        /**
         * <strong>example:</strong>
         * <p>vsw-t4n8x7jcc8rknon85tqoa</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-k</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBInstanceAttributeResponseBodyDBClusterList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyDBClusterList self = new DescribeDBInstanceAttributeResponseBodyDBClusterList();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyDBClusterList setCacheStorageSizeGB(String cacheStorageSizeGB) {
            this.cacheStorageSizeGB = cacheStorageSizeGB;
            return this;
        }
        public String getCacheStorageSizeGB() {
            return this.cacheStorageSizeGB;
        }

        public DescribeDBInstanceAttributeResponseBodyDBClusterList setCacheStorageType(String cacheStorageType) {
            this.cacheStorageType = cacheStorageType;
            return this;
        }
        public String getCacheStorageType() {
            return this.cacheStorageType;
        }

        public DescribeDBInstanceAttributeResponseBodyDBClusterList setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeDBInstanceAttributeResponseBodyDBClusterList setClusterBinding(String clusterBinding) {
            this.clusterBinding = clusterBinding;
            return this;
        }
        public String getClusterBinding() {
            return this.clusterBinding;
        }

        public DescribeDBInstanceAttributeResponseBodyDBClusterList setClusterNodeCount(Integer clusterNodeCount) {
            this.clusterNodeCount = clusterNodeCount;
            return this;
        }
        public Integer getClusterNodeCount() {
            return this.clusterNodeCount;
        }

        public DescribeDBInstanceAttributeResponseBodyDBClusterList setClusterNodeType(String clusterNodeType) {
            this.clusterNodeType = clusterNodeType;
            return this;
        }
        public String getClusterNodeType() {
            return this.clusterNodeType;
        }

        public DescribeDBInstanceAttributeResponseBodyDBClusterList setCpuCores(Long cpuCores) {
            this.cpuCores = cpuCores;
            return this;
        }
        public Long getCpuCores() {
            return this.cpuCores;
        }

        public DescribeDBInstanceAttributeResponseBodyDBClusterList setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeDBInstanceAttributeResponseBodyDBClusterList setDbClusterClass(String dbClusterClass) {
            this.dbClusterClass = dbClusterClass;
            return this;
        }
        public String getDbClusterClass() {
            return this.dbClusterClass;
        }

        public DescribeDBInstanceAttributeResponseBodyDBClusterList setDbClusterId(String dbClusterId) {
            this.dbClusterId = dbClusterId;
            return this;
        }
        public String getDbClusterId() {
            return this.dbClusterId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBClusterList setDbClusterName(String dbClusterName) {
            this.dbClusterName = dbClusterName;
            return this;
        }
        public String getDbClusterName() {
            return this.dbClusterName;
        }

        public DescribeDBInstanceAttributeResponseBodyDBClusterList setDbInstanceName(String dbInstanceName) {
            this.dbInstanceName = dbInstanceName;
            return this;
        }
        public String getDbInstanceName() {
            return this.dbInstanceName;
        }

        public DescribeDBInstanceAttributeResponseBodyDBClusterList setMemory(Long memory) {
            this.memory = memory;
            return this;
        }
        public Long getMemory() {
            return this.memory;
        }

        public DescribeDBInstanceAttributeResponseBodyDBClusterList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeDBInstanceAttributeResponseBodyDBClusterList setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DescribeDBInstanceAttributeResponseBodyDBClusterList setScaleMax(Double scaleMax) {
            this.scaleMax = scaleMax;
            return this;
        }
        public Double getScaleMax() {
            return this.scaleMax;
        }

        public DescribeDBInstanceAttributeResponseBodyDBClusterList setScaleMin(Double scaleMin) {
            this.scaleMin = scaleMin;
            return this;
        }
        public Double getScaleMin() {
            return this.scaleMin;
        }

        public DescribeDBInstanceAttributeResponseBodyDBClusterList setScalingRulesEnable(Boolean scalingRulesEnable) {
            this.scalingRulesEnable = scalingRulesEnable;
            return this;
        }
        public Boolean getScalingRulesEnable() {
            return this.scalingRulesEnable;
        }

        public DescribeDBInstanceAttributeResponseBodyDBClusterList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeDBInstanceAttributeResponseBodyDBClusterList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDBInstanceAttributeResponseBodyDBClusterList setSubDomain(String subDomain) {
            this.subDomain = subDomain;
            return this;
        }
        public String getSubDomain() {
            return this.subDomain;
        }

        public DescribeDBInstanceAttributeResponseBodyDBClusterList setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBClusterList setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyMultiZone extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>4096</p>
         */
        @NameInMap("AvailableIpCount")
        public Long availableIpCount;

        /**
         * <strong>example:</strong>
         * <p>113.88.14.211/32</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-k</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBInstanceAttributeResponseBodyMultiZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyMultiZone self = new DescribeDBInstanceAttributeResponseBodyMultiZone();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyMultiZone setAvailableIpCount(Long availableIpCount) {
            this.availableIpCount = availableIpCount;
            return this;
        }
        public Long getAvailableIpCount() {
            return this.availableIpCount;
        }

        public DescribeDBInstanceAttributeResponseBodyMultiZone setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public DescribeDBInstanceAttributeResponseBodyMultiZone setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public DescribeDBInstanceAttributeResponseBodyMultiZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>testValue</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeDBInstanceAttributeResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyTags self = new DescribeDBInstanceAttributeResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeDBInstanceAttributeResponseBodyTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyVirtualClusterList extends TeaModel {
        @NameInMap("ActiveClusterId")
        public String activeClusterId;

        @NameInMap("ActiveClusterName")
        public String activeClusterName;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("DbClusterId")
        public String dbClusterId;

        @NameInMap("DbClusterName")
        public String dbClusterName;

        @NameInMap("StandbyClusterId")
        public String standbyClusterId;

        @NameInMap("StandbyClusterName")
        public String standbyClusterName;

        @NameInMap("Status")
        public String status;

        public static DescribeDBInstanceAttributeResponseBodyVirtualClusterList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyVirtualClusterList self = new DescribeDBInstanceAttributeResponseBodyVirtualClusterList();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyVirtualClusterList setActiveClusterId(String activeClusterId) {
            this.activeClusterId = activeClusterId;
            return this;
        }
        public String getActiveClusterId() {
            return this.activeClusterId;
        }

        public DescribeDBInstanceAttributeResponseBodyVirtualClusterList setActiveClusterName(String activeClusterName) {
            this.activeClusterName = activeClusterName;
            return this;
        }
        public String getActiveClusterName() {
            return this.activeClusterName;
        }

        public DescribeDBInstanceAttributeResponseBodyVirtualClusterList setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeDBInstanceAttributeResponseBodyVirtualClusterList setDbClusterId(String dbClusterId) {
            this.dbClusterId = dbClusterId;
            return this;
        }
        public String getDbClusterId() {
            return this.dbClusterId;
        }

        public DescribeDBInstanceAttributeResponseBodyVirtualClusterList setDbClusterName(String dbClusterName) {
            this.dbClusterName = dbClusterName;
            return this;
        }
        public String getDbClusterName() {
            return this.dbClusterName;
        }

        public DescribeDBInstanceAttributeResponseBodyVirtualClusterList setStandbyClusterId(String standbyClusterId) {
            this.standbyClusterId = standbyClusterId;
            return this;
        }
        public String getStandbyClusterId() {
            return this.standbyClusterId;
        }

        public DescribeDBInstanceAttributeResponseBodyVirtualClusterList setStandbyClusterName(String standbyClusterName) {
            this.standbyClusterName = standbyClusterName;
            return this;
        }
        public String getStandbyClusterName() {
            return this.standbyClusterName;
        }

        public DescribeDBInstanceAttributeResponseBodyVirtualClusterList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
