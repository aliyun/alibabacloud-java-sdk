// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ListPublicTemplatesRequest extends TeaModel {
    @NameInMap("CreatedBy")
    public String createdBy;

    @NameInMap("CreatedDateAfter")
    public String createdDateAfter;

    @NameInMap("CreatedDateBefore")
    public String createdDateBefore;

    @NameInMap("IsExample")
    public Boolean isExample;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Popularity")
    public Integer popularity;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ShareType")
    public String shareType;

    @NameInMap("SortField")
    public String sortField;

    @NameInMap("SortOrder")
    public String sortOrder;

    @NameInMap("TemplateFormat")
    public String templateFormat;

    @NameInMap("TemplateName")
    public String templateName;

    public static ListPublicTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPublicTemplatesRequest self = new ListPublicTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListPublicTemplatesRequest setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public ListPublicTemplatesRequest setCreatedDateAfter(String createdDateAfter) {
        this.createdDateAfter = createdDateAfter;
        return this;
    }
    public String getCreatedDateAfter() {
        return this.createdDateAfter;
    }

    public ListPublicTemplatesRequest setCreatedDateBefore(String createdDateBefore) {
        this.createdDateBefore = createdDateBefore;
        return this;
    }
    public String getCreatedDateBefore() {
        return this.createdDateBefore;
    }

    public ListPublicTemplatesRequest setIsExample(Boolean isExample) {
        this.isExample = isExample;
        return this;
    }
    public Boolean getIsExample() {
        return this.isExample;
    }

    public ListPublicTemplatesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPublicTemplatesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPublicTemplatesRequest setPopularity(Integer popularity) {
        this.popularity = popularity;
        return this;
    }
    public Integer getPopularity() {
        return this.popularity;
    }

    public ListPublicTemplatesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListPublicTemplatesRequest setShareType(String shareType) {
        this.shareType = shareType;
        return this;
    }
    public String getShareType() {
        return this.shareType;
    }

    public ListPublicTemplatesRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public ListPublicTemplatesRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListPublicTemplatesRequest setTemplateFormat(String templateFormat) {
        this.templateFormat = templateFormat;
        return this;
    }
    public String getTemplateFormat() {
        return this.templateFormat;
    }

    public ListPublicTemplatesRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
