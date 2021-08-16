// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUniBackupPolicyDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UniBackupPolicyDTO")
    public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTO uniBackupPolicyDTO;

    public static DescribeUniBackupPolicyDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUniBackupPolicyDetailResponseBody self = new DescribeUniBackupPolicyDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUniBackupPolicyDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUniBackupPolicyDetailResponseBody setUniBackupPolicyDTO(DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTO uniBackupPolicyDTO) {
        this.uniBackupPolicyDTO = uniBackupPolicyDTO;
        return this;
    }
    public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTO getUniBackupPolicyDTO() {
        return this.uniBackupPolicyDTO;
    }

    public static class DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOFullPlan extends TeaModel {
        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("PlanType")
        public String planType;

        @NameInMap("Interval")
        public Integer interval;

        @NameInMap("Days")
        public java.util.List<String> days;

        public static DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOFullPlan build(java.util.Map<String, ?> map) throws Exception {
            DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOFullPlan self = new DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOFullPlan();
            return TeaModel.build(map, self);
        }

        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOFullPlan setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOFullPlan setPlanType(String planType) {
            this.planType = planType;
            return this;
        }
        public String getPlanType() {
            return this.planType;
        }

        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOFullPlan setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOFullPlan setDays(java.util.List<String> days) {
            this.days = days;
            return this;
        }
        public java.util.List<String> getDays() {
            return this.days;
        }

    }

    public static class DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOIncPlan extends TeaModel {
        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("PlanType")
        public String planType;

        @NameInMap("Interval")
        public Integer interval;

        @NameInMap("Days")
        public java.util.List<String> days;

        public static DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOIncPlan build(java.util.Map<String, ?> map) throws Exception {
            DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOIncPlan self = new DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOIncPlan();
            return TeaModel.build(map, self);
        }

        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOIncPlan setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOIncPlan setPlanType(String planType) {
            this.planType = planType;
            return this;
        }
        public String getPlanType() {
            return this.planType;
        }

        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOIncPlan setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOIncPlan setDays(java.util.List<String> days) {
            this.days = days;
            return this;
        }
        public java.util.List<String> getDays() {
            return this.days;
        }

    }

    public static class DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTO extends TeaModel {
        @NameInMap("PolicyStatus")
        public String policyStatus;

        @NameInMap("DatabaseType")
        public String databaseType;

        @NameInMap("UniBackUpCount")
        public Integer uniBackUpCount;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("Retention")
        public Integer retention;

        @NameInMap("SpeedLimiter")
        public Long speedLimiter;

        @NameInMap("PolicyName")
        public String policyName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("PolicyId")
        public Long policyId;

        @NameInMap("AgentStatus")
        public String agentStatus;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("FullPlan")
        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOFullPlan fullPlan;

        @NameInMap("IncPlan")
        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOIncPlan incPlan;

        public static DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTO build(java.util.Map<String, ?> map) throws Exception {
            DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTO self = new DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTO();
            return TeaModel.build(map, self);
        }

        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTO setPolicyStatus(String policyStatus) {
            this.policyStatus = policyStatus;
            return this;
        }
        public String getPolicyStatus() {
            return this.policyStatus;
        }

        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTO setDatabaseType(String databaseType) {
            this.databaseType = databaseType;
            return this;
        }
        public String getDatabaseType() {
            return this.databaseType;
        }

        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTO setUniBackUpCount(Integer uniBackUpCount) {
            this.uniBackUpCount = uniBackUpCount;
            return this;
        }
        public Integer getUniBackUpCount() {
            return this.uniBackUpCount;
        }

        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTO setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTO setRetention(Integer retention) {
            this.retention = retention;
            return this;
        }
        public Integer getRetention() {
            return this.retention;
        }

        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTO setSpeedLimiter(Long speedLimiter) {
            this.speedLimiter = speedLimiter;
            return this;
        }
        public Long getSpeedLimiter() {
            return this.speedLimiter;
        }

        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTO setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTO setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTO setPolicyId(Long policyId) {
            this.policyId = policyId;
            return this;
        }
        public Long getPolicyId() {
            return this.policyId;
        }

        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTO setAgentStatus(String agentStatus) {
            this.agentStatus = agentStatus;
            return this;
        }
        public String getAgentStatus() {
            return this.agentStatus;
        }

        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTO setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTO setFullPlan(DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOFullPlan fullPlan) {
            this.fullPlan = fullPlan;
            return this;
        }
        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOFullPlan getFullPlan() {
            return this.fullPlan;
        }

        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTO setIncPlan(DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOIncPlan incPlan) {
            this.incPlan = incPlan;
            return this;
        }
        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOIncPlan getIncPlan() {
            return this.incPlan;
        }

    }

}
