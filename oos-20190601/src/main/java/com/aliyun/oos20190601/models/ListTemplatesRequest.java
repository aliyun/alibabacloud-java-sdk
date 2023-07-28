// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListTemplatesRequest extends TeaModel {
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
     * <p>The field that is used to sort the templates to be returned. Valid values:</p>
     * <br>
     * <p>*   **TotalExecutionCounts**: The system sorts the returned templates based on the total number of execution times of the template. This is the default value.</p>
     * <p>*   **Popularity**: The system sorts the returned templates based on the popularity of the template.</p>
     * <p>*   **TemplateName**: The system sorts the returned templates based on the name of the template.</p>
     * <p>*   **CreatedDate**: The system sorts the returned templates based on the creation time of the template.</p>
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
    public java.util.Map<String, ?> tags;

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
     * <p>The type of the template.</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    public static ListTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTemplatesRequest self = new ListTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListTemplatesRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListTemplatesRequest setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public ListTemplatesRequest setCreatedDateAfter(String createdDateAfter) {
        this.createdDateAfter = createdDateAfter;
        return this;
    }
    public String getCreatedDateAfter() {
        return this.createdDateAfter;
    }

    public ListTemplatesRequest setCreatedDateBefore(String createdDateBefore) {
        this.createdDateBefore = createdDateBefore;
        return this;
    }
    public String getCreatedDateBefore() {
        return this.createdDateBefore;
    }

    public ListTemplatesRequest setHasTrigger(Boolean hasTrigger) {
        this.hasTrigger = hasTrigger;
        return this;
    }
    public Boolean getHasTrigger() {
        return this.hasTrigger;
    }

    public ListTemplatesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTemplatesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTemplatesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTemplatesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListTemplatesRequest setShareType(String shareType) {
        this.shareType = shareType;
        return this;
    }
    public String getShareType() {
        return this.shareType;
    }

    public ListTemplatesRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public ListTemplatesRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListTemplatesRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public ListTemplatesRequest setTemplateFormat(String templateFormat) {
        this.templateFormat = templateFormat;
        return this;
    }
    public String getTemplateFormat() {
        return this.templateFormat;
    }

    public ListTemplatesRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public ListTemplatesRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
