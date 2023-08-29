// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListProjectsRequest extends TeaModel {
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
    public java.util.List<String> projectIds;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListProjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsRequest self = new ListProjectsRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListProjectsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListProjectsRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListProjectsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListProjectsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProjectsRequest setProjectIds(java.util.List<String> projectIds) {
        this.projectIds = projectIds;
        return this;
    }
    public java.util.List<String> getProjectIds() {
        return this.projectIds;
    }

    public ListProjectsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListProjectsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
