// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUniBackupDatabaseResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the information about the databases.</p>
     */
    @NameInMap("DatabaseList")
    public java.util.List<DescribeUniBackupDatabaseResponseBodyDatabaseList> databaseList;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeUniBackupDatabaseResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUniBackupDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUniBackupDatabaseResponseBody self = new DescribeUniBackupDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUniBackupDatabaseResponseBody setDatabaseList(java.util.List<DescribeUniBackupDatabaseResponseBodyDatabaseList> databaseList) {
        this.databaseList = databaseList;
        return this;
    }
    public java.util.List<DescribeUniBackupDatabaseResponseBodyDatabaseList> getDatabaseList() {
        return this.databaseList;
    }

    public DescribeUniBackupDatabaseResponseBody setPageInfo(DescribeUniBackupDatabaseResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeUniBackupDatabaseResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeUniBackupDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUniBackupDatabaseResponseBodyDatabaseList extends TeaModel {
        /**
         * <p>The status of the anti-ransomware agent. Valid values:</p>
         * <br>
         * <p>*   **UNKNOWN**: unknown</p>
         * <p>*   **INSTALLED**: installed</p>
         * <p>*   **INSTALL_FAILED**: installation failed</p>
         * <p>*   **UNINSTALL_FAILED**: uninstallation failed</p>
         */
        @NameInMap("AgentStatus")
        public String agentStatus;

        /**
         * <p>The service from which the database is created. Valid values:</p>
         * <br>
         * <p>*   **HBR**: HBR</p>
         * <p>*   **AEGIS**: Security Center</p>
         */
        @NameInMap("CreatedByProduct")
        public String createdByProduct;

        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The type of the database. Valid values:</p>
         * <br>
         * <p>*   **MYSQL**</p>
         * <p>*   **MSSQL**</p>
         * <p>*   **Oracle**</p>
         */
        @NameInMap("DatabaseType")
        public String databaseType;

        /**
         * <p>The version of the database engine.</p>
         */
        @NameInMap("DatabaseVersion")
        public String databaseVersion;

        /**
         * <p>The ID of the server.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the instance to which the database belongs.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The UUID of the Hybrid Backup Recovery (HBR) agent that is used to back up the data of the database.</p>
         */
        @NameInMap("InstanceUuid")
        public String instanceUuid;

        /**
         * <p>The ID of the anti-ransomware policy.</p>
         */
        @NameInMap("PolicyId")
        public Long policyId;

        /**
         * <p>The status of the ECS instance. Valid values:</p>
         * <br>
         * <p>*   **Stopped**</p>
         * <p>*   **Running**</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeUniBackupDatabaseResponseBodyDatabaseList build(java.util.Map<String, ?> map) throws Exception {
            DescribeUniBackupDatabaseResponseBodyDatabaseList self = new DescribeUniBackupDatabaseResponseBodyDatabaseList();
            return TeaModel.build(map, self);
        }

        public DescribeUniBackupDatabaseResponseBodyDatabaseList setAgentStatus(String agentStatus) {
            this.agentStatus = agentStatus;
            return this;
        }
        public String getAgentStatus() {
            return this.agentStatus;
        }

        public DescribeUniBackupDatabaseResponseBodyDatabaseList setCreatedByProduct(String createdByProduct) {
            this.createdByProduct = createdByProduct;
            return this;
        }
        public String getCreatedByProduct() {
            return this.createdByProduct;
        }

        public DescribeUniBackupDatabaseResponseBodyDatabaseList setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeUniBackupDatabaseResponseBodyDatabaseList setDatabaseType(String databaseType) {
            this.databaseType = databaseType;
            return this;
        }
        public String getDatabaseType() {
            return this.databaseType;
        }

        public DescribeUniBackupDatabaseResponseBodyDatabaseList setDatabaseVersion(String databaseVersion) {
            this.databaseVersion = databaseVersion;
            return this;
        }
        public String getDatabaseVersion() {
            return this.databaseVersion;
        }

        public DescribeUniBackupDatabaseResponseBodyDatabaseList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeUniBackupDatabaseResponseBodyDatabaseList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeUniBackupDatabaseResponseBodyDatabaseList setInstanceUuid(String instanceUuid) {
            this.instanceUuid = instanceUuid;
            return this;
        }
        public String getInstanceUuid() {
            return this.instanceUuid;
        }

        public DescribeUniBackupDatabaseResponseBodyDatabaseList setPolicyId(Long policyId) {
            this.policyId = policyId;
            return this;
        }
        public Long getPolicyId() {
            return this.policyId;
        }

        public DescribeUniBackupDatabaseResponseBodyDatabaseList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeUniBackupDatabaseResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeUniBackupDatabaseResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeUniBackupDatabaseResponseBodyPageInfo self = new DescribeUniBackupDatabaseResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeUniBackupDatabaseResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeUniBackupDatabaseResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeUniBackupDatabaseResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeUniBackupDatabaseResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
