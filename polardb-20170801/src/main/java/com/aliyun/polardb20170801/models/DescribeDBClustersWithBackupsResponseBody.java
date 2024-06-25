// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClustersWithBackupsResponseBody extends TeaModel {
    /**
     * <p>The details about the cluster.</p>
     */
    @NameInMap("Items")
    public DescribeDBClustersWithBackupsResponseBodyItems items;

    /**
     * <p>The total number of returned pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of clusters returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F8529AA2-522F-4B30-B80B-8F7D39******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <p>The time when the cluster was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-09T09:33:51Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DBClusterDescription")
        public String DBClusterDescription;

        /**
         * <p>The ID of cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-****************</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The network type of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("DBClusterNetworkType")
        public String DBClusterNetworkType;

        /**
         * <p>The status of the cluster. Valid values:</p>
         * <ul>
         * <li>Creating: The cluster is being created.</li>
         * <li>Running: The cluster is running.</li>
         * <li>Deleting: The cluster is being released.</li>
         * <li>Rebooting: The cluster is restarting.</li>
         * <li>DBNodeCreating: The node is being added.</li>
         * <li>DBNodeDeleting: The node is being deleted.</li>
         * <li>ClassChanging: The specifications of the node are being changed.</li>
         * <li>NetAddressCreating: The network connection is being created.</li>
         * <li>NetAddressDeleting: The network connection is being deleted.</li>
         * <li>NetAddressModifying: The network connection is being modified.</li>
         * <li>Deleted: The cluster has been released.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DBClusterStatus")
        public String DBClusterStatus;

        /**
         * <p>The specifications of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>polar.mysql.x4.medium</p>
         */
        @NameInMap("DBNodeClass")
        public String DBNodeClass;

        /**
         * <p>The type of the database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("DBType")
        public String DBType;

        /**
         * <p>The version of the database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>8.0</p>
         */
        @NameInMap("DBVersion")
        public String DBVersion;

        /**
         * <p>The time when the cluster was deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-12T03:25:37Z</p>
         */
        @NameInMap("DeletedTime")
        public String deletedTime;

        /**
         * <p>Indicates whether the cluster is locked and can be deleted. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The cluster is not locked and can be deleted.</li>
         * <li><strong>1</strong>: The cluster is locked and cannot be deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DeletionLock")
        public Integer deletionLock;

        /**
         * <p>The type of the database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>POLARDB</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The time when the cluster expires.</p>
         * <blockquote>
         * <p>A specific value will be returned only for subscription clusters. For pay-as-you-go clusters, an empty string will be returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-09-14T16:00:00Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>Indicates whether the cluster has expired.</p>
         * <blockquote>
         * <p>A specific value will be returned only for subscription clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Expired")
        public String expired;

        /**
         * <p>Indicates whether the cluster was released. Valid values:</p>
         * <ul>
         * <li>1: released</li>
         * <li>0: not released</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsDeleted")
        public Integer isDeleted;

        /**
         * <p>The state of the cluster lock. Valid values:</p>
         * <ul>
         * <li><strong>Unlock</strong>: The cluster is not locked.</li>
         * <li><strong>ManualLock</strong>: The cluster is manually locked.</li>
         * <li><strong>LockByExpiration</strong>: The cluster is automatically locked after the cluster expires.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Unlock</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
         * <li><strong>Prepaid</strong>: subscription</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Postpaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The region ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The VPC ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-******************</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the zone in which the instance is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
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
