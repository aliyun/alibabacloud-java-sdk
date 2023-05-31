// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListSystemClientRulesResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListSystemClientRulesResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of the system defense rules.</p>
     */
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
        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
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
        /**
         * <p>The policy key.</p>
         */
        @NameInMap("PolicyKey")
        public String policyKey;

        /**
         * <p>The name of the policy.</p>
         */
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
        /**
         * <p>The name of the aggregation type for the system defense rule.</p>
         */
        @NameInMap("AggregationName")
        public String aggregationName;

        /**
         * <p>The description of the system defense rule.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The type of the OS. Valid values:</p>
         * <br>
         * <p>*   **windows**: Windows</p>
         * <p>*   **linux**: Linux</p>
         * <p>*   **all**: all types</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>An array that consists of policies.</p>
         */
        @NameInMap("Policies")
        public java.util.List<ListSystemClientRulesResponseBodyRuleListPolicies> policies;

        /**
         * <p>The ID of the system defense rule.</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The name of the system defense rule.</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The type of the system defense rule. Valid values:</p>
         * <br>
         * <p>*   **1**: alihips</p>
         * <p>*   **2**: alinet</p>
         * <p>*   **3**: alidetect</p>
         * <p>*   **4**: alisecguard</p>
         */
        @NameInMap("RuleType")
        public Integer ruleType;

        /**
         * <p>The status of the system defense rule. Valid values:</p>
         * <br>
         * <p>*   **online**: enabled</p>
         * <p>*   **offline**: disabled</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The switch ID of the system defense rule.</p>
         */
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
