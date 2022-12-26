// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListSystemAggregationRulesRequest extends TeaModel {
    @NameInMap("AggregationIds")
    public java.util.List<Integer> aggregationIds;

    @NameInMap("CurrentPage")
    public Integer currentPage;

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

    public static ListSystemAggregationRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSystemAggregationRulesRequest self = new ListSystemAggregationRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListSystemAggregationRulesRequest setAggregationIds(java.util.List<Integer> aggregationIds) {
        this.aggregationIds = aggregationIds;
        return this;
    }
    public java.util.List<Integer> getAggregationIds() {
        return this.aggregationIds;
    }

    public ListSystemAggregationRulesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListSystemAggregationRulesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListSystemAggregationRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSystemAggregationRulesRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ListSystemAggregationRulesRequest setRuleTypes(java.util.List<Integer> ruleTypes) {
        this.ruleTypes = ruleTypes;
        return this;
    }
    public java.util.List<Integer> getRuleTypes() {
        return this.ruleTypes;
    }

    public ListSystemAggregationRulesRequest setSystemType(Integer systemType) {
        this.systemType = systemType;
        return this;
    }
    public Integer getSystemType() {
        return this.systemType;
    }

}
