// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceTopologyResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeDBInstanceTopologyResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>C458B1E8-1683-3645-B154-6BA32080EEA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceTopologyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceTopologyResponseBody self = new DescribeDBInstanceTopologyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceTopologyResponseBody setData(DescribeDBInstanceTopologyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDBInstanceTopologyResponseBodyData getData() {
        return this.data;
    }

    public DescribeDBInstanceTopologyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyHistoryItems extends TeaModel {
        @NameInMap("Activated")
        public Boolean activated;

        @NameInMap("Azone")
        public String azone;

        @NameInMap("CharacterType")
        public String characterType;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        @NameInMap("PhyInstanceName")
        public String phyInstanceName;

        @NameInMap("Region")
        public String region;

        @NameInMap("Role")
        public String role;

        public static DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyHistoryItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyHistoryItems self = new DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyHistoryItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyHistoryItems setActivated(Boolean activated) {
            this.activated = activated;
            return this;
        }
        public Boolean getActivated() {
            return this.activated;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyHistoryItems setAzone(String azone) {
            this.azone = azone;
            return this;
        }
        public String getAzone() {
            return this.azone;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyHistoryItems setCharacterType(String characterType) {
            this.characterType = characterType;
            return this;
        }
        public String getCharacterType() {
            return this.characterType;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyHistoryItems setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyHistoryItems setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyHistoryItems setPhyInstanceName(String phyInstanceName) {
            this.phyInstanceName = phyInstanceName;
            return this;
        }
        public String getPhyInstanceName() {
            return this.phyInstanceName;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyHistoryItems setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyHistoryItems setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItemsAzoneRoleList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
         */
        @NameInMap("Azone")
        public String azone;

        /**
         * <strong>example:</strong>
         * <p>leader</p>
         */
        @NameInMap("Role")
        public String role;

        public static DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItemsAzoneRoleList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItemsAzoneRoleList self = new DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItemsAzoneRoleList();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItemsAzoneRoleList setAzone(String azone) {
            this.azone = azone;
            return this;
        }
        public String getAzone() {
            return this.azone;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItemsAzoneRoleList setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItemsConnectionIp extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>pxc-xdb-m-pxcdym7g7w********.mysql.singapore.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DBInstanceNetType")
        public Integer DBInstanceNetType;

        /**
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        public static DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItemsConnectionIp build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItemsConnectionIp self = new DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItemsConnectionIp();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItemsConnectionIp setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItemsConnectionIp setDBInstanceNetType(Integer DBInstanceNetType) {
            this.DBInstanceNetType = DBInstanceNetType;
            return this;
        }
        public Integer getDBInstanceNetType() {
            return this.DBInstanceNetType;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItemsConnectionIp setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Activated")
        public Boolean activated;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
         */
        @NameInMap("Azone")
        public String azone;

        @NameInMap("AzoneRoleList")
        public java.util.List<DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItemsAzoneRoleList> azoneRoleList;

        @NameInMap("CharacterType")
        public String characterType;

        @NameInMap("ConnectionIp")
        public java.util.List<DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItemsConnectionIp> connectionIp;

        @NameInMap("DBInstanceConnType")
        public Integer DBInstanceConnType;

        /**
         * <strong>example:</strong>
         * <p>2021-10-21T10:30:45Z</p>
         */
        @NameInMap("DBInstanceCreateTime")
        public String DBInstanceCreateTime;

        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        /**
         * <strong>example:</strong>
         * <p>304726049</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <strong>example:</strong>
         * <p>pxc-i-tk6t4z****</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("DBInstanceStatus")
        public Integer DBInstanceStatus;

        @NameInMap("DBInstanceStatusDescription")
        public String DBInstanceStatusDescription;

        /**
         * <strong>example:</strong>
         * <p>3145728</p>
         */
        @NameInMap("DiskSize")
        public Long diskSize;

        /**
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <strong>example:</strong>
         * <p>5.7</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LockMode")
        public Integer lockMode;

        @NameInMap("LockReason")
        public String lockReason;

        @NameInMap("MaintainEndTime")
        public String maintainEndTime;

        @NameInMap("MaintainStartTime")
        public String maintainStartTime;

        /**
         * <strong>example:</strong>
         * <p>4000</p>
         */
        @NameInMap("MaxConnections")
        public Integer maxConnections;

        /**
         * <strong>example:</strong>
         * <p>7000</p>
         */
        @NameInMap("MaxIops")
        public Integer maxIops;

        /**
         * <strong>example:</strong>
         * <p>polarx.x4.large.2e</p>
         */
        @NameInMap("NodeClass")
        public String nodeClass;

        @NameInMap("PhyInstanceName")
        public String phyInstanceName;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>master</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("StorageUsed")
        public String storageUsed;

        /**
         * <strong>example:</strong>
         * <p>polarx-cdc-kernel-2.0.0-3985896</p>
         */
        @NameInMap("Version")
        public String version;

        public static DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems self = new DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setActivated(Boolean activated) {
            this.activated = activated;
            return this;
        }
        public Boolean getActivated() {
            return this.activated;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setAzone(String azone) {
            this.azone = azone;
            return this;
        }
        public String getAzone() {
            return this.azone;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setAzoneRoleList(java.util.List<DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItemsAzoneRoleList> azoneRoleList) {
            this.azoneRoleList = azoneRoleList;
            return this;
        }
        public java.util.List<DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItemsAzoneRoleList> getAzoneRoleList() {
            return this.azoneRoleList;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setCharacterType(String characterType) {
            this.characterType = characterType;
            return this;
        }
        public String getCharacterType() {
            return this.characterType;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setConnectionIp(java.util.List<DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItemsConnectionIp> connectionIp) {
            this.connectionIp = connectionIp;
            return this;
        }
        public java.util.List<DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItemsConnectionIp> getConnectionIp() {
            return this.connectionIp;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setDBInstanceConnType(Integer DBInstanceConnType) {
            this.DBInstanceConnType = DBInstanceConnType;
            return this;
        }
        public Integer getDBInstanceConnType() {
            return this.DBInstanceConnType;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setDBInstanceCreateTime(String DBInstanceCreateTime) {
            this.DBInstanceCreateTime = DBInstanceCreateTime;
            return this;
        }
        public String getDBInstanceCreateTime() {
            return this.DBInstanceCreateTime;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setDBInstanceStatus(Integer DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public Integer getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setDBInstanceStatusDescription(String DBInstanceStatusDescription) {
            this.DBInstanceStatusDescription = DBInstanceStatusDescription;
            return this;
        }
        public String getDBInstanceStatusDescription() {
            return this.DBInstanceStatusDescription;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setDiskSize(Long diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Long getDiskSize() {
            return this.diskSize;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setLockMode(Integer lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public Integer getLockMode() {
            return this.lockMode;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setMaintainEndTime(String maintainEndTime) {
            this.maintainEndTime = maintainEndTime;
            return this;
        }
        public String getMaintainEndTime() {
            return this.maintainEndTime;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setMaintainStartTime(String maintainStartTime) {
            this.maintainStartTime = maintainStartTime;
            return this;
        }
        public String getMaintainStartTime() {
            return this.maintainStartTime;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setMaxConnections(Integer maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setMaxIops(Integer maxIops) {
            this.maxIops = maxIops;
            return this;
        }
        public Integer getMaxIops() {
            return this.maxIops;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setNodeClass(String nodeClass) {
            this.nodeClass = nodeClass;
            return this;
        }
        public String getNodeClass() {
            return this.nodeClass;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setPhyInstanceName(String phyInstanceName) {
            this.phyInstanceName = phyInstanceName;
            return this;
        }
        public String getPhyInstanceName() {
            return this.phyInstanceName;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setStorageUsed(String storageUsed) {
            this.storageUsed = storageUsed;
            return this;
        }
        public String getStorageUsed() {
            return this.storageUsed;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>lvs</p>
         */
        @NameInMap("DBInstanceConnType")
        public String DBInstanceConnType;

        /**
         * <strong>example:</strong>
         * <p>2021-10-21T10:30:45Z 04:00:00</p>
         */
        @NameInMap("DBInstanceCreateTime")
        public String DBInstanceCreateTime;

        /**
         * <strong>example:</strong>
         * <p>pxc-sprcym7g7wj7k</p>
         */
        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        /**
         * <strong>example:</strong>
         * <p>304726047</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <strong>example:</strong>
         * <p>pxc-sprcym7g7w****</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("DBInstanceStatus")
        public Integer DBInstanceStatus;

        /**
         * <strong>example:</strong>
         * <p>TDE_MODIFYING</p>
         */
        @NameInMap("DBInstanceStatusDescription")
        public String DBInstanceStatusDescription;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DBInstanceStorage")
        public Integer DBInstanceStorage;

        /**
         * <strong>example:</strong>
         * <p>polarx</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("HistoryItems")
        public java.util.List<DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyHistoryItems> historyItems;

        @NameInMap("Items")
        public java.util.List<DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems> items;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LockMode")
        public Integer lockMode;

        @NameInMap("LockReason")
        public String lockReason;

        /**
         * <strong>example:</strong>
         * <p>05:00:00</p>
         */
        @NameInMap("MaintainEndTime")
        public String maintainEndTime;

        /**
         * <strong>example:</strong>
         * <p>04:00:00</p>
         */
        @NameInMap("MaintainStartTime")
        public String maintainStartTime;

        public static DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology self = new DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology setDBInstanceConnType(String DBInstanceConnType) {
            this.DBInstanceConnType = DBInstanceConnType;
            return this;
        }
        public String getDBInstanceConnType() {
            return this.DBInstanceConnType;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology setDBInstanceCreateTime(String DBInstanceCreateTime) {
            this.DBInstanceCreateTime = DBInstanceCreateTime;
            return this;
        }
        public String getDBInstanceCreateTime() {
            return this.DBInstanceCreateTime;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology setDBInstanceStatus(Integer DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public Integer getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology setDBInstanceStatusDescription(String DBInstanceStatusDescription) {
            this.DBInstanceStatusDescription = DBInstanceStatusDescription;
            return this;
        }
        public String getDBInstanceStatusDescription() {
            return this.DBInstanceStatusDescription;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology setDBInstanceStorage(Integer DBInstanceStorage) {
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }
        public Integer getDBInstanceStorage() {
            return this.DBInstanceStorage;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology setHistoryItems(java.util.List<DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyHistoryItems> historyItems) {
            this.historyItems = historyItems;
            return this;
        }
        public java.util.List<DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyHistoryItems> getHistoryItems() {
            return this.historyItems;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology setItems(java.util.List<DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems> getItems() {
            return this.items;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology setLockMode(Integer lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public Integer getLockMode() {
            return this.lockMode;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology setMaintainEndTime(String maintainEndTime) {
            this.maintainEndTime = maintainEndTime;
            return this;
        }
        public String getMaintainEndTime() {
            return this.maintainEndTime;
        }

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology setMaintainStartTime(String maintainStartTime) {
            this.maintainStartTime = maintainStartTime;
            return this;
        }
        public String getMaintainStartTime() {
            return this.maintainStartTime;
        }

    }

    public static class DescribeDBInstanceTopologyResponseBodyData extends TeaModel {
        @NameInMap("LogicInstanceTopology")
        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology logicInstanceTopology;

        public static DescribeDBInstanceTopologyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceTopologyResponseBodyData self = new DescribeDBInstanceTopologyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceTopologyResponseBodyData setLogicInstanceTopology(DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology logicInstanceTopology) {
            this.logicInstanceTopology = logicInstanceTopology;
            return this;
        }
        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology getLogicInstanceTopology() {
            return this.logicInstanceTopology;
        }

    }

}
