// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeRuleGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleGroups")
    public java.util.List<DescribeRuleGroupsResponseBodyRuleGroups> ruleGroups;

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
        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("RuleGroupId")
        public Long ruleGroupId;

        @NameInMap("RuleGroupName")
        public String ruleGroupName;

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
