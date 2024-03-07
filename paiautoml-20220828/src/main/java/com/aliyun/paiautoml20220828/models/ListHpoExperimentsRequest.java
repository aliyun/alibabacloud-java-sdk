// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class ListHpoExperimentsRequest extends TeaModel {
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("Creator")
    public String creator;

    @NameInMap("IncludeConfigData")
    public String includeConfigData;

    @NameInMap("MaxCreateTime")
    public String maxCreateTime;

    @NameInMap("MinCreateTime")
    public String minCreateTime;

    @NameInMap("Name")
    public String name;

    @NameInMap("Order")
    public String order;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("Status")
    public String status;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListHpoExperimentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHpoExperimentsRequest self = new ListHpoExperimentsRequest();
        return TeaModel.build(map, self);
    }

    public ListHpoExperimentsRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public ListHpoExperimentsRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public ListHpoExperimentsRequest setIncludeConfigData(String includeConfigData) {
        this.includeConfigData = includeConfigData;
        return this;
    }
    public String getIncludeConfigData() {
        return this.includeConfigData;
    }

    public ListHpoExperimentsRequest setMaxCreateTime(String maxCreateTime) {
        this.maxCreateTime = maxCreateTime;
        return this;
    }
    public String getMaxCreateTime() {
        return this.maxCreateTime;
    }

    public ListHpoExperimentsRequest setMinCreateTime(String minCreateTime) {
        this.minCreateTime = minCreateTime;
        return this;
    }
    public String getMinCreateTime() {
        return this.minCreateTime;
    }

    public ListHpoExperimentsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListHpoExperimentsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListHpoExperimentsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListHpoExperimentsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListHpoExperimentsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListHpoExperimentsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListHpoExperimentsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
