// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClustersWithBackupsResponseBody extends TeaModel {
    @NameInMap("Items")
    public DescribeDBClustersWithBackupsResponseBodyItems items;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeDBClustersWithBackupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClustersWithBackupsResponseBody self = new DescribeDBClustersWithBackupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClustersWithBackupsResponseBody setItems(DescribeDBClustersWithBackupsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeDBClustersWithBackupsResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeDBClustersWithBackupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBClustersWithBackupsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeDBClustersWithBackupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClustersWithBackupsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeDBClustersWithBackupsResponseBodyItemsDBCluster extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DBClusterDescription")
        public String DBClusterDescription;

        @NameInMap("DBClusterId")
        public String DBClusterId;

        @NameInMap("DBClusterNetworkType")
        public String DBClusterNetworkType;

        @NameInMap("DBClusterStatus")
        public String DBClusterStatus;

        @NameInMap("DBNodeClass")
        public String DBNodeClass;

        @NameInMap("DBType")
        public String DBType;

        @NameInMap("DBVersion")
        public String DBVersion;

        @NameInMap("DeletedTime")
        public String deletedTime;

        @NameInMap("DeletionLock")
        public Integer deletionLock;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("Expired")
        public String expired;

        @NameInMap("IsDeleted")
        public Integer isDeleted;

        @NameInMap("LockMode")
        public String lockMode;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBClustersWithBackupsResponseBodyItemsDBCluster build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersWithBackupsResponseBodyItemsDBCluster self = new DescribeDBClustersWithBackupsResponseBodyItemsDBCluster();
            return TeaModel.build(map, self);
        }

        public DescribeDBClustersWithBackupsResponseBodyItemsDBCluster setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDBClustersWithBackupsResponseBodyItemsDBCluster setDBClusterDescription(String DBClusterDescription) {
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }
        public String getDBClusterDescription() {
            return this.DBClusterDescription;
        }

        public DescribeDBClustersWithBackupsResponseBodyItemsDBCluster setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeDBClustersWithBackupsResponseBodyItemsDBCluster setDBClusterNetworkType(String DBClusterNetworkType) {
            this.DBClusterNetworkType = DBClusterNetworkType;
            return this;
        }
        public String getDBClusterNetworkType() {
            return this.DBClusterNetworkType;
        }

        public DescribeDBClustersWithBackupsResponseBodyItemsDBCluster setDBClusterStatus(String DBClusterStatus) {
            this.DBClusterStatus = DBClusterStatus;
            return this;
        }
        public String getDBClusterStatus() {
            return this.DBClusterStatus;
        }

        public DescribeDBClustersWithBackupsResponseBodyItemsDBCluster setDBNodeClass(String DBNodeClass) {
            this.DBNodeClass = DBNodeClass;
            return this;
        }
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        public DescribeDBClustersWithBackupsResponseBodyItemsDBCluster setDBType(String DBType) {
            this.DBType = DBType;
            return this;
        }
        public String getDBType() {
            return this.DBType;
        }

        public DescribeDBClustersWithBackupsResponseBodyItemsDBCluster setDBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }
        public String getDBVersion() {
            return this.DBVersion;
        }

        public DescribeDBClustersWithBackupsResponseBodyItemsDBCluster setDeletedTime(String deletedTime) {
            this.deletedTime = deletedTime;
            return this;
        }
        public String getDeletedTime() {
            return this.deletedTime;
        }

        public DescribeDBClustersWithBackupsResponseBodyItemsDBCluster setDeletionLock(Integer deletionLock) {
            this.deletionLock = deletionLock;
            return this;
        }
        public Integer getDeletionLock() {
            return this.deletionLock;
        }

        public DescribeDBClustersWithBackupsResponseBodyItemsDBCluster setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBClustersWithBackupsResponseBodyItemsDBCluster setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBClustersWithBackupsResponseBodyItemsDBCluster setExpired(String expired) {
            this.expired = expired;
            return this;
        }
        public String getExpired() {
            return this.expired;
        }

        public DescribeDBClustersWithBackupsResponseBodyItemsDBCluster setIsDeleted(Integer isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Integer getIsDeleted() {
            return this.isDeleted;
        }

        public DescribeDBClustersWithBackupsResponseBodyItemsDBCluster setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBClustersWithBackupsResponseBodyItemsDBCluster setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDBClustersWithBackupsResponseBodyItemsDBCluster setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBClustersWithBackupsResponseBodyItemsDBCluster setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDBClustersWithBackupsResponseBodyItemsDBCluster setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDBClustersWithBackupsResponseBodyItems extends TeaModel {
        @NameInMap("DBCluster")
        public java.util.List<DescribeDBClustersWithBackupsResponseBodyItemsDBCluster> DBCluster;

        public static DescribeDBClustersWithBackupsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersWithBackupsResponseBodyItems self = new DescribeDBClustersWithBackupsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBClustersWithBackupsResponseBodyItems setDBCluster(java.util.List<DescribeDBClustersWithBackupsResponseBodyItemsDBCluster> DBCluster) {
            this.DBCluster = DBCluster;
            return this;
        }
        public java.util.List<DescribeDBClustersWithBackupsResponseBodyItemsDBCluster> getDBCluster() {
            return this.DBCluster;
        }

    }

}
