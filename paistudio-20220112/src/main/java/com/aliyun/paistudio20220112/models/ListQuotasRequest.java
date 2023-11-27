// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListQuotasRequest extends TeaModel {
    @NameInMap("Labels")
    public String labels;

    @NameInMap("Order")
    public String order;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ParentQuotaId")
    public String parentQuotaId;

    @NameInMap("QuotaIds")
    public String quotaIds;

    @NameInMap("QuotaName")
    public String quotaName;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("Statuses")
    public String statuses;

    @NameInMap("WorkspaceIds")
    public String workspaceIds;

    public static ListQuotasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQuotasRequest self = new ListQuotasRequest();
        return TeaModel.build(map, self);
    }

    public ListQuotasRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public ListQuotasRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListQuotasRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListQuotasRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListQuotasRequest setParentQuotaId(String parentQuotaId) {
        this.parentQuotaId = parentQuotaId;
        return this;
    }
    public String getParentQuotaId() {
        return this.parentQuotaId;
    }

    public ListQuotasRequest setQuotaIds(String quotaIds) {
        this.quotaIds = quotaIds;
        return this;
    }
    public String getQuotaIds() {
        return this.quotaIds;
    }

    public ListQuotasRequest setQuotaName(String quotaName) {
        this.quotaName = quotaName;
        return this;
    }
    public String getQuotaName() {
        return this.quotaName;
    }

    public ListQuotasRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListQuotasRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListQuotasRequest setStatuses(String statuses) {
        this.statuses = statuses;
        return this;
    }
    public String getStatuses() {
        return this.statuses;
    }

    public ListQuotasRequest setWorkspaceIds(String workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }
    public String getWorkspaceIds() {
        return this.workspaceIds;
    }

}
