// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListSystemClientRulesRequest extends TeaModel {
    /**
     * <p>The IDs of the aggregation types for rules.</p>
     */
    @NameInMap("AggregationIds")
    public java.util.List<Integer> aggregationIds;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Specifies whether to query only container images. Valid values:</p>
     * <br>
     * <p>*   **0**: no</p>
     * <p>*   **1**: yes</p>
     */
    @NameInMap("IsContainer")
    public Integer isContainer;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the system defense rule.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The types of the system defense rules.</p>
     */
    @NameInMap("RuleTypes")
    public java.util.List<Integer> ruleTypes;

    /**
     * <p>The type of the OS. Valid values:</p>
     * <br>
     * <p>*   **2**: Windows</p>
     * <p>*   **1**: Linux</p>
     * <p>*   **0**: all types</p>
     */
    @NameInMap("SystemType")
    public Integer systemType;

    public static ListSystemClientRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSystemClientRulesRequest self = new ListSystemClientRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListSystemClientRulesRequest setAggregationIds(java.util.List<Integer> aggregationIds) {
        this.aggregationIds = aggregationIds;
        return this;
    }
    public java.util.List<Integer> getAggregationIds() {
        return this.aggregationIds;
    }

    public ListSystemClientRulesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListSystemClientRulesRequest setIsContainer(Integer isContainer) {
        this.isContainer = isContainer;
        return this;
    }
    public Integer getIsContainer() {
        return this.isContainer;
    }

    public ListSystemClientRulesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListSystemClientRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSystemClientRulesRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ListSystemClientRulesRequest setRuleTypes(java.util.List<Integer> ruleTypes) {
        this.ruleTypes = ruleTypes;
        return this;
    }
    public java.util.List<Integer> getRuleTypes() {
        return this.ruleTypes;
    }

    public ListSystemClientRulesRequest setSystemType(Integer systemType) {
        this.systemType = systemType;
        return this;
    }
    public Integer getSystemType() {
        return this.systemType;
    }

}
