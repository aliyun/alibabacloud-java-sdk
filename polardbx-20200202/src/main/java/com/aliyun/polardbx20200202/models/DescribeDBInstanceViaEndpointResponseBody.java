// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceViaEndpointResponseBody extends TeaModel {
    @NameInMap("DBInstance")
    public DescribeDBInstanceViaEndpointResponseBodyDBInstance DBInstance;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceViaEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceViaEndpointResponseBody self = new DescribeDBInstanceViaEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceViaEndpointResponseBody setDBInstance(DescribeDBInstanceViaEndpointResponseBodyDBInstance DBInstance) {
        this.DBInstance = DBInstance;
        return this;
    }
    public DescribeDBInstanceViaEndpointResponseBodyDBInstance getDBInstance() {
        return this.DBInstance;
    }

    public DescribeDBInstanceViaEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBInstanceViaEndpointResponseBodyDBInstanceConnAddrs extends TeaModel {
        @NameInMap("ConnectionString")
        public String connectionString;

        @NameInMap("Port")
        public Long port;

        @NameInMap("Type")
        public String type;

        /**
         * <p>VPC ID。</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VpcInstanceId")
        public String vpcInstanceId;

        public static DescribeDBInstanceViaEndpointResponseBodyDBInstanceConnAddrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceViaEndpointResponseBodyDBInstanceConnAddrs self = new DescribeDBInstanceViaEndpointResponseBodyDBInstanceConnAddrs();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstanceConnAddrs setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstanceConnAddrs setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstanceConnAddrs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstanceConnAddrs setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstanceConnAddrs setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstanceConnAddrs setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

    }

    public static class DescribeDBInstanceViaEndpointResponseBodyDBInstanceDBNodes extends TeaModel {
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

        public static DescribeDBInstanceViaEndpointResponseBodyDBInstanceDBNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceViaEndpointResponseBodyDBInstanceDBNodes self = new DescribeDBInstanceViaEndpointResponseBodyDBInstanceDBNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstanceDBNodes setComputeNodeId(String computeNodeId) {
            this.computeNodeId = computeNodeId;
            return this;
        }
        public String getComputeNodeId() {
            return this.computeNodeId;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstanceDBNodes setDataNodeId(String dataNodeId) {
            this.dataNodeId = dataNodeId;
            return this;
        }
        public String getDataNodeId() {
            return this.dataNodeId;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstanceDBNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstanceDBNodes setNodeClass(String nodeClass) {
            this.nodeClass = nodeClass;
            return this;
        }
        public String getNodeClass() {
            return this.nodeClass;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstanceDBNodes setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstanceDBNodes setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDBInstanceViaEndpointResponseBodyDBInstanceTagSet extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeDBInstanceViaEndpointResponseBodyDBInstanceTagSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceViaEndpointResponseBodyDBInstanceTagSet self = new DescribeDBInstanceViaEndpointResponseBodyDBInstanceTagSet();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstanceTagSet setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstanceTagSet setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDBInstanceViaEndpointResponseBodyDBInstance extends TeaModel {
        @NameInMap("CnNodeClassCode")
        public String cnNodeClassCode;

        @NameInMap("CnNodeCount")
        public Integer cnNodeCount;

        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("ConnAddrs")
        public java.util.List<DescribeDBInstanceViaEndpointResponseBodyDBInstanceConnAddrs> connAddrs;

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
        public java.util.List<DescribeDBInstanceViaEndpointResponseBodyDBInstanceDBNodes> DBNodes;

        @NameInMap("DBType")
        public String DBType;

        @NameInMap("DBVersion")
        public String DBVersion;

        @NameInMap("Description")
        public String description;

        @NameInMap("DnNodeClassCode")
        public String dnNodeClassCode;

        @NameInMap("DnNodeCount")
        public Integer dnNodeCount;

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

        @NameInMap("LTSVersions")
        public java.util.List<String> LTSVersions;

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

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("RightsSeparationEnabled")
        public Boolean rightsSeparationEnabled;

        @NameInMap("RightsSeparationStatus")
        public String rightsSeparationStatus;

        @NameInMap("Series")
        public String series;

        @NameInMap("Status")
        public String status;

        @NameInMap("StorageUsed")
        public Long storageUsed;

        @NameInMap("TagSet")
        public java.util.List<DescribeDBInstanceViaEndpointResponseBodyDBInstanceTagSet> tagSet;

        @NameInMap("Type")
        public String type;

        /**
         * <p>VPC ID。</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBInstanceViaEndpointResponseBodyDBInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceViaEndpointResponseBodyDBInstance self = new DescribeDBInstanceViaEndpointResponseBodyDBInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setCnNodeClassCode(String cnNodeClassCode) {
            this.cnNodeClassCode = cnNodeClassCode;
            return this;
        }
        public String getCnNodeClassCode() {
            return this.cnNodeClassCode;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setCnNodeCount(Integer cnNodeCount) {
            this.cnNodeCount = cnNodeCount;
            return this;
        }
        public Integer getCnNodeCount() {
            return this.cnNodeCount;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setConnAddrs(java.util.List<DescribeDBInstanceViaEndpointResponseBodyDBInstanceConnAddrs> connAddrs) {
            this.connAddrs = connAddrs;
            return this;
        }
        public java.util.List<DescribeDBInstanceViaEndpointResponseBodyDBInstanceConnAddrs> getConnAddrs() {
            return this.connAddrs;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setDBInstanceType(String DBInstanceType) {
            this.DBInstanceType = DBInstanceType;
            return this;
        }
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setDBNodeClass(String DBNodeClass) {
            this.DBNodeClass = DBNodeClass;
            return this;
        }
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setDBNodeCount(Integer DBNodeCount) {
            this.DBNodeCount = DBNodeCount;
            return this;
        }
        public Integer getDBNodeCount() {
            return this.DBNodeCount;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setDBNodes(java.util.List<DescribeDBInstanceViaEndpointResponseBodyDBInstanceDBNodes> DBNodes) {
            this.DBNodes = DBNodes;
            return this;
        }
        public java.util.List<DescribeDBInstanceViaEndpointResponseBodyDBInstanceDBNodes> getDBNodes() {
            return this.DBNodes;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setDBType(String DBType) {
            this.DBType = DBType;
            return this;
        }
        public String getDBType() {
            return this.DBType;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setDBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }
        public String getDBVersion() {
            return this.DBVersion;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setDnNodeClassCode(String dnNodeClassCode) {
            this.dnNodeClassCode = dnNodeClassCode;
            return this;
        }
        public String getDnNodeClassCode() {
            return this.dnNodeClassCode;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setDnNodeCount(Integer dnNodeCount) {
            this.dnNodeCount = dnNodeCount;
            return this;
        }
        public Integer getDnNodeCount() {
            return this.dnNodeCount;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setExpired(String expired) {
            this.expired = expired;
            return this;
        }
        public String getExpired() {
            return this.expired;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setKindCode(Integer kindCode) {
            this.kindCode = kindCode;
            return this;
        }
        public Integer getKindCode() {
            return this.kindCode;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setLTSVersions(java.util.List<String> LTSVersions) {
            this.LTSVersions = LTSVersions;
            return this;
        }
        public java.util.List<String> getLTSVersions() {
            return this.LTSVersions;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setLatestMinorVersion(String latestMinorVersion) {
            this.latestMinorVersion = latestMinorVersion;
            return this;
        }
        public String getLatestMinorVersion() {
            return this.latestMinorVersion;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setMaintainEndTime(String maintainEndTime) {
            this.maintainEndTime = maintainEndTime;
            return this;
        }
        public String getMaintainEndTime() {
            return this.maintainEndTime;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setMaintainStartTime(String maintainStartTime) {
            this.maintainStartTime = maintainStartTime;
            return this;
        }
        public String getMaintainStartTime() {
            return this.maintainStartTime;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setMinorVersion(String minorVersion) {
            this.minorVersion = minorVersion;
            return this;
        }
        public String getMinorVersion() {
            return this.minorVersion;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setReadDBInstances(java.util.List<String> readDBInstances) {
            this.readDBInstances = readDBInstances;
            return this;
        }
        public java.util.List<String> getReadDBInstances() {
            return this.readDBInstances;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setRightsSeparationEnabled(Boolean rightsSeparationEnabled) {
            this.rightsSeparationEnabled = rightsSeparationEnabled;
            return this;
        }
        public Boolean getRightsSeparationEnabled() {
            return this.rightsSeparationEnabled;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setRightsSeparationStatus(String rightsSeparationStatus) {
            this.rightsSeparationStatus = rightsSeparationStatus;
            return this;
        }
        public String getRightsSeparationStatus() {
            return this.rightsSeparationStatus;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setSeries(String series) {
            this.series = series;
            return this;
        }
        public String getSeries() {
            return this.series;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setStorageUsed(Long storageUsed) {
            this.storageUsed = storageUsed;
            return this;
        }
        public Long getStorageUsed() {
            return this.storageUsed;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setTagSet(java.util.List<DescribeDBInstanceViaEndpointResponseBodyDBInstanceTagSet> tagSet) {
            this.tagSet = tagSet;
            return this;
        }
        public java.util.List<DescribeDBInstanceViaEndpointResponseBodyDBInstanceTagSet> getTagSet() {
            return this.tagSet;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBInstanceViaEndpointResponseBodyDBInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
