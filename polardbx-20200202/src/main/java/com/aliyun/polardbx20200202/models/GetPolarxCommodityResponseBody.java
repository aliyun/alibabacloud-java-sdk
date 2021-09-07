// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class GetPolarxCommodityResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DBInstance")
    public GetPolarxCommodityResponseBodyDBInstance DBInstance;

    @NameInMap("ComponentList")
    public java.util.List<GetPolarxCommodityResponseBodyComponentList> componentList;

    public static GetPolarxCommodityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPolarxCommodityResponseBody self = new GetPolarxCommodityResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPolarxCommodityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPolarxCommodityResponseBody setDBInstance(GetPolarxCommodityResponseBodyDBInstance DBInstance) {
        this.DBInstance = DBInstance;
        return this;
    }
    public GetPolarxCommodityResponseBodyDBInstance getDBInstance() {
        return this.DBInstance;
    }

    public GetPolarxCommodityResponseBody setComponentList(java.util.List<GetPolarxCommodityResponseBodyComponentList> componentList) {
        this.componentList = componentList;
        return this;
    }
    public java.util.List<GetPolarxCommodityResponseBodyComponentList> getComponentList() {
        return this.componentList;
    }

    public static class GetPolarxCommodityResponseBodyDBInstanceDBNodes extends TeaModel {
        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("NodeClass")
        public String nodeClass;

        @NameInMap("Id")
        public String id;

        @NameInMap("RegionId")
        public String regionId;

        public static GetPolarxCommodityResponseBodyDBInstanceDBNodes build(java.util.Map<String, ?> map) throws Exception {
            GetPolarxCommodityResponseBodyDBInstanceDBNodes self = new GetPolarxCommodityResponseBodyDBInstanceDBNodes();
            return TeaModel.build(map, self);
        }

        public GetPolarxCommodityResponseBodyDBInstanceDBNodes setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public GetPolarxCommodityResponseBodyDBInstanceDBNodes setNodeClass(String nodeClass) {
            this.nodeClass = nodeClass;
            return this;
        }
        public String getNodeClass() {
            return this.nodeClass;
        }

        public GetPolarxCommodityResponseBodyDBInstanceDBNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetPolarxCommodityResponseBodyDBInstanceDBNodes setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class GetPolarxCommodityResponseBodyDBInstanceConnAddrs extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("Port")
        public String port;

        @NameInMap("VPCId")
        public String VPCId;

        @NameInMap("ConnectionString")
        public String connectionString;

        public static GetPolarxCommodityResponseBodyDBInstanceConnAddrs build(java.util.Map<String, ?> map) throws Exception {
            GetPolarxCommodityResponseBodyDBInstanceConnAddrs self = new GetPolarxCommodityResponseBodyDBInstanceConnAddrs();
            return TeaModel.build(map, self);
        }

        public GetPolarxCommodityResponseBodyDBInstanceConnAddrs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetPolarxCommodityResponseBodyDBInstanceConnAddrs setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetPolarxCommodityResponseBodyDBInstanceConnAddrs setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public GetPolarxCommodityResponseBodyDBInstanceConnAddrs setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public GetPolarxCommodityResponseBodyDBInstanceConnAddrs setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

    }

    public static class GetPolarxCommodityResponseBodyDBInstance extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Status")
        public String status;

        @NameInMap("DBNodeCount")
        public Integer DBNodeCount;

        @NameInMap("Expired")
        public String expired;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("Port")
        public String port;

        @NameInMap("LockMode")
        public String lockMode;

        @NameInMap("Description")
        public String description;

        @NameInMap("ConnectionString")
        public String connectionString;

        @NameInMap("StorageUsed")
        public Long storageUsed;

        @NameInMap("ExpireDate")
        public String expireDate;

        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("MaintainStartTime")
        public String maintainStartTime;

        @NameInMap("DBInstanceType")
        public String DBInstanceType;

        @NameInMap("DBNodeClass")
        public String DBNodeClass;

        @NameInMap("LatestMinorVersion")
        public String latestMinorVersion;

        @NameInMap("MaintainEndTime")
        public String maintainEndTime;

        @NameInMap("DBType")
        public String DBType;

        @NameInMap("VPCId")
        public String VPCId;

        @NameInMap("MinorVersion")
        public String minorVersion;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Network")
        public String network;

        @NameInMap("DBVersion")
        public String DBVersion;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("Id")
        public String id;

        @NameInMap("DBNodes")
        public java.util.List<GetPolarxCommodityResponseBodyDBInstanceDBNodes> DBNodes;

        @NameInMap("ConnAddrs")
        public java.util.List<GetPolarxCommodityResponseBodyDBInstanceConnAddrs> connAddrs;

        @NameInMap("ReadDBInstances")
        public java.util.List<String> readDBInstances;

        public static GetPolarxCommodityResponseBodyDBInstance build(java.util.Map<String, ?> map) throws Exception {
            GetPolarxCommodityResponseBodyDBInstance self = new GetPolarxCommodityResponseBodyDBInstance();
            return TeaModel.build(map, self);
        }

        public GetPolarxCommodityResponseBodyDBInstance setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetPolarxCommodityResponseBodyDBInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPolarxCommodityResponseBodyDBInstance setDBNodeCount(Integer DBNodeCount) {
            this.DBNodeCount = DBNodeCount;
            return this;
        }
        public Integer getDBNodeCount() {
            return this.DBNodeCount;
        }

        public GetPolarxCommodityResponseBodyDBInstance setExpired(String expired) {
            this.expired = expired;
            return this;
        }
        public String getExpired() {
            return this.expired;
        }

        public GetPolarxCommodityResponseBodyDBInstance setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetPolarxCommodityResponseBodyDBInstance setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public GetPolarxCommodityResponseBodyDBInstance setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public GetPolarxCommodityResponseBodyDBInstance setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public GetPolarxCommodityResponseBodyDBInstance setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetPolarxCommodityResponseBodyDBInstance setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public GetPolarxCommodityResponseBodyDBInstance setStorageUsed(Long storageUsed) {
            this.storageUsed = storageUsed;
            return this;
        }
        public Long getStorageUsed() {
            return this.storageUsed;
        }

        public GetPolarxCommodityResponseBodyDBInstance setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

        public GetPolarxCommodityResponseBodyDBInstance setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public GetPolarxCommodityResponseBodyDBInstance setMaintainStartTime(String maintainStartTime) {
            this.maintainStartTime = maintainStartTime;
            return this;
        }
        public String getMaintainStartTime() {
            return this.maintainStartTime;
        }

        public GetPolarxCommodityResponseBodyDBInstance setDBInstanceType(String DBInstanceType) {
            this.DBInstanceType = DBInstanceType;
            return this;
        }
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        public GetPolarxCommodityResponseBodyDBInstance setDBNodeClass(String DBNodeClass) {
            this.DBNodeClass = DBNodeClass;
            return this;
        }
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        public GetPolarxCommodityResponseBodyDBInstance setLatestMinorVersion(String latestMinorVersion) {
            this.latestMinorVersion = latestMinorVersion;
            return this;
        }
        public String getLatestMinorVersion() {
            return this.latestMinorVersion;
        }

        public GetPolarxCommodityResponseBodyDBInstance setMaintainEndTime(String maintainEndTime) {
            this.maintainEndTime = maintainEndTime;
            return this;
        }
        public String getMaintainEndTime() {
            return this.maintainEndTime;
        }

        public GetPolarxCommodityResponseBodyDBInstance setDBType(String DBType) {
            this.DBType = DBType;
            return this;
        }
        public String getDBType() {
            return this.DBType;
        }

        public GetPolarxCommodityResponseBodyDBInstance setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public GetPolarxCommodityResponseBodyDBInstance setMinorVersion(String minorVersion) {
            this.minorVersion = minorVersion;
            return this;
        }
        public String getMinorVersion() {
            return this.minorVersion;
        }

        public GetPolarxCommodityResponseBodyDBInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetPolarxCommodityResponseBodyDBInstance setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public GetPolarxCommodityResponseBodyDBInstance setDBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }
        public String getDBVersion() {
            return this.DBVersion;
        }

        public GetPolarxCommodityResponseBodyDBInstance setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetPolarxCommodityResponseBodyDBInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public GetPolarxCommodityResponseBodyDBInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public GetPolarxCommodityResponseBodyDBInstance setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetPolarxCommodityResponseBodyDBInstance setDBNodes(java.util.List<GetPolarxCommodityResponseBodyDBInstanceDBNodes> DBNodes) {
            this.DBNodes = DBNodes;
            return this;
        }
        public java.util.List<GetPolarxCommodityResponseBodyDBInstanceDBNodes> getDBNodes() {
            return this.DBNodes;
        }

        public GetPolarxCommodityResponseBodyDBInstance setConnAddrs(java.util.List<GetPolarxCommodityResponseBodyDBInstanceConnAddrs> connAddrs) {
            this.connAddrs = connAddrs;
            return this;
        }
        public java.util.List<GetPolarxCommodityResponseBodyDBInstanceConnAddrs> getConnAddrs() {
            return this.connAddrs;
        }

        public GetPolarxCommodityResponseBodyDBInstance setReadDBInstances(java.util.List<String> readDBInstances) {
            this.readDBInstances = readDBInstances;
            return this;
        }
        public java.util.List<String> getReadDBInstances() {
            return this.readDBInstances;
        }

    }

    public static class GetPolarxCommodityResponseBodyComponentList extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Name")
        public String name;

        @NameInMap("Values")
        public java.util.List<String> values;

        public static GetPolarxCommodityResponseBodyComponentList build(java.util.Map<String, ?> map) throws Exception {
            GetPolarxCommodityResponseBodyComponentList self = new GetPolarxCommodityResponseBodyComponentList();
            return TeaModel.build(map, self);
        }

        public GetPolarxCommodityResponseBodyComponentList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetPolarxCommodityResponseBodyComponentList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPolarxCommodityResponseBodyComponentList setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

}
