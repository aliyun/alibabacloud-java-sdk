// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListSystemAggregationRulesRequest extends TeaModel {
    /**
     * <p>The rule cluster ID.</p>
     */
    @NameInMap("AggregationIds")
    public java.util.List<Integer> aggregationIds;

    /**
     * <p>The page number of the current page in a paging query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The language type of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of entries per page in a paging query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The rule name.</p>
     * 
     * <strong>example:</strong>
     * <p>规则****</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The list of rule types.</p>
     */
    @NameInMap("RuleTypes")
    public java.util.List<Integer> ruleTypes;

    /**
     * <p>The operating system type. Valid values:</p>
     * <ul>
     * <li><strong>2</strong>: Windows</li>
     * <li><strong>1</strong>: Linux</li>
     * <li><strong>0</strong>: all.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
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
