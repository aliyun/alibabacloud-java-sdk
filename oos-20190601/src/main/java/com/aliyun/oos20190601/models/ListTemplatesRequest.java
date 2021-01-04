// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListTemplatesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("TemplateFormat")
    public String templateFormat;

    @NameInMap("ShareType")
    public String shareType;

    @NameInMap("CreatedBy")
    public String createdBy;

    @NameInMap("CreatedDateBefore")
    public String createdDateBefore;

    @NameInMap("CreatedDateAfter")
    public String createdDateAfter;

    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    @NameInMap("Category")
    public String category;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("SortField")
    public String sortField;

    @NameInMap("SortOrder")
    public String sortOrder;

    @NameInMap("HasTrigger")
    public Boolean hasTrigger;

    @NameInMap("TemplateType")
    public String templateType;

    public static ListTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTemplatesRequest self = new ListTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListTemplatesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTemplatesRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public ListTemplatesRequest setTemplateFormat(String templateFormat) {
        this.templateFormat = templateFormat;
        return this;
    }
    public String getTemplateFormat() {
        return this.templateFormat;
    }

    public ListTemplatesRequest setShareType(String shareType) {
        this.shareType = shareType;
        return this;
    }
    public String getShareType() {
        return this.shareType;
    }

    public ListTemplatesRequest setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public ListTemplatesRequest setCreatedDateBefore(String createdDateBefore) {
        this.createdDateBefore = createdDateBefore;
        return this;
    }
    public String getCreatedDateBefore() {
        return this.createdDateBefore;
    }

    public ListTemplatesRequest setCreatedDateAfter(String createdDateAfter) {
        this.createdDateAfter = createdDateAfter;
        return this;
    }
    public String getCreatedDateAfter() {
        return this.createdDateAfter;
    }

    public ListTemplatesRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public ListTemplatesRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
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

    public ListTemplatesRequest setHasTrigger(Boolean hasTrigger) {
        this.hasTrigger = hasTrigger;
        return this;
    }
    public Boolean getHasTrigger() {
        return this.hasTrigger;
    }

    public ListTemplatesRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
