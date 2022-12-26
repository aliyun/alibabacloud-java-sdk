// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUniBackupPoliciesResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    public DescribeUniBackupPoliciesResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

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
        @NameInMap("AgentErrorMessage")
        public String agentErrorMessage;

        @NameInMap("AgentStatus")
        public String agentStatus;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("DatabaseType")
        public String databaseType;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceStatus")
        public String instanceStatus;

        @NameInMap("InstanceUuid")
        public String instanceUuid;

        @NameInMap("LatestBackResult")
        public String latestBackResult;

        @NameInMap("LatestBackupTime")
        public String latestBackupTime;

        @NameInMap("PlanStatus")
        public String planStatus;

        @NameInMap("PolicyId")
        public Long policyId;

        @NameInMap("PolicyName")
        public String policyName;

        @NameInMap("PolicyStatus")
        public String policyStatus;

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
