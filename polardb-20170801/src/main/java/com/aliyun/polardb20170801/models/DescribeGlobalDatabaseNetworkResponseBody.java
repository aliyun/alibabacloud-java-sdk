// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeGlobalDatabaseNetworkResponseBody extends TeaModel {
    /**
     * <p>The connection information.</p>
     */
    @NameInMap("Connections")
    public java.util.List<DescribeGlobalDatabaseNetworkResponseBodyConnections> connections;

    /**
     * <p>The time when the GDN was created.</p>
     * <p>The time is in the ISO 8601 format in UTC (format: YYYY-MM-DDTHH:mm:ssZ).</p>
     * 
     * <strong>example:</strong>
     * <p>2020-02-24T11:57:54Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-bp1s826a1up******</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The clusters in the GDN.</p>
     */
    @NameInMap("DBClusters")
    public java.util.List<DescribeGlobalDatabaseNetworkResponseBodyDBClusters> DBClusters;

    /**
     * <p>The database engine type. Currently, only MySQL is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DBType")
    public String DBType;

    /**
     * <p>The database engine version. Currently, only version 8.0 is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>8.0</p>
     */
    @NameInMap("DBVersion")
    public String DBVersion;

    /**
     * <p>The description of the GDN. The description must meet the following requirements:</p>
     * <ul>
     * <li><p>It cannot start with http:// or https://.</p>
     * </li>
     * <li><p>It must start with an uppercase letter, a lowercase letter, or a Chinese character.</p>
     * </li>
     * <li><p>It can contain uppercase letters, lowercase letters, Chinese characters, digits, underscores (_), or hyphens (-).</p>
     * </li>
     * <li><p>It must be 2 to 126 characters in length.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GDN-fortest</p>
     */
    @NameInMap("GDNDescription")
    public String GDNDescription;

    /**
     * <p>GDN ID。</p>
     * 
     * <strong>example:</strong>
     * <p>gdn-bp1fttxsrmv*****</p>
     */
    @NameInMap("GDNId")
    public String GDNId;

    /**
     * <p>The status of the GDN. Valid values:</p>
     * <ul>
     * <li><p><strong>creating</strong>: Being created.</p>
     * </li>
     * <li><p><strong>active</strong>: Running.</p>
     * </li>
     * <li><p><strong>deleting</strong>: Being deleted.</p>
     * </li>
     * <li><p><strong>locked</strong>: Locked. No operations can be performed on any cluster in the GDN.</p>
     * </li>
     * <li><p><strong>removing_member</strong>: A cluster is being removed from the GDN.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("GDNStatus")
    public String GDNStatus;

    /**
     * <p>The global domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>[gdnid].gdn.rds.aliyuncs.com</p>
     */
    @NameInMap("GlobalDomainName")
    public String globalDomainName;

    /**
     * <p>The property labels.</p>
     */
    @NameInMap("Labels")
    public DescribeGlobalDatabaseNetworkResponseBodyLabels labels;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>67F2E75F-AE67-4FB2-821F-A81237EACD15</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-************</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeGlobalDatabaseNetworkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalDatabaseNetworkResponseBody self = new DescribeGlobalDatabaseNetworkResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGlobalDatabaseNetworkResponseBody setConnections(java.util.List<DescribeGlobalDatabaseNetworkResponseBodyConnections> connections) {
        this.connections = connections;
        return this;
    }
    public java.util.List<DescribeGlobalDatabaseNetworkResponseBodyConnections> getConnections() {
        return this.connections;
    }

    public DescribeGlobalDatabaseNetworkResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeGlobalDatabaseNetworkResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeGlobalDatabaseNetworkResponseBody setDBClusters(java.util.List<DescribeGlobalDatabaseNetworkResponseBodyDBClusters> DBClusters) {
        this.DBClusters = DBClusters;
        return this;
    }
    public java.util.List<DescribeGlobalDatabaseNetworkResponseBodyDBClusters> getDBClusters() {
        return this.DBClusters;
    }

    public DescribeGlobalDatabaseNetworkResponseBody setDBType(String DBType) {
        this.DBType = DBType;
        return this;
    }
    public String getDBType() {
        return this.DBType;
    }

    public DescribeGlobalDatabaseNetworkResponseBody setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
        return this;
    }
    public String getDBVersion() {
        return this.DBVersion;
    }

    public DescribeGlobalDatabaseNetworkResponseBody setGDNDescription(String GDNDescription) {
        this.GDNDescription = GDNDescription;
        return this;
    }
    public String getGDNDescription() {
        return this.GDNDescription;
    }

    public DescribeGlobalDatabaseNetworkResponseBody setGDNId(String GDNId) {
        this.GDNId = GDNId;
        return this;
    }
    public String getGDNId() {
        return this.GDNId;
    }

    public DescribeGlobalDatabaseNetworkResponseBody setGDNStatus(String GDNStatus) {
        this.GDNStatus = GDNStatus;
        return this;
    }
    public String getGDNStatus() {
        return this.GDNStatus;
    }

    public DescribeGlobalDatabaseNetworkResponseBody setGlobalDomainName(String globalDomainName) {
        this.globalDomainName = globalDomainName;
        return this;
    }
    public String getGlobalDomainName() {
        return this.globalDomainName;
    }

    public DescribeGlobalDatabaseNetworkResponseBody setLabels(DescribeGlobalDatabaseNetworkResponseBodyLabels labels) {
        this.labels = labels;
        return this;
    }
    public DescribeGlobalDatabaseNetworkResponseBodyLabels getLabels() {
        return this.labels;
    }

    public DescribeGlobalDatabaseNetworkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGlobalDatabaseNetworkResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static class DescribeGlobalDatabaseNetworkResponseBodyConnections extends TeaModel {
        /**
         * <p>The connection string.</p>
         * 
         * <strong>example:</strong>
         * <p>abc.polardb.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The network type.</p>
         * 
         * <strong>example:</strong>
         * <p>Private</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <p>The port number of the connection string.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        public static DescribeGlobalDatabaseNetworkResponseBodyConnections build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalDatabaseNetworkResponseBodyConnections self = new DescribeGlobalDatabaseNetworkResponseBodyConnections();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalDatabaseNetworkResponseBodyConnections setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeGlobalDatabaseNetworkResponseBodyConnections setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public DescribeGlobalDatabaseNetworkResponseBodyConnections setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class DescribeGlobalDatabaseNetworkResponseBodyDBClustersDBNodes extends TeaModel {
        /**
         * <p>The time when the database node was created.</p>
         * <p>The time is in the ISO 8601 format in UTC (format: YYYY-MM-DDTHH:mm:ssZ).</p>
         * 
         * <strong>example:</strong>
         * <p>2020-03-23T21:35:43Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The node specifications of the database node.</p>
         * 
         * <strong>example:</strong>
         * <p>polar.mysql.x4.large</p>
         */
        @NameInMap("DBNodeClass")
        public String DBNodeClass;

        /**
         * <p>The database node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pi-****************</p>
         */
        @NameInMap("DBNodeId")
        public String DBNodeId;

        /**
         * <p>The role of the database node. Valid values:</p>
         * <ul>
         * <li><p><strong>Writer</strong>: primary node</p>
         * </li>
         * <li><p><strong>Reader</strong>: read-only node</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Reader</p>
         */
        @NameInMap("DBNodeRole")
        public String DBNodeRole;

        /**
         * <p>The status of the node. Valid values:</p>
         * <ul>
         * <li><p><strong>Creating</strong>: Being created.</p>
         * </li>
         * <li><p><strong>Running</strong>: Running.</p>
         * </li>
         * <li><p><strong>Deleting</strong>: Being deleted.</p>
         * </li>
         * <li><p><strong>Rebooting</strong>: Being restarted.</p>
         * </li>
         * <li><p><strong>ClassChanging</strong>: The node specifications are being changed.</p>
         * </li>
         * <li><p><strong>NetAddressCreating</strong>: Network connectivity is being created.</p>
         * </li>
         * <li><p><strong>NetAddressDeleting</strong>: Network connectivity is being deleted.</p>
         * </li>
         * <li><p><strong>NetAddressModifying</strong>: Network connectivity is being modified.</p>
         * </li>
         * <li><p><strong>MinorVersionUpgrading</strong>: A minor engine version upgrade is in progress.</p>
         * </li>
         * <li><p><strong>Maintaining</strong>: The cluster is under maintenance.</p>
         * </li>
         * <li><p><strong>Switching</strong>: A failover is in progress.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DBNodeStatus")
        public String DBNodeStatus;

        /**
         * <p>The failover priority. Each node has a failover priority that determines the likelihood of the node being elected as the primary node during a failover. A higher value indicates a higher priority. Valid values: 1 to 15.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FailoverPriority")
        public Integer failoverPriority;

        /**
         * <p>The maximum number of concurrent connections to the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>8000</p>
         */
        @NameInMap("MaxConnections")
        public Integer maxConnections;

        /**
         * <p>The maximum number of I/O requests per second (IOPS).</p>
         * 
         * <strong>example:</strong>
         * <p>32000</p>
         */
        @NameInMap("MaxIOPS")
        public Integer maxIOPS;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeGlobalDatabaseNetworkResponseBodyDBClustersDBNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalDatabaseNetworkResponseBodyDBClustersDBNodes self = new DescribeGlobalDatabaseNetworkResponseBodyDBClustersDBNodes();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalDatabaseNetworkResponseBodyDBClustersDBNodes setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeGlobalDatabaseNetworkResponseBodyDBClustersDBNodes setDBNodeClass(String DBNodeClass) {
            this.DBNodeClass = DBNodeClass;
            return this;
        }
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        public DescribeGlobalDatabaseNetworkResponseBodyDBClustersDBNodes setDBNodeId(String DBNodeId) {
            this.DBNodeId = DBNodeId;
            return this;
        }
        public String getDBNodeId() {
            return this.DBNodeId;
        }

        public DescribeGlobalDatabaseNetworkResponseBodyDBClustersDBNodes setDBNodeRole(String DBNodeRole) {
            this.DBNodeRole = DBNodeRole;
            return this;
        }
        public String getDBNodeRole() {
            return this.DBNodeRole;
        }

        public DescribeGlobalDatabaseNetworkResponseBodyDBClustersDBNodes setDBNodeStatus(String DBNodeStatus) {
            this.DBNodeStatus = DBNodeStatus;
            return this;
        }
        public String getDBNodeStatus() {
            return this.DBNodeStatus;
        }

        public DescribeGlobalDatabaseNetworkResponseBodyDBClustersDBNodes setFailoverPriority(Integer failoverPriority) {
            this.failoverPriority = failoverPriority;
            return this;
        }
        public Integer getFailoverPriority() {
            return this.failoverPriority;
        }

        public DescribeGlobalDatabaseNetworkResponseBodyDBClustersDBNodes setMaxConnections(Integer maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        public DescribeGlobalDatabaseNetworkResponseBodyDBClustersDBNodes setMaxIOPS(Integer maxIOPS) {
            this.maxIOPS = maxIOPS;
            return this;
        }
        public Integer getMaxIOPS() {
            return this.maxIOPS;
        }

        public DescribeGlobalDatabaseNetworkResponseBodyDBClustersDBNodes setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeGlobalDatabaseNetworkResponseBodyDBClusters extends TeaModel {
        /**
         * <p>The edition of the product. Valid values:</p>
         * <p>Normal: Cluster Edition
         * Basic: Single Node Edition
         * Archive: PolarDB X-Engine Edition
         * NormalMultimaster: Multi-master Cluster Edition
         * SENormal: PolarDB for MySQL Standard Edition</p>
         * <blockquote>
         * <ul>
         * <li>PolarDB for PostgreSQL 11 does not support Single Node Edition.</li>
         * <li>PolarDB for MySQL 8.0, PolarDB for MySQL 5.7, and PolarDB for PostgreSQL 14 support PolarDB for MySQL Standard Edition.</li>
         * <li>PolarDB for MySQL 8.0 supports PolarDB X-Engine Edition and Multi-master Cluster Edition.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The cluster description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DBClusterDescription")
        public String DBClusterDescription;

        /**
         * <p>The cluster ID in the GDN.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-wz9fb5nn44u1d****</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The status of the cluster in the GDN. For more information, see <a href="https://help.aliyun.com/document_detail/99286.html">Cluster status table</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DBClusterStatus")
        public String DBClusterStatus;

        /**
         * <p>The node specifications of the database node.</p>
         * 
         * <strong>example:</strong>
         * <p>polar.mysql.x4.large</p>
         */
        @NameInMap("DBNodeClass")
        public String DBNodeClass;

        /**
         * <p>The details of the database nodes.</p>
         */
        @NameInMap("DBNodes")
        public java.util.List<DescribeGlobalDatabaseNetworkResponseBodyDBClustersDBNodes> DBNodes;

        /**
         * <p>The database engine type. Currently, only MySQL is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("DBType")
        public String DBType;

        /**
         * <p>The database engine version. Currently, only version 8.0 is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>8.0</p>
         */
        @NameInMap("DBVersion")
        public String DBVersion;

        /**
         * <p>The expiration time of the cluster.</p>
         * <blockquote>
         * <p>This parameter is returned only for clusters whose billing method is <strong>Prepaid</strong> (subscription). An empty value is returned for <strong>Postpaid</strong> (pay-as-you-go) clusters.</p>
         * </blockquote>
         * <p>The time is in the ISO 8601 format in UTC (format: YYYY-MM-DDTHH:mm:ssZ).</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-14T16:00:00Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>Indicates whether the cluster has expired. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong></p>
         * </li>
         * <li><p><strong>false</strong></p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is returned only for clusters whose billing method is <strong>Prepaid</strong> (subscription).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Expired")
        public String expired;

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li><p><strong>Postpaid</strong>: pay-as-you-go.</p>
         * </li>
         * <li><p><strong>Prepaid</strong>: subscription.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prepaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The cross-region replication delay between the primary and secondary clusters. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReplicaLag")
        public String replicaLag;

        /**
         * <p>The role of the cluster. Valid values:</p>
         * <ul>
         * <li><p><strong>primary</strong>: primary cluster</p>
         * </li>
         * <li><p><strong>standby</strong>: secondary cluster</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>A GDN contains one primary cluster and up to four secondary clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>primary</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The serverless type. The value is fixed as AgileServerless.</p>
         * <blockquote>
         * <p>This parameter is supported only for serverless clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>AgileServerless</p>
         */
        @NameInMap("ServerlessType")
        public String serverlessType;

        /**
         * <p>The storage usage. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>3012558848</p>
         */
        @NameInMap("StorageUsed")
        public String storageUsed;

        public static DescribeGlobalDatabaseNetworkResponseBodyDBClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalDatabaseNetworkResponseBodyDBClusters self = new DescribeGlobalDatabaseNetworkResponseBodyDBClusters();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalDatabaseNetworkResponseBodyDBClusters setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeGlobalDatabaseNetworkResponseBodyDBClusters setDBClusterDescription(String DBClusterDescription) {
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }
        public String getDBClusterDescription() {
            return this.DBClusterDescription;
        }

        public DescribeGlobalDatabaseNetworkResponseBodyDBClusters setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeGlobalDatabaseNetworkResponseBodyDBClusters setDBClusterStatus(String DBClusterStatus) {
            this.DBClusterStatus = DBClusterStatus;
            return this;
        }
        public String getDBClusterStatus() {
            return this.DBClusterStatus;
        }

        public DescribeGlobalDatabaseNetworkResponseBodyDBClusters setDBNodeClass(String DBNodeClass) {
            this.DBNodeClass = DBNodeClass;
            return this;
        }
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        public DescribeGlobalDatabaseNetworkResponseBodyDBClusters setDBNodes(java.util.List<DescribeGlobalDatabaseNetworkResponseBodyDBClustersDBNodes> DBNodes) {
            this.DBNodes = DBNodes;
            return this;
        }
        public java.util.List<DescribeGlobalDatabaseNetworkResponseBodyDBClustersDBNodes> getDBNodes() {
            return this.DBNodes;
        }

        public DescribeGlobalDatabaseNetworkResponseBodyDBClusters setDBType(String DBType) {
            this.DBType = DBType;
            return this;
        }
        public String getDBType() {
            return this.DBType;
        }

        public DescribeGlobalDatabaseNetworkResponseBodyDBClusters setDBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }
        public String getDBVersion() {
            return this.DBVersion;
        }

        public DescribeGlobalDatabaseNetworkResponseBodyDBClusters setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeGlobalDatabaseNetworkResponseBodyDBClusters setExpired(String expired) {
            this.expired = expired;
            return this;
        }
        public String getExpired() {
            return this.expired;
        }

        public DescribeGlobalDatabaseNetworkResponseBodyDBClusters setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeGlobalDatabaseNetworkResponseBodyDBClusters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeGlobalDatabaseNetworkResponseBodyDBClusters setReplicaLag(String replicaLag) {
            this.replicaLag = replicaLag;
            return this;
        }
        public String getReplicaLag() {
            return this.replicaLag;
        }

        public DescribeGlobalDatabaseNetworkResponseBodyDBClusters setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeGlobalDatabaseNetworkResponseBodyDBClusters setServerlessType(String serverlessType) {
            this.serverlessType = serverlessType;
            return this;
        }
        public String getServerlessType() {
            return this.serverlessType;
        }

        public DescribeGlobalDatabaseNetworkResponseBodyDBClusters setStorageUsed(String storageUsed) {
            this.storageUsed = storageUsed;
            return this;
        }
        public String getStorageUsed() {
            return this.storageUsed;
        }

    }

    public static class DescribeGlobalDatabaseNetworkResponseBodyLabels extends TeaModel {
        /**
         * <p>The GDN version.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("GDNVersion")
        public String GDNVersion;

        public static DescribeGlobalDatabaseNetworkResponseBodyLabels build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalDatabaseNetworkResponseBodyLabels self = new DescribeGlobalDatabaseNetworkResponseBodyLabels();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalDatabaseNetworkResponseBodyLabels setGDNVersion(String GDNVersion) {
            this.GDNVersion = GDNVersion;
            return this;
        }
        public String getGDNVersion() {
            return this.GDNVersion;
        }

    }

}
