// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClustersResponseBody extends TeaModel {
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Items")
    public DescribeDBClustersResponseBodyItems items;

    public static DescribeDBClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClustersResponseBody self = new DescribeDBClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClustersResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeDBClustersResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeDBClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClustersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBClustersResponseBody setItems(DescribeDBClustersResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeDBClustersResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeDBClustersResponseBodyItemsDBClusterTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeDBClustersResponseBodyItemsDBClusterTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersResponseBodyItemsDBClusterTagsTag self = new DescribeDBClustersResponseBodyItemsDBClusterTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeDBClustersResponseBodyItemsDBClusterTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBClustersResponseBodyItemsDBClusterTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDBClustersResponseBodyItemsDBClusterTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeDBClustersResponseBodyItemsDBClusterTagsTag> tag;

        public static DescribeDBClustersResponseBodyItemsDBClusterTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersResponseBodyItemsDBClusterTags self = new DescribeDBClustersResponseBodyItemsDBClusterTags();
            return TeaModel.build(map, self);
        }

        public DescribeDBClustersResponseBodyItemsDBClusterTags setTag(java.util.List<DescribeDBClustersResponseBodyItemsDBClusterTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeDBClustersResponseBodyItemsDBClusterTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeDBClustersResponseBodyItemsDBClusterDBNodesDBNode extends TeaModel {
        @NameInMap("DBNodeClass")
        public String DBNodeClass;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("DBNodeRole")
        public String DBNodeRole;

        @NameInMap("DBNodeId")
        public String DBNodeId;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeDBClustersResponseBodyItemsDBClusterDBNodesDBNode build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersResponseBodyItemsDBClusterDBNodesDBNode self = new DescribeDBClustersResponseBodyItemsDBClusterDBNodesDBNode();
            return TeaModel.build(map, self);
        }

        public DescribeDBClustersResponseBodyItemsDBClusterDBNodesDBNode setDBNodeClass(String DBNodeClass) {
            this.DBNodeClass = DBNodeClass;
            return this;
        }
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        public DescribeDBClustersResponseBodyItemsDBClusterDBNodesDBNode setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDBClustersResponseBodyItemsDBClusterDBNodesDBNode setDBNodeRole(String DBNodeRole) {
            this.DBNodeRole = DBNodeRole;
            return this;
        }
        public String getDBNodeRole() {
            return this.DBNodeRole;
        }

        public DescribeDBClustersResponseBodyItemsDBClusterDBNodesDBNode setDBNodeId(String DBNodeId) {
            this.DBNodeId = DBNodeId;
            return this;
        }
        public String getDBNodeId() {
            return this.DBNodeId;
        }

        public DescribeDBClustersResponseBodyItemsDBClusterDBNodesDBNode setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeDBClustersResponseBodyItemsDBClusterDBNodes extends TeaModel {
        @NameInMap("DBNode")
        public java.util.List<DescribeDBClustersResponseBodyItemsDBClusterDBNodesDBNode> DBNode;

        public static DescribeDBClustersResponseBodyItemsDBClusterDBNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersResponseBodyItemsDBClusterDBNodes self = new DescribeDBClustersResponseBodyItemsDBClusterDBNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDBClustersResponseBodyItemsDBClusterDBNodes setDBNode(java.util.List<DescribeDBClustersResponseBodyItemsDBClusterDBNodesDBNode> DBNode) {
            this.DBNode = DBNode;
            return this;
        }
        public java.util.List<DescribeDBClustersResponseBodyItemsDBClusterDBNodesDBNode> getDBNode() {
            return this.DBNode;
        }

    }

    public static class DescribeDBClustersResponseBodyItemsDBCluster extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("Expired")
        public String expired;

        @NameInMap("DBNodeNumber")
        public Integer DBNodeNumber;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("DBNodeClass")
        public String DBNodeClass;

        @NameInMap("Tags")
        public DescribeDBClustersResponseBodyItemsDBClusterTags tags;

        @NameInMap("DBType")
        public String DBType;

        @NameInMap("LockMode")
        public String lockMode;

        @NameInMap("DBNodes")
        public DescribeDBClustersResponseBodyItemsDBClusterDBNodes DBNodes;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("DeletionLock")
        public Integer deletionLock;

        @NameInMap("DBVersion")
        public String DBVersion;

        @NameInMap("DBClusterId")
        public String DBClusterId;

        @NameInMap("DBClusterStatus")
        public String DBClusterStatus;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("StorageUsed")
        public Long storageUsed;

        @NameInMap("DBClusterNetworkType")
        public String DBClusterNetworkType;

        @NameInMap("DBClusterDescription")
        public String DBClusterDescription;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("Engine")
        public String engine;

        public static DescribeDBClustersResponseBodyItemsDBCluster build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersResponseBodyItemsDBCluster self = new DescribeDBClustersResponseBodyItemsDBCluster();
            return TeaModel.build(map, self);
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setExpired(String expired) {
            this.expired = expired;
            return this;
        }
        public String getExpired() {
            return this.expired;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setDBNodeNumber(Integer DBNodeNumber) {
            this.DBNodeNumber = DBNodeNumber;
            return this;
        }
        public Integer getDBNodeNumber() {
            return this.DBNodeNumber;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setDBNodeClass(String DBNodeClass) {
            this.DBNodeClass = DBNodeClass;
            return this;
        }
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setTags(DescribeDBClustersResponseBodyItemsDBClusterTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeDBClustersResponseBodyItemsDBClusterTags getTags() {
            return this.tags;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setDBType(String DBType) {
            this.DBType = DBType;
            return this;
        }
        public String getDBType() {
            return this.DBType;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setDBNodes(DescribeDBClustersResponseBodyItemsDBClusterDBNodes DBNodes) {
            this.DBNodes = DBNodes;
            return this;
        }
        public DescribeDBClustersResponseBodyItemsDBClusterDBNodes getDBNodes() {
            return this.DBNodes;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setDeletionLock(Integer deletionLock) {
            this.deletionLock = deletionLock;
            return this;
        }
        public Integer getDeletionLock() {
            return this.deletionLock;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setDBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }
        public String getDBVersion() {
            return this.DBVersion;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setDBClusterStatus(String DBClusterStatus) {
            this.DBClusterStatus = DBClusterStatus;
            return this;
        }
        public String getDBClusterStatus() {
            return this.DBClusterStatus;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setStorageUsed(Long storageUsed) {
            this.storageUsed = storageUsed;
            return this;
        }
        public Long getStorageUsed() {
            return this.storageUsed;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setDBClusterNetworkType(String DBClusterNetworkType) {
            this.DBClusterNetworkType = DBClusterNetworkType;
            return this;
        }
        public String getDBClusterNetworkType() {
            return this.DBClusterNetworkType;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setDBClusterDescription(String DBClusterDescription) {
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }
        public String getDBClusterDescription() {
            return this.DBClusterDescription;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

    }

    public static class DescribeDBClustersResponseBodyItems extends TeaModel {
        @NameInMap("DBCluster")
        public java.util.List<DescribeDBClustersResponseBodyItemsDBCluster> DBCluster;

        public static DescribeDBClustersResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersResponseBodyItems self = new DescribeDBClustersResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBClustersResponseBodyItems setDBCluster(java.util.List<DescribeDBClustersResponseBodyItemsDBCluster> DBCluster) {
            this.DBCluster = DBCluster;
            return this;
        }
        public java.util.List<DescribeDBClustersResponseBodyItemsDBCluster> getDBCluster() {
            return this.DBCluster;
        }

    }

}
