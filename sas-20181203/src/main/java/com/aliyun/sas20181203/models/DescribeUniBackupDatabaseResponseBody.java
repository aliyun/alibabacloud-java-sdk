// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUniBackupDatabaseResponseBody extends TeaModel {
    @NameInMap("DatabaseList")
    public java.util.List<DescribeUniBackupDatabaseResponseBodyDatabaseList> databaseList;

    @NameInMap("PageInfo")
    public DescribeUniBackupDatabaseResponseBodyPageInfo pageInfo;

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
        @NameInMap("AgentStatus")
        public String agentStatus;

        @NameInMap("CreatedByProduct")
        public String createdByProduct;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("DatabaseType")
        public String databaseType;

        @NameInMap("DatabaseVersion")
        public String databaseVersion;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceUuid")
        public String instanceUuid;

        @NameInMap("PolicyId")
        public Long policyId;

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
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

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
