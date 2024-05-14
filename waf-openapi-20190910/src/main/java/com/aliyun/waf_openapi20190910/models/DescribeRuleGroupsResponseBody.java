// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeRuleGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleGroups")
    public java.util.List<DescribeRuleGroupsResponseBodyRuleGroups> ruleGroups;

    @NameInMap("TaskStatus")
    public Integer taskStatus;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("WafTaskId")
    public String wafTaskId;

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

    public DescribeRuleGroupsResponseBody setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public Integer getTaskStatus() {
        return this.taskStatus;
    }

    public DescribeRuleGroupsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeRuleGroupsResponseBody setWafTaskId(String wafTaskId) {
        this.wafTaskId = wafTaskId;
        return this;
    }
    public String getWafTaskId() {
        return this.wafTaskId;
    }

    public static class DescribeRuleGroupsResponseBodyRuleGroups extends TeaModel {
        @NameInMap("Desc")
        public String desc;

        @NameInMap("DomainList")
        public java.util.List<String> domainList;

        @NameInMap("Name")
        public String name;

        @NameInMap("PolicyId")
        public Long policyId;

        @NameInMap("RuleCnt")
        public Integer ruleCnt;

        @NameInMap("RuleGroupTemplateName")
        public String ruleGroupTemplateName;

        @NameInMap("RuleGroupUpdateTime")
        public Long ruleGroupUpdateTime;

        @NameInMap("TemplatePolicyId")
        public Long templatePolicyId;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("WafVersion")
        public Long wafVersion;

        public static DescribeRuleGroupsResponseBodyRuleGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeRuleGroupsResponseBodyRuleGroups self = new DescribeRuleGroupsResponseBodyRuleGroups();
            return TeaModel.build(map, self);
        }

        public DescribeRuleGroupsResponseBodyRuleGroups setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public DescribeRuleGroupsResponseBodyRuleGroups setDomainList(java.util.List<String> domainList) {
            this.domainList = domainList;
            return this;
        }
        public java.util.List<String> getDomainList() {
            return this.domainList;
        }

        public DescribeRuleGroupsResponseBodyRuleGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeRuleGroupsResponseBodyRuleGroups setPolicyId(Long policyId) {
            this.policyId = policyId;
            return this;
        }
        public Long getPolicyId() {
            return this.policyId;
        }

        public DescribeRuleGroupsResponseBodyRuleGroups setRuleCnt(Integer ruleCnt) {
            this.ruleCnt = ruleCnt;
            return this;
        }
        public Integer getRuleCnt() {
            return this.ruleCnt;
        }

        public DescribeRuleGroupsResponseBodyRuleGroups setRuleGroupTemplateName(String ruleGroupTemplateName) {
            this.ruleGroupTemplateName = ruleGroupTemplateName;
            return this;
        }
        public String getRuleGroupTemplateName() {
            return this.ruleGroupTemplateName;
        }

        public DescribeRuleGroupsResponseBodyRuleGroups setRuleGroupUpdateTime(Long ruleGroupUpdateTime) {
            this.ruleGroupUpdateTime = ruleGroupUpdateTime;
            return this;
        }
        public Long getRuleGroupUpdateTime() {
            return this.ruleGroupUpdateTime;
        }

        public DescribeRuleGroupsResponseBodyRuleGroups setTemplatePolicyId(Long templatePolicyId) {
            this.templatePolicyId = templatePolicyId;
            return this;
        }
        public Long getTemplatePolicyId() {
            return this.templatePolicyId;
        }

        public DescribeRuleGroupsResponseBodyRuleGroups setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DescribeRuleGroupsResponseBodyRuleGroups setWafVersion(Long wafVersion) {
            this.wafVersion = wafVersion;
            return this;
        }
        public Long getWafVersion() {
            return this.wafVersion;
        }

    }

}
