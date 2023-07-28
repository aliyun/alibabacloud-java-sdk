// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListStateConfigurationsShrinkRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return on each page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token of the next page.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of each desired-state configuration.</p>
     */
    @NameInMap("StateConfigurationIds")
    public String stateConfigurationIds;

    /**
     * <p>The tag.</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <p>The name of the template. The name must be 1 to 200 characters in length, and can contain letters, digits, hyphens (-), and underscores (\_).</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The version number. If you do not specify this parameter, the system uses the latest version.</p>
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
