// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClustersResponseBody extends TeaModel {
    /**
     * <p>The details of the cluster.</p>
     */
    @NameInMap("Items")
    public DescribeDBClustersResponseBodyItems items;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of clusters returned per page.</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeDBClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClustersResponseBody self = new DescribeDBClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClustersResponseBody setItems(DescribeDBClustersResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeDBClustersResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeDBClustersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public DescribeDBClustersResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeDBClustersResponseBodyItemsDBClusterDBNodesDBNode extends TeaModel {
        /**
         * <p>The specifications of the node.</p>
         */
        @NameInMap("DBNodeClass")
        public String DBNodeClass;

        /**
         * <p>The ID of the node.</p>
         */
        @NameInMap("DBNodeId")
        public String DBNodeId;

        /**
         * <p>The role of the node. Valid values:</p>
         * <br>
         * <p>*   **Writer**: The node is the primary node.</p>
         * <p>*   **Reader**: The node is the read-only node.</p>
         */
        @NameInMap("DBNodeRole")
        public String DBNodeRole;

        /**
         * <p>Indicates whether the hot standby feature is enabled. Valid values:</p>
         * <br>
         * <p>*   **ON**</p>
         * <p>*   **OFF**</p>
         */
        @NameInMap("HotReplicaMode")
        public String hotReplicaMode;

        /**
         * <p>Indicates whether the In-Memory Column Index (IMCI) feature is enabled. Valid values:</p>
         * <br>
         * <p>*   **ON**</p>
         * <p>*   **OFF**</p>
         */
        @NameInMap("ImciSwitch")
        public String imciSwitch;

        /**
         * <p>The ID of the region in which the node resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Indicates whether the serverless feature is enabled for the current node.</p>
         * <br>
         * <p>*   **ON** indicates that the serverless feature is enabled.</p>
         * <p>*   An empty value indicates that the serverless feature is disabled.</p>
         */
        @NameInMap("Serverless")
        public String serverless;

        /**
         * <p>The zone ID of the node.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

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

        public DescribeDBClustersResponseBodyItemsDBClusterDBNodesDBNode setDBNodeId(String DBNodeId) {
            this.DBNodeId = DBNodeId;
            return this;
        }
        public String getDBNodeId() {
            return this.DBNodeId;
        }

        public DescribeDBClustersResponseBodyItemsDBClusterDBNodesDBNode setDBNodeRole(String DBNodeRole) {
            this.DBNodeRole = DBNodeRole;
            return this;
        }
        public String getDBNodeRole() {
            return this.DBNodeRole;
        }

        public DescribeDBClustersResponseBodyItemsDBClusterDBNodesDBNode setHotReplicaMode(String hotReplicaMode) {
            this.hotReplicaMode = hotReplicaMode;
            return this;
        }
        public String getHotReplicaMode() {
            return this.hotReplicaMode;
        }

        public DescribeDBClustersResponseBodyItemsDBClusterDBNodesDBNode setImciSwitch(String imciSwitch) {
            this.imciSwitch = imciSwitch;
            return this;
        }
        public String getImciSwitch() {
            return this.imciSwitch;
        }

        public DescribeDBClustersResponseBodyItemsDBClusterDBNodesDBNode setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBClustersResponseBodyItemsDBClusterDBNodesDBNode setServerless(String serverless) {
            this.serverless = serverless;
            return this;
        }
        public String getServerless() {
            return this.serverless;
        }

        public DescribeDBClustersResponseBodyItemsDBClusterDBNodesDBNode setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
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

    public static class DescribeDBClustersResponseBodyItemsDBClusterTagsTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         */
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

    public static class DescribeDBClustersResponseBodyItemsDBCluster extends TeaModel {
        /**
         * <p>The type of the AI node. Valid values:</p>
         * <br>
         * <p>*   SearchNode: search node.</p>
         * <p>*   DLNode: AI node.</p>
         */
        @NameInMap("AiType")
        public String aiType;

        /**
         * <p>The edition of the cluster. Valid values:</p>
         * <br>
         * <p>*   **Normal**: Cluster Edition</p>
         * <p>*   **Basic**: Single Node Edition</p>
         * <p>*   **Archive**: X-Engine Edition</p>
         * <p>*   **NormalMultimaster**: Multi-master Cluster (Database/Table)</p>
         */
        @NameInMap("Category")
        public String category;

        @NameInMap("CpuCores")
        public String cpuCores;

        /**
         * <p>The time when the cluster was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the cluster.</p>
         */
        @NameInMap("DBClusterDescription")
        public String DBClusterDescription;

        /**
         * <p>The ID of the cluster.</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The network type of the cluster.</p>
         */
        @NameInMap("DBClusterNetworkType")
        public String DBClusterNetworkType;

        /**
         * <p>The status of the cluster.</p>
         */
        @NameInMap("DBClusterStatus")
        public String DBClusterStatus;

        /**
         * <p>The specifications of the node.</p>
         */
        @NameInMap("DBNodeClass")
        public String DBNodeClass;

        /**
         * <p>The number of nodes.</p>
         */
        @NameInMap("DBNodeNumber")
        public Integer DBNodeNumber;

        /**
         * <p>The nodes of the cluster.</p>
         */
        @NameInMap("DBNodes")
        public DescribeDBClustersResponseBodyItemsDBClusterDBNodes DBNodes;

        /**
         * <p>The type of the database engine.</p>
         */
        @NameInMap("DBType")
        public String DBType;

        /**
         * <p>The version of the database.</p>
         */
        @NameInMap("DBVersion")
        public String DBVersion;

        /**
         * <p>Indicates whether the cluster is protected from deletion. Valid values:</p>
         * <br>
         * <p>*   **0**: The cluster is not locked.</p>
         * <p>*   **1**: The cluster is locked.</p>
         * <br>
         * <p>> You cannot delete clusters that are locked.</p>
         */
        @NameInMap("DeletionLock")
        public Integer deletionLock;

        /**
         * <p>The engine of the cluster.</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The expiration time of the cluster.</p>
         * <br>
         * <p>> A specific value is returned only for subscription (**Prepaid**) clusters. For pay-as-you-go (**Postpaid**) clusters, an empty string is returned.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>Indicates whether the cluster has expired. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>> A specific value is returned only for subscription (**Prepaid**) clusters.</p>
         */
        @NameInMap("Expired")
        public String expired;

        /**
         * <p>The lock state of the cluster. Valid values:</p>
         * <br>
         * <p>*   **Unlock**: The cluster is not locked.</p>
         * <p>*   **ManualLock**: The cluster is manually locked.</p>
         * <p>*   **LockByExpiration**: The cluster is automatically locked due to cluster expiration.</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        @NameInMap("MemorySize")
        public String memorySize;

        /**
         * <p>The billing method of the cluster. Valid values:</p>
         * <br>
         * <p>*   **Postpaid**: pay-as-you-go</p>
         * <p>*   **Prepaid**: subscription</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The ID of the region in which the node resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RemoteMemorySize")
        public String remoteMemorySize;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Indicates whether the cluster is a serverless cluster. **AgileServerless** indicates a serverless cluster. An empty value indicates a common cluster.</p>
         */
        @NameInMap("ServerlessType")
        public String serverlessType;

        /**
         * <p>The billing method of the storage space. Valid values:</p>
         * <br>
         * <p>*   **Postpaid**: pay-as-you-go</p>
         * <p>*   **Prepaid**: subscription</p>
         */
        @NameInMap("StoragePayType")
        public String storagePayType;

        /**
         * <p>The storage capacity that is billed based on the subscription billing method. Unit: byte.</p>
         */
        @NameInMap("StorageSpace")
        public Long storageSpace;

        /**
         * <p>The storage space this is occupied by the cluster. Unit: bytes.</p>
         */
        @NameInMap("StorageUsed")
        public Long storageUsed;

        /**
         * <p>Indicates whether multi-zone data consistency is enabled for the cluster. Valid values:</p>
         * <br>
         * <p>*   **ON**: multi-zone data consistency is enabled, which is suitable for Standard Edition clusters of Multi-zone Edition.</p>
         * <p>*   **OFF**: multi-zone data consistency is disabled.</p>
         */
        @NameInMap("StrictConsistency")
        public String strictConsistency;

        @NameInMap("SubCategory")
        public String subCategory;

        /**
         * <p>The tags of the cluster.</p>
         */
        @NameInMap("Tags")
        public DescribeDBClustersResponseBodyItemsDBClusterTags tags;

        /**
         * <p>The VPC ID of the cluster.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The vSwitch ID of the cluster.</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        /**
         * <p>The zone ID of the cluster.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBClustersResponseBodyItemsDBCluster build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersResponseBodyItemsDBCluster self = new DescribeDBClustersResponseBodyItemsDBCluster();
            return TeaModel.build(map, self);
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setAiType(String aiType) {
            this.aiType = aiType;
            return this;
        }
        public String getAiType() {
            return this.aiType;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setCpuCores(String cpuCores) {
            this.cpuCores = cpuCores;
            return this;
        }
        public String getCpuCores() {
            return this.cpuCores;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setDBClusterDescription(String DBClusterDescription) {
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }
        public String getDBClusterDescription() {
            return this.DBClusterDescription;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setDBClusterNetworkType(String DBClusterNetworkType) {
            this.DBClusterNetworkType = DBClusterNetworkType;
            return this;
        }
        public String getDBClusterNetworkType() {
            return this.DBClusterNetworkType;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setDBClusterStatus(String DBClusterStatus) {
            this.DBClusterStatus = DBClusterStatus;
            return this;
        }
        public String getDBClusterStatus() {
            return this.DBClusterStatus;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setDBNodeClass(String DBNodeClass) {
            this.DBNodeClass = DBNodeClass;
            return this;
        }
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setDBNodeNumber(Integer DBNodeNumber) {
            this.DBNodeNumber = DBNodeNumber;
            return this;
        }
        public Integer getDBNodeNumber() {
            return this.DBNodeNumber;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setDBNodes(DescribeDBClustersResponseBodyItemsDBClusterDBNodes DBNodes) {
            this.DBNodes = DBNodes;
            return this;
        }
        public DescribeDBClustersResponseBodyItemsDBClusterDBNodes getDBNodes() {
            return this.DBNodes;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setDBType(String DBType) {
            this.DBType = DBType;
            return this;
        }
        public String getDBType() {
            return this.DBType;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setDBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }
        public String getDBVersion() {
            return this.DBVersion;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setDeletionLock(Integer deletionLock) {
            this.deletionLock = deletionLock;
            return this;
        }
        public Integer getDeletionLock() {
            return this.deletionLock;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
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

        public DescribeDBClustersResponseBodyItemsDBCluster setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setMemorySize(String memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public String getMemorySize() {
            return this.memorySize;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setRemoteMemorySize(String remoteMemorySize) {
            this.remoteMemorySize = remoteMemorySize;
            return this;
        }
        public String getRemoteMemorySize() {
            return this.remoteMemorySize;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setServerlessType(String serverlessType) {
            this.serverlessType = serverlessType;
            return this;
        }
        public String getServerlessType() {
            return this.serverlessType;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setStoragePayType(String storagePayType) {
            this.storagePayType = storagePayType;
            return this;
        }
        public String getStoragePayType() {
            return this.storagePayType;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setStorageSpace(Long storageSpace) {
            this.storageSpace = storageSpace;
            return this;
        }
        public Long getStorageSpace() {
            return this.storageSpace;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setStorageUsed(Long storageUsed) {
            this.storageUsed = storageUsed;
            return this;
        }
        public Long getStorageUsed() {
            return this.storageUsed;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setStrictConsistency(String strictConsistency) {
            this.strictConsistency = strictConsistency;
            return this;
        }
        public String getStrictConsistency() {
            return this.strictConsistency;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setSubCategory(String subCategory) {
            this.subCategory = subCategory;
            return this;
        }
        public String getSubCategory() {
            return this.subCategory;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setTags(DescribeDBClustersResponseBodyItemsDBClusterTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeDBClustersResponseBodyItemsDBClusterTags getTags() {
            return this.tags;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public DescribeDBClustersResponseBodyItemsDBCluster setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
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
