// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribePolarxDbInstancesResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public String total;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("DbInstances")
    public DescribePolarxDbInstancesResponseBodyDbInstances dbInstances;

    public static DescribePolarxDbInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarxDbInstancesResponseBody self = new DescribePolarxDbInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolarxDbInstancesResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribePolarxDbInstancesResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribePolarxDbInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePolarxDbInstancesResponseBody setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public DescribePolarxDbInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribePolarxDbInstancesResponseBody setDbInstances(DescribePolarxDbInstancesResponseBodyDbInstances dbInstances) {
        this.dbInstances = dbInstances;
        return this;
    }
    public DescribePolarxDbInstancesResponseBodyDbInstances getDbInstances() {
        return this.dbInstances;
    }

    public static class DescribePolarxDbInstancesResponseBodyDbInstancesDbInstance extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("DBType")
        public String DBType;

        @NameInMap("LockMode")
        public String lockMode;

        @NameInMap("VPCId")
        public String VPCId;

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
        public Integer storageUsed;

        @NameInMap("NodeCount")
        public Integer nodeCount;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("lockReason")
        public String lockReason;

        @NameInMap("StatusDesc")
        public String statusDesc;

        public static DescribePolarxDbInstancesResponseBodyDbInstancesDbInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarxDbInstancesResponseBodyDbInstancesDbInstance self = new DescribePolarxDbInstancesResponseBodyDbInstancesDbInstance();
            return TeaModel.build(map, self);
        }

        public DescribePolarxDbInstancesResponseBodyDbInstancesDbInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribePolarxDbInstancesResponseBodyDbInstancesDbInstance setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribePolarxDbInstancesResponseBodyDbInstancesDbInstance setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribePolarxDbInstancesResponseBodyDbInstancesDbInstance setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribePolarxDbInstancesResponseBodyDbInstancesDbInstance setDBType(String DBType) {
            this.DBType = DBType;
            return this;
        }
        public String getDBType() {
            return this.DBType;
        }

        public DescribePolarxDbInstancesResponseBodyDbInstancesDbInstance setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribePolarxDbInstancesResponseBodyDbInstancesDbInstance setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribePolarxDbInstancesResponseBodyDbInstancesDbInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribePolarxDbInstancesResponseBodyDbInstancesDbInstance setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public DescribePolarxDbInstancesResponseBodyDbInstancesDbInstance setDBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }
        public String getDBVersion() {
            return this.DBVersion;
        }

        public DescribePolarxDbInstancesResponseBodyDbInstancesDbInstance setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePolarxDbInstancesResponseBodyDbInstancesDbInstance setNodeClass(String nodeClass) {
            this.nodeClass = nodeClass;
            return this;
        }
        public String getNodeClass() {
            return this.nodeClass;
        }

        public DescribePolarxDbInstancesResponseBodyDbInstancesDbInstance setStorageUsed(Integer storageUsed) {
            this.storageUsed = storageUsed;
            return this;
        }
        public Integer getStorageUsed() {
            return this.storageUsed;
        }

        public DescribePolarxDbInstancesResponseBodyDbInstancesDbInstance setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public DescribePolarxDbInstancesResponseBodyDbInstancesDbInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribePolarxDbInstancesResponseBodyDbInstancesDbInstance setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribePolarxDbInstancesResponseBodyDbInstancesDbInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribePolarxDbInstancesResponseBodyDbInstancesDbInstance setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribePolarxDbInstancesResponseBodyDbInstancesDbInstance setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

    }

    public static class DescribePolarxDbInstancesResponseBodyDbInstances extends TeaModel {
        @NameInMap("DbInstance")
        public java.util.List<DescribePolarxDbInstancesResponseBodyDbInstancesDbInstance> dbInstance;

        public static DescribePolarxDbInstancesResponseBodyDbInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarxDbInstancesResponseBodyDbInstances self = new DescribePolarxDbInstancesResponseBodyDbInstances();
            return TeaModel.build(map, self);
        }

        public DescribePolarxDbInstancesResponseBodyDbInstances setDbInstance(java.util.List<DescribePolarxDbInstancesResponseBodyDbInstancesDbInstance> dbInstance) {
            this.dbInstance = dbInstance;
            return this;
        }
        public java.util.List<DescribePolarxDbInstancesResponseBodyDbInstancesDbInstance> getDbInstance() {
            return this.dbInstance;
        }

    }

}
