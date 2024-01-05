// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceAttributeResponseBody extends TeaModel {
    @NameInMap("CanUpgradeVersions")
    public java.util.List<String> canUpgradeVersions;

    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("DBClusterList")
    public java.util.List<DescribeDBInstanceAttributeResponseBodyDBClusterList> DBClusterList;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("EngineMinorVersion")
    public String engineMinorVersion;

    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("LockMode")
    public Long lockMode;

    @NameInMap("LockReason")
    public String lockReason;

    @NameInMap("MaintainEndtime")
    public String maintainEndtime;

    @NameInMap("MaintainStarttime")
    public String maintainStarttime;

    @NameInMap("ObjectStoreSize")
    public Long objectStoreSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceCpu")
    public Long resourceCpu;

    @NameInMap("Status")
    public String status;

    @NameInMap("StorageSize")
    public Long storageSize;

    @NameInMap("SubDomain")
    public String subDomain;

    public static DescribeDBInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceAttributeResponseBody self = new DescribeDBInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceAttributeResponseBody setCanUpgradeVersions(java.util.List<String> canUpgradeVersions) {
        this.canUpgradeVersions = canUpgradeVersions;
        return this;
    }
    public java.util.List<String> getCanUpgradeVersions() {
        return this.canUpgradeVersions;
    }

    public DescribeDBInstanceAttributeResponseBody setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribeDBInstanceAttributeResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeDBInstanceAttributeResponseBody setDBClusterList(java.util.List<DescribeDBInstanceAttributeResponseBodyDBClusterList> DBClusterList) {
        this.DBClusterList = DBClusterList;
        return this;
    }
    public java.util.List<DescribeDBInstanceAttributeResponseBodyDBClusterList> getDBClusterList() {
        return this.DBClusterList;
    }

    public DescribeDBInstanceAttributeResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstanceAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeDBInstanceAttributeResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeDBInstanceAttributeResponseBody setEngineMinorVersion(String engineMinorVersion) {
        this.engineMinorVersion = engineMinorVersion;
        return this;
    }
    public String getEngineMinorVersion() {
        return this.engineMinorVersion;
    }

    public DescribeDBInstanceAttributeResponseBody setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeDBInstanceAttributeResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DescribeDBInstanceAttributeResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public DescribeDBInstanceAttributeResponseBody setLockMode(Long lockMode) {
        this.lockMode = lockMode;
        return this;
    }
    public Long getLockMode() {
        return this.lockMode;
    }

    public DescribeDBInstanceAttributeResponseBody setLockReason(String lockReason) {
        this.lockReason = lockReason;
        return this;
    }
    public String getLockReason() {
        return this.lockReason;
    }

    public DescribeDBInstanceAttributeResponseBody setMaintainEndtime(String maintainEndtime) {
        this.maintainEndtime = maintainEndtime;
        return this;
    }
    public String getMaintainEndtime() {
        return this.maintainEndtime;
    }

    public DescribeDBInstanceAttributeResponseBody setMaintainStarttime(String maintainStarttime) {
        this.maintainStarttime = maintainStarttime;
        return this;
    }
    public String getMaintainStarttime() {
        return this.maintainStarttime;
    }

    public DescribeDBInstanceAttributeResponseBody setObjectStoreSize(Long objectStoreSize) {
        this.objectStoreSize = objectStoreSize;
        return this;
    }
    public Long getObjectStoreSize() {
        return this.objectStoreSize;
    }

    public DescribeDBInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceAttributeResponseBody setResourceCpu(Long resourceCpu) {
        this.resourceCpu = resourceCpu;
        return this;
    }
    public Long getResourceCpu() {
        return this.resourceCpu;
    }

    public DescribeDBInstanceAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeDBInstanceAttributeResponseBody setStorageSize(Long storageSize) {
        this.storageSize = storageSize;
        return this;
    }
    public Long getStorageSize() {
        return this.storageSize;
    }

    public DescribeDBInstanceAttributeResponseBody setSubDomain(String subDomain) {
        this.subDomain = subDomain;
        return this;
    }
    public String getSubDomain() {
        return this.subDomain;
    }

    public static class DescribeDBInstanceAttributeResponseBodyDBClusterList extends TeaModel {
        @NameInMap("CacheStorageSizeGB")
        public String cacheStorageSizeGB;

        @NameInMap("CacheStorageType")
        public String cacheStorageType;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("CpuCores")
        public Long cpuCores;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("DbClusterClass")
        public String dbClusterClass;

        @NameInMap("DbClusterId")
        public String dbClusterId;

        @NameInMap("DbClusterName")
        public String dbClusterName;

        @NameInMap("DbInstanceName")
        public String dbInstanceName;

        @NameInMap("Memory")
        public Long memory;

        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        public static DescribeDBInstanceAttributeResponseBodyDBClusterList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceAttributeResponseBodyDBClusterList self = new DescribeDBInstanceAttributeResponseBodyDBClusterList();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceAttributeResponseBodyDBClusterList setCacheStorageSizeGB(String cacheStorageSizeGB) {
            this.cacheStorageSizeGB = cacheStorageSizeGB;
            return this;
        }
        public String getCacheStorageSizeGB() {
            return this.cacheStorageSizeGB;
        }

        public DescribeDBInstanceAttributeResponseBodyDBClusterList setCacheStorageType(String cacheStorageType) {
            this.cacheStorageType = cacheStorageType;
            return this;
        }
        public String getCacheStorageType() {
            return this.cacheStorageType;
        }

        public DescribeDBInstanceAttributeResponseBodyDBClusterList setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeDBInstanceAttributeResponseBodyDBClusterList setCpuCores(Long cpuCores) {
            this.cpuCores = cpuCores;
            return this;
        }
        public Long getCpuCores() {
            return this.cpuCores;
        }

        public DescribeDBInstanceAttributeResponseBodyDBClusterList setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeDBInstanceAttributeResponseBodyDBClusterList setDbClusterClass(String dbClusterClass) {
            this.dbClusterClass = dbClusterClass;
            return this;
        }
        public String getDbClusterClass() {
            return this.dbClusterClass;
        }

        public DescribeDBInstanceAttributeResponseBodyDBClusterList setDbClusterId(String dbClusterId) {
            this.dbClusterId = dbClusterId;
            return this;
        }
        public String getDbClusterId() {
            return this.dbClusterId;
        }

        public DescribeDBInstanceAttributeResponseBodyDBClusterList setDbClusterName(String dbClusterName) {
            this.dbClusterName = dbClusterName;
            return this;
        }
        public String getDbClusterName() {
            return this.dbClusterName;
        }

        public DescribeDBInstanceAttributeResponseBodyDBClusterList setDbInstanceName(String dbInstanceName) {
            this.dbInstanceName = dbInstanceName;
            return this;
        }
        public String getDbInstanceName() {
            return this.dbInstanceName;
        }

        public DescribeDBInstanceAttributeResponseBodyDBClusterList setMemory(Long memory) {
            this.memory = memory;
            return this;
        }
        public Long getMemory() {
            return this.memory;
        }

        public DescribeDBInstanceAttributeResponseBodyDBClusterList setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DescribeDBInstanceAttributeResponseBodyDBClusterList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeDBInstanceAttributeResponseBodyDBClusterList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
