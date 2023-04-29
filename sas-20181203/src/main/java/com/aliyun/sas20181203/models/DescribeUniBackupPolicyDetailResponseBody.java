// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUniBackupPolicyDetailResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
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
        /**
         * <p>The interval of backup tasks.</p>
         */
        @NameInMap("Days")
        public java.util.List<String> days;

        /**
         * <p>The unit of the interval. Valid values:</p>
         * <br>
         * <p>*   **hourly**: hour</p>
         * <p>*   **daily**: day</p>
         * <p>*   **weekly**: week</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The time when the full backup started. The time is in the HH:mm:ss format.</p>
         */
        @NameInMap("PlanType")
        public String planType;

        /**
         * <p>The details of the policy for full backup.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOFullPlan build(java.util.Map<String, ?> map) throws Exception {
            DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOFullPlan self = new DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOFullPlan();
            return TeaModel.build(map, self);
        }

        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOFullPlan setDays(java.util.List<String> days) {
            this.days = days;
            return this;
        }
        public java.util.List<String> getDays() {
            return this.days;
        }

        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOFullPlan setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOFullPlan setPlanType(String planType) {
            this.planType = planType;
            return this;
        }
        public String getPlanType() {
            return this.planType;
        }

        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOFullPlan setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOIncPlan extends TeaModel {
        /**
         * <p>The interval of backup tasks.</p>
         */
        @NameInMap("Days")
        public java.util.List<String> days;

        /**
         * <p>The unit of the interval. Valid values:</p>
         * <br>
         * <p>*   **hourly**: hour</p>
         * <p>*   **daily**: day</p>
         * <p>*   **weekly**: week</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The time when the incremental backup started. The time is in the HH:mm:ss format.</p>
         */
        @NameInMap("PlanType")
        public String planType;

        /**
         * <p>The details of the policy for incremental backup.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOIncPlan build(java.util.Map<String, ?> map) throws Exception {
            DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOIncPlan self = new DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOIncPlan();
            return TeaModel.build(map, self);
        }

        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOIncPlan setDays(java.util.List<String> days) {
            this.days = days;
            return this;
        }
        public java.util.List<String> getDays() {
            return this.days;
        }

        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOIncPlan setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOIncPlan setPlanType(String planType) {
            this.planType = planType;
            return this;
        }
        public String getPlanType() {
            return this.planType;
        }

        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOIncPlan setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTO extends TeaModel {
        /**
         * <p>The status of the database client. Valid values:</p>
         * <br>
         * <p>*   **UNKNOWN**: unknown</p>
         * <p>*   **INSTALLED**: installed</p>
         * <p>*   **INSTALL_FAILED**: installation failed</p>
         * <p>*   **UNINSTALL_FAILED**: uninstallation failed</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The ID of the anti-ransomware policy.</p>
         */
        @NameInMap("AgentStatus")
        public String agentStatus;

        /**
         * <p>The status of the anti-ransomware policy. Valid values:</p>
         * <br>
         * <p>*   **initiating**: initializing</p>
         * <p>*   **opening**: enabled</p>
         * <p>*   **closing**: disabled</p>
         * <p>*   **deleting**: deleting</p>
         */
        @NameInMap("DatabaseType")
        public String databaseType;

        /**
         * <p>The name of the database account.</p>
         */
        @NameInMap("FullPlan")
        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOFullPlan fullPlan;

        /**
         * <p>The day of a week on which the backup is performed. Valid values:</p>
         * <br>
         * <p>*   **0**: Sunday</p>
         * <p>*   **1**: Monday</p>
         * <p>*   **2**: Tuesday</p>
         * <p>*   **3**: Wednesday</p>
         * <p>*   **4**: Thursday</p>
         * <p>*   **5**: Friday</p>
         * <p>*   **6**: Saturday</p>
         */
        @NameInMap("IncPlan")
        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOIncPlan incPlan;

        /**
         * <p>The name of the anti-ransomware policy.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The type of the database. Valid values:</p>
         * <br>
         * <p>*   **MYSQL**</p>
         * <p>*   **MSSQL**</p>
         * <p>*   **Oracle**</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The ID of the server.</p>
         */
        @NameInMap("PolicyId")
        public Long policyId;

        /**
         * <p>The maximum network bandwidth that is allowed during data backup. Unit: bytes.</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <p>The details of the anti-ransomware policy.</p>
         */
        @NameInMap("PolicyStatus")
        public String policyStatus;

        /**
         * <p>The name of the server.</p>
         */
        @NameInMap("Retention")
        public Integer retention;

        /**
         * <p>The retention period of the backup snapshot.</p>
         */
        @NameInMap("SpeedLimiter")
        public Long speedLimiter;

        public static DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTO build(java.util.Map<String, ?> map) throws Exception {
            DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTO self = new DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTO();
            return TeaModel.build(map, self);
        }

        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTO setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTO setAgentStatus(String agentStatus) {
            this.agentStatus = agentStatus;
            return this;
        }
        public String getAgentStatus() {
            return this.agentStatus;
        }

        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTO setDatabaseType(String databaseType) {
            this.databaseType = databaseType;
            return this;
        }
        public String getDatabaseType() {
            return this.databaseType;
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

        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTO setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTO setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTO setPolicyId(Long policyId) {
            this.policyId = policyId;
            return this;
        }
        public Long getPolicyId() {
            return this.policyId;
        }

        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTO setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTO setPolicyStatus(String policyStatus) {
            this.policyStatus = policyStatus;
            return this;
        }
        public String getPolicyStatus() {
            return this.policyStatus;
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

    }

}
