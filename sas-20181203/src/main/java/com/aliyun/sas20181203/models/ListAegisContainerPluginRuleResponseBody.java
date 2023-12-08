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
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
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

    public static class ListAegisContainerPluginRuleResponseBodyRuleList extends TeaModel {
        /**
         * <p>The time when the rule was created. Unit: milliseconds.</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The time when the rule was modified. Unit: milliseconds.</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The action of the rule. Valid values:</p>
         * <br>
         * <p>*   **1**: Alert</p>
         * <p>*   **2**: Block</p>
         */
        @NameInMap("Mode")
        public Integer mode;

        /**
         * <p>The description of the rule.</p>
         */
        @NameInMap("RuleDescription")
        public String ruleDescription;

        /**
         * <p>The ID of the rule.</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The name of the rule.</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The ID of the rule template. The ListSystemClientRules operation returns the ID of a rule template.</p>
         */
        @NameInMap("RuleTemplateId")
        public String ruleTemplateId;

        /**
         * <p>The name of the rule template.</p>
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
