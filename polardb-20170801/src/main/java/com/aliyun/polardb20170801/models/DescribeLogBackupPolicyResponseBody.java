// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeLogBackupPolicyResponseBody extends TeaModel {
    @NameInMap("AdvancedLogPolicies")
    public DescribeLogBackupPolicyResponseBodyAdvancedLogPolicies advancedLogPolicies;

    /**
     * <p>Indicates whether the log backup feature is enabled. Valid values:</p>
     * <ul>
     * <li>0: The log backup feature is disabled.</li>
     * <li>1: The log backup feature is enabled. By default, the log backup feature is enabled and cannot be disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EnableBackupLog")
    public Integer enableBackupLog;

    /**
     * <p>The region in which you want to store cross-region log backups. For more information about regions that support the cross-region backup feature, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("LogBackupAnotherRegionRegion")
    public String logBackupAnotherRegionRegion;

    /**
     * <p>The retention period of cross-region log backups. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: The cross-region backup feature is disabled.</li>
     * <li><strong>30 to 7300</strong>: Cross-region log backups are retained for 30 to 7,300 days.</li>
     * <li><strong>-1</strong>: The log backups are permanently retained.</li>
     * </ul>
     * <blockquote>
     * <p> When you create a cluster, the default value of this parameter is <strong>0</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("LogBackupAnotherRegionRetentionPeriod")
    public String logBackupAnotherRegionRetentionPeriod;

    /**
     * <p>The retention period of the log backups. Valid values:</p>
     * <ul>
     * <li>3 to 7300: The log backups are retained for 3 to 7,300 days.</li>
     * <li>\-1: The log backups are permanently retained.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("LogBackupRetentionPeriod")
    public Integer logBackupRetentionPeriod;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>62EE0051-102B-488D-9C79-D607B8******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLogBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogBackupPolicyResponseBody self = new DescribeLogBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLogBackupPolicyResponseBody setAdvancedLogPolicies(DescribeLogBackupPolicyResponseBodyAdvancedLogPolicies advancedLogPolicies) {
        this.advancedLogPolicies = advancedLogPolicies;
        return this;
    }
    public DescribeLogBackupPolicyResponseBodyAdvancedLogPolicies getAdvancedLogPolicies() {
        return this.advancedLogPolicies;
    }

    public DescribeLogBackupPolicyResponseBody setEnableBackupLog(Integer enableBackupLog) {
        this.enableBackupLog = enableBackupLog;
        return this;
    }
    public Integer getEnableBackupLog() {
        return this.enableBackupLog;
    }

    public DescribeLogBackupPolicyResponseBody setLogBackupAnotherRegionRegion(String logBackupAnotherRegionRegion) {
        this.logBackupAnotherRegionRegion = logBackupAnotherRegionRegion;
        return this;
    }
    public String getLogBackupAnotherRegionRegion() {
        return this.logBackupAnotherRegionRegion;
    }

    public DescribeLogBackupPolicyResponseBody setLogBackupAnotherRegionRetentionPeriod(String logBackupAnotherRegionRetentionPeriod) {
        this.logBackupAnotherRegionRetentionPeriod = logBackupAnotherRegionRetentionPeriod;
        return this;
    }
    public String getLogBackupAnotherRegionRetentionPeriod() {
        return this.logBackupAnotherRegionRetentionPeriod;
    }

    public DescribeLogBackupPolicyResponseBody setLogBackupRetentionPeriod(Integer logBackupRetentionPeriod) {
        this.logBackupRetentionPeriod = logBackupRetentionPeriod;
        return this;
    }
    public Integer getLogBackupRetentionPeriod() {
        return this.logBackupRetentionPeriod;
    }

    public DescribeLogBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLogBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy extends TeaModel {
        @NameInMap("DestRegion")
        public String destRegion;

        @NameInMap("DestType")
        public String destType;

        @NameInMap("EnableLogBackup")
        public Integer enableLogBackup;

        @NameInMap("LogRetentionType")
        public String logRetentionType;

        @NameInMap("LogRetentionValue")
        public String logRetentionValue;

        @NameInMap("PolicyId")
        public String policyId;

        @NameInMap("SrcRegion")
        public String srcRegion;

        @NameInMap("SrcType")
        public String srcType;

        public static DescribeLogBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy self = new DescribeLogBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy();
            return TeaModel.build(map, self);
        }

        public DescribeLogBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy setDestRegion(String destRegion) {
            this.destRegion = destRegion;
            return this;
        }
        public String getDestRegion() {
            return this.destRegion;
        }

        public DescribeLogBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy setDestType(String destType) {
            this.destType = destType;
            return this;
        }
        public String getDestType() {
            return this.destType;
        }

        public DescribeLogBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy setEnableLogBackup(Integer enableLogBackup) {
            this.enableLogBackup = enableLogBackup;
            return this;
        }
        public Integer getEnableLogBackup() {
            return this.enableLogBackup;
        }

        public DescribeLogBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy setLogRetentionType(String logRetentionType) {
            this.logRetentionType = logRetentionType;
            return this;
        }
        public String getLogRetentionType() {
            return this.logRetentionType;
        }

        public DescribeLogBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy setLogRetentionValue(String logRetentionValue) {
            this.logRetentionValue = logRetentionValue;
            return this;
        }
        public String getLogRetentionValue() {
            return this.logRetentionValue;
        }

        public DescribeLogBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public DescribeLogBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy setSrcRegion(String srcRegion) {
            this.srcRegion = srcRegion;
            return this;
        }
        public String getSrcRegion() {
            return this.srcRegion;
        }

        public DescribeLogBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy setSrcType(String srcType) {
            this.srcType = srcType;
            return this;
        }
        public String getSrcType() {
            return this.srcType;
        }

    }

    public static class DescribeLogBackupPolicyResponseBodyAdvancedLogPolicies extends TeaModel {
        @NameInMap("AdvancedLogPolicy")
        public java.util.List<DescribeLogBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy> advancedLogPolicy;

        public static DescribeLogBackupPolicyResponseBodyAdvancedLogPolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogBackupPolicyResponseBodyAdvancedLogPolicies self = new DescribeLogBackupPolicyResponseBodyAdvancedLogPolicies();
            return TeaModel.build(map, self);
        }

        public DescribeLogBackupPolicyResponseBodyAdvancedLogPolicies setAdvancedLogPolicy(java.util.List<DescribeLogBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy> advancedLogPolicy) {
            this.advancedLogPolicy = advancedLogPolicy;
            return this;
        }
        public java.util.List<DescribeLogBackupPolicyResponseBodyAdvancedLogPoliciesAdvancedLogPolicy> getAdvancedLogPolicy() {
            return this.advancedLogPolicy;
        }

    }

}
