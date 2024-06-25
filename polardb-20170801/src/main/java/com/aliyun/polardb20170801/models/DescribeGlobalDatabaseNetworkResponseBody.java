// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeGlobalDatabaseNetworkResponseBody extends TeaModel {
    /**
     * <p>The information about the connection to the cluster.</p>
     */
    @NameInMap("Connections")
    public java.util.List<DescribeGlobalDatabaseNetworkResponseBodyConnections> connections;

    /**
     * <p>The time at which the GDN was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-02-24T11:57:54Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-bp1s826a1up******</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The clusters that are included in the GDN.</p>
     */
    @NameInMap("DBClusters")
    public java.util.List<DescribeGlobalDatabaseNetworkResponseBodyDBClusters> DBClusters;

    /**
     * <p>The type of the database engine. Only MySQL is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DBType")
    public String DBType;

    /**
     * <p>The version of the database engine. Only version 8.0 is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>8.0</p>
     */
    @NameInMap("DBVersion")
    public String DBVersion;

    /**
     * <p>The description of the GDN. The description must meet the following requirements:</p>
     * <ul>
     * <li>It cannot start with <code>http://</code> or <code>https://</code>.</li>
     * <li>It must start with a letter.</li>
     * <li>It can contain letters, digits, underscores (_), and hyphens (-).</li>
     * <li>It must be 2 to 126 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GDN-fortest</p>
     */
    @NameInMap("GDNDescription")
    public String GDNDescription;

    /**
     * <p>The ID of the GDN.</p>
     * 
     * <strong>example:</strong>
     * <p>gdn-bp1fttxsrmv*****</p>
     */
    @NameInMap("GDNId")
    public String GDNId;

    /**
     * <p>The status of the GDN. Valid values:</p>
     * <ul>
     * <li><strong>Creating</strong>: The GDN is being created.</li>
     * <li><strong>active</strong>: The GDN is running.</li>
     * <li><strong>deleting</strong>: The GDN is being deleted.</li>
     * <li><strong>locked</strong>: The GDN is locked. If the GDN is locked, you cannot perform operations on clusters in the GDN.</li>
     * <li><strong>removing_member</strong>: The secondary cluster is being removed from the GDN.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("GDNStatus")
    public String GDNStatus;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>67F2E75F-AE67-4FB2-821F-A81237EACD15</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group.</p>
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
         * <p>The URL of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>abc.polardb.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The network type of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>Private</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <p>The port number of the endpoint.</p>
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
         * <p>The time when the node was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-03-23T21:35:43Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The specifications of the node in the cluster.</p>
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
         * <li><strong>Writer</strong>: The node is the primary node.</li>
         * <li><strong>Reader</strong>: The node is a read-only node.</li>
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
         * <li><strong>Creating</strong>: The cluster is being created.</li>
         * <li><strong>Running</strong>: The cluster is running.</li>
         * <li><strong>Deleting</strong>: The cluster is being deleted.</li>
         * <li><strong>Rebooting</strong>: The cluster is restarting.</li>
         * <li><strong>DBNodeCreating</strong>: PolarProxy is being added.</li>
         * <li><strong>DBNodeDeleting</strong>: PolarProxy is being deleted.</li>
         * <li><strong>ClassChanging</strong>: The specifications of PolarProxy are being changed.</li>
         * <li><strong>NetAddressCreating</strong>: The network connection is being created.</li>
         * <li><strong>NetAddressDeleting</strong>: The network connection is being deleted.</li>
         * <li><strong>NetAddressModifying</strong>: The network connection is being modified.</li>
         * <li><strong>MinorVersionUpgrading</strong>: The minor version is being updated.</li>
         * <li><strong>Maintaining</strong>: The cluster is being maintained.</li>
         * <li><strong>Switching</strong>: A failover is being performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DBNodeStatus")
        public String DBNodeStatus;

        /**
         * <p>The priority of failover. Each node is assigned a failover priority. If a failover occurs, a node can be selected as the primary node based on the priority. A larger value indicates a higher priority. Valid values: 1 to 15.</p>
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
         * <p>The maximum input/output operations per second (IOPS).</p>
         * 
         * <strong>example:</strong>
         * <p>32000</p>
         */
        @NameInMap("MaxIOPS")
        public Integer maxIOPS;

        /**
         * <p>The zone ID of the cluster.</p>
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
         * <p>The description of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DBClusterDescription")
        public String DBClusterDescription;

        /**
         * <p>The ID of the cluster in the GDN.</p>
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
         * <p>The specifications of the node in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>polar.mysql.x4.large</p>
         */
        @NameInMap("DBNodeClass")
        public String DBNodeClass;

        /**
         * <p>The details of the node.</p>
         */
        @NameInMap("DBNodes")
        public java.util.List<DescribeGlobalDatabaseNetworkResponseBodyDBClustersDBNodes> DBNodes;

        /**
         * <p>The type of the database engine. Only MySQL is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("DBType")
        public String DBType;

        /**
         * <p>The version of the database engine. Only version 8.0 is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>8.0</p>
         */
        @NameInMap("DBVersion")
        public String DBVersion;

        /**
         * <p>The expiration time of the cluster.</p>
         * <blockquote>
         * <p>A specific value is returned only for subscription (<strong>Prepaid</strong>) clusters. For pay-as-you-go (<strong>Postpaid</strong>) clusters, an empty string is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2020-11-14T16:00:00Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>Indicates whether the cluster is expired. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p>This parameter is returned only for subscription (<strong>Prepaid</strong>) clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Expired")
        public String expired;

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
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The ID of the region in which the cluster resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The latency of cross-region data replication between the primary cluster and secondary clusters. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReplicaLag")
        public String replicaLag;

        /**
         * <p>The role of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>Primary</strong>: the primary cluster</li>
         * <li><strong>standby</strong>: the secondary cluster</li>
         * </ul>
         * <blockquote>
         * <p>A GDN consists of one primary cluster and up to four secondary clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>primary</p>
         */
        @NameInMap("Role")
        public String role;

        @NameInMap("ServerlessType")
        public String serverlessType;

        /**
         * <p>The storage space that is occupied by the cluster. Unit: bytes.</p>
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

}
