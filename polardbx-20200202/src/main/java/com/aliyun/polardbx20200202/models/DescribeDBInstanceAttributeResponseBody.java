// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceAttributeResponseBody extends TeaModel {
    @NameInMap("DBInstance")
    public DescribeDBInstanceAttributeResponseBodyDBInstance DBInstance;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceAttributeResponseBody self = new DescribeDBInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceAttributeResponseBody setDBInstance(DescribeDBInstanceAttributeResponseBodyDBInstance DBInstance) {
        this.DBInstance = DBInstance;
        return this;
    }
    public DescribeDBInstanceAttributeResponseBodyDBInstance getDBInstance() {
        return this.DBInstance;
    }

    public DescribeDBInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBInstanceAttributeResponseBodyDBInstanceConnAddrs extends TeaModel {
        @NameInMap("ConnectionString")
        public String connectionString;

        @NameInMap("Port")
        public String port;

        @NameInMap("Type")
        public String type;

        @NameInMap("VPCId")
        public String VPCId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static DescribeDBInstanceAttributeResponseBodyDBInstanceConnAddrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyDBInstanceConnAddrs self = new DescribeDBInstanceAttributeResponseBodyDBInstanceConnAddrs();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstanceConnAddrs setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstanceConnAddrs setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstanceConnAddrs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstanceConnAddrs setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstanceConnAddrs setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyDBInstanceDBNodes extends TeaModel {
        @NameInMap("ComputeNodeId")
        public String computeNodeId;

        @NameInMap("DataNodeId")
        public String dataNodeId;

        @NameInMap("Id")
        public String id;

        @NameInMap("NodeClass")
        public String nodeClass;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBInstanceAttributeResponseBodyDBInstanceDBNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyDBInstanceDBNodes self = new DescribeDBInstanceAttributeResponseBodyDBInstanceDBNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstanceDBNodes setComputeNodeId(String computeNodeId) {
            this.computeNodeId = computeNodeId;
            return this;
        }
        public String getComputeNodeId() {
            return this.computeNodeId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstanceDBNodes setDataNodeId(String dataNodeId) {
            this.dataNodeId = dataNodeId;
            return this;
        }
        public String getDataNodeId() {
            return this.dataNodeId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstanceDBNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstanceDBNodes setNodeClass(String nodeClass) {
            this.nodeClass = nodeClass;
            return this;
        }
        public String getNodeClass() {
            return this.nodeClass;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstanceDBNodes setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstanceDBNodes setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDBInstanceAttributeResponseBodyDBInstance extends TeaModel {
        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("ConnAddrs")
        public java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstanceConnAddrs> connAddrs;

        @NameInMap("ConnectionString")
        public String connectionString;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DBInstanceType")
        public String DBInstanceType;

        @NameInMap("DBNodeClass")
        public String DBNodeClass;

        @NameInMap("DBNodeCount")
        public Integer DBNodeCount;

        @NameInMap("DBNodes")
        public java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstanceDBNodes> DBNodes;

        @NameInMap("DBType")
        public String DBType;

        @NameInMap("DBVersion")
        public String DBVersion;

        @NameInMap("Description")
        public String description;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("ExpireDate")
        public String expireDate;

        @NameInMap("Expired")
        public String expired;

        @NameInMap("Id")
        public String id;

        @NameInMap("KindCode")
        public Integer kindCode;

        @NameInMap("LatestMinorVersion")
        public String latestMinorVersion;

        @NameInMap("LockMode")
        public String lockMode;

        @NameInMap("MaintainEndTime")
        public String maintainEndTime;

        @NameInMap("MaintainStartTime")
        public String maintainStartTime;

        @NameInMap("MinorVersion")
        public String minorVersion;

        @NameInMap("Network")
        public String network;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("Port")
        public String port;

        @NameInMap("ReadDBInstances")
        public java.util.List<String> readDBInstances;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RightsSeparationEnabled")
        public Boolean rightsSeparationEnabled;

        @NameInMap("RightsSeparationStatus")
        public String rightsSeparationStatus;

        @NameInMap("Status")
        public String status;

        @NameInMap("StorageUsed")
        public Long storageUsed;

        @NameInMap("Type")
        public String type;

        @NameInMap("VPCId")
        public String VPCId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBInstanceAttributeResponseBodyDBInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyDBInstance self = new DescribeDBInstanceAttributeResponseBodyDBInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setConnAddrs(java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstanceConnAddrs> connAddrs) {
            this.connAddrs = connAddrs;
            return this;
        }
        public java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstanceConnAddrs> getConnAddrs() {
            return this.connAddrs;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setDBInstanceType(String DBInstanceType) {
            this.DBInstanceType = DBInstanceType;
            return this;
        }
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setDBNodeClass(String DBNodeClass) {
            this.DBNodeClass = DBNodeClass;
            return this;
        }
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setDBNodeCount(Integer DBNodeCount) {
            this.DBNodeCount = DBNodeCount;
            return this;
        }
        public Integer getDBNodeCount() {
            return this.DBNodeCount;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setDBNodes(java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstanceDBNodes> DBNodes) {
            this.DBNodes = DBNodes;
            return this;
        }
        public java.util.List<DescribeDBInstanceAttributeResponseBodyDBInstanceDBNodes> getDBNodes() {
            return this.DBNodes;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setDBType(String DBType) {
            this.DBType = DBType;
            return this;
        }
        public String getDBType() {
            return this.DBType;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setDBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }
        public String getDBVersion() {
            return this.DBVersion;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setExpired(String expired) {
            this.expired = expired;
            return this;
        }
        public String getExpired() {
            return this.expired;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setKindCode(Integer kindCode) {
            this.kindCode = kindCode;
            return this;
        }
        public Integer getKindCode() {
            return this.kindCode;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setLatestMinorVersion(String latestMinorVersion) {
            this.latestMinorVersion = latestMinorVersion;
            return this;
        }
        public String getLatestMinorVersion() {
            return this.latestMinorVersion;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setMaintainEndTime(String maintainEndTime) {
            this.maintainEndTime = maintainEndTime;
            return this;
        }
        public String getMaintainEndTime() {
            return this.maintainEndTime;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setMaintainStartTime(String maintainStartTime) {
            this.maintainStartTime = maintainStartTime;
            return this;
        }
        public String getMaintainStartTime() {
            return this.maintainStartTime;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setMinorVersion(String minorVersion) {
            this.minorVersion = minorVersion;
            return this;
        }
        public String getMinorVersion() {
            return this.minorVersion;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setReadDBInstances(java.util.List<String> readDBInstances) {
            this.readDBInstances = readDBInstances;
            return this;
        }
        public java.util.List<String> getReadDBInstances() {
            return this.readDBInstances;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setRightsSeparationEnabled(Boolean rightsSeparationEnabled) {
            this.rightsSeparationEnabled = rightsSeparationEnabled;
            return this;
        }
        public Boolean getRightsSeparationEnabled() {
            return this.rightsSeparationEnabled;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setRightsSeparationStatus(String rightsSeparationStatus) {
            this.rightsSeparationStatus = rightsSeparationStatus;
            return this;
        }
        public String getRightsSeparationStatus() {
            return this.rightsSeparationStatus;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setStorageUsed(Long storageUsed) {
            this.storageUsed = storageUsed;
            return this;
        }
        public Long getStorageUsed() {
            return this.storageUsed;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
