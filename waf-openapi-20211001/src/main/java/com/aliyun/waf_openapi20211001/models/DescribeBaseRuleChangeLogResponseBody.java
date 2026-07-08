// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeBaseRuleChangeLogResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6FBF08CB-8691-5B65-BBF8-***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of rule change records.</p>
     */
    @NameInMap("Rules")
    public java.util.List<DescribeBaseRuleChangeLogResponseBodyRules> rules;

    /**
     * <p>The total number of rule change records.</p>
     * 
     * <strong>example:</strong>
     * <p>63</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeBaseRuleChangeLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBaseRuleChangeLogResponseBody self = new DescribeBaseRuleChangeLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBaseRuleChangeLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBaseRuleChangeLogResponseBody setRules(java.util.List<DescribeBaseRuleChangeLogResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<DescribeBaseRuleChangeLogResponseBodyRules> getRules() {
        return this.rules;
    }

    public DescribeBaseRuleChangeLogResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeBaseRuleChangeLogResponseBodyRules extends TeaModel {
        /**
         * <p>The CVE ID of the vulnerability associated with the system rule.</p>
         * 
         * <strong>example:</strong>
         * <p>CVE-2021-34538</p>
         */
        @NameInMap("CveId")
        public String cveId;

        /**
         * <p>The type of change. Valid values:</p>
         * <ul>
         * <li><p><strong>add</strong>: The rule was added.</p>
         * </li>
         * <li><p><strong>modify</strong>: The rule was modified.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>42755</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>Header XSS Scanner Behavior</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The time when the rule was updated, in UNIX timestamp format. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1665460629000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static DescribeBaseRuleChangeLogResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeBaseRuleChangeLogResponseBodyRules self = new DescribeBaseRuleChangeLogResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribeBaseRuleChangeLogResponseBodyRules setCveId(String cveId) {
            this.cveId = cveId;
            return this;
        }
        public String getCveId() {
            return this.cveId;
        }

        public DescribeBaseRuleChangeLogResponseBodyRules setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public DescribeBaseRuleChangeLogResponseBodyRules setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DescribeBaseRuleChangeLogResponseBodyRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeBaseRuleChangeLogResponseBodyRules setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
