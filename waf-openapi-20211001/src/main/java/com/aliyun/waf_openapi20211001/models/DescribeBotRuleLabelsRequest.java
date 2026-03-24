// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeBotRuleLabelsRequest extends TeaModel {
    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of your WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v3prepaid_public_cn-53y4******</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of bot rule label to query.</p>
     * 
     * <strong>example:</strong>
     * <p>human_machine_challenge</p>
     */
    @NameInMap("LabelType")
    public String labelType;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 200. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token to retrieve the next page of results. This parameter is returned if a next page exists.</p>
     * <blockquote>
     * <p>If a value is returned for this parameter, it indicates that more results are available. Use the returned <strong>NextToken</strong> value in the next request to retrieve the next page of results. Repeat this process until no value is returned for this parameter. This indicates that all results have been retrieved.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AAAAAGBgV9tolsLfijC4wam2htS*****D/46H3X2wIS</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
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
     * <p>The type of bot management scenario. Valid values:</p>
     * <ul>
     * <li><p><strong>web</strong>: web protection.</p>
     * </li>
     * <li><p><strong>app</strong>: app protection.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>app</p>
     */
    @NameInMap("SubScene")
    public String subScene;

    public static DescribeBotRuleLabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBotRuleLabelsRequest self = new DescribeBotRuleLabelsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBotRuleLabelsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeBotRuleLabelsRequest setLabelType(String labelType) {
        this.labelType = labelType;
        return this;
    }
    public String getLabelType() {
        return this.labelType;
    }

    public DescribeBotRuleLabelsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeBotRuleLabelsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeBotRuleLabelsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeBotRuleLabelsRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeBotRuleLabelsRequest setSubScene(String subScene) {
        this.subScene = subScene;
        return this;
    }
    public String getSubScene() {
        return this.subScene;
    }

}
