// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListModelFeaturesRequest extends TeaModel {
    @NameInMap("ModelFeatureIds")
    public java.util.List<String> modelFeatureIds;

    @NameInMap("Name")
    public String name;

    @NameInMap("Order")
    public String order;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("SortBy")
    public String sortBy;

    public static ListModelFeaturesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelFeaturesRequest self = new ListModelFeaturesRequest();
        return TeaModel.build(map, self);
    }

    public ListModelFeaturesRequest setModelFeatureIds(java.util.List<String> modelFeatureIds) {
        this.modelFeatureIds = modelFeatureIds;
        return this;
    }
    public java.util.List<String> getModelFeatureIds() {
        return this.modelFeatureIds;
    }

    public ListModelFeaturesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListModelFeaturesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListModelFeaturesRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListModelFeaturesRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListModelFeaturesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListModelFeaturesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListModelFeaturesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
