// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClustersResponseBody extends TeaModel {
    /**
     * <p>The information about the clusters.</p>
     */
    @NameInMap("Items")
    public DescribeDBClustersResponseBodyItems items;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of clusters returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9B7BFB11-C077-4FE3-B051-F69CEB******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
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
         * 
         * <strong>example:</strong>
         * <p>polar.mysql.x4.large</p>
         */
        @NameInMap("DBNodeClass")
        public String DBNodeClass;

        /**
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>pi-****************</p>
         */
        @NameInMap("DBNodeId")
        public String DBNodeId;

        /**
         * <p>The role of the node. Valid values:</p>
         * <ul>
         * <li><strong>Writer</strong>: primary node</li>
         * <li><strong>Reader</strong>: read-only node</li>
         * <li><strong>ColumnReader</strong>: column store read-only node</li>
         * <li><strong>AI</strong>: AI node</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Reader</p>
         */
        @NameInMap("DBNodeRole")
        public String DBNodeRole;

        /**
         * <p>Indicates whether the hot standby feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>ON</strong></li>
         * <li><strong>OFF</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OFF</p>
         */
        @NameInMap("HotReplicaMode")
        public String hotReplicaMode;

        /**
         * <p>Indicates whether the In-Memory Column Index (IMCI) feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>ON</strong></li>
         * <li><strong>OFF</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OFF</p>
         */
        @NameInMap("ImciSwitch")
        public String imciSwitch;

        /**
         * <p>The region ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Indicates whether the serverless feature is enabled for the node.</p>
         * <ul>
         * <li><strong>ON</strong> indicates that the serverless feature is enabled.</li>
         * <li>No value is returned if the serverless feature is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("Serverless")
        public String serverless;

        /**
         * <p>The zone ID of node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
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
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>5.6</p>
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
         * <ul>
         * <li>SearchNode: search node</li>
         * <li>DLNode: AI node</li>
         * </ul>
         * <p>Enumeration values:</p>
         * <ul>
         * <li>SearchNode | DLNode: both</li>
         * <li>DLNode: AI node</li>
         * <li>SearchNode: search node</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SearchNode</p>
         */
        @NameInMap("AiType")
        public String aiType;

        /**
         * <p>The edition of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: Cluster Edition</li>
         * <li><strong>Basic</strong>: Single Node Edition</li>
         * <li><strong>Archive</strong>: X-Engine Edition</li>
         * <li><strong>NormalMultimaster</strong>: Multi-master Cluster (Database/Table) Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The number of CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CpuCores")
        public String cpuCores;

        /**
         * <p>The time when the cluster was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-08-14T05:58:42Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>GDN-1</p>
         */
        @NameInMap("DBClusterDescription")
        public String DBClusterDescription;

        /**
         * <p>The cluster ID.</p>
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
         * <p>The state of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DBClusterStatus")
        public String DBClusterStatus;

        /**
         * <p>The node specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>polar.mysql.x4.large</p>
         */
        @NameInMap("DBNodeClass")
        public String DBNodeClass;

        /**
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DBNodeNumber")
        public Integer DBNodeNumber;

        /**
         * <p>The information about the nodes.</p>
         */
        @NameInMap("DBNodes")
        public DescribeDBClustersResponseBodyItemsDBClusterDBNodes DBNodes;

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
         * <p>5.6</p>
         */
        @NameInMap("DBVersion")
        public String DBVersion;

        /**
         * <p>Indicates whether the cluster is protected from deletion. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The cluster is not protected from deletion.</li>
         * <li><strong>1</strong>: The cluster is protected from deletion.</li>
         * </ul>
         * <blockquote>
         * <p> You cannot delete clusters that are protected from deletion.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DeletionLock")
        public Integer deletionLock;

        /**
         * <p>The database engine of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>POLARDB</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The expiration time of the cluster.</p>
         * <blockquote>
         * <p> A specific value is returned only for subscription (<strong>Prepaid</strong>) clusters. For pay-as-you-go (<strong>Postpaid</strong>) clusters, no value is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2020-11-14T16:00:00Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>Indicates whether the cluster has expired. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p> A specific value is returned only for subscription (<strong>Prepaid</strong>) clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Expired")
        public String expired;

        /**
         * <p>The lock state of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>Unlock</strong>: The cluster is unlocked.</li>
         * <li><strong>ManualLock</strong>: The cluster is manually locked.</li>
         * <li><strong>LockByExpiration</strong>: The cluster is locked due to cluster expiration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Unlock</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        /**
         * <p>The memory size for local operations. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("MemorySize")
        public String memorySize;

        /**
         * <p>The billing method of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>Postpaid</strong>: pay-as-you-go</li>
         * <li><strong>Prepaid</strong>: subscription</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prepaid</p>
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
         * <p>The memory size for distributed operations. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>3612</p>
         */
        @NameInMap("RemoteMemorySize")
        public String remoteMemorySize;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-************</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Indicates whether the cluster is a serverless cluster. <strong>AgileServerless</strong> indicates a serverless cluster. No value is returned for a common cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>AgileServerless</p>
         */
        @NameInMap("ServerlessType")
        public String serverlessType;

        /**
         * <p>The storage billing method of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>Postpaid</strong>: pay-as-you-go</li>
         * <li><strong>Prepaid</strong>: subscription</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prepaid</p>
         */
        @NameInMap("StoragePayType")
        public String storagePayType;

        /**
         * <p>The storage that is billed based on the subscription billing method. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("StorageSpace")
        public Long storageSpace;

        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>The used storage. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>3009413120</p>
         */
        @NameInMap("StorageUsed")
        public Long storageUsed;

        /**
         * <p>Indicates whether multi-zone data consistency is enabled for the cluster. Valid values:</p>
         * <ul>
         * <li><strong>ON</strong>: Multi-zone data consistency is enabled. For Standard Edition clusters of Multi-zone Edition, this value is returned.</li>
         * <li><strong>OFF</strong>: Multi-zone data consistency is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("StrictConsistency")
        public String strictConsistency;

        /**
         * <p>The specification type of the compute node. Valid values:</p>
         * <ul>
         * <li><strong>Exclusive</strong>: dedicated.</li>
         * <li><strong>General</strong>: general-purpose.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Exclusive</p>
         */
        @NameInMap("SubCategory")
        public String subCategory;

        /**
         * <p>The information about the tags.</p>
         */
        @NameInMap("Tags")
        public DescribeDBClustersResponseBodyItemsDBClusterTags tags;

        /**
         * <p>The virtual private cloud (VPC) ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-****************</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The vSwitch ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-***************</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        /**
         * <p>The zone ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
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

        public DescribeDBClustersResponseBodyItemsDBCluster setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
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
