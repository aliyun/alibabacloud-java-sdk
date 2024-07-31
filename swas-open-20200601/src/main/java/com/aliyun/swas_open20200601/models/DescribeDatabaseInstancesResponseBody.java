// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeDatabaseInstancesResponseBody extends TeaModel {
    /**
     * <p>The information about the Simple Database Service instances.</p>
     */
    @NameInMap("DatabaseInstances")
    public java.util.List<DescribeDatabaseInstancesResponseBodyDatabaseInstances> databaseInstances;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20758A-585D-4A41-A9B2-28DA8F4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
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
        /**
         * <p>The business status of the instance. Valid values:</p>
         * <ul>
         * <li>normal</li>
         * <li>expired</li>
         * <li>overdue</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("BusinessStatus")
        public String businessStatus;

        /**
         * <p>The billing method of the Simple Database Service instance. Set the value to PrePaid. This value indicates the subscription billing method.</p>
         * <p>Default value: PrePaid.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The number of vCPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Cpu")
        public String cpu;

        /**
         * <p>The time when the instance was created. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-01T02:39:46Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The plan edition ID of the Simple Database Service instance. Valid values:</p>
         * <ul>
         * <li>swas.db.c1m1s25: CNY 35/month.</li>
         * <li>swas.db.c1m2s80: CNY 100/month.</li>
         * <li>swas.db.c2m4s120: CNY 200/month.</li>
         * <li>swas.db.c2m8s240: CNY 300/month.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>swas.db.c1m1s25</p>
         */
        @NameInMap("DatabaseInstanceEdition")
        public String databaseInstanceEdition;

        /**
         * <p>The ID of the Simple Database Service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>db-38263fa955774501a2ae1bdaed6f****</p>
         */
        @NameInMap("DatabaseInstanceId")
        public String databaseInstanceId;

        /**
         * <p>The name of the Simple Database Service instance.</p>
         */
        @NameInMap("DatabaseInstanceName")
        public String databaseInstanceName;

        /**
         * <p>The status of the Simple Database Service instance. Valid values:</p>
         * <ul>
         * <li>Pending: The instance is being created.</li>
         * <li>Restarting: The instance is being restarted.</li>
         * <li>Running: The instance is running.</li>
         * <li>Stopping: The instance is being stopped.</li>
         * <li>Stopped: The instance is stopped.</li>
         * <li>UPGRADING: The instance is being upgraded.</li>
         * <li>DISABLED: The instance is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DatabaseInstanceStatus")
        public String databaseInstanceStatus;

        /**
         * <p>The database engine version of the instance. Valid values:</p>
         * <ul>
         * <li>5.7: MySQL 5.7.</li>
         * <li>8.0: MySQL 8.0.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5.7</p>
         */
        @NameInMap("DatabaseVersion")
        public String databaseVersion;

        /**
         * <p>The time when the instance expires. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * <blockquote>
         * <p> The time displayed in the Simple Application Server console is in the format of UTC+8.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-10-01T16:00:00Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The memory size of the instance. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Memory")
        public String memory;

        /**
         * <p>The private endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1d39opj7906****.mysql.rds.aliyuncs.com</p>
         */
        @NameInMap("PrivateConnection")
        public String privateConnection;

        /**
         * <p>The public endpoint.</p>
         * <blockquote>
         * <p> This parameter is displayed only after you apply for a public endpoint for the instance and a public endpoint is assigned to the instance. You can call <a href="https://help.aliyun.com/document_detail/451413.html">AllocatePublicConnection</a> to apply for a public endpoint for the instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>db-38263fa955774501a2ae1bdaed6f****.mysql.rds.aliyuncs.com</p>
         */
        @NameInMap("PublicConnection")
        public String publicConnection;

        /**
         * <p>The region ID of the Simple Database Service instances.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The size of the enhanced SSD (ESSD). Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("Storage")
        public Integer storage;

        /**
         * <p>The name of the super administrator account of the Simple Database Service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>administrator</p>
         */
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
