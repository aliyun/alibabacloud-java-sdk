// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesResponseBody extends TeaModel {
    @NameInMap("DBInstances")
    public java.util.List<DescribeDBInstancesResponseBodyDBInstances> DBInstances;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalNumber")
    public Integer totalNumber;

    public static DescribeDBInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesResponseBody self = new DescribeDBInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesResponseBody setDBInstances(java.util.List<DescribeDBInstancesResponseBodyDBInstances> DBInstances) {
        this.DBInstances = DBInstances;
        return this;
    }
    public java.util.List<DescribeDBInstancesResponseBodyDBInstances> getDBInstances() {
        return this.DBInstances;
    }

    public DescribeDBInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDBInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstancesResponseBody setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
        return this;
    }
    public Integer getTotalNumber() {
        return this.totalNumber;
    }

    public static class DescribeDBInstancesResponseBodyDBInstancesNodes extends TeaModel {
        @NameInMap("ClassCode")
        public String classCode;

        @NameInMap("Id")
        public String id;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBInstancesResponseBodyDBInstancesNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseBodyDBInstancesNodes self = new DescribeDBInstancesResponseBodyDBInstancesNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseBodyDBInstancesNodes setClassCode(String classCode) {
            this.classCode = classCode;
            return this;
        }
        public String getClassCode() {
            return this.classCode;
        }

        public DescribeDBInstancesResponseBodyDBInstancesNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDBInstancesResponseBodyDBInstancesNodes setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBInstancesResponseBodyDBInstancesNodes setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDBInstancesResponseBodyDBInstancesTagSet extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeDBInstancesResponseBodyDBInstancesTagSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseBodyDBInstancesTagSet self = new DescribeDBInstancesResponseBodyDBInstancesTagSet();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseBodyDBInstancesTagSet setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBInstancesResponseBodyDBInstancesTagSet setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDBInstancesResponseBodyDBInstances extends TeaModel {
        @NameInMap("CdcInstanceName")
        public String cdcInstanceName;

        @NameInMap("CnNodeClassCode")
        public String cnNodeClassCode;

        @NameInMap("CnNodeCount")
        public Integer cnNodeCount;

        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("ContainBinlogX")
        public Boolean containBinlogX;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DBInstanceName")
        public String DBInstanceName;

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

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("Expired")
        public Boolean expired;

        @NameInMap("Id")
        public String id;

        @NameInMap("LockMode")
        public String lockMode;

        @NameInMap("LockReason")
        public String lockReason;

        @NameInMap("MinorVersion")
        public String minorVersion;

        @NameInMap("Network")
        public String network;

        @NameInMap("NodeClass")
        public String nodeClass;

        @NameInMap("NodeCount")
        public Integer nodeCount;

        @NameInMap("Nodes")
        public java.util.List<DescribeDBInstancesResponseBodyDBInstancesNodes> nodes;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("ReadDBInstances")
        public java.util.List<String> readDBInstances;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Series")
        public String series;

        @NameInMap("Status")
        public String status;

        @NameInMap("StorageUsed")
        public Long storageUsed;

        @NameInMap("SupportBinlogX")
        public Boolean supportBinlogX;

        @NameInMap("TagSet")
        public java.util.List<DescribeDBInstancesResponseBodyDBInstancesTagSet> tagSet;

        @NameInMap("Type")
        public String type;

        /**
         * <p>VPC ID。</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBInstancesResponseBodyDBInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseBodyDBInstances self = new DescribeDBInstancesResponseBodyDBInstances();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseBodyDBInstances setCdcInstanceName(String cdcInstanceName) {
            this.cdcInstanceName = cdcInstanceName;
            return this;
        }
        public String getCdcInstanceName() {
            return this.cdcInstanceName;
        }

        public DescribeDBInstancesResponseBodyDBInstances setCnNodeClassCode(String cnNodeClassCode) {
            this.cnNodeClassCode = cnNodeClassCode;
            return this;
        }
        public String getCnNodeClassCode() {
            return this.cnNodeClassCode;
        }

        public DescribeDBInstancesResponseBodyDBInstances setCnNodeCount(Integer cnNodeCount) {
            this.cnNodeCount = cnNodeCount;
            return this;
        }
        public Integer getCnNodeCount() {
            return this.cnNodeCount;
        }

        public DescribeDBInstancesResponseBodyDBInstances setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeDBInstancesResponseBodyDBInstances setContainBinlogX(Boolean containBinlogX) {
            this.containBinlogX = containBinlogX;
            return this;
        }
        public Boolean getContainBinlogX() {
            return this.containBinlogX;
        }

        public DescribeDBInstancesResponseBodyDBInstances setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDBInstancesResponseBodyDBInstances setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DescribeDBInstancesResponseBodyDBInstances setDBType(String DBType) {
            this.DBType = DBType;
            return this;
        }
        public String getDBType() {
            return this.DBType;
        }

        public DescribeDBInstancesResponseBodyDBInstances setDBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }
        public String getDBVersion() {
            return this.DBVersion;
        }

        public DescribeDBInstancesResponseBodyDBInstances setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDBInstancesResponseBodyDBInstances setDnNodeClassCode(String dnNodeClassCode) {
            this.dnNodeClassCode = dnNodeClassCode;
            return this;
        }
        public String getDnNodeClassCode() {
            return this.dnNodeClassCode;
        }

        public DescribeDBInstancesResponseBodyDBInstances setDnNodeCount(Integer dnNodeCount) {
            this.dnNodeCount = dnNodeCount;
            return this;
        }
        public Integer getDnNodeCount() {
            return this.dnNodeCount;
        }

        public DescribeDBInstancesResponseBodyDBInstances setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBInstancesResponseBodyDBInstances setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBInstancesResponseBodyDBInstances setExpired(Boolean expired) {
            this.expired = expired;
            return this;
        }
        public Boolean getExpired() {
            return this.expired;
        }

        public DescribeDBInstancesResponseBodyDBInstances setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDBInstancesResponseBodyDBInstances setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBInstancesResponseBodyDBInstances setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeDBInstancesResponseBodyDBInstances setMinorVersion(String minorVersion) {
            this.minorVersion = minorVersion;
            return this;
        }
        public String getMinorVersion() {
            return this.minorVersion;
        }

        public DescribeDBInstancesResponseBodyDBInstances setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public DescribeDBInstancesResponseBodyDBInstances setNodeClass(String nodeClass) {
            this.nodeClass = nodeClass;
            return this;
        }
        public String getNodeClass() {
            return this.nodeClass;
        }

        public DescribeDBInstancesResponseBodyDBInstances setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public DescribeDBInstancesResponseBodyDBInstances setNodes(java.util.List<DescribeDBInstancesResponseBodyDBInstancesNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<DescribeDBInstancesResponseBodyDBInstancesNodes> getNodes() {
            return this.nodes;
        }

        public DescribeDBInstancesResponseBodyDBInstances setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDBInstancesResponseBodyDBInstances setReadDBInstances(java.util.List<String> readDBInstances) {
            this.readDBInstances = readDBInstances;
            return this;
        }
        public java.util.List<String> getReadDBInstances() {
            return this.readDBInstances;
        }

        public DescribeDBInstancesResponseBodyDBInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBInstancesResponseBodyDBInstances setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDBInstancesResponseBodyDBInstances setSeries(String series) {
            this.series = series;
            return this;
        }
        public String getSeries() {
            return this.series;
        }

        public DescribeDBInstancesResponseBodyDBInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDBInstancesResponseBodyDBInstances setStorageUsed(Long storageUsed) {
            this.storageUsed = storageUsed;
            return this;
        }
        public Long getStorageUsed() {
            return this.storageUsed;
        }

        public DescribeDBInstancesResponseBodyDBInstances setSupportBinlogX(Boolean supportBinlogX) {
            this.supportBinlogX = supportBinlogX;
            return this;
        }
        public Boolean getSupportBinlogX() {
            return this.supportBinlogX;
        }

        public DescribeDBInstancesResponseBodyDBInstances setTagSet(java.util.List<DescribeDBInstancesResponseBodyDBInstancesTagSet> tagSet) {
            this.tagSet = tagSet;
            return this;
        }
        public java.util.List<DescribeDBInstancesResponseBodyDBInstancesTagSet> getTagSet() {
            return this.tagSet;
        }

        public DescribeDBInstancesResponseBodyDBInstances setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDBInstancesResponseBodyDBInstances setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDBInstancesResponseBodyDBInstances setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
