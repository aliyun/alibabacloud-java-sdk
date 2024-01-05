// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeDBInstancesResponseBodyItems> items;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeDBInstancesResponseBodyItemsTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseBodyItemsTags self = new DescribeDBInstancesResponseBodyItemsTags();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseBodyItemsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBInstancesResponseBodyItemsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDBInstancesResponseBodyItems extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("ClusterCount")
        public Integer clusterCount;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("Description")
        public String description;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("InstanceUsedType")
        public String instanceUsedType;

        @NameInMap("IsDeleted")
        public Boolean isDeleted;

        @NameInMap("LockMode")
        public Long lockMode;

        @NameInMap("LockReason")
        public String lockReason;

        @NameInMap("MaintainEndTimeStr")
        public String maintainEndTimeStr;

        @NameInMap("MaintainEndtime")
        public String maintainEndtime;

        @NameInMap("MaintainStartTimeStr")
        public String maintainStartTimeStr;

        @NameInMap("MaintainStarttime")
        public String maintainStarttime;

        @NameInMap("ObjectStoreSize")
        public Long objectStoreSize;

        @NameInMap("ParentInstance")
        public String parentInstance;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceCpu")
        public Long resourceCpu;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ResourceMemory")
        public Long resourceMemory;

        @NameInMap("ScaleMax")
        public Long scaleMax;

        @NameInMap("ScaleMin")
        public Long scaleMin;

        @NameInMap("ScaleReplica")
        public Long scaleReplica;

        @NameInMap("Status")
        public String status;

        @NameInMap("StorageSize")
        public Long storageSize;

        @NameInMap("StorageType")
        public String storageType;

        @NameInMap("Tags")
        public java.util.List<DescribeDBInstancesResponseBodyItemsTags> tags;

        @NameInMap("TenantClusterId")
        public String tenantClusterId;

        @NameInMap("TenantToken")
        public String tenantToken;

        @NameInMap("TenantUserId")
        public String tenantUserId;

        /**
         * <p>VPC ID。</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VswitchId")
        public String vswitchId;

        @NameInMap("ZoneId")
        public String zoneId;

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
