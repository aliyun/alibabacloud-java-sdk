// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class ListExperimentsRequest extends TeaModel {
    @NameInMap("All")
    public Boolean all;

    @NameInMap("ExperimentId")
    public String experimentId;

    @NameInMap("ExperimentName")
    public String experimentName;

    @NameInMap("LayerId")
    public String layerId;

    @NameInMap("Order")
    public String order;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("Status")
    public String status;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListExperimentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExperimentsRequest self = new ListExperimentsRequest();
        return TeaModel.build(map, self);
    }

    public ListExperimentsRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public ListExperimentsRequest setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

    public ListExperimentsRequest setExperimentName(String experimentName) {
        this.experimentName = experimentName;
        return this;
    }
    public String getExperimentName() {
        return this.experimentName;
    }

    public ListExperimentsRequest setLayerId(String layerId) {
        this.layerId = layerId;
        return this;
    }
    public String getLayerId() {
        return this.layerId;
    }

    public ListExperimentsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListExperimentsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListExperimentsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListExperimentsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListExperimentsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListExperimentsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListExperimentsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
