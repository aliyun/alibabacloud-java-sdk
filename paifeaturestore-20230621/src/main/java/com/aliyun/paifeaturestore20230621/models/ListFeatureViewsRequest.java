// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListFeatureViewsRequest extends TeaModel {
    @NameInMap("FeatureName")
    public String featureName;

    @NameInMap("FeatureViewIds")
    public java.util.List<String> featureViewIds;

    @NameInMap("Order")
    public String order;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("Tag")
    public String tag;

    @NameInMap("Type")
    public String type;

    public static ListFeatureViewsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFeatureViewsRequest self = new ListFeatureViewsRequest();
        return TeaModel.build(map, self);
    }

    public ListFeatureViewsRequest setFeatureName(String featureName) {
        this.featureName = featureName;
        return this;
    }
    public String getFeatureName() {
        return this.featureName;
    }

    public ListFeatureViewsRequest setFeatureViewIds(java.util.List<String> featureViewIds) {
        this.featureViewIds = featureViewIds;
        return this;
    }
    public java.util.List<String> getFeatureViewIds() {
        return this.featureViewIds;
    }

    public ListFeatureViewsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListFeatureViewsRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListFeatureViewsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFeatureViewsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFeatureViewsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListFeatureViewsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListFeatureViewsRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public ListFeatureViewsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
