// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListStateConfigurationsShrinkRequest extends TeaModel {
    /**
     * <p>The maximum number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>AHJKH-AHKJHDJK-AKHDIOWJL</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxsn4m4******</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the desired-state configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;sc-asfgdhj12345&quot;]</p>
     */
    @NameInMap("StateConfigurationIds")
    public String stateConfigurationIds;

    /**
     * <p>The tags to be added to the configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Key&quot;: &quot;oos&quot;, &quot;Value&quot;: &quot;inventory&quot;}</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <p>The name of the template. The name must be 1 to 200 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</p>
     * 
     * <strong>example:</strong>
     * <p>ACS-ECS-InventoryDataCollection</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The version number of the template. If you do not specify this parameter, the latest version of the template is used.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("TemplateVersion")
    public String templateVersion;

    public static ListStateConfigurationsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStateConfigurationsShrinkRequest self = new ListStateConfigurationsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListStateConfigurationsShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListStateConfigurationsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListStateConfigurationsShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListStateConfigurationsShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListStateConfigurationsShrinkRequest setStateConfigurationIds(String stateConfigurationIds) {
        this.stateConfigurationIds = stateConfigurationIds;
        return this;
    }
    public String getStateConfigurationIds() {
        return this.stateConfigurationIds;
    }

    public ListStateConfigurationsShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public ListStateConfigurationsShrinkRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public ListStateConfigurationsShrinkRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

}
