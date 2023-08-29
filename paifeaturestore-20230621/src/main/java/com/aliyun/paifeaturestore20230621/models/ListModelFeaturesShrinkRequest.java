// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListModelFeaturesShrinkRequest extends TeaModel {
    @NameInMap("ModelFeatureIds")
    public String modelFeatureIdsShrink;

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

    public static ListModelFeaturesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelFeaturesShrinkRequest self = new ListModelFeaturesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListModelFeaturesShrinkRequest setModelFeatureIdsShrink(String modelFeatureIdsShrink) {
        this.modelFeatureIdsShrink = modelFeatureIdsShrink;
        return this;
    }
    public String getModelFeatureIdsShrink() {
        return this.modelFeatureIdsShrink;
    }

    public ListModelFeaturesShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListModelFeaturesShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListModelFeaturesShrinkRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListModelFeaturesShrinkRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListModelFeaturesShrinkRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListModelFeaturesShrinkRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListModelFeaturesShrinkRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
