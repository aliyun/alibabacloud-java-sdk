// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListFeatureEntitiesRequest extends TeaModel {
    @NameInMap("FeatureEntityIds")
    public java.util.List<String> featureEntityIds;

    @NameInMap("Name")
    public String name;

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

    public static ListFeatureEntitiesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFeatureEntitiesRequest self = new ListFeatureEntitiesRequest();
        return TeaModel.build(map, self);
    }

    public ListFeatureEntitiesRequest setFeatureEntityIds(java.util.List<String> featureEntityIds) {
        this.featureEntityIds = featureEntityIds;
        return this;
    }
    public java.util.List<String> getFeatureEntityIds() {
        return this.featureEntityIds;
    }

    public ListFeatureEntitiesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListFeatureEntitiesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListFeatureEntitiesRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListFeatureEntitiesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFeatureEntitiesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFeatureEntitiesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListFeatureEntitiesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
