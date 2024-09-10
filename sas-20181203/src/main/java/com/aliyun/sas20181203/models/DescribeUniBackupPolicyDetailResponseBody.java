// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUniBackupPolicyDetailResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>F35F45B0-5D6B-4238-BE02-A62D0760****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the anti-ransomware policy.</p>
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
         * <p>An array that consists of the days of a week on which the backup is performed.</p>
         */
        @NameInMap("Days")
        public java.util.List<String> days;

        /**
         * <p>The interval of backup tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The unit of the interval. Valid values:</p>
         * <ul>
         * <li><strong>hourly</strong>: hour</li>
         * <li><strong>daily</strong>: day</li>
         * <li><strong>weekly</strong>: week</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>daily</p>
         */
        @NameInMap("PlanType")
        public String planType;

        /**
         * <p>The time when the full backup started. The time is in the HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>00:10:00</p>
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
         * <p>An array that consists of the days of a week on which the backup is performed.</p>
         */
        @NameInMap("Days")
        public java.util.List<String> days;

        /**
         * <p>The interval of backup tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The unit of the interval. Valid values:</p>
         * <ul>
         * <li><strong>hourly</strong>: hour</li>
         * <li><strong>daily</strong>: day</li>
         * <li><strong>weekly</strong>: week</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>daily</p>
         */
        @NameInMap("PlanType")
        public String planType;

        /**
         * <p>The time when the incremental data backup starts. The time is in the hh:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>00:10:00</p>
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
         * <p>The name of the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The status of the database client. Valid values:</p>
         * <ul>
         * <li><strong>UNKNOWN</strong>: unknown</li>
         * <li><strong>INSTALLED</strong>: installed</li>
         * <li><strong>INSTALL_FAILED</strong>: installation failed</li>
         * <li><strong>UNINSTALL_FAILED</strong>: uninstallation failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INSTALLED</p>
         */
        @NameInMap("AgentStatus")
        public String agentStatus;

        /**
         * <p>The type of the database. Valid values:</p>
         * <ul>
         * <li><strong>MYSQL</strong></li>
         * <li><strong>MSSQL</strong></li>
         * <li><strong>Oracle</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ORACLE</p>
         */
        @NameInMap("DatabaseType")
        public String databaseType;

        /**
         * <p>The details of the policy for full backup.</p>
         */
        @NameInMap("FullPlan")
        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOFullPlan fullPlan;

        /**
         * <p>The policy for incremental data backup.</p>
         */
        @NameInMap("IncPlan")
        public DescribeUniBackupPolicyDetailResponseBodyUniBackupPolicyDTOIncPlan incPlan;

        /**
         * <p>The ID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>i-2zefcy2id5d60m9t****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>sql-test-01</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The ID of the anti-ransomware policy.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("PolicyId")
        public Long policyId;

        /**
         * <p>The name of the anti-ransomware policy.</p>
         * 
         * <strong>example:</strong>
         * <p>auto_test_sql</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        /**
         * <p>The status of the anti-ransomware policy. Valid values:</p>
         * <ul>
         * <li><strong>initiating</strong>: initializing</li>
         * <li><strong>opening</strong>: enabled</li>
         * <li><strong>closing</strong>: disabled</li>
         * <li><strong>deleting</strong>: deleting</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>opening</p>
         */
        @NameInMap("PolicyStatus")
        public String policyStatus;

        /**
         * <p>The retention period of the backup snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("Retention")
        public Integer retention;

        /**
         * <p>The maximum network bandwidth that is allowed during data backup. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>5242880</p>
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
