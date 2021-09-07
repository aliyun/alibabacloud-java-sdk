// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDBInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalNumber")
    public Integer totalNumber;

    @NameInMap("DBInstances")
    public java.util.List<DescribeDBInstancesResponseBodyDBInstances> DBInstances;

    public static DescribeDBInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancesResponseBody self = new DescribeDBInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public DescribeDBInstancesResponseBody setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
        return this;
    }
    public Integer getTotalNumber() {
        return this.totalNumber;
    }

    public DescribeDBInstancesResponseBody setDBInstances(java.util.List<DescribeDBInstancesResponseBodyDBInstances> DBInstances) {
        this.DBInstances = DBInstances;
        return this;
    }
    public java.util.List<DescribeDBInstancesResponseBodyDBInstances> getDBInstances() {
        return this.DBInstances;
    }

    public static class DescribeDBInstancesResponseBodyDBInstancesNodes extends TeaModel {
        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("Id")
        public String id;

        @NameInMap("ClassCode")
        public String classCode;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeDBInstancesResponseBodyDBInstancesNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseBodyDBInstancesNodes self = new DescribeDBInstancesResponseBodyDBInstancesNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseBodyDBInstancesNodes setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDBInstancesResponseBodyDBInstancesNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDBInstancesResponseBodyDBInstancesNodes setClassCode(String classCode) {
            this.classCode = classCode;
            return this;
        }
        public String getClassCode() {
            return this.classCode;
        }

        public DescribeDBInstancesResponseBodyDBInstancesNodes setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeDBInstancesResponseBodyDBInstances extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Status")
        public String status;

        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("Expired")
        public Boolean expired;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("LockReason")
        public String lockReason;

        @NameInMap("DBType")
        public String DBType;

        @NameInMap("LockMode")
        public String lockMode;

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

        @NameInMap("Description")
        public String description;

        @NameInMap("NodeClass")
        public String nodeClass;

        @NameInMap("StorageUsed")
        public Long storageUsed;

        @NameInMap("NodeCount")
        public Integer nodeCount;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("Id")
        public String id;

        @NameInMap("Nodes")
        public java.util.List<DescribeDBInstancesResponseBodyDBInstancesNodes> nodes;

        @NameInMap("ReadDBInstances")
        public java.util.List<String> readDBInstances;

        public static DescribeDBInstancesResponseBodyDBInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancesResponseBodyDBInstances self = new DescribeDBInstancesResponseBodyDBInstances();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancesResponseBodyDBInstances setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDBInstancesResponseBodyDBInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDBInstancesResponseBodyDBInstances setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
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

        public DescribeDBInstancesResponseBodyDBInstances setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDBInstancesResponseBodyDBInstances setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDBInstancesResponseBodyDBInstances setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeDBInstancesResponseBodyDBInstances setDBType(String DBType) {
            this.DBType = DBType;
            return this;
        }
        public String getDBType() {
            return this.DBType;
        }

        public DescribeDBInstancesResponseBodyDBInstances setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBInstancesResponseBodyDBInstances setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDBInstancesResponseBodyDBInstances setMinorVersion(String minorVersion) {
            this.minorVersion = minorVersion;
            return this;
        }
        public String getMinorVersion() {
            return this.minorVersion;
        }

        public DescribeDBInstancesResponseBodyDBInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBInstancesResponseBodyDBInstances setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
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

        public DescribeDBInstancesResponseBodyDBInstances setNodeClass(String nodeClass) {
            this.nodeClass = nodeClass;
            return this;
        }
        public String getNodeClass() {
            return this.nodeClass;
        }

        public DescribeDBInstancesResponseBodyDBInstances setStorageUsed(Long storageUsed) {
            this.storageUsed = storageUsed;
            return this;
        }
        public Long getStorageUsed() {
            return this.storageUsed;
        }

        public DescribeDBInstancesResponseBodyDBInstances setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public DescribeDBInstancesResponseBodyDBInstances setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDBInstancesResponseBodyDBInstances setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBInstancesResponseBodyDBInstances setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDBInstancesResponseBodyDBInstances setNodes(java.util.List<DescribeDBInstancesResponseBodyDBInstancesNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<DescribeDBInstancesResponseBodyDBInstancesNodes> getNodes() {
            return this.nodes;
        }

        public DescribeDBInstancesResponseBodyDBInstances setReadDBInstances(java.util.List<String> readDBInstances) {
            this.readDBInstances = readDBInstances;
            return this;
        }
        public java.util.List<String> getReadDBInstances() {
            return this.readDBInstances;
        }

    }

}
