// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterMigrationResponseBody extends TeaModel {
    /**
     * <p>The description of a migration exception. If no exception occurs during the migration, an empty string is returned.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The endpoints of the PolarDB cluster.</p>
     */
    @NameInMap("DBClusterEndpointList")
    public java.util.List<DescribeDBClusterMigrationResponseBodyDBClusterEndpointList> DBClusterEndpointList;

    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The mode of the PolarDB cluster. Valid values:</p>
     * <br>
     * <p>*   **rw**: read and write mode</p>
     * <p>*   **ro**: read-only mode</p>
     */
    @NameInMap("DBClusterReadWriteMode")
    public String DBClusterReadWriteMode;

    /**
     * <p>The replication latency between the ApsaraDB RDS instance and the PolarDB cluster. Unit: seconds.</p>
     */
    @NameInMap("DelayedSeconds")
    public Integer delayedSeconds;

    /**
     * <p>The ID of the synchronous task.</p>
     */
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    /**
     * <p>The expiration time of the replication between ApsaraDB RDS and PolarDB. The time is in the `YYYY-MM-DDThh:mm:ssZ` format. The time is displayed in UTC.</p>
     */
    @NameInMap("ExpiredTime")
    public String expiredTime;

    /**
     * <p>The migration state of the PolarDB cluster. Valid values:</p>
     * <br>
     * <p>*   **NO_MIGRATION**: No migration task is running.</p>
     * <p>*   **RDS2POLARDB_CLONING**: Data is being replicated.</p>
     * <p>*   **RDS2POLARDB_SYNCING**: Data is being replicated. During the replication, the PolarDB cluster is running in read-only mode and the source ApsaraDB RDS instance is running in read and write mode.</p>
     * <p>*   **SWITCHING**: Databases are being switched.</p>
     * <p>*   **POLARDB2RDS_SYNCING**: Databases are switched. The PolarDB cluster is running in read and write mode and the source ApsaraDB RDS instance is running in read-only mode. In this state, you can modify the endpoints for your applications.</p>
     * <p>*   **ROLLBACK**: The migration is being rolled back. After the rollback is complete, the value **RDS2POLARDB_SYNCING** is returned.</p>
     * <p>*   **CLOSING_MIGRATION**: The migration task is being terminated.</p>
     */
    @NameInMap("MigrationStatus")
    public String migrationStatus;

    /**
     * <p>The endpoints of the ApsaraDB RDS instance.</p>
     */
    @NameInMap("RdsEndpointList")
    public java.util.List<DescribeDBClusterMigrationResponseBodyRdsEndpointList> rdsEndpointList;

    /**
     * <p>The mode of the source ApsaraDB RDS instance. Valid values:</p>
     * <br>
     * <p>*   **rw**: read and write mode</p>
     * <p>*   **ro**: read-only mode</p>
     */
    @NameInMap("RdsReadWriteMode")
    public String rdsReadWriteMode;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the source ApsaraDB RDS instance.</p>
     */
    @NameInMap("SourceRDSDBInstanceId")
    public String sourceRDSDBInstanceId;

    /**
     * <p>The type of the source database. Valid values:</p>
     * <br>
     * <p>*   **PolarDBMySQL**: The source database is a PolarDB for MySQL database when the major version of your PolarDB cluster is upgraded.</p>
     * <p>*   **RDS**: The source database is an ApsaraDB RDS database when data is migrated from ApsaraDB RDS to PolarDB for MySQL.</p>
     */
    @NameInMap("SrcDbType")
    public String srcDbType;

    /**
     * <p>The synchronization direction. Valid values:</p>
     * <br>
     * <p>*   **RDS2POLARDB**: Data is replicated from an ApsaraDB RDS instance to a PolarDB cluster.</p>
     * <p>*   **POLARDB2RDS**: Data is replicated from a PolarDB cluster to an ApsaraDB RDS instance.</p>
     */
    @NameInMap("Topologies")
    public String topologies;

    public static DescribeDBClusterMigrationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterMigrationResponseBody self = new DescribeDBClusterMigrationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterMigrationResponseBody setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public DescribeDBClusterMigrationResponseBody setDBClusterEndpointList(java.util.List<DescribeDBClusterMigrationResponseBodyDBClusterEndpointList> DBClusterEndpointList) {
        this.DBClusterEndpointList = DBClusterEndpointList;
        return this;
    }
    public java.util.List<DescribeDBClusterMigrationResponseBodyDBClusterEndpointList> getDBClusterEndpointList() {
        return this.DBClusterEndpointList;
    }

    public DescribeDBClusterMigrationResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDBClusterMigrationResponseBody setDBClusterReadWriteMode(String DBClusterReadWriteMode) {
        this.DBClusterReadWriteMode = DBClusterReadWriteMode;
        return this;
    }
    public String getDBClusterReadWriteMode() {
        return this.DBClusterReadWriteMode;
    }

    public DescribeDBClusterMigrationResponseBody setDelayedSeconds(Integer delayedSeconds) {
        this.delayedSeconds = delayedSeconds;
        return this;
    }
    public Integer getDelayedSeconds() {
        return this.delayedSeconds;
    }

    public DescribeDBClusterMigrationResponseBody setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    public DescribeDBClusterMigrationResponseBody setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public DescribeDBClusterMigrationResponseBody setMigrationStatus(String migrationStatus) {
        this.migrationStatus = migrationStatus;
        return this;
    }
    public String getMigrationStatus() {
        return this.migrationStatus;
    }

    public DescribeDBClusterMigrationResponseBody setRdsEndpointList(java.util.List<DescribeDBClusterMigrationResponseBodyRdsEndpointList> rdsEndpointList) {
        this.rdsEndpointList = rdsEndpointList;
        return this;
    }
    public java.util.List<DescribeDBClusterMigrationResponseBodyRdsEndpointList> getRdsEndpointList() {
        return this.rdsEndpointList;
    }

    public DescribeDBClusterMigrationResponseBody setRdsReadWriteMode(String rdsReadWriteMode) {
        this.rdsReadWriteMode = rdsReadWriteMode;
        return this;
    }
    public String getRdsReadWriteMode() {
        return this.rdsReadWriteMode;
    }

    public DescribeDBClusterMigrationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClusterMigrationResponseBody setSourceRDSDBInstanceId(String sourceRDSDBInstanceId) {
        this.sourceRDSDBInstanceId = sourceRDSDBInstanceId;
        return this;
    }
    public String getSourceRDSDBInstanceId() {
        return this.sourceRDSDBInstanceId;
    }

    public DescribeDBClusterMigrationResponseBody setSrcDbType(String srcDbType) {
        this.srcDbType = srcDbType;
        return this;
    }
    public String getSrcDbType() {
        return this.srcDbType;
    }

    public DescribeDBClusterMigrationResponseBody setTopologies(String topologies) {
        this.topologies = topologies;
        return this;
    }
    public String getTopologies() {
        return this.topologies;
    }

    public static class DescribeDBClusterMigrationResponseBodyDBClusterEndpointListAddressItems extends TeaModel {
        /**
         * <p>The connection string.</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The IP address of the endpoint.</p>
         */
        @NameInMap("IPAddress")
        public String IPAddress;

        /**
         * <p>The network type of the endpoint. Valid values:</p>
         * <br>
         * <p>*   **Public**: the public endpoint</p>
         * <p>*   **Private**: the internal endpoint (VPC)</p>
         * <p>*   **Inner**: the internal endpoint (classic network)</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <p>The port number.</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>Indicates whether SSL encryption is enabled. Valid values:</p>
         * <br>
         * <p>*   **Enabled**</p>
         * <p>*   **Disabled**</p>
         */
        @NameInMap("SSLEnabled")
        public String SSLEnabled;

        /**
         * <p>The VPC ID.</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <p>The vSwitch ID.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static DescribeDBClusterMigrationResponseBodyDBClusterEndpointListAddressItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterMigrationResponseBodyDBClusterEndpointListAddressItems self = new DescribeDBClusterMigrationResponseBodyDBClusterEndpointListAddressItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterMigrationResponseBodyDBClusterEndpointListAddressItems setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBClusterMigrationResponseBodyDBClusterEndpointListAddressItems setIPAddress(String IPAddress) {
            this.IPAddress = IPAddress;
            return this;
        }
        public String getIPAddress() {
            return this.IPAddress;
        }

        public DescribeDBClusterMigrationResponseBodyDBClusterEndpointListAddressItems setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public DescribeDBClusterMigrationResponseBodyDBClusterEndpointListAddressItems setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDBClusterMigrationResponseBodyDBClusterEndpointListAddressItems setSSLEnabled(String SSLEnabled) {
            this.SSLEnabled = SSLEnabled;
            return this;
        }
        public String getSSLEnabled() {
            return this.SSLEnabled;
        }

        public DescribeDBClusterMigrationResponseBodyDBClusterEndpointListAddressItems setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDBClusterMigrationResponseBodyDBClusterEndpointListAddressItems setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeDBClusterMigrationResponseBodyDBClusterEndpointList extends TeaModel {
        /**
         * <p>Details about the endpoints.</p>
         */
        @NameInMap("AddressItems")
        public java.util.List<DescribeDBClusterMigrationResponseBodyDBClusterEndpointListAddressItems> addressItems;

        /**
         * <p>The ID of the endpoint.</p>
         */
        @NameInMap("DBEndpointId")
        public String DBEndpointId;

        /**
         * <p>The type of the endpoint. Valid values:</p>
         * <br>
         * <p>*   **Cluster**: the default cluster endpoint</p>
         * <p>*   **Primary**: the primary endpoint</p>
         * <p>*   **Custom**: the custom cluster endpoint</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        @NameInMap("ReadWriteMode")
        public String readWriteMode;

        public static DescribeDBClusterMigrationResponseBodyDBClusterEndpointList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterMigrationResponseBodyDBClusterEndpointList self = new DescribeDBClusterMigrationResponseBodyDBClusterEndpointList();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterMigrationResponseBodyDBClusterEndpointList setAddressItems(java.util.List<DescribeDBClusterMigrationResponseBodyDBClusterEndpointListAddressItems> addressItems) {
            this.addressItems = addressItems;
            return this;
        }
        public java.util.List<DescribeDBClusterMigrationResponseBodyDBClusterEndpointListAddressItems> getAddressItems() {
            return this.addressItems;
        }

        public DescribeDBClusterMigrationResponseBodyDBClusterEndpointList setDBEndpointId(String DBEndpointId) {
            this.DBEndpointId = DBEndpointId;
            return this;
        }
        public String getDBEndpointId() {
            return this.DBEndpointId;
        }

        public DescribeDBClusterMigrationResponseBodyDBClusterEndpointList setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public DescribeDBClusterMigrationResponseBodyDBClusterEndpointList setReadWriteMode(String readWriteMode) {
            this.readWriteMode = readWriteMode;
            return this;
        }
        public String getReadWriteMode() {
            return this.readWriteMode;
        }

    }

    public static class DescribeDBClusterMigrationResponseBodyRdsEndpointListAddressItems extends TeaModel {
        /**
         * <p>The connection string.</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The IP address of the endpoint.</p>
         */
        @NameInMap("IPAddress")
        public String IPAddress;

        /**
         * <p>The network type of the endpoint. Valid values:</p>
         * <br>
         * <p>*   **Public**: the public endpoint</p>
         * <p>*   **Private**: the internal endpoint (VPC)</p>
         * <p>*   **Inner**: the internal endpoint (classic network)</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <p>The port number.</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>Indicates whether SSL encryption is enabled. Valid values:</p>
         * <br>
         * <p>*   **Enabled**</p>
         * <p>*   **Disabled**</p>
         */
        @NameInMap("SSLEnabled")
        public String SSLEnabled;

        /**
         * <p>The VPC ID.</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <p>The vSwitch ID.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static DescribeDBClusterMigrationResponseBodyRdsEndpointListAddressItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterMigrationResponseBodyRdsEndpointListAddressItems self = new DescribeDBClusterMigrationResponseBodyRdsEndpointListAddressItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterMigrationResponseBodyRdsEndpointListAddressItems setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBClusterMigrationResponseBodyRdsEndpointListAddressItems setIPAddress(String IPAddress) {
            this.IPAddress = IPAddress;
            return this;
        }
        public String getIPAddress() {
            return this.IPAddress;
        }

        public DescribeDBClusterMigrationResponseBodyRdsEndpointListAddressItems setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public DescribeDBClusterMigrationResponseBodyRdsEndpointListAddressItems setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDBClusterMigrationResponseBodyRdsEndpointListAddressItems setSSLEnabled(String SSLEnabled) {
            this.SSLEnabled = SSLEnabled;
            return this;
        }
        public String getSSLEnabled() {
            return this.SSLEnabled;
        }

        public DescribeDBClusterMigrationResponseBodyRdsEndpointListAddressItems setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDBClusterMigrationResponseBodyRdsEndpointListAddressItems setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeDBClusterMigrationResponseBodyRdsEndpointList extends TeaModel {
        /**
         * <p>Details about the endpoints.</p>
         */
        @NameInMap("AddressItems")
        public java.util.List<DescribeDBClusterMigrationResponseBodyRdsEndpointListAddressItems> addressItems;

        @NameInMap("CustinsType")
        public String custinsType;

        /**
         * <p>The ID of the endpoint.</p>
         */
        @NameInMap("DBEndpointId")
        public String DBEndpointId;

        /**
         * <p>The type of the endpoint. Valid values:</p>
         * <br>
         * <p>*   **Normal**: the standard endpoint</p>
         * <p>*   **ReadWriteSplitting**: the read/write splitting endpoint</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        public static DescribeDBClusterMigrationResponseBodyRdsEndpointList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterMigrationResponseBodyRdsEndpointList self = new DescribeDBClusterMigrationResponseBodyRdsEndpointList();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterMigrationResponseBodyRdsEndpointList setAddressItems(java.util.List<DescribeDBClusterMigrationResponseBodyRdsEndpointListAddressItems> addressItems) {
            this.addressItems = addressItems;
            return this;
        }
        public java.util.List<DescribeDBClusterMigrationResponseBodyRdsEndpointListAddressItems> getAddressItems() {
            return this.addressItems;
        }

        public DescribeDBClusterMigrationResponseBodyRdsEndpointList setCustinsType(String custinsType) {
            this.custinsType = custinsType;
            return this;
        }
        public String getCustinsType() {
            return this.custinsType;
        }

        public DescribeDBClusterMigrationResponseBodyRdsEndpointList setDBEndpointId(String DBEndpointId) {
            this.DBEndpointId = DBEndpointId;
            return this;
        }
        public String getDBEndpointId() {
            return this.DBEndpointId;
        }

        public DescribeDBClusterMigrationResponseBodyRdsEndpointList setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

    }

}
