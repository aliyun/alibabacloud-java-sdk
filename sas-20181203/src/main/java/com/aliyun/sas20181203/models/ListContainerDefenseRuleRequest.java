// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListContainerDefenseRuleRequest extends TeaModel {
    /**
     * <p>The details of the condition.</p>
     */
    @NameInMap("Conditions")
    public java.util.List<ListContainerDefenseRuleRequestConditions> conditions;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Specifies whether to query system rules.</p>
     * <br>
     * <p>>  This parameter is deprecated.</p>
     */
    @NameInMap("IsDefaultRule")
    public Integer isDefaultRule;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese.</p>
     * <p>*   **en**: English.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries per page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
     * <br>
     * <p>>  We recommend that you do not leave this parameter empty.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The rule type. Valid values:</p>
     * <br>
     * <p>*   1: system rule</p>
     * <p>*   2: user-defined rule</p>
     */
    @NameInMap("RuleType")
    public Integer ruleType;

    public static ListContainerDefenseRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListContainerDefenseRuleRequest self = new ListContainerDefenseRuleRequest();
        return TeaModel.build(map, self);
    }

    public ListContainerDefenseRuleRequest setConditions(java.util.List<ListContainerDefenseRuleRequestConditions> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<ListContainerDefenseRuleRequestConditions> getConditions() {
        return this.conditions;
    }

    public ListContainerDefenseRuleRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListContainerDefenseRuleRequest setIsDefaultRule(Integer isDefaultRule) {
        this.isDefaultRule = isDefaultRule;
        return this;
    }
    public Integer getIsDefaultRule() {
        return this.isDefaultRule;
    }

    public ListContainerDefenseRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListContainerDefenseRuleRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListContainerDefenseRuleRequest setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public Integer getRuleType() {
        return this.ruleType;
    }

    public static class ListContainerDefenseRuleRequestConditions extends TeaModel {
        /**
         * <p>The condition type. Valid values:</p>
         * <br>
         * <p>*   **ruleName**: the rule name</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The rule content.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListContainerDefenseRuleRequestConditions build(java.util.Map<String, ?> map) throws Exception {
            ListContainerDefenseRuleRequestConditions self = new ListContainerDefenseRuleRequestConditions();
            return TeaModel.build(map, self);
        }

        public ListContainerDefenseRuleRequestConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListContainerDefenseRuleRequestConditions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
