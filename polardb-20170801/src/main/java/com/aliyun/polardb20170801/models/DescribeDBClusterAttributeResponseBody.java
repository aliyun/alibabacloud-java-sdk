// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAttributeResponseBody extends TeaModel {
    @NameInMap("DeletionLock")
    public Integer deletionLock;

    @NameInMap("Category")
    public String category;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("DataLevel1BackupChainSize")
    public Long dataLevel1BackupChainSize;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("DBType")
    public String DBType;

    @NameInMap("DBClusterNetworkType")
    public String DBClusterNetworkType;

    @NameInMap("IsLatestVersion")
    public Boolean isLatestVersion;

    @NameInMap("StorageMax")
    public Long storageMax;

    @NameInMap("DBVersion")
    public String DBVersion;

    @NameInMap("DBNodes")
    public java.util.List<DescribeDBClusterAttributeResponseBodyDBNodes> DBNodes;

    @NameInMap("ZoneIds")
    public String zoneIds;

    @NameInMap("MaintainTime")
    public String maintainTime;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("Tags")
    public java.util.List<DescribeDBClusterAttributeResponseBodyTags> tags;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VPCId")
    public String VPCId;

    @NameInMap("DBClusterStatus")
    public String DBClusterStatus;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("DBClusterDescription")
    public String DBClusterDescription;

    @NameInMap("Expired")
    public String expired;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("LockMode")
    public String lockMode;

    @NameInMap("StorageUsed")
    public Long storageUsed;

    @NameInMap("DBVersionStatus")
    public String DBVersionStatus;

    @NameInMap("CreationTime")
    public String creationTime;

    @NameInMap("SQLSize")
    public Long SQLSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("SubCategory")
    public String subCategory;

    public static DescribeDBClusterAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterAttributeResponseBody self = new DescribeDBClusterAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterAttributeResponseBody setDeletionLock(Integer deletionLock) {
        this.deletionLock = deletionLock;
        return this;
    }
    public Integer getDeletionLock() {
        return this.deletionLock;
    }

    public DescribeDBClusterAttributeResponseBody setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribeDBClusterAttributeResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDBClusterAttributeResponseBody setDataLevel1BackupChainSize(Long dataLevel1BackupChainSize) {
        this.dataLevel1BackupChainSize = dataLevel1BackupChainSize;
        return this;
    }
    public Long getDataLevel1BackupChainSize() {
        return this.dataLevel1BackupChainSize;
    }

    public DescribeDBClusterAttributeResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDBClusterAttributeResponseBody setDBType(String DBType) {
        this.DBType = DBType;
        return this;
    }
    public String getDBType() {
        return this.DBType;
    }

    public DescribeDBClusterAttributeResponseBody setDBClusterNetworkType(String DBClusterNetworkType) {
        this.DBClusterNetworkType = DBClusterNetworkType;
        return this;
    }
    public String getDBClusterNetworkType() {
        return this.DBClusterNetworkType;
    }

    public DescribeDBClusterAttributeResponseBody setIsLatestVersion(Boolean isLatestVersion) {
        this.isLatestVersion = isLatestVersion;
        return this;
    }
    public Boolean getIsLatestVersion() {
        return this.isLatestVersion;
    }

    public DescribeDBClusterAttributeResponseBody setStorageMax(Long storageMax) {
        this.storageMax = storageMax;
        return this;
    }
    public Long getStorageMax() {
        return this.storageMax;
    }

    public DescribeDBClusterAttributeResponseBody setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
        return this;
    }
    public String getDBVersion() {
        return this.DBVersion;
    }

    public DescribeDBClusterAttributeResponseBody setDBNodes(java.util.List<DescribeDBClusterAttributeResponseBodyDBNodes> DBNodes) {
        this.DBNodes = DBNodes;
        return this;
    }
    public java.util.List<DescribeDBClusterAttributeResponseBodyDBNodes> getDBNodes() {
        return this.DBNodes;
    }

    public DescribeDBClusterAttributeResponseBody setZoneIds(String zoneIds) {
        this.zoneIds = zoneIds;
        return this;
    }
    public String getZoneIds() {
        return this.zoneIds;
    }

    public DescribeDBClusterAttributeResponseBody setMaintainTime(String maintainTime) {
        this.maintainTime = maintainTime;
        return this;
    }
    public String getMaintainTime() {
        return this.maintainTime;
    }

    public DescribeDBClusterAttributeResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeDBClusterAttributeResponseBody setTags(java.util.List<DescribeDBClusterAttributeResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeDBClusterAttributeResponseBodyTags> getTags() {
        return this.tags;
    }

    public DescribeDBClusterAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClusterAttributeResponseBody setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public DescribeDBClusterAttributeResponseBody setDBClusterStatus(String DBClusterStatus) {
        this.DBClusterStatus = DBClusterStatus;
        return this;
    }
    public String getDBClusterStatus() {
        return this.DBClusterStatus;
    }

    public DescribeDBClusterAttributeResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeDBClusterAttributeResponseBody setDBClusterDescription(String DBClusterDescription) {
        this.DBClusterDescription = DBClusterDescription;
        return this;
    }
    public String getDBClusterDescription() {
        return this.DBClusterDescription;
    }

    public DescribeDBClusterAttributeResponseBody setExpired(String expired) {
        this.expired = expired;
        return this;
    }
    public String getExpired() {
        return this.expired;
    }

    public DescribeDBClusterAttributeResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeDBClusterAttributeResponseBody setLockMode(String lockMode) {
        this.lockMode = lockMode;
        return this;
    }
    public String getLockMode() {
        return this.lockMode;
    }

    public DescribeDBClusterAttributeResponseBody setStorageUsed(Long storageUsed) {
        this.storageUsed = storageUsed;
        return this;
    }
    public Long getStorageUsed() {
        return this.storageUsed;
    }

    public DescribeDBClusterAttributeResponseBody setDBVersionStatus(String DBVersionStatus) {
        this.DBVersionStatus = DBVersionStatus;
        return this;
    }
    public String getDBVersionStatus() {
        return this.DBVersionStatus;
    }

    public DescribeDBClusterAttributeResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeDBClusterAttributeResponseBody setSQLSize(Long SQLSize) {
        this.SQLSize = SQLSize;
        return this;
    }
    public Long getSQLSize() {
        return this.SQLSize;
    }

    public DescribeDBClusterAttributeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDBClusterAttributeResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DescribeDBClusterAttributeResponseBody setSubCategory(String subCategory) {
        this.subCategory = subCategory;
        return this;
    }
    public String getSubCategory() {
        return this.subCategory;
    }

    public static class DescribeDBClusterAttributeResponseBodyDBNodes extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("FailoverPriority")
        public Integer failoverPriority;

        @NameInMap("MaxIOPS")
        public Integer maxIOPS;

        @NameInMap("DBNodeClass")
        public String DBNodeClass;

        @NameInMap("DBNodeRole")
        public String DBNodeRole;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("MaxConnections")
        public Integer maxConnections;

        @NameInMap("DBNodeStatus")
        public String DBNodeStatus;

        @NameInMap("DBNodeId")
        public String DBNodeId;

        public static DescribeDBClusterAttributeResponseBodyDBNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAttributeResponseBodyDBNodes self = new DescribeDBClusterAttributeResponseBodyDBNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setFailoverPriority(Integer failoverPriority) {
            this.failoverPriority = failoverPriority;
            return this;
        }
        public Integer getFailoverPriority() {
            return this.failoverPriority;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setMaxIOPS(Integer maxIOPS) {
            this.maxIOPS = maxIOPS;
            return this;
        }
        public Integer getMaxIOPS() {
            return this.maxIOPS;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setDBNodeClass(String DBNodeClass) {
            this.DBNodeClass = DBNodeClass;
            return this;
        }
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setDBNodeRole(String DBNodeRole) {
            this.DBNodeRole = DBNodeRole;
            return this;
        }
        public String getDBNodeRole() {
            return this.DBNodeRole;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setMaxConnections(Integer maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setDBNodeStatus(String DBNodeStatus) {
            this.DBNodeStatus = DBNodeStatus;
            return this;
        }
        public String getDBNodeStatus() {
            return this.DBNodeStatus;
        }

        public DescribeDBClusterAttributeResponseBodyDBNodes setDBNodeId(String DBNodeId) {
            this.DBNodeId = DBNodeId;
            return this;
        }
        public String getDBNodeId() {
            return this.DBNodeId;
        }

    }

    public static class DescribeDBClusterAttributeResponseBodyTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeDBClusterAttributeResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAttributeResponseBodyTags self = new DescribeDBClusterAttributeResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAttributeResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBClusterAttributeResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
