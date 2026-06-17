// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeLogBackupPolicyResponseBody extends TeaModel {
    @NameInMap("AdvancedLogPolicies")
    public DescribeLogBackupPolicyResponseBodyAdvancedLogPolicies advancedLogPolicies;

    /**
     * <p>Indicates whether the log backup feature is enabled. Valid values:</p>
     * <ul>
     * <li><p>0: The feature is disabled.</p>
     * </li>
     * <li><p>1: The feature is enabled. By default, the log backup feature is enabled and cannot be disabled.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If the advanced backup feature is enabled, this parameter is not recommended. Use the AdvancedLogPolicies parameter instead.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EnableBackupLog")
    public Integer enableBackupLog;

    /**
     * <p>The region in which the cross-region log backup is stored. For information about the regions that support cross-region backup, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</p>
     * <blockquote>
     * <p>If the advanced backup feature is enabled, this parameter is not recommended. Use the AdvancedLogPolicies parameter instead.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("LogBackupAnotherRegionRegion")
    public String logBackupAnotherRegionRegion;

    /**
     * <p>The retention period of the cross-region log backup. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: The cross-region log backup feature is disabled.</p>
     * </li>
     * <li><p><strong>30 to 7300</strong>: The cross-region log backup is retained for 30 to 7300 days.</p>
     * </li>
     * <li><p><strong>-1</strong>: The cross-region log backups are retained permanently.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><ul>
     * <li>When you create a cluster, the default value is <strong>0</strong>. This value indicates that the cross-region log backup feature is disabled.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>If the advanced backup feature is enabled, this parameter is not recommended. Use the AdvancedLogPolicies parameter instead.</li>
     * </ul>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("LogBackupAnotherRegionRetentionPeriod")
    public String logBackupAnotherRegionRetentionPeriod;

    /**
     * <p>The retention period of the log backup. Valid values:</p>
     * <ul>
     * <li><p>3 to 7300: The log backup is retained for 3 to 7300 days.</p>
     * </li>
     * <li><p>-1: The log backups are retained permanently.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If the advanced backup feature is enabled, this parameter is not recommended. Use the AdvancedLogPolicies parameter instead.</li>
     * </ul>
     * </blockquote>
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
