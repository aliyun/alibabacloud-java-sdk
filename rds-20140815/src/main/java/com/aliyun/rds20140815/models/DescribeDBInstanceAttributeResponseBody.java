// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceAttributeResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the details about the instance.</p>
     */
    @NameInMap("Items")
    public DescribeDBInstanceAttributeResponseBodyItems items;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceAttributeResponseBody self = new DescribeDBInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceAttributeResponseBody setItems(DescribeDBInstanceAttributeResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeDBInstanceAttributeResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeDBInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeBabelfishConfig extends TeaModel {
        /**
         * <p>The switch to enable or disable Babelfish.</p>
         * <br>
         * <p>>  If Babelfish is enabled when you purchase an ApsaraDB RDS for PostgreSQL instance, this parameter is fixed as **true**.</p>
         */
        @NameInMap("BabelfishEnabled")
        public String babelfishEnabled;

        /**
         * <p>The migration mode for Babelfish. Valid values:</p>
         * <br>
         * <p>*   **single-db**</p>
         * <p>*   **multi-db**</p>
         * <br>
         * <p>>  For more information about migration modes for Babelfish, see [Migration modes](~~428613~~).</p>
         */
        @NameInMap("MigrationMode")
        public String migrationMode;

        public static DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeBabelfishConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeBabelfishConfig self = new DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeBabelfishConfig();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeBabelfishConfig setBabelfishEnabled(String babelfishEnabled) {
            this.babelfishEnabled = babelfishEnabled;
            return this;
        }
        public String getBabelfishEnabled() {
            return this.babelfishEnabled;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeBabelfishConfig setMigrationMode(String migrationMode) {
            this.migrationMode = migrationMode;
            return this;
        }
        public String getMigrationMode() {
            return this.migrationMode;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeDBClusterNodesDBClusterNode extends TeaModel {
        /**
         * <p>The specification of the node.</p>
         */
        @NameInMap("ClassCode")
        public String classCode;

        /**
         * <p>Node specification type. Value range:</p>
         * <br>
         * <p>*   **d**: Exclusive specifications</p>
         * <p>*   **x**: General specifications</p>
         */
        @NameInMap("ClassType")
        public String classType;

        /**
         * <p>The number of vCPUs that you want to allocate to the elastic container instance. Unit: cores.</p>
         */
        @NameInMap("Cpu")
        public String cpu;

        /**
         * <p>The memory size that you applied for each instance. Unit: MB.</p>
         */
        @NameInMap("Memory")
        public String memory;

        /**
         * <p>The node ID.</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("NodeRegionId")
        public String nodeRegionId;

        /**
         * <p>The role of the node. Valid values:</p>
         * <br>
         * <p>*   **primary**: primary node</p>
         * <p>*   **secondary**: secondary node</p>
         */
        @NameInMap("NodeRole")
        public String nodeRole;

        /**
         * <p>The zone ID.</p>
         */
        @NameInMap("NodeZoneId")
        public String nodeZoneId;

        /**
         * <p>The status of the migration task. Valid values:</p>
         * <br>
         * <p>*   **NoStart**: The task has not started.</p>
         * <p>*   **Running**:The task is in progress.</p>
         * <p>*   **Success**: The task is successful.</p>
         * <p>*   **Failed**: The task failed.</p>
         * <p>*   **Waiting**: The task is waiting for an incremental backup file to be imported.</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeDBClusterNodesDBClusterNode build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeDBClusterNodesDBClusterNode self = new DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeDBClusterNodesDBClusterNode();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeDBClusterNodesDBClusterNode setClassCode(String classCode) {
            this.classCode = classCode;
            return this;
        }
        public String getClassCode() {
            return this.classCode;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeDBClusterNodesDBClusterNode setClassType(String classType) {
            this.classType = classType;
            return this;
        }
        public String getClassType() {
            return this.classType;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeDBClusterNodesDBClusterNode setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeDBClusterNodesDBClusterNode setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeDBClusterNodesDBClusterNode setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeDBClusterNodesDBClusterNode setNodeRegionId(String nodeRegionId) {
            this.nodeRegionId = nodeRegionId;
            return this;
        }
        public String getNodeRegionId() {
            return this.nodeRegionId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeDBClusterNodesDBClusterNode setNodeRole(String nodeRole) {
            this.nodeRole = nodeRole;
            return this;
        }
        public String getNodeRole() {
            return this.nodeRole;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeDBClusterNodesDBClusterNode setNodeZoneId(String nodeZoneId) {
            this.nodeZoneId = nodeZoneId;
            return this;
        }
        public String getNodeZoneId() {
            return this.nodeZoneId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeDBClusterNodesDBClusterNode setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeDBClusterNodes extends TeaModel {
        @NameInMap("DBClusterNode")
        public java.util.List<DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeDBClusterNodesDBClusterNode> DBClusterNode;

        public static DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeDBClusterNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeDBClusterNodes self = new DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeDBClusterNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeDBClusterNodes setDBClusterNode(java.util.List<DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeDBClusterNodesDBClusterNode> DBClusterNode) {
            this.DBClusterNode = DBClusterNode;
            return this;
        }
        public java.util.List<DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeDBClusterNodesDBClusterNode> getDBClusterNode() {
            return this.DBClusterNode;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeExtraDBInstanceIds extends TeaModel {
        @NameInMap("DBInstanceId")
        public java.util.List<String> DBInstanceId;

        public static DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeExtraDBInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeExtraDBInstanceIds self = new DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeExtraDBInstanceIds();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeExtraDBInstanceIds setDBInstanceId(java.util.List<String> DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public java.util.List<String> getDBInstanceId() {
            return this.DBInstanceId;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeExtra extends TeaModel {
        /**
         * <p>The IDs of the instances.</p>
         */
        @NameInMap("DBInstanceIds")
        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeExtraDBInstanceIds DBInstanceIds;

        public static DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeExtra build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeExtra self = new DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeExtra();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeExtra setDBInstanceIds(DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeExtraDBInstanceIds DBInstanceIds) {
            this.DBInstanceIds = DBInstanceIds;
            return this;
        }
        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeExtraDBInstanceIds getDBInstanceIds() {
            return this.DBInstanceIds;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeReadOnlyDBInstanceIdsReadOnlyDBInstanceId extends TeaModel {
        /**
         * <p>The ID of the read-only instance.</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        public static DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeReadOnlyDBInstanceIdsReadOnlyDBInstanceId build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeReadOnlyDBInstanceIdsReadOnlyDBInstanceId self = new DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeReadOnlyDBInstanceIdsReadOnlyDBInstanceId();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeReadOnlyDBInstanceIdsReadOnlyDBInstanceId setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeReadOnlyDBInstanceIds extends TeaModel {
        @NameInMap("ReadOnlyDBInstanceId")
        public java.util.List<DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeReadOnlyDBInstanceIdsReadOnlyDBInstanceId> readOnlyDBInstanceId;

        public static DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeReadOnlyDBInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeReadOnlyDBInstanceIds self = new DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeReadOnlyDBInstanceIds();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeReadOnlyDBInstanceIds setReadOnlyDBInstanceId(java.util.List<DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeReadOnlyDBInstanceIdsReadOnlyDBInstanceId> readOnlyDBInstanceId) {
            this.readOnlyDBInstanceId = readOnlyDBInstanceId;
            return this;
        }
        public java.util.List<DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeReadOnlyDBInstanceIdsReadOnlyDBInstanceId> getReadOnlyDBInstanceId() {
            return this.readOnlyDBInstanceId;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeServerlessConfig extends TeaModel {
        /**
         * <p>Indicates whether the automatic start and stop feature is enabled for the serverless instance. Valid values:</p>
         * <br>
         * <p>*   **true**: The feature is enabled.</p>
         * <p>*   **false** (default): The feature is disabled.</p>
         * <br>
         * <p>>  After the automatic suspension feature is enabled, if no connections to the instance are established within 10 minutes, the instance is suspended. After a connection to the instance is established, the instance is automatically resumed.</p>
         */
        @NameInMap("AutoPause")
        public Boolean autoPause;

        /**
         * <p>The maximum number of RCUs.</p>
         */
        @NameInMap("ScaleMax")
        public Double scaleMax;

        /**
         * <p>The minimum number of RDS Capacity Units (RCUs).</p>
         */
        @NameInMap("ScaleMin")
        public Double scaleMin;

        /**
         * <p>Indicates whether the forced scaling feature is enabled for the serverless instance.</p>
         * <br>
         * <p>*   **true**: The feature is enabled.</p>
         * <p>*   **false** (default): The feature is disabled.</p>
         * <br>
         * <p>>  In most cases, ApsaraDB RDS automatically scales in or out the RCUs of a serverless instance based on business requirements in real time. In rare cases, the scaling does not take effect in real time. You can enable the forced scaling feature to forcefully scales in or out the RCUs of the instance.</p>
         */
        @NameInMap("SwitchForce")
        public Boolean switchForce;

        public static DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeServerlessConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeServerlessConfig self = new DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeServerlessConfig();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeServerlessConfig setAutoPause(Boolean autoPause) {
            this.autoPause = autoPause;
            return this;
        }
        public Boolean getAutoPause() {
            return this.autoPause;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeServerlessConfig setScaleMax(Double scaleMax) {
            this.scaleMax = scaleMax;
            return this;
        }
        public Double getScaleMax() {
            return this.scaleMax;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeServerlessConfig setScaleMin(Double scaleMin) {
            this.scaleMin = scaleMin;
            return this;
        }
        public Double getScaleMin() {
            return this.scaleMin;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeServerlessConfig setSwitchForce(Boolean switchForce) {
            this.switchForce = switchForce;
            return this;
        }
        public Boolean getSwitchForce() {
            return this.switchForce;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeSlaveZonesSlaveZone extends TeaModel {
        /**
         * <p>The zone ID.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeSlaveZonesSlaveZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeSlaveZonesSlaveZone self = new DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeSlaveZonesSlaveZone();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeSlaveZonesSlaveZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeSlaveZones extends TeaModel {
        @NameInMap("SlaveZone")
        public java.util.List<DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeSlaveZonesSlaveZone> slaveZone;

        public static DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeSlaveZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeSlaveZones self = new DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeSlaveZones();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeSlaveZones setSlaveZone(java.util.List<DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeSlaveZonesSlaveZone> slaveZone) {
            this.slaveZone = slaveZone;
            return this;
        }
        public java.util.List<DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeSlaveZonesSlaveZone> getSlaveZone() {
            return this.slaveZone;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute extends TeaModel {
        /**
         * <p>The maximum number of accounts that can be created on the instance.</p>
         */
        @NameInMap("AccountMaxQuantity")
        public Integer accountMaxQuantity;

        /**
         * <p>The advanced features that are enabled for the instance. If multiple advanced features are enabled, the advanced features are separated by commas (,). This parameter is available only to instances that run **SQL Server**. Valid values:</p>
         * <br>
         * <p>*   **LinkedServer**</p>
         * <p>*   **DistributeTransaction**</p>
         */
        @NameInMap("AdvancedFeatures")
        public String advancedFeatures;

        /**
         * <p>The method that is used to update the minor engine version of the instance. Valid values:</p>
         * <br>
         * <p>*   **Auto:** automatic update.</p>
         * <p>*   **Manual**: manual update. The minor engine version of the instance is forcefully updated only when the in-use minor engine version is phased out.</p>
         */
        @NameInMap("AutoUpgradeMinorVersion")
        public String autoUpgradeMinorVersion;

        /**
         * <p>The availability status of the instance in percentage.</p>
         */
        @NameInMap("AvailabilityValue")
        public String availabilityValue;

        /**
         * <p>The configuration of the Babelfish feature for the ApsaraDB RDS for PostgreSQL instance.</p>
         * <br>
         * <p>>  This parameter is suitable only for ApsaraDB RDS for PostgreSQL instances for which Babelfish is enabled. For more information, see Introduction to Babelfish.[](~~428613~~)</p>
         */
        @NameInMap("BabelfishConfig")
        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeBabelfishConfig babelfishConfig;

        /**
         * <p>An invalid parameter. You can ignore this parameter.</p>
         */
        @NameInMap("BpeEnabled")
        public String bpeEnabled;

        /**
         * <p>An invalid parameter. You can ignore this parameter.</p>
         */
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <p>The RDS edition of the instance. Valid values:</p>
         * <br>
         * <p>*   **Basic**: RDS Basic Edition</p>
         * <p>*   **HighAvailability**: RDS High-availability Edition</p>
         * <p>*   **cluster**: RDS Cluster Edition for MySQL</p>
         * <p>*   **AlwaysOn**: RDS Cluster Edition for SQL Server</p>
         * <p>*   **Finance**: RDS Enterprise Edition</p>
         * <p>*   **Serverless_basic**: RDS Serverless Basic Edition</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The character set collation of the instance.</p>
         */
        @NameInMap("Collation")
        public String collation;

        /**
         * <p>The connection mode of the instance. Valid values:</p>
         * <br>
         * <p>*   **Standard**: standard mode</p>
         * <p>*   **Safe**: database proxy mode</p>
         */
        @NameInMap("ConnectionMode")
        public String connectionMode;

        /**
         * <p>The internal endpoint of the instance.</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The type of the proxy that is used by the instance. Valid values:</p>
         * <br>
         * <p>*   **1**: shared proxy</p>
         * <p>*   **2**: dedicated proxy</p>
         * <br>
         * <p>>  We recommend that you use the ProxyType parameter instead of this parameter.</p>
         */
        @NameInMap("ConsoleVersion")
        public String consoleVersion;

        /**
         * <p>The creation time. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The version of the database engine.</p>
         */
        @NameInMap("CurrentKernelVersion")
        public String currentKernelVersion;

        /**
         * <p>The information about the node in the cluster.</p>
         */
        @NameInMap("DBClusterNodes")
        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeDBClusterNodes DBClusterNodes;

        /**
         * <p>The number of CPU cores.</p>
         */
        @NameInMap("DBInstanceCPU")
        public String DBInstanceCPU;

        /**
         * <p>The instance type of the instance. For more information, see [Primary ApsaraDB RDS instance types](~~26312~~).</p>
         */
        @NameInMap("DBInstanceClass")
        public String DBInstanceClass;

        /**
         * <p>The instance family to which the instance belongs. Valid values:</p>
         * <br>
         * <p>*   **s**: shared instance family</p>
         * <p>*   **x**: general-purpose instance family</p>
         * <p>*   **d**: dedicated instance family</p>
         * <p>*   **h**: dedicated host instance family</p>
         */
        @NameInMap("DBInstanceClassType")
        public String DBInstanceClassType;

        /**
         * <p>The description of the instance.</p>
         */
        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The memory capacity of the instance. Unit: MB.</p>
         */
        @NameInMap("DBInstanceMemory")
        public Long DBInstanceMemory;

        /**
         * <p>The type of the network over which the instance is connected. Valid values:</p>
         * <br>
         * <p>*   **Internet**: Internet</p>
         * <p>*   **Intranet**: internal network</p>
         */
        @NameInMap("DBInstanceNetType")
        public String DBInstanceNetType;

        /**
         * <p>The status of the instance. For more information, see [Instance states](~~26315~~).</p>
         */
        @NameInMap("DBInstanceStatus")
        public String DBInstanceStatus;

        /**
         * <p>The storage capacity of the instance. Unit: GB.</p>
         */
        @NameInMap("DBInstanceStorage")
        public Integer DBInstanceStorage;

        /**
         * <p>The storage type of the instance. Valid values:</p>
         * <br>
         * <p>*   **local_ssd** and **ephemeral_ssd**: local SSD</p>
         * <p>*   **cloud_ssd**: standard SSD</p>
         * <p>*   **cloud_essd**: enhanced SSD (ESSD)</p>
         */
        @NameInMap("DBInstanceStorageType")
        public String DBInstanceStorageType;

        /**
         * <p>The type of the instance. Valid values:</p>
         * <br>
         * <p>*   **Primary**: primary instance</p>
         * <p>*   **Readonly**: read-only instance</p>
         * <p>*   **Guard**: disaster recovery instance</p>
         * <p>*   **Temp**: temporary instance</p>
         */
        @NameInMap("DBInstanceType")
        public String DBInstanceType;

        /**
         * <p>The maximum number of databases that can be created on the instance.</p>
         */
        @NameInMap("DBMaxQuantity")
        public Integer DBMaxQuantity;

        /**
         * <p>The ID of the dedicated cluster.</p>
         */
        @NameInMap("DedicatedHostGroupId")
        public String dedicatedHostGroupId;

        /**
         * <p>Indicates whether the release protection feature is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**: The feature is enabled.</p>
         * <p>*   **false**: The feature is disabled.</p>
         */
        @NameInMap("DeletionProtection")
        public Boolean deletionProtection;

        /**
         * <p>The database engine of the instance. Valid values:</p>
         * <br>
         * <p>*   **MySQL**</p>
         * <p>*   **PostgreSQL**</p>
         * <p>*   **SQLServer**</p>
         * <p>*   **MariaDB**</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The database engine version of the serverless instance.</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The expiration time. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         * <br>
         * <p>**</p>
         * <br>
         * <p>**Description** Pay-as-you-go instances never expire.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The extended information of the instance.</p>
         */
        @NameInMap("Extra")
        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeExtra extra;

        /**
         * <p>The name of the dedicated cluster to which the instance belongs. This parameter is returned only when the instance is created in an ApsaraDB MyBase cluster that runs MySQL on Standard Edition.</p>
         */
        @NameInMap("GeneralGroupName")
        public String generalGroupName;

        /**
         * <p>The ID of the disaster recovery instance that is attached to the instance.</p>
         */
        @NameInMap("GuardDBInstanceId")
        public String guardDBInstanceId;

        /**
         * <p>The type of the IP address. Only **IPv4** addresses are supported.</p>
         */
        @NameInMap("IPType")
        public String IPType;

        /**
         * <p>The ID of the instance from which the incremental data comes. The incremental data of a disaster recovery instance or read-only instance comes from its primary instance. If this parameter is not returned, the instance is a primary instance.</p>
         */
        @NameInMap("IncrementSourceDBInstanceId")
        public String incrementSourceDBInstanceId;

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <br>
         * <p>*   **Classic**</p>
         * <p>*   **VPC**</p>
         */
        @NameInMap("InstanceNetworkType")
        public String instanceNetworkType;

        /**
         * <p>The architecture type of the instance. Valid values:</p>
         * <br>
         * <p>*   **x86**</p>
         * <p>*   **arm**</p>
         */
        @NameInMap("InstructionSetArch")
        public String instructionSetArch;

        /**
         * <p>The latest minor engine version that is supported by the instance.</p>
         */
        @NameInMap("LatestKernelVersion")
        public String latestKernelVersion;

        /**
         * <p>The lock mode of the instance. Valid values:</p>
         * <br>
         * <p>*   **Unlock**: The instance is not locked.</p>
         * <p>*   **ManualLock**: The instance is manually locked.</p>
         * <p>*   **LockByExpiration**: The instance is automatically locked due to instance expiration.</p>
         * <p>*   **LockByRestoration**: The instance is automatically locked due to instance restoration.</p>
         * <p>*   **LockByDiskQuota**: The instance is automatically locked due to exhausted storage.</p>
         * <p>*   **LockReadInstanceByDiskQuota**: The instance is a read-only instance and is automatically locked due to exhausted storage.</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        /**
         * <p>The reason why the instance was locked.</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        /**
         * <p>The maintenance window of the instance. The time is displayed in UTC. Take note that the maintenance window displayed in the ApsaraDB RDS console is equal to the value of this parameter plus 8 hours.</p>
         */
        @NameInMap("MaintainTime")
        public String maintainTime;

        /**
         * <p>The ID of the primary instance.</p>
         * <br>
         * <p>**</p>
         * <br>
         * <p>**Description** If this parameter is not returned, the instance is the primary instance.</p>
         */
        @NameInMap("MasterInstanceId")
        public String masterInstanceId;

        /**
         * <p>The zone ID of the primary instance.</p>
         */
        @NameInMap("MasterZone")
        public String masterZone;

        /**
         * <p>The maximum number of concurrent connections.</p>
         */
        @NameInMap("MaxConnections")
        public Integer maxConnections;

        /**
         * <p>The maximum I/O throughput. Unit: MB/s.</p>
         */
        @NameInMap("MaxIOMBPS")
        public Integer maxIOMBPS;

        /**
         * <p>The maximum number of I/O requests per second.</p>
         */
        @NameInMap("MaxIOPS")
        public Integer maxIOPS;

        /**
         * <p>Indicates whether PgBouncer is enabled.</p>
         * <br>
         * <p>>  This parameter is returned only for RDS instances that run PostgreSQL. If PgBouncer is enabled, the return value is **true**.</p>
         */
        @NameInMap("PGBouncerEnabled")
        public String PGBouncerEnabled;

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <br>
         * <p>*   **Postpaid**: pay-as-you-go</p>
         * <p>*   **Prepaid**: subscription</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The port that is used to connect to the instance over an internal network.</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The type of the proxy that is supported by the instance. Valid values:</p>
         * <br>
         * <p>*   **0**: The instance does not support database proxies.</p>
         * <p>*   **1**: The instance supports shared proxies, with which the instance runs in multi-tenant mode.</p>
         * <p>*   **2**: The instance supports dedicated proxies, with which the instance runs in single-tenant mode.</p>
         */
        @NameInMap("ProxyType")
        public Integer proxyType;

        /**
         * <p>The IDs of the read-only instances that are attached to the primary instance.</p>
         */
        @NameInMap("ReadOnlyDBInstanceIds")
        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeReadOnlyDBInstanceIds readOnlyDBInstanceIds;

        /**
         * <p>The latency at which the system replicates data to read-only instances. The system replicates data from the primary instance to the read-only instances at the latency that is specified by the **ReadonlyInstanceSQLDelayedTime** parameter. Unit: seconds.</p>
         */
        @NameInMap("ReadonlyInstanceSQLDelayedTime")
        public String readonlyInstanceSQLDelayedTime;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource group ID.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The IP addresses in the IP address whitelist.</p>
         */
        @NameInMap("SecurityIPList")
        public String securityIPList;

        /**
         * <p>The whitelist mode of the instance. Valid values:</p>
         * <br>
         * <p>*   **normal**: standard whitelist mode</p>
         * <p>*   **safety**: enhanced whitelist mode</p>
         */
        @NameInMap("SecurityIPMode")
        public String securityIPMode;

        /**
         * <p>The settings of the serverless instance.</p>
         */
        @NameInMap("ServerlessConfig")
        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeServerlessConfig serverlessConfig;

        /**
         * <p>Information about the zone of the secondary instance.</p>
         */
        @NameInMap("SlaveZones")
        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeSlaveZones slaveZones;

        /**
         * <p>Indicates whether the instance supports privileged accounts, such as the system administrator (SA) account, the Active Directory (AD) account, and the host account.</p>
         * <br>
         * <p>*   **Enable**: Privileged accounts are supported.</p>
         * <p>*   **Disabled**: Privileged accounts are not supported.</p>
         */
        @NameInMap("SuperPermissionMode")
        public String superPermissionMode;

        /**
         * <p>The ID of the temporary instance that is attached to the instance.</p>
         */
        @NameInMap("TempDBInstanceId")
        public String tempDBInstanceId;

        /**
         * <p>The time zone of the instance.</p>
         */
        @NameInMap("TimeZone")
        public String timeZone;

        /**
         * <p>The information about the exception that is detected on the instance. This parameter is returned only when the instance is created in an ApsaraDB MyBase cluster that runs MySQL on Standard Edition.</p>
         */
        @NameInMap("Tips")
        public String tips;

        /**
         * <p>The severity level of the exception that is detected on the instance. This parameter is returned only when the instance is created in an ApsaraDB MyBase cluster that runs MySQL on Standard Edition. Valid values:</p>
         * <br>
         * <p>*   **1**: The instance is normal.</p>
         * <p>*   **2**: The specifications of the read-only instances do not match the specifications of the primary instance, and the performance is affected. You must adjust the specifications of these instances based on your business requirements.</p>
         */
        @NameInMap("TipsLevel")
        public Integer tipsLevel;

        /**
         * <p>The vSwitch ID.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The VPC ID.</p>
         */
        @NameInMap("VpcCloudInstanceId")
        public String vpcCloudInstanceId;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The zone ID of the instance.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        /**
         * <p>An internal parameter. You can ignore this parameter.</p>
         */
        @NameInMap("kindCode")
        public String kindCode;

        public static DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute self = new DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setAccountMaxQuantity(Integer accountMaxQuantity) {
            this.accountMaxQuantity = accountMaxQuantity;
            return this;
        }
        public Integer getAccountMaxQuantity() {
            return this.accountMaxQuantity;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setAdvancedFeatures(String advancedFeatures) {
            this.advancedFeatures = advancedFeatures;
            return this;
        }
        public String getAdvancedFeatures() {
            return this.advancedFeatures;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setAutoUpgradeMinorVersion(String autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }
        public String getAutoUpgradeMinorVersion() {
            return this.autoUpgradeMinorVersion;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setAvailabilityValue(String availabilityValue) {
            this.availabilityValue = availabilityValue;
            return this;
        }
        public String getAvailabilityValue() {
            return this.availabilityValue;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setBabelfishConfig(DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeBabelfishConfig babelfishConfig) {
            this.babelfishConfig = babelfishConfig;
            return this;
        }
        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeBabelfishConfig getBabelfishConfig() {
            return this.babelfishConfig;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setBpeEnabled(String bpeEnabled) {
            this.bpeEnabled = bpeEnabled;
            return this;
        }
        public String getBpeEnabled() {
            return this.bpeEnabled;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setCollation(String collation) {
            this.collation = collation;
            return this;
        }
        public String getCollation() {
            return this.collation;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setConnectionMode(String connectionMode) {
            this.connectionMode = connectionMode;
            return this;
        }
        public String getConnectionMode() {
            return this.connectionMode;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setConsoleVersion(String consoleVersion) {
            this.consoleVersion = consoleVersion;
            return this;
        }
        public String getConsoleVersion() {
            return this.consoleVersion;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setCurrentKernelVersion(String currentKernelVersion) {
            this.currentKernelVersion = currentKernelVersion;
            return this;
        }
        public String getCurrentKernelVersion() {
            return this.currentKernelVersion;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBClusterNodes(DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeDBClusterNodes DBClusterNodes) {
            this.DBClusterNodes = DBClusterNodes;
            return this;
        }
        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeDBClusterNodes getDBClusterNodes() {
            return this.DBClusterNodes;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceCPU(String DBInstanceCPU) {
            this.DBInstanceCPU = DBInstanceCPU;
            return this;
        }
        public String getDBInstanceCPU() {
            return this.DBInstanceCPU;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceClass(String DBInstanceClass) {
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }
        public String getDBInstanceClass() {
            return this.DBInstanceClass;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceClassType(String DBInstanceClassType) {
            this.DBInstanceClassType = DBInstanceClassType;
            return this;
        }
        public String getDBInstanceClassType() {
            return this.DBInstanceClassType;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceMemory(Long DBInstanceMemory) {
            this.DBInstanceMemory = DBInstanceMemory;
            return this;
        }
        public Long getDBInstanceMemory() {
            return this.DBInstanceMemory;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceNetType(String DBInstanceNetType) {
            this.DBInstanceNetType = DBInstanceNetType;
            return this;
        }
        public String getDBInstanceNetType() {
            return this.DBInstanceNetType;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceStorage(Integer DBInstanceStorage) {
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }
        public Integer getDBInstanceStorage() {
            return this.DBInstanceStorage;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceStorageType(String DBInstanceStorageType) {
            this.DBInstanceStorageType = DBInstanceStorageType;
            return this;
        }
        public String getDBInstanceStorageType() {
            return this.DBInstanceStorageType;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBInstanceType(String DBInstanceType) {
            this.DBInstanceType = DBInstanceType;
            return this;
        }
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDBMaxQuantity(Integer DBMaxQuantity) {
            this.DBMaxQuantity = DBMaxQuantity;
            return this;
        }
        public Integer getDBMaxQuantity() {
            return this.DBMaxQuantity;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDedicatedHostGroupId(String dedicatedHostGroupId) {
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }
        public String getDedicatedHostGroupId() {
            return this.dedicatedHostGroupId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setDeletionProtection(Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setExtra(DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeExtra extra) {
            this.extra = extra;
            return this;
        }
        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeExtra getExtra() {
            return this.extra;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setGeneralGroupName(String generalGroupName) {
            this.generalGroupName = generalGroupName;
            return this;
        }
        public String getGeneralGroupName() {
            return this.generalGroupName;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setGuardDBInstanceId(String guardDBInstanceId) {
            this.guardDBInstanceId = guardDBInstanceId;
            return this;
        }
        public String getGuardDBInstanceId() {
            return this.guardDBInstanceId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setIPType(String IPType) {
            this.IPType = IPType;
            return this;
        }
        public String getIPType() {
            return this.IPType;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setIncrementSourceDBInstanceId(String incrementSourceDBInstanceId) {
            this.incrementSourceDBInstanceId = incrementSourceDBInstanceId;
            return this;
        }
        public String getIncrementSourceDBInstanceId() {
            return this.incrementSourceDBInstanceId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setInstanceNetworkType(String instanceNetworkType) {
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }
        public String getInstanceNetworkType() {
            return this.instanceNetworkType;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setInstructionSetArch(String instructionSetArch) {
            this.instructionSetArch = instructionSetArch;
            return this;
        }
        public String getInstructionSetArch() {
            return this.instructionSetArch;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setLatestKernelVersion(String latestKernelVersion) {
            this.latestKernelVersion = latestKernelVersion;
            return this;
        }
        public String getLatestKernelVersion() {
            return this.latestKernelVersion;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setMaintainTime(String maintainTime) {
            this.maintainTime = maintainTime;
            return this;
        }
        public String getMaintainTime() {
            return this.maintainTime;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setMasterInstanceId(String masterInstanceId) {
            this.masterInstanceId = masterInstanceId;
            return this;
        }
        public String getMasterInstanceId() {
            return this.masterInstanceId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setMasterZone(String masterZone) {
            this.masterZone = masterZone;
            return this;
        }
        public String getMasterZone() {
            return this.masterZone;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setMaxConnections(Integer maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setMaxIOMBPS(Integer maxIOMBPS) {
            this.maxIOMBPS = maxIOMBPS;
            return this;
        }
        public Integer getMaxIOMBPS() {
            return this.maxIOMBPS;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setMaxIOPS(Integer maxIOPS) {
            this.maxIOPS = maxIOPS;
            return this;
        }
        public Integer getMaxIOPS() {
            return this.maxIOPS;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setPGBouncerEnabled(String PGBouncerEnabled) {
            this.PGBouncerEnabled = PGBouncerEnabled;
            return this;
        }
        public String getPGBouncerEnabled() {
            return this.PGBouncerEnabled;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setProxyType(Integer proxyType) {
            this.proxyType = proxyType;
            return this;
        }
        public Integer getProxyType() {
            return this.proxyType;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setReadOnlyDBInstanceIds(DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeReadOnlyDBInstanceIds readOnlyDBInstanceIds) {
            this.readOnlyDBInstanceIds = readOnlyDBInstanceIds;
            return this;
        }
        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeReadOnlyDBInstanceIds getReadOnlyDBInstanceIds() {
            return this.readOnlyDBInstanceIds;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setReadonlyInstanceSQLDelayedTime(String readonlyInstanceSQLDelayedTime) {
            this.readonlyInstanceSQLDelayedTime = readonlyInstanceSQLDelayedTime;
            return this;
        }
        public String getReadonlyInstanceSQLDelayedTime() {
            return this.readonlyInstanceSQLDelayedTime;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setSecurityIPMode(String securityIPMode) {
            this.securityIPMode = securityIPMode;
            return this;
        }
        public String getSecurityIPMode() {
            return this.securityIPMode;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setServerlessConfig(DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeServerlessConfig serverlessConfig) {
            this.serverlessConfig = serverlessConfig;
            return this;
        }
        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeServerlessConfig getServerlessConfig() {
            return this.serverlessConfig;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setSlaveZones(DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeSlaveZones slaveZones) {
            this.slaveZones = slaveZones;
            return this;
        }
        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttributeSlaveZones getSlaveZones() {
            return this.slaveZones;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setSuperPermissionMode(String superPermissionMode) {
            this.superPermissionMode = superPermissionMode;
            return this;
        }
        public String getSuperPermissionMode() {
            return this.superPermissionMode;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setTempDBInstanceId(String tempDBInstanceId) {
            this.tempDBInstanceId = tempDBInstanceId;
            return this;
        }
        public String getTempDBInstanceId() {
            return this.tempDBInstanceId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setTipsLevel(Integer tipsLevel) {
            this.tipsLevel = tipsLevel;
            return this;
        }
        public Integer getTipsLevel() {
            return this.tipsLevel;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setVpcCloudInstanceId(String vpcCloudInstanceId) {
            this.vpcCloudInstanceId = vpcCloudInstanceId;
            return this;
        }
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute setKindCode(String kindCode) {
            this.kindCode = kindCode;
            return this;
        }
        public String getKindCode() {
            return this.kindCode;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyItems extends TeaModel {
        @NameInMap("DBInstanceAttribute")
        public java.util.List<DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute> DBInstanceAttribute;

        public static DescribeDBInstanceAttributeResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyItems self = new DescribeDBInstanceAttributeResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyItems setDBInstanceAttribute(java.util.List<DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute> DBInstanceAttribute) {
            this.DBInstanceAttribute = DBInstanceAttribute;
            return this;
        }
        public java.util.List<DescribeDBInstanceAttributeResponseBodyItemsDBInstanceAttribute> getDBInstanceAttribute() {
            return this.DBInstanceAttribute;
        }

    }

}
