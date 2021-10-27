// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribePolarxPgInstancesResponseBody extends TeaModel {
    @NameInMap("DBInstances")
    public java.util.List<DescribePolarxPgInstancesResponseBodyDBInstances> DBInstances;

    @NameInMap("ExpireDate")
    public String expireDate;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePolarxPgInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarxPgInstancesResponseBody self = new DescribePolarxPgInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolarxPgInstancesResponseBody setDBInstances(java.util.List<DescribePolarxPgInstancesResponseBodyDBInstances> DBInstances) {
        this.DBInstances = DBInstances;
        return this;
    }
    public java.util.List<DescribePolarxPgInstancesResponseBodyDBInstances> getDBInstances() {
        return this.DBInstances;
    }

    public DescribePolarxPgInstancesResponseBody setExpireDate(String expireDate) {
        this.expireDate = expireDate;
        return this;
    }
    public String getExpireDate() {
        return this.expireDate;
    }

    public DescribePolarxPgInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePolarxPgInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePolarxPgInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePolarxPgInstancesResponseBodyDBInstances extends TeaModel {
        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DBType")
        public String DBType;

        @NameInMap("DBVersion")
        public String DBVersion;

        @NameInMap("Description")
        public String description;

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

        @NameInMap("Network")
        public String network;

        @NameInMap("NodeClass")
        public String nodeClass;

        @NameInMap("NodeCount")
        public Integer nodeCount;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

        @NameInMap("StorageUsed")
        public Integer storageUsed;

        @NameInMap("VPCId")
        public String VPCId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribePolarxPgInstancesResponseBodyDBInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarxPgInstancesResponseBodyDBInstances self = new DescribePolarxPgInstancesResponseBodyDBInstances();
            return TeaModel.build(map, self);
        }

        public DescribePolarxPgInstancesResponseBodyDBInstances setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribePolarxPgInstancesResponseBodyDBInstances setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribePolarxPgInstancesResponseBodyDBInstances setDBType(String DBType) {
            this.DBType = DBType;
            return this;
        }
        public String getDBType() {
            return this.DBType;
        }

        public DescribePolarxPgInstancesResponseBodyDBInstances setDBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }
        public String getDBVersion() {
            return this.DBVersion;
        }

        public DescribePolarxPgInstancesResponseBodyDBInstances setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePolarxPgInstancesResponseBodyDBInstances setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribePolarxPgInstancesResponseBodyDBInstances setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribePolarxPgInstancesResponseBodyDBInstances setExpired(Boolean expired) {
            this.expired = expired;
            return this;
        }
        public Boolean getExpired() {
            return this.expired;
        }

        public DescribePolarxPgInstancesResponseBodyDBInstances setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribePolarxPgInstancesResponseBodyDBInstances setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribePolarxPgInstancesResponseBodyDBInstances setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribePolarxPgInstancesResponseBodyDBInstances setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public DescribePolarxPgInstancesResponseBodyDBInstances setNodeClass(String nodeClass) {
            this.nodeClass = nodeClass;
            return this;
        }
        public String getNodeClass() {
            return this.nodeClass;
        }

        public DescribePolarxPgInstancesResponseBodyDBInstances setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public DescribePolarxPgInstancesResponseBodyDBInstances setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribePolarxPgInstancesResponseBodyDBInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribePolarxPgInstancesResponseBodyDBInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribePolarxPgInstancesResponseBodyDBInstances setStorageUsed(Integer storageUsed) {
            this.storageUsed = storageUsed;
            return this;
        }
        public Integer getStorageUsed() {
            return this.storageUsed;
        }

        public DescribePolarxPgInstancesResponseBodyDBInstances setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribePolarxPgInstancesResponseBodyDBInstances setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
