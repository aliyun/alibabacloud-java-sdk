// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesResponseBody extends TeaModel {
    /**
     * <p>The details about each instance returned.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeDBInstancesResponseBodyItems> items;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><strong>30</strong> (default)</li>
     * <li><strong>50</strong></li>
     * <li><strong>100</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BC854513-E85E-54F3-9842-B9CCD3308CDD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalRecordCount")
    public Long totalRecordCount;

    public static DescribeDBInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesResponseBody self = new DescribeDBInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesResponseBody setItems(java.util.List<DescribeDBInstancesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeDBInstancesResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeDBInstancesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstancesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDBInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstancesResponseBody setTotalRecordCount(Long totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeDBInstancesResponseBodyItemsTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <strong>example:</strong>
         * <p>testValue</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeDBInstancesResponseBodyItemsTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseBodyItemsTags self = new DescribeDBInstancesResponseBodyItemsTags();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseBodyItemsTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeDBInstancesResponseBodyItemsTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeDBInstancesResponseBodyItems extends TeaModel {
        /**
         * <p>The edition of the instance. Default value: basic.</p>
         * 
         * <strong>example:</strong>
         * <p>basic</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
         * <li><strong>Prepaid</strong>: subscription.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The total number of clusters.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ClusterCount")
        public Integer clusterCount;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-cn-7213cjv****</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The description of the instance.</p>
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
         * <p>The database engine version of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2.4</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The time when the cluster expires.</p>
         * <blockquote>
         * <p> A specific value is returned only for subscription clusters whose billing method is <strong>Prepaid</strong>. For pay-as-you-go clusters whose billing method is <strong>Postpaid</strong>, no value is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2024-03-29T03:47:05Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The time when the task was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-08-12T04:14Z</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The time when the task was last modified. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-08-12T19:05Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Instance</p>
         */
        @NameInMap("InstanceUsedType")
        public String instanceUsedType;

        /**
         * <p>Indicates whether the instance is deleted. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDeleted")
        public Boolean isDeleted;

        /**
         * <p>The lock mode of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>The end timestamp of the maintenance window.</p>
         */
        @NameInMap("MaintainEndTimeStr")
        public String maintainEndTimeStr;

        /**
         * <p>The end time of the instance maintenance window.</p>
         */
        @NameInMap("MaintainEndtime")
        public String maintainEndtime;

        /**
         * <p>The start timestamp of the maintenance window.</p>
         */
        @NameInMap("MaintainStartTimeStr")
        public String maintainStartTimeStr;

        /**
         * <p>The start time of the instance maintenance window.</p>
         */
        @NameInMap("MaintainStarttime")
        public String maintainStarttime;

        /**
         * <p>The storage capacity of the instance. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ObjectStoreSize")
        public Long objectStoreSize;

        /**
         * <p>The time when the instance was created.</p>
         */
        @NameInMap("ParentInstance")
        public String parentInstance;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The number of CPU cores of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("ResourceCpu")
        public Long resourceCpu;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The memory capacity of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("ResourceMemory")
        public Long resourceMemory;

        /**
         * <p>The maximum number of RCUs.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ScaleMax")
        public Long scaleMax;

        /**
         * <p>The minimum number of RDS capacity units (RCUs).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ScaleMin")
        public Long scaleMin;

        /**
         * <p>This parameter is not returned.</p>
         */
        @NameInMap("ScaleReplica")
        public Long scaleReplica;

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
         * <p>100</p>
         */
        @NameInMap("StorageSize")
        public Long storageSize;

        /**
         * <p>The storage type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>The details about each tag returned.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeDBInstancesResponseBodyItemsTags> tags;

        /**
         * <p>The ID of the cluster that is monitored by Managed Service for Prometheus.</p>
         */
        @NameInMap("TenantClusterId")
        public String tenantClusterId;

        /**
         * <p>The token that is used to access Managed Service for Prometheus.</p>
         */
        @NameInMap("TenantToken")
        public String tenantToken;

        /**
         * <p>The ID of the account that uses Managed Service for Prometheus.</p>
         */
        @NameInMap("TenantUserId")
        public String tenantUserId;

        /**
         * <p>The virtual private cloud (VPC) ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp175iuvg8nxqraf2****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1gzt31twhlo0sa5****</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        /**
         * <p>The connection string of the instance.</p>
         */
        @NameInMap("connectionString")
        public String connectionString;

        public static DescribeDBInstancesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseBodyItems self = new DescribeDBInstancesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseBodyItems setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDBInstancesResponseBodyItems setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeDBInstancesResponseBodyItems setClusterCount(Integer clusterCount) {
            this.clusterCount = clusterCount;
            return this;
        }
        public Integer getClusterCount() {
            return this.clusterCount;
        }

        public DescribeDBInstancesResponseBodyItems setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstancesResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDBInstancesResponseBodyItems setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBInstancesResponseBodyItems setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDBInstancesResponseBodyItems setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBInstancesResponseBodyItems setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeDBInstancesResponseBodyItems setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeDBInstancesResponseBodyItems setInstanceUsedType(String instanceUsedType) {
            this.instanceUsedType = instanceUsedType;
            return this;
        }
        public String getInstanceUsedType() {
            return this.instanceUsedType;
        }

        public DescribeDBInstancesResponseBodyItems setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        public DescribeDBInstancesResponseBodyItems setLockMode(Long lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public Long getLockMode() {
            return this.lockMode;
        }

        public DescribeDBInstancesResponseBodyItems setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeDBInstancesResponseBodyItems setMaintainEndTimeStr(String maintainEndTimeStr) {
            this.maintainEndTimeStr = maintainEndTimeStr;
            return this;
        }
        public String getMaintainEndTimeStr() {
            return this.maintainEndTimeStr;
        }

        public DescribeDBInstancesResponseBodyItems setMaintainEndtime(String maintainEndtime) {
            this.maintainEndtime = maintainEndtime;
            return this;
        }
        public String getMaintainEndtime() {
            return this.maintainEndtime;
        }

        public DescribeDBInstancesResponseBodyItems setMaintainStartTimeStr(String maintainStartTimeStr) {
            this.maintainStartTimeStr = maintainStartTimeStr;
            return this;
        }
        public String getMaintainStartTimeStr() {
            return this.maintainStartTimeStr;
        }

        public DescribeDBInstancesResponseBodyItems setMaintainStarttime(String maintainStarttime) {
            this.maintainStarttime = maintainStarttime;
            return this;
        }
        public String getMaintainStarttime() {
            return this.maintainStarttime;
        }

        public DescribeDBInstancesResponseBodyItems setObjectStoreSize(Long objectStoreSize) {
            this.objectStoreSize = objectStoreSize;
            return this;
        }
        public Long getObjectStoreSize() {
            return this.objectStoreSize;
        }

        public DescribeDBInstancesResponseBodyItems setParentInstance(String parentInstance) {
            this.parentInstance = parentInstance;
            return this;
        }
        public String getParentInstance() {
            return this.parentInstance;
        }

        public DescribeDBInstancesResponseBodyItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBInstancesResponseBodyItems setResourceCpu(Long resourceCpu) {
            this.resourceCpu = resourceCpu;
            return this;
        }
        public Long getResourceCpu() {
            return this.resourceCpu;
        }

        public DescribeDBInstancesResponseBodyItems setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDBInstancesResponseBodyItems setResourceMemory(Long resourceMemory) {
            this.resourceMemory = resourceMemory;
            return this;
        }
        public Long getResourceMemory() {
            return this.resourceMemory;
        }

        public DescribeDBInstancesResponseBodyItems setScaleMax(Long scaleMax) {
            this.scaleMax = scaleMax;
            return this;
        }
        public Long getScaleMax() {
            return this.scaleMax;
        }

        public DescribeDBInstancesResponseBodyItems setScaleMin(Long scaleMin) {
            this.scaleMin = scaleMin;
            return this;
        }
        public Long getScaleMin() {
            return this.scaleMin;
        }

        public DescribeDBInstancesResponseBodyItems setScaleReplica(Long scaleReplica) {
            this.scaleReplica = scaleReplica;
            return this;
        }
        public Long getScaleReplica() {
            return this.scaleReplica;
        }

        public DescribeDBInstancesResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDBInstancesResponseBodyItems setStorageSize(Long storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public Long getStorageSize() {
            return this.storageSize;
        }

        public DescribeDBInstancesResponseBodyItems setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeDBInstancesResponseBodyItems setTags(java.util.List<DescribeDBInstancesResponseBodyItemsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeDBInstancesResponseBodyItemsTags> getTags() {
            return this.tags;
        }

        public DescribeDBInstancesResponseBodyItems setTenantClusterId(String tenantClusterId) {
            this.tenantClusterId = tenantClusterId;
            return this;
        }
        public String getTenantClusterId() {
            return this.tenantClusterId;
        }

        public DescribeDBInstancesResponseBodyItems setTenantToken(String tenantToken) {
            this.tenantToken = tenantToken;
            return this;
        }
        public String getTenantToken() {
            return this.tenantToken;
        }

        public DescribeDBInstancesResponseBodyItems setTenantUserId(String tenantUserId) {
            this.tenantUserId = tenantUserId;
            return this;
        }
        public String getTenantUserId() {
            return this.tenantUserId;
        }

        public DescribeDBInstancesResponseBodyItems setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDBInstancesResponseBodyItems setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public DescribeDBInstancesResponseBodyItems setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDBInstancesResponseBodyItems setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

    }

}
