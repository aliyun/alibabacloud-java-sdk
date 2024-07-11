// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListTemplatesRequest extends TeaModel {
    /**
     * <p>The type of the template. Valid values include TimerTrigger, EventTrigger, AlarmTrigger, and Other.</p>
     * 
     * <strong>example:</strong>
     * <p>TimerTrigger</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The creator of the template.</p>
     * <ul>
     * <li>To query the template provided by Alibaba Cloud, set this parameter to <strong>ACS</strong>.</li>
     * <li>To query the template created by a user, set this parameter to the <strong>ID</strong> of the template or the <strong>name of the user</strong> who creates the template.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ACS</p>
     */
    @NameInMap("CreatedBy")
    public String createdBy;

    /**
     * <p>Specifies to query the template that is created at or later than the specified time.</p>
     * <p>The value must be in the YYYY-MM-DDThh:mm:ssZ format.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-05-16T10:26:14Z</p>
     */
    @NameInMap("CreatedDateAfter")
    public String createdDateAfter;

    /**
     * <p>Specifies to query the template that is created at or before the specified time.</p>
     * <p>The value must be in the YYYY-MM-DDThh:mm::ssZ format.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-05-16T10:26:14Z</p>
     */
    @NameInMap("CreatedDateBefore")
    public String createdDateBefore;

    /**
     * <p>Specifies whether to query the template that is configured with a trigger.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasTrigger")
    public Boolean hasTrigger;

    @NameInMap("IsExample")
    public Boolean isExample;

    /**
     * <p>The template is favorite or not.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsFavorite")
    public Boolean isFavorite;

    /**
     * <p>The number of entries to return on each page. Valid values: 10 to 100. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region in which you want to query templates.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxsn4m4******</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The share type of the template. Valid values:</p>
     * <ul>
     * <li><strong>Public</strong></li>
     * <li><strong>Private</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Private</p>
     */
    @NameInMap("ShareType")
    public String shareType;

    /**
     * <p>The field that is used to sort the templates to be queried. Valid values:</p>
     * <ul>
     * <li><strong>TotalExecutionCount</strong> (default): The system sorts the returned templates based on the total number of times that the templates are used.</li>
     * <li><strong>Popularity</strong>: The system sorts the returned templates based on the popularity of the templates.</li>
     * <li><strong>TemplateName</strong>: The system sorts the returned templates based on the names of the templates.</li>
     * <li><strong>CreatedDate</strong>: The system sorts the returned templates based on the points in time when the templates are created.</li>
     * <li><strong>UpdatedDate</strong>: The system sorts the returned templates based on the points in time when the templates are updated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Popularity</p>
     */
    @NameInMap("SortField")
    public String sortField;

    /**
     * <p>The order in which you want to sort the results. Valid values:</p>
     * <ul>
     * <li><strong>Ascending</strong>: ascending order.</li>
     * <li><strong>Descending</strong>: descending order. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Descending</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>The tag keys and values. The number of key-value pairs ranges from 1 to 20.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;k1&quot;:&quot;k2&quot;,&quot;k2&quot;:&quot;v2&quot;}</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    /**
     * <p>The format of the template. Valid values:</p>
     * <ul>
     * <li><strong>JSON</strong></li>
     * <li><strong>YAML</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>YAML</p>
     */
    @NameInMap("TemplateFormat")
    public String templateFormat;

    /**
     * <p>The name of the template. All templates whose names contain the specified template name are to be returned.</p>
     * 
     * <strong>example:</strong>
     * <p>MyTemplate</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The type of the template. Valid values:</p>
     * <ul>
     * <li>Automation: the template for automated tasks.</li>
     * <li>State: the template for configuration inventories.</li>
     * <li>Package: the template for software packages.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>private</p>
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

    public ListTemplatesRequest setIsExample(Boolean isExample) {
        this.isExample = isExample;
        return this;
    }
    public Boolean getIsExample() {
        return this.isExample;
    }

    public ListTemplatesRequest setIsFavorite(Boolean isFavorite) {
        this.isFavorite = isFavorite;
        return this;
    }
    public Boolean getIsFavorite() {
        return this.isFavorite;
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
