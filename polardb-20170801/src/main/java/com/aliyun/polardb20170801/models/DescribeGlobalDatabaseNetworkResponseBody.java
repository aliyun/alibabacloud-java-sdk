// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeGlobalDatabaseNetworkResponseBody extends TeaModel {
    @NameInMap("GDNStatus")
    public String GDNStatus;

    @NameInMap("Connections")
    public java.util.List<DescribeGlobalDatabaseNetworkResponseBodyConnections> connections;

    @NameInMap("DBVersion")
    public String DBVersion;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("GDNId")
    public String GDNId;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("DBType")
    public String DBType;

    @NameInMap("GDNDescription")
    public String GDNDescription;

    @NameInMap("DBClusters")
    public java.util.List<DescribeGlobalDatabaseNetworkResponseBodyDBClusters> DBClusters;

    public static DescribeGlobalDatabaseNetworkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalDatabaseNetworkResponseBody self = new DescribeGlobalDatabaseNetworkResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGlobalDatabaseNetworkResponseBody setGDNStatus(String GDNStatus) {
        this.GDNStatus = GDNStatus;
        return this;
    }
    public String getGDNStatus() {
        return this.GDNStatus;
    }

    public DescribeGlobalDatabaseNetworkResponseBody setConnections(java.util.List<DescribeGlobalDatabaseNetworkResponseBodyConnections> connections) {
        this.connections = connections;
        return this;
    }
    public java.util.List<DescribeGlobalDatabaseNetworkResponseBodyConnections> getConnections() {
        return this.connections;
    }

    public DescribeGlobalDatabaseNetworkResponseBody setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
        return this;
    }
    public String getDBVersion() {
        return this.DBVersion;
    }

    public DescribeGlobalDatabaseNetworkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGlobalDatabaseNetworkResponseBody setGDNId(String GDNId) {
        this.GDNId = GDNId;
        return this;
    }
    public String getGDNId() {
        return this.GDNId;
    }

    public DescribeGlobalDatabaseNetworkResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeGlobalDatabaseNetworkResponseBody setDBType(String DBType) {
        this.DBType = DBType;
        return this;
    }
    public String getDBType() {
        return this.DBType;
    }

    public DescribeGlobalDatabaseNetworkResponseBody setGDNDescription(String GDNDescription) {
        this.GDNDescription = GDNDescription;
        return this;
    }
    public String getGDNDescription() {
        return this.GDNDescription;
    }

    public DescribeGlobalDatabaseNetworkResponseBody setDBClusters(java.util.List<DescribeGlobalDatabaseNetworkResponseBodyDBClusters> DBClusters) {
        this.DBClusters = DBClusters;
        return this;
    }
    public java.util.List<DescribeGlobalDatabaseNetworkResponseBodyDBClusters> getDBClusters() {
        return this.DBClusters;
    }

    public static class DescribeGlobalDatabaseNetworkResponseBodyConnections extends TeaModel {
        @NameInMap("ConnectionString")
        public String connectionString;

        @NameInMap("NetType")
        public String netType;

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

    public static class DescribeGlobalDatabaseNetworkResponseBodyDBClusters extends TeaModel {
        @NameInMap("ReplicaLag")
        public String replicaLag;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("Expired")
        public String expired;

        @NameInMap("DBNodeClass")
        public String DBNodeClass;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("DBType")
        public String DBType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("DBVersion")
        public String DBVersion;

        @NameInMap("DBClusterId")
        public String DBClusterId;

        @NameInMap("DBClusterStatus")
        public String DBClusterStatus;

        @NameInMap("StorageUsed")
        public String storageUsed;

        @NameInMap("DBClusterDescription")
        public String DBClusterDescription;

        @NameInMap("Role")
        public String role;

        public static DescribeGlobalDatabaseNetworkResponseBodyDBClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalDatabaseNetworkResponseBodyDBClusters self = new DescribeGlobalDatabaseNetworkResponseBodyDBClusters();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalDatabaseNetworkResponseBodyDBClusters setReplicaLag(String replicaLag) {
            this.replicaLag = replicaLag;
            return this;
        }
        public String getReplicaLag() {
            return this.replicaLag;
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

        public DescribeGlobalDatabaseNetworkResponseBodyDBClusters setDBNodeClass(String DBNodeClass) {
            this.DBNodeClass = DBNodeClass;
            return this;
        }
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        public DescribeGlobalDatabaseNetworkResponseBodyDBClusters setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeGlobalDatabaseNetworkResponseBodyDBClusters setDBType(String DBType) {
            this.DBType = DBType;
            return this;
        }
        public String getDBType() {
            return this.DBType;
        }

        public DescribeGlobalDatabaseNetworkResponseBodyDBClusters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeGlobalDatabaseNetworkResponseBodyDBClusters setDBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }
        public String getDBVersion() {
            return this.DBVersion;
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

        public DescribeGlobalDatabaseNetworkResponseBodyDBClusters setStorageUsed(String storageUsed) {
            this.storageUsed = storageUsed;
            return this;
        }
        public String getStorageUsed() {
            return this.storageUsed;
        }

        public DescribeGlobalDatabaseNetworkResponseBodyDBClusters setDBClusterDescription(String DBClusterDescription) {
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }
        public String getDBClusterDescription() {
            return this.DBClusterDescription;
        }

        public DescribeGlobalDatabaseNetworkResponseBodyDBClusters setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

}
