// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeDatabaseInstancesResponseBody extends TeaModel {
    /**
     * <p>The name of the super administrator account of the Simple Database Service instance.</p>
     */
    @NameInMap("DatabaseInstances")
    public java.util.List<DescribeDatabaseInstancesResponseBodyDatabaseInstances> databaseInstances;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDatabaseInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatabaseInstancesResponseBody self = new DescribeDatabaseInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDatabaseInstancesResponseBody setDatabaseInstances(java.util.List<DescribeDatabaseInstancesResponseBodyDatabaseInstances> databaseInstances) {
        this.databaseInstances = databaseInstances;
        return this;
    }
    public java.util.List<DescribeDatabaseInstancesResponseBodyDatabaseInstances> getDatabaseInstances() {
        return this.databaseInstances;
    }

    public DescribeDatabaseInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDatabaseInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDatabaseInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDatabaseInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDatabaseInstancesResponseBodyDatabaseInstances extends TeaModel {
        @NameInMap("BusinessStatus")
        public String businessStatus;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("Cpu")
        public String cpu;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("DatabaseInstanceEdition")
        public String databaseInstanceEdition;

        @NameInMap("DatabaseInstanceId")
        public String databaseInstanceId;

        @NameInMap("DatabaseInstanceName")
        public String databaseInstanceName;

        @NameInMap("DatabaseInstanceStatus")
        public String databaseInstanceStatus;

        @NameInMap("DatabaseVersion")
        public String databaseVersion;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("Memory")
        public String memory;

        @NameInMap("PrivateConnection")
        public String privateConnection;

        @NameInMap("PublicConnection")
        public String publicConnection;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Storage")
        public Integer storage;

        @NameInMap("SuperAccountName")
        public String superAccountName;

        public static DescribeDatabaseInstancesResponseBodyDatabaseInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabaseInstancesResponseBodyDatabaseInstances self = new DescribeDatabaseInstancesResponseBodyDatabaseInstances();
            return TeaModel.build(map, self);
        }

        public DescribeDatabaseInstancesResponseBodyDatabaseInstances setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribeDatabaseInstancesResponseBodyDatabaseInstances setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeDatabaseInstancesResponseBodyDatabaseInstances setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public DescribeDatabaseInstancesResponseBodyDatabaseInstances setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDatabaseInstancesResponseBodyDatabaseInstances setDatabaseInstanceEdition(String databaseInstanceEdition) {
            this.databaseInstanceEdition = databaseInstanceEdition;
            return this;
        }
        public String getDatabaseInstanceEdition() {
            return this.databaseInstanceEdition;
        }

        public DescribeDatabaseInstancesResponseBodyDatabaseInstances setDatabaseInstanceId(String databaseInstanceId) {
            this.databaseInstanceId = databaseInstanceId;
            return this;
        }
        public String getDatabaseInstanceId() {
            return this.databaseInstanceId;
        }

        public DescribeDatabaseInstancesResponseBodyDatabaseInstances setDatabaseInstanceName(String databaseInstanceName) {
            this.databaseInstanceName = databaseInstanceName;
            return this;
        }
        public String getDatabaseInstanceName() {
            return this.databaseInstanceName;
        }

        public DescribeDatabaseInstancesResponseBodyDatabaseInstances setDatabaseInstanceStatus(String databaseInstanceStatus) {
            this.databaseInstanceStatus = databaseInstanceStatus;
            return this;
        }
        public String getDatabaseInstanceStatus() {
            return this.databaseInstanceStatus;
        }

        public DescribeDatabaseInstancesResponseBodyDatabaseInstances setDatabaseVersion(String databaseVersion) {
            this.databaseVersion = databaseVersion;
            return this;
        }
        public String getDatabaseVersion() {
            return this.databaseVersion;
        }

        public DescribeDatabaseInstancesResponseBodyDatabaseInstances setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeDatabaseInstancesResponseBodyDatabaseInstances setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public DescribeDatabaseInstancesResponseBodyDatabaseInstances setPrivateConnection(String privateConnection) {
            this.privateConnection = privateConnection;
            return this;
        }
        public String getPrivateConnection() {
            return this.privateConnection;
        }

        public DescribeDatabaseInstancesResponseBodyDatabaseInstances setPublicConnection(String publicConnection) {
            this.publicConnection = publicConnection;
            return this;
        }
        public String getPublicConnection() {
            return this.publicConnection;
        }

        public DescribeDatabaseInstancesResponseBodyDatabaseInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDatabaseInstancesResponseBodyDatabaseInstances setStorage(Integer storage) {
            this.storage = storage;
            return this;
        }
        public Integer getStorage() {
            return this.storage;
        }

        public DescribeDatabaseInstancesResponseBodyDatabaseInstances setSuperAccountName(String superAccountName) {
            this.superAccountName = superAccountName;
            return this;
        }
        public String getSuperAccountName() {
            return this.superAccountName;
        }

    }

}
