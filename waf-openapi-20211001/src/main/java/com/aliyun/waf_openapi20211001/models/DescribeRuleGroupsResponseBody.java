// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeRuleGroupsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>02E9A4B8-90FB-5F41-A049-C82277EB82FB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array of regular expression rule groups.</p>
     */
    @NameInMap("RuleGroups")
    public java.util.List<DescribeRuleGroupsResponseBodyRuleGroups> ruleGroups;

    /**
     * <p>The total number of entries that are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>24</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeRuleGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleGroupsResponseBody self = new DescribeRuleGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRuleGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRuleGroupsResponseBody setRuleGroups(java.util.List<DescribeRuleGroupsResponseBodyRuleGroups> ruleGroups) {
        this.ruleGroups = ruleGroups;
        return this;
    }
    public java.util.List<DescribeRuleGroupsResponseBodyRuleGroups> getRuleGroups() {
        return this.ruleGroups;
    }

    public DescribeRuleGroupsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRuleGroupsResponseBodyRuleGroups extends TeaModel {
        /**
         * <p>The most recent time when the rule group was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1664336364000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>Indicates whether the automatic update feature is enabled for the rule group.</p>
         * <ul>
         * <li>1: The automatic update feature is enabled for the rule group.</li>
         * <li>2: The automatic update feature is disabled for the rule group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsSubscribe")
        public Integer isSubscribe;

        /**
         * <p>The ID of the rule group.</p>
         * <ul>
         * <li>0: The rule group is created from scratch.</li>
         * <li>1011: The rule group is a strict rule group.</li>
         * <li>1012: The rule group is a medium rule group.</li>
         * <li>1013: The rue group is a loose rule group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1012</p>
         */
        @NameInMap("ParentRuleGroupId")
        public Long parentRuleGroupId;

        /**
         * <p>The ID of the regular expression rule group.</p>
         * 
         * <strong>example:</strong>
         * <p>115361</p>
         */
        @NameInMap("RuleGroupId")
        public Long ruleGroupId;

        /**
         * <p>The name of the rule group.</p>
         * 
         * <strong>example:</strong>
         * <p>ssssss</p>
         */
        @NameInMap("RuleGroupName")
        public String ruleGroupName;

        /**
         * <p>The number of built-in rules in the rule group.</p>
         * 
         * <strong>example:</strong>
         * <p>4444</p>
         */
        @NameInMap("RuleTotalCount")
        public Integer ruleTotalCount;

        public static DescribeRuleGroupsResponseBodyRuleGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeRuleGroupsResponseBodyRuleGroups self = new DescribeRuleGroupsResponseBodyRuleGroups();
            return TeaModel.build(map, self);
        }

        public DescribeRuleGroupsResponseBodyRuleGroups setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeRuleGroupsResponseBodyRuleGroups setIsSubscribe(Integer isSubscribe) {
            this.isSubscribe = isSubscribe;
            return this;
        }
        public Integer getIsSubscribe() {
            return this.isSubscribe;
        }

        public DescribeRuleGroupsResponseBodyRuleGroups setParentRuleGroupId(Long parentRuleGroupId) {
            this.parentRuleGroupId = parentRuleGroupId;
            return this;
        }
        public Long getParentRuleGroupId() {
            return this.parentRuleGroupId;
        }

        public DescribeRuleGroupsResponseBodyRuleGroups setRuleGroupId(Long ruleGroupId) {
            this.ruleGroupId = ruleGroupId;
            return this;
        }
        public Long getRuleGroupId() {
            return this.ruleGroupId;
        }

        public DescribeRuleGroupsResponseBodyRuleGroups setRuleGroupName(String ruleGroupName) {
            this.ruleGroupName = ruleGroupName;
            return this;
        }
        public String getRuleGroupName() {
            return this.ruleGroupName;
        }

        public DescribeRuleGroupsResponseBodyRuleGroups setRuleTotalCount(Integer ruleTotalCount) {
            this.ruleTotalCount = ruleTotalCount;
            return this;
        }
        public Integer getRuleTotalCount() {
            return this.ruleTotalCount;
        }

    }

}
