// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAegisContainerPluginRuleResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListAegisContainerPluginRuleResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CE500770-42D3-442E-9DDD-156E0F9F3B45</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The rules.</p>
     */
    @NameInMap("RuleList")
    public java.util.List<ListAegisContainerPluginRuleResponseBodyRuleList> ruleList;

    public static ListAegisContainerPluginRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAegisContainerPluginRuleResponseBody self = new ListAegisContainerPluginRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAegisContainerPluginRuleResponseBody setPageInfo(ListAegisContainerPluginRuleResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListAegisContainerPluginRuleResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListAegisContainerPluginRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAegisContainerPluginRuleResponseBody setRuleList(java.util.List<ListAegisContainerPluginRuleResponseBodyRuleList> ruleList) {
        this.ruleList = ruleList;
        return this;
    }
    public java.util.List<ListAegisContainerPluginRuleResponseBodyRuleList> getRuleList() {
        return this.ruleList;
    }

    public static class ListAegisContainerPluginRuleResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>69</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListAegisContainerPluginRuleResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListAegisContainerPluginRuleResponseBodyPageInfo self = new ListAegisContainerPluginRuleResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListAegisContainerPluginRuleResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListAegisContainerPluginRuleResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAegisContainerPluginRuleResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListAegisContainerPluginRuleResponseBodyRuleListPolicies extends TeaModel {
        /**
         * <p>The policy key.</p>
         * 
         * <strong>example:</strong>
         * <p>system_auto_****</p>
         */
        @NameInMap("PolicyKey")
        public String policyKey;

        /**
         * <p>The name of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>System self-starting task\<em>\</em>\<em>\</em></p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        public static ListAegisContainerPluginRuleResponseBodyRuleListPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListAegisContainerPluginRuleResponseBodyRuleListPolicies self = new ListAegisContainerPluginRuleResponseBodyRuleListPolicies();
            return TeaModel.build(map, self);
        }

        public ListAegisContainerPluginRuleResponseBodyRuleListPolicies setPolicyKey(String policyKey) {
            this.policyKey = policyKey;
            return this;
        }
        public String getPolicyKey() {
            return this.policyKey;
        }

        public ListAegisContainerPluginRuleResponseBodyRuleListPolicies setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

    }

    public static class ListAegisContainerPluginRuleResponseBodyRuleList extends TeaModel {
        /**
         * <p>The time when the rule was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1676355025000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The time when the rule was modified. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1681985833000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The action of the rule. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Alert</li>
         * <li><strong>2</strong>: Block</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Mode")
        public Integer mode;

        /**
         * <p>An array that consists of policies.</p>
         */
        @NameInMap("Policies")
        public java.util.List<ListAegisContainerPluginRuleResponseBodyRuleListPolicies> policies;

        /**
         * <p>The description of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>system_call</p>
         */
        @NameInMap("RuleDescription")
        public String ruleDescription;

        /**
         * <p>The ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>30****</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test-18****</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The ID of the rule template. The ListSystemClientRules operation returns the ID of a rule template.</p>
         * 
         * <strong>example:</strong>
         * <p>868**</p>
         */
        @NameInMap("RuleTemplateId")
        public String ruleTemplateId;

        /**
         * <p>The name of the rule template.</p>
         * 
         * <strong>example:</strong>
         * <p>system_call</p>
         */
        @NameInMap("RuleTemplateName")
        public String ruleTemplateName;

        /**
         * <p>The fields in the value of the rule subtype.</p>
         */
        @NameInMap("SelectedPolicy")
        public java.util.List<String> selectedPolicy;

        /**
         * <p>The switch ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>USER-ENABLE-SWITCH-TYPE_****</p>
         */
        @NameInMap("SwitchId")
        public String switchId;

        /**
         * <p>The images that are added to the whitelist of the rule.</p>
         */
        @NameInMap("WhiteImages")
        public java.util.List<String> whiteImages;

        public static ListAegisContainerPluginRuleResponseBodyRuleList build(java.util.Map<String, ?> map) throws Exception {
            ListAegisContainerPluginRuleResponseBodyRuleList self = new ListAegisContainerPluginRuleResponseBodyRuleList();
            return TeaModel.build(map, self);
        }

        public ListAegisContainerPluginRuleResponseBodyRuleList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAegisContainerPluginRuleResponseBodyRuleList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListAegisContainerPluginRuleResponseBodyRuleList setMode(Integer mode) {
            this.mode = mode;
            return this;
        }
        public Integer getMode() {
            return this.mode;
        }

        public ListAegisContainerPluginRuleResponseBodyRuleList setPolicies(java.util.List<ListAegisContainerPluginRuleResponseBodyRuleListPolicies> policies) {
            this.policies = policies;
            return this;
        }
        public java.util.List<ListAegisContainerPluginRuleResponseBodyRuleListPolicies> getPolicies() {
            return this.policies;
        }

        public ListAegisContainerPluginRuleResponseBodyRuleList setRuleDescription(String ruleDescription) {
            this.ruleDescription = ruleDescription;
            return this;
        }
        public String getRuleDescription() {
            return this.ruleDescription;
        }

        public ListAegisContainerPluginRuleResponseBodyRuleList setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public ListAegisContainerPluginRuleResponseBodyRuleList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListAegisContainerPluginRuleResponseBodyRuleList setRuleTemplateId(String ruleTemplateId) {
            this.ruleTemplateId = ruleTemplateId;
            return this;
        }
        public String getRuleTemplateId() {
            return this.ruleTemplateId;
        }

        public ListAegisContainerPluginRuleResponseBodyRuleList setRuleTemplateName(String ruleTemplateName) {
            this.ruleTemplateName = ruleTemplateName;
            return this;
        }
        public String getRuleTemplateName() {
            return this.ruleTemplateName;
        }

        public ListAegisContainerPluginRuleResponseBodyRuleList setSelectedPolicy(java.util.List<String> selectedPolicy) {
            this.selectedPolicy = selectedPolicy;
            return this;
        }
        public java.util.List<String> getSelectedPolicy() {
            return this.selectedPolicy;
        }

        public ListAegisContainerPluginRuleResponseBodyRuleList setSwitchId(String switchId) {
            this.switchId = switchId;
            return this;
        }
        public String getSwitchId() {
            return this.switchId;
        }

        public ListAegisContainerPluginRuleResponseBodyRuleList setWhiteImages(java.util.List<String> whiteImages) {
            this.whiteImages = whiteImages;
            return this;
        }
        public java.util.List<String> getWhiteImages() {
            return this.whiteImages;
        }

    }

}
