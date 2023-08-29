// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListProjectsShrinkRequest extends TeaModel {
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

    @NameInMap("ProjectIds")
    public String projectIdsShrink;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListProjectsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsShrinkRequest self = new ListProjectsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectsShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListProjectsShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListProjectsShrinkRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListProjectsShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListProjectsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProjectsShrinkRequest setProjectIdsShrink(String projectIdsShrink) {
        this.projectIdsShrink = projectIdsShrink;
        return this;
    }
    public String getProjectIdsShrink() {
        return this.projectIdsShrink;
    }

    public ListProjectsShrinkRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListProjectsShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
