// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListSystemClientRulesResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    public ListSystemClientRulesResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleList")
    public java.util.List<ListSystemClientRulesResponseBodyRuleList> ruleList;

    public static ListSystemClientRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSystemClientRulesResponseBody self = new ListSystemClientRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSystemClientRulesResponseBody setPageInfo(ListSystemClientRulesResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListSystemClientRulesResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListSystemClientRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSystemClientRulesResponseBody setRuleList(java.util.List<ListSystemClientRulesResponseBodyRuleList> ruleList) {
        this.ruleList = ruleList;
        return this;
    }
    public java.util.List<ListSystemClientRulesResponseBodyRuleList> getRuleList() {
        return this.ruleList;
    }

    public static class ListSystemClientRulesResponseBodyPageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListSystemClientRulesResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListSystemClientRulesResponseBodyPageInfo self = new ListSystemClientRulesResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListSystemClientRulesResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListSystemClientRulesResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListSystemClientRulesResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListSystemClientRulesResponseBodyRuleListPolicies extends TeaModel {
        @NameInMap("PolicyKey")
        public String policyKey;

        @NameInMap("PolicyName")
        public String policyName;

        public static ListSystemClientRulesResponseBodyRuleListPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListSystemClientRulesResponseBodyRuleListPolicies self = new ListSystemClientRulesResponseBodyRuleListPolicies();
            return TeaModel.build(map, self);
        }

        public ListSystemClientRulesResponseBodyRuleListPolicies setPolicyKey(String policyKey) {
            this.policyKey = policyKey;
            return this;
        }
        public String getPolicyKey() {
            return this.policyKey;
        }

        public ListSystemClientRulesResponseBodyRuleListPolicies setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

    }

    public static class ListSystemClientRulesResponseBodyRuleList extends TeaModel {
        @NameInMap("AggregationName")
        public String aggregationName;

        @NameInMap("Description")
        public String description;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("Policies")
        public java.util.List<ListSystemClientRulesResponseBodyRuleListPolicies> policies;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleType")
        public Integer ruleType;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("SwitchId")
        public String switchId;

        public static ListSystemClientRulesResponseBodyRuleList build(java.util.Map<String, ?> map) throws Exception {
            ListSystemClientRulesResponseBodyRuleList self = new ListSystemClientRulesResponseBodyRuleList();
            return TeaModel.build(map, self);
        }

        public ListSystemClientRulesResponseBodyRuleList setAggregationName(String aggregationName) {
            this.aggregationName = aggregationName;
            return this;
        }
        public String getAggregationName() {
            return this.aggregationName;
        }

        public ListSystemClientRulesResponseBodyRuleList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSystemClientRulesResponseBodyRuleList setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListSystemClientRulesResponseBodyRuleList setPolicies(java.util.List<ListSystemClientRulesResponseBodyRuleListPolicies> policies) {
            this.policies = policies;
            return this;
        }
        public java.util.List<ListSystemClientRulesResponseBodyRuleListPolicies> getPolicies() {
            return this.policies;
        }

        public ListSystemClientRulesResponseBodyRuleList setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public ListSystemClientRulesResponseBodyRuleList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListSystemClientRulesResponseBodyRuleList setRuleType(Integer ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public Integer getRuleType() {
            return this.ruleType;
        }

        public ListSystemClientRulesResponseBodyRuleList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListSystemClientRulesResponseBodyRuleList setSwitchId(String switchId) {
            this.switchId = switchId;
            return this;
        }
        public String getSwitchId() {
            return this.switchId;
        }

    }

}
