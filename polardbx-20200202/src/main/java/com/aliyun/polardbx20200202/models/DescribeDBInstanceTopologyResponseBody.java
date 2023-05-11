// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceTopologyResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeDBInstanceTopologyResponseBodyData data;

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

    public static class DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItemsAzoneRoleList extends TeaModel {
        @NameInMap("Azone")
        public String azone;

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
        @NameInMap("ConnectionString")
        public String connectionString;

        @NameInMap("DBInstanceNetType")
        public Integer DBInstanceNetType;

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
        @NameInMap("Activated")
        public Boolean activated;

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

        @NameInMap("DBInstanceCreateTime")
        public String DBInstanceCreateTime;

        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        @NameInMap("DBInstanceStatus")
        public Integer DBInstanceStatus;

        @NameInMap("DBInstanceStatusDescription")
        public String DBInstanceStatusDescription;

        @NameInMap("DiskSize")
        public Long diskSize;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("LockMode")
        public Integer lockMode;

        @NameInMap("LockReason")
        public String lockReason;

        @NameInMap("MaintainEndTime")
        public String maintainEndTime;

        @NameInMap("MaintainStartTime")
        public String maintainStartTime;

        @NameInMap("MaxConnections")
        public Integer maxConnections;

        @NameInMap("MaxIops")
        public Integer maxIops;

        @NameInMap("NodeClass")
        public String nodeClass;

        @NameInMap("Region")
        public String region;

        @NameInMap("Role")
        public String role;

        @NameInMap("Status")
        public String status;

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

        public DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopology extends TeaModel {
        @NameInMap("DBInstanceConnType")
        public String DBInstanceConnType;

        @NameInMap("DBInstanceCreateTime")
        public String DBInstanceCreateTime;

        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        @NameInMap("DBInstanceStatus")
        public Integer DBInstanceStatus;

        @NameInMap("DBInstanceStatusDescription")
        public String DBInstanceStatusDescription;

        @NameInMap("DBInstanceStorage")
        public Integer DBInstanceStorage;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("Items")
        public java.util.List<DescribeDBInstanceTopologyResponseBodyDataLogicInstanceTopologyItems> items;

        @NameInMap("LockMode")
        public Integer lockMode;

        @NameInMap("LockReason")
        public String lockReason;

        @NameInMap("MaintainEndTime")
        public String maintainEndTime;

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
