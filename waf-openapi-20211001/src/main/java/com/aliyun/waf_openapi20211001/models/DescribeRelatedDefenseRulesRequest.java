// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeRelatedDefenseRulesRequest extends TeaModel {
    /**
     * <p>The WAF protection scenario. Only the following value is supported:</p>
     * <ul>
     * <li><strong>address_book</strong>: address book.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>address_book</p>
     */
    @NameInMap("DefenseScene")
    public String defenseScene;

    /**
     * <p>The type of the protection rule. Only the following value is supported:</p>
     * <ul>
     * <li><strong>global</strong>: a global-level rule.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("DefenseType")
    public String defenseType;

    /**
     * <p>Instance ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance ID of the current WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf-cn-zz11sr5****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of entries per page when using paging. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token (<strong>Token</strong>) for the next page. If a next page exists, this field has a return value.</p>
     * <blockquote>
     * <p>If this parameter has a return value, a next page exists. Use the returned <strong>NextToken</strong> as a request parameter to obtain the next page of data. Repeat this process until no value is returned, which indicates that all data has been retrieved.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0*****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region in which the WAF instance resides. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The ID of the rule to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    public static DescribeRelatedDefenseRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRelatedDefenseRulesRequest self = new DescribeRelatedDefenseRulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRelatedDefenseRulesRequest setDefenseScene(String defenseScene) {
        this.defenseScene = defenseScene;
        return this;
    }
    public String getDefenseScene() {
        return this.defenseScene;
    }

    public DescribeRelatedDefenseRulesRequest setDefenseType(String defenseType) {
        this.defenseType = defenseType;
        return this;
    }
    public String getDefenseType() {
        return this.defenseType;
    }

    public DescribeRelatedDefenseRulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeRelatedDefenseRulesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeRelatedDefenseRulesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeRelatedDefenseRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRelatedDefenseRulesRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeRelatedDefenseRulesRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
