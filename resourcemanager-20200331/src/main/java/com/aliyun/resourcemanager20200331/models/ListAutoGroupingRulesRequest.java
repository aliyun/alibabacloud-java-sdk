// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListAutoGroupingRulesRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return for a single request. Valid values: 1 to 50.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     * 
     * <strong>example:</strong>
     * <p>TGlzdFJlc291cm****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>gr-acfo******hy6a</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The name of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom Transfer Rule for Online Resources of Project A</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The type of the rule. Valid values:</p>
     * <ul>
     * <li>custom_condition: custom transfer rule</li>
     * <li>associated_transfer: transfer rule for associated resources</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>custom_condition</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    public static ListAutoGroupingRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAutoGroupingRulesRequest self = new ListAutoGroupingRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListAutoGroupingRulesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAutoGroupingRulesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAutoGroupingRulesRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public ListAutoGroupingRulesRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ListAutoGroupingRulesRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

}
