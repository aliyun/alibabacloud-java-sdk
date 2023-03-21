// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListSystemClientRulesRequest extends TeaModel {
    @NameInMap("AggregationIds")
    public java.util.List<Integer> aggregationIds;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("IsContainer")
    public Integer isContainer;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("RuleTypes")
    public java.util.List<Integer> ruleTypes;

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
