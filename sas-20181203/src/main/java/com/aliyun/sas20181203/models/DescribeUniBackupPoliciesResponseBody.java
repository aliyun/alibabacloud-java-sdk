// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUniBackupPoliciesResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeUniBackupPoliciesResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of the anti-ransomware policies.</p>
     */
    @NameInMap("UniBackupPolicies")
    public java.util.List<DescribeUniBackupPoliciesResponseBodyUniBackupPolicies> uniBackupPolicies;

    public static DescribeUniBackupPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUniBackupPoliciesResponseBody self = new DescribeUniBackupPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUniBackupPoliciesResponseBody setPageInfo(DescribeUniBackupPoliciesResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeUniBackupPoliciesResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeUniBackupPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUniBackupPoliciesResponseBody setUniBackupPolicies(java.util.List<DescribeUniBackupPoliciesResponseBodyUniBackupPolicies> uniBackupPolicies) {
        this.uniBackupPolicies = uniBackupPolicies;
        return this;
    }
    public java.util.List<DescribeUniBackupPoliciesResponseBodyUniBackupPolicies> getUniBackupPolicies() {
        return this.uniBackupPolicies;
    }

    public static class DescribeUniBackupPoliciesResponseBodyPageInfo extends TeaModel {
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

        public static DescribeUniBackupPoliciesResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeUniBackupPoliciesResponseBodyPageInfo self = new DescribeUniBackupPoliciesResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeUniBackupPoliciesResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeUniBackupPoliciesResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeUniBackupPoliciesResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeUniBackupPoliciesResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeUniBackupPoliciesResponseBodyUniBackupPolicies extends TeaModel {
        /**
         * <p>The error message for the anti-ransomware agent.</p>
         */
        @NameInMap("AgentErrorMessage")
        public String agentErrorMessage;

        /**
         * <p>The status of the agent. Valid values:</p>
         * <br>
         * <p>*   **UNKNOWN**: unknown</p>
         * <p>*   **INSTALLED**: installed</p>
         * <p>*   **INSTALL_FAILED**: installation failed</p>
         * <p>*   **UNINSTALL_FAILED**: uninstallation failed</p>
         */
        @NameInMap("AgentStatus")
        public String agentStatus;

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
         * <p>The error code returned when the backup task fails.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message for the anti-ransomware policy.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The ID of the server.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the server.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The status of the Elastic Compute Service (ECS) instance. Valid values:</p>
         * <br>
         * <p>*   **Stopped**</p>
         * <p>*   **Running**</p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        /**
         * <p>The UUID of the agent that is used to back up the data of the database.</p>
         */
        @NameInMap("InstanceUuid")
        public String instanceUuid;

        /**
         * <p>The execution result of the last backup task.</p>
         */
        @NameInMap("LatestBackResult")
        public String latestBackResult;

        /**
         * <p>The time when the last backup task was executed.</p>
         */
        @NameInMap("LatestBackupTime")
        public String latestBackupTime;

        /**
         * <p>The status of the backup task. Valid values:</p>
         * <br>
         * <p>*   **init**: initializing</p>
         * <p>*   **running**: running</p>
         * <p>*   **completed**: complete</p>
         * <p>*   **restoring**: restoring</p>
         * <p>*   **creating**: creating</p>
         * <p>*   **created**: created</p>
         */
        @NameInMap("PlanStatus")
        public String planStatus;

        /**
         * <p>The ID of the anti-ransomware policy.</p>
         */
        @NameInMap("PolicyId")
        public Long policyId;

        /**
         * <p>The name of the anti-ransomware policy.</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <p>The status of the anti-ransomware policy. Valid values:</p>
         * <br>
         * <p>*   **initiating**: initializing</p>
         * <p>*   **opening**: enabled</p>
         * <p>*   **closing**: disabled</p>
         * <p>*   **deleting**: deleting</p>
         */
        @NameInMap("PolicyStatus")
        public String policyStatus;

        /**
         * <p>The region ID of the server that hosts the database.</p>
         */
        @NameInMap("UniRegionId")
        public String uniRegionId;

        public static DescribeUniBackupPoliciesResponseBodyUniBackupPolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribeUniBackupPoliciesResponseBodyUniBackupPolicies self = new DescribeUniBackupPoliciesResponseBodyUniBackupPolicies();
            return TeaModel.build(map, self);
        }

        public DescribeUniBackupPoliciesResponseBodyUniBackupPolicies setAgentErrorMessage(String agentErrorMessage) {
            this.agentErrorMessage = agentErrorMessage;
            return this;
        }
        public String getAgentErrorMessage() {
            return this.agentErrorMessage;
        }

        public DescribeUniBackupPoliciesResponseBodyUniBackupPolicies setAgentStatus(String agentStatus) {
            this.agentStatus = agentStatus;
            return this;
        }
        public String getAgentStatus() {
            return this.agentStatus;
        }

        public DescribeUniBackupPoliciesResponseBodyUniBackupPolicies setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeUniBackupPoliciesResponseBodyUniBackupPolicies setDatabaseType(String databaseType) {
            this.databaseType = databaseType;
            return this;
        }
        public String getDatabaseType() {
            return this.databaseType;
        }

        public DescribeUniBackupPoliciesResponseBodyUniBackupPolicies setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeUniBackupPoliciesResponseBodyUniBackupPolicies setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeUniBackupPoliciesResponseBodyUniBackupPolicies setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeUniBackupPoliciesResponseBodyUniBackupPolicies setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeUniBackupPoliciesResponseBodyUniBackupPolicies setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public DescribeUniBackupPoliciesResponseBodyUniBackupPolicies setInstanceUuid(String instanceUuid) {
            this.instanceUuid = instanceUuid;
            return this;
        }
        public String getInstanceUuid() {
            return this.instanceUuid;
        }

        public DescribeUniBackupPoliciesResponseBodyUniBackupPolicies setLatestBackResult(String latestBackResult) {
            this.latestBackResult = latestBackResult;
            return this;
        }
        public String getLatestBackResult() {
            return this.latestBackResult;
        }

        public DescribeUniBackupPoliciesResponseBodyUniBackupPolicies setLatestBackupTime(String latestBackupTime) {
            this.latestBackupTime = latestBackupTime;
            return this;
        }
        public String getLatestBackupTime() {
            return this.latestBackupTime;
        }

        public DescribeUniBackupPoliciesResponseBodyUniBackupPolicies setPlanStatus(String planStatus) {
            this.planStatus = planStatus;
            return this;
        }
        public String getPlanStatus() {
            return this.planStatus;
        }

        public DescribeUniBackupPoliciesResponseBodyUniBackupPolicies setPolicyId(Long policyId) {
            this.policyId = policyId;
            return this;
        }
        public Long getPolicyId() {
            return this.policyId;
        }

        public DescribeUniBackupPoliciesResponseBodyUniBackupPolicies setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public DescribeUniBackupPoliciesResponseBodyUniBackupPolicies setPolicyStatus(String policyStatus) {
            this.policyStatus = policyStatus;
            return this;
        }
        public String getPolicyStatus() {
            return this.policyStatus;
        }

        public DescribeUniBackupPoliciesResponseBodyUniBackupPolicies setUniRegionId(String uniRegionId) {
            this.uniRegionId = uniRegionId;
            return this;
        }
        public String getUniRegionId() {
            return this.uniRegionId;
        }

    }

}
