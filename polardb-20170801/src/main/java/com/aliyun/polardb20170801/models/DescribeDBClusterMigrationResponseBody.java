// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterMigrationResponseBody extends TeaModel {
    /**
     * <p>The comments on the migration exception. If no exception occurs during the migration, an empty value is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The details of the PolarDB endpoints.</p>
     */
    @NameInMap("DBClusterEndpointList")
    public java.util.List<DescribeDBClusterMigrationResponseBodyDBClusterEndpointList> DBClusterEndpointList;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The read/write mode of the cluster. Valid values:</p>
     * <ul>
     * <li><p><strong>rw</strong>: Read and write.</p>
     * </li>
     * <li><p><strong>ro</strong>: Read-only.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ro</p>
     */
    @NameInMap("DBClusterReadWriteMode")
    public String DBClusterReadWriteMode;

    /**
     * <p>The replication delay between the ApsaraDB RDS instance and the PolarDB cluster, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DelayedSeconds")
    public Integer delayedSeconds;

    /**
     * <p>The ID of the sync task.</p>
     * 
     * <strong>example:</strong>
     * <p>dts**********618bs</p>
     */
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    /**
     * <p>The time when the replication relationship between the ApsaraDB RDS instance and the PolarDB cluster expires. The time is in the <code>YYYY-MM-DDThh:mm:ssZ</code> format and is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-06-17T01:56:36Z</p>
     */
    @NameInMap("ExpiredTime")
    public String expiredTime;

    /**
     * <p>The migration status of the PolarDB cluster. Valid values:</p>
     * <ul>
     * <li><p><strong>NO_MIGRATION</strong>: No migration task is created.</p>
     * </li>
     * <li><p><strong>RDS2POLARDB_CLONING</strong>: Data is being cloned.</p>
     * </li>
     * <li><p><strong>RDS2POLARDB_SYNCING</strong>: Data is being synchronized. In this state, the PolarDB cluster is read-only, and the ApsaraDB RDS instance is read-write.</p>
     * </li>
     * <li><p><strong>SWITCHING</strong>: The database is being switched.</p>
     * </li>
     * <li><p><strong>POLARDB2RDS_SYNCING</strong>: The database switch is complete. In this state, the PolarDB cluster is read-write, and the ApsaraDB RDS instance is read-only. Change the endpoints in your application.</p>
     * </li>
     * <li><p><strong>ROLLBACK</strong>: The migration is being rolled back. After the rollback is complete, the migration status changes to <strong>RDS2POLARDB_SYNCING</strong>.</p>
     * </li>
     * <li><p><strong>CLOSING_MIGRATION</strong>: The migration task is being shut down.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RDS2POLARDB_SYNCING</p>
     */
    @NameInMap("MigrationStatus")
    public String migrationStatus;

    /**
     * <p>The details of the ApsaraDB RDS endpoints.</p>
     */
    @NameInMap("RdsEndpointList")
    public java.util.List<DescribeDBClusterMigrationResponseBodyRdsEndpointList> rdsEndpointList;

    /**
     * <p>The read/write mode of the source ApsaraDB RDS instance. Valid values:</p>
     * <ul>
     * <li><p><strong>rw</strong>: Read and write.</p>
     * </li>
     * <li><p><strong>ro</strong>: Read-only.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rw</p>
     */
    @NameInMap("RdsReadWriteMode")
    public String rdsReadWriteMode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F2A9EFA7-915F-4572-8299-85A307******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the source ApsaraDB RDS instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-************</p>
     */
    @NameInMap("SourceRDSDBInstanceId")
    public String sourceRDSDBInstanceId;

    /**
     * <p>The type of the source database. Valid values:</p>
     * <ul>
     * <li><p><strong>PolarDBMySQL</strong>: The source database for a major version upgrade of a PolarDB cluster.</p>
     * </li>
     * <li><p><strong>RDS</strong>: The source database for migrating data from an ApsaraDB RDS instance to a PolarDB for MySQL cluster.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PolarDBMySQL</p>
     */
    @NameInMap("SrcDbType")
    public String srcDbType;

    /**
     * <p>The data synchronization relationship. Valid values:</p>
     * <ul>
     * <li><p><strong>RDS2POLARDB</strong>: Data is synchronized from the ApsaraDB RDS instance to the PolarDB cluster.</p>
     * </li>
     * <li><p><strong>POLARDB2RDS</strong>: Data is synchronized from the PolarDB cluster to the ApsaraDB RDS instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RDS2POLARDB</p>
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
         * 
         * <strong>example:</strong>
         * <p>pc-**************.rwlb.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.<em><strong>.</strong></em>.10</p>
         */
        @NameInMap("IPAddress")
        public String IPAddress;

        /**
         * <p>The network type of the endpoint. Valid values:</p>
         * <ul>
         * <li><p><strong>Public</strong>: An endpoint for the Internet.</p>
         * </li>
         * <li><p><strong>Private</strong>: A private endpoint.</p>
         * </li>
         * <li><p><strong>Inner</strong>: A private endpoint in a classic network.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Private</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <p>The port.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>Indicates whether Secure Sockets Layer (SSL) encryption is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>Enabled</strong>: SSL encryption is enabled.</p>
         * </li>
         * <li><p><strong>Disabled</strong>: SSL encryption is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("SSLEnabled")
        public String SSLEnabled;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-**********</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <p>The ID of the virtual switch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-**********</p>
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
         * <p>The details of the connection strings.</p>
         */
        @NameInMap("AddressItems")
        public java.util.List<DescribeDBClusterMigrationResponseBodyDBClusterEndpointListAddressItems> addressItems;

        /**
         * <p>The endpoint ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pe-***********</p>
         */
        @NameInMap("DBEndpointId")
        public String DBEndpointId;

        /**
         * <p>The type of the endpoint. Valid values:</p>
         * <ul>
         * <li><p><strong>Cluster</strong>: The default cluster endpoint.</p>
         * </li>
         * <li><p><strong>Primary</strong>: The primary endpoint.</p>
         * </li>
         * <li><p><strong>Custom</strong>: A custom cluster endpoint.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Cluster</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        /**
         * <p>The read/write mode. Valid values:</p>
         * <ul>
         * <li><p>ReadWrite: Read and write (automatic read/write splitting).</p>
         * </li>
         * <li><p>ReadOnly (Default): Read-only.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ReadOnly</p>
         */
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
         * 
         * <strong>example:</strong>
         * <p>rm-***********.mysql.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>172.<em><strong>.</strong></em>.173</p>
         */
        @NameInMap("IPAddress")
        public String IPAddress;

        /**
         * <p>The network type of the endpoint. Valid values:</p>
         * <ul>
         * <li><p><strong>Public</strong>: An endpoint for the Internet.</p>
         * </li>
         * <li><p><strong>Private</strong>: A private endpoint.</p>
         * </li>
         * <li><p><strong>Inner</strong>: A private endpoint in a classic network.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Private</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <p>The port.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>Indicates whether SSL encryption is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>Enabled</strong>: SSL encryption is enabled.</p>
         * </li>
         * <li><p><strong>Disabled</strong>: SSL encryption is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("SSLEnabled")
        public String SSLEnabled;

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-************</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-**************</p>
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
         * <p>The details of the connection strings.</p>
         */
        @NameInMap("AddressItems")
        public java.util.List<DescribeDBClusterMigrationResponseBodyRdsEndpointListAddressItems> addressItems;

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ReadOnly
         * Maxscale
         * Primary</p>
         */
        @NameInMap("CustinsType")
        public String custinsType;

        /**
         * <p>The endpoint ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-************-normal</p>
         */
        @NameInMap("DBEndpointId")
        public String DBEndpointId;

        /**
         * <p>The type of the endpoint. Valid values:</p>
         * <ul>
         * <li><p><strong>Normal</strong>: A regular endpoint.</p>
         * </li>
         * <li><p><strong>ReadWriteSplitting</strong>: A read/write splitting endpoint.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
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
