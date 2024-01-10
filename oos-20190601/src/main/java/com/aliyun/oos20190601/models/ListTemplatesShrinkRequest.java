// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListTemplatesShrinkRequest extends TeaModel {
    /**
     * <p>The type of the template. Valid values include TimerTrigger, EventTrigger, AlarmTrigger, and Other.</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The creator of the template.</p>
     * <br>
     * <p>*   To query the template provided by Alibaba Cloud, set this parameter to **ACS**.</p>
     * <p>*   To query the template created by a user, set this parameter to the **ID** of the template or the **name of the user** who creates the template.</p>
     */
    @NameInMap("CreatedBy")
    public String createdBy;

    /**
     * <p>Specifies to query the template that is created at or later than the specified time.</p>
     * <br>
     * <p>The value must be in the YYYY-MM-DDThh:mm:ssZ format.</p>
     */
    @NameInMap("CreatedDateAfter")
    public String createdDateAfter;

    /**
     * <p>Specifies to query the template that is created at or before the specified time.</p>
     * <br>
     * <p>The value must be in the YYYY-MM-DDThh:mm::ssZ format.</p>
     */
    @NameInMap("CreatedDateBefore")
    public String createdDateBefore;

    /**
     * <p>Specifies whether to query the template that is configured with a trigger.</p>
     */
    @NameInMap("HasTrigger")
    public Boolean hasTrigger;

    /**
     * <p>The template is favorite or not.</p>
     */
    @NameInMap("IsFavorite")
    public Boolean isFavorite;

    /**
     * <p>The number of entries to return on each page. Valid values: 20 to 100. Default value: 50.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region in which you want to query templates.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The share type of the template. Valid values:</p>
     * <br>
     * <p>*   **Public**</p>
     * <p>*   **Private**</p>
     */
    @NameInMap("ShareType")
    public String shareType;

    /**
     * <p>The field that is used to sort the templates to be queried. Valid values:</p>
     * <br>
     * <p>*   **TotalExecutionCount** (default): The system sorts the returned templates based on the total number of times that the templates are used.</p>
     * <p>*   **Popularity**: The system sorts the returned templates based on the popularity of the templates.</p>
     * <p>*   **TemplateName**: The system sorts the returned templates based on the names of the templates.</p>
     * <p>*   **CreatedDate**: The system sorts the returned templates based on the points in time when the templates are created.</p>
     * <p>*   **UpdatedDate**: The system sorts the returned templates based on the points in time when the templates are updated.</p>
     */
    @NameInMap("SortField")
    public String sortField;

    /**
     * <p>The order in which you want to sort the results. Valid values:</p>
     * <br>
     * <p>*   **Ascending**: ascending order.</p>
     * <p>*   **Descending**: descending order. This is the default value.</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>The tag keys and values. The number of key-value pairs ranges from 1 to 20.</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <p>The format of the template. Valid values:</p>
     * <br>
     * <p>*   **JSON**</p>
     * <p>*   **YAML**</p>
     */
    @NameInMap("TemplateFormat")
    public String templateFormat;

    /**
     * <p>The name of the template. All templates whose names contain the specified template name are to be returned.</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The type of the template. Valid values:</p>
     * <br>
     * <p>*   Automation: the template for automated tasks.</p>
     * <p>*   State: the template for configuration inventories.</p>
     * <p>*   Package: the template for software packages.</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    public static ListTemplatesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTemplatesShrinkRequest self = new ListTemplatesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListTemplatesShrinkRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListTemplatesShrinkRequest setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public ListTemplatesShrinkRequest setCreatedDateAfter(String createdDateAfter) {
        this.createdDateAfter = createdDateAfter;
        return this;
    }
    public String getCreatedDateAfter() {
        return this.createdDateAfter;
    }

    public ListTemplatesShrinkRequest setCreatedDateBefore(String createdDateBefore) {
        this.createdDateBefore = createdDateBefore;
        return this;
    }
    public String getCreatedDateBefore() {
        return this.createdDateBefore;
    }

    public ListTemplatesShrinkRequest setHasTrigger(Boolean hasTrigger) {
        this.hasTrigger = hasTrigger;
        return this;
    }
    public Boolean getHasTrigger() {
        return this.hasTrigger;
    }

    public ListTemplatesShrinkRequest setIsFavorite(Boolean isFavorite) {
        this.isFavorite = isFavorite;
        return this;
    }
    public Boolean getIsFavorite() {
        return this.isFavorite;
    }

    public ListTemplatesShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTemplatesShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTemplatesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTemplatesShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListTemplatesShrinkRequest setShareType(String shareType) {
        this.shareType = shareType;
        return this;
    }
    public String getShareType() {
        return this.shareType;
    }

    public ListTemplatesShrinkRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public ListTemplatesShrinkRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListTemplatesShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public ListTemplatesShrinkRequest setTemplateFormat(String templateFormat) {
        this.templateFormat = templateFormat;
        return this;
    }
    public String getTemplateFormat() {
        return this.templateFormat;
    }

    public ListTemplatesShrinkRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public ListTemplatesShrinkRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
