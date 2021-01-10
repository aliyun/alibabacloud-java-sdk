// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasRequestTaskRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("IdsRepeatList")
    public java.util.List<String> idsRepeatList;

    @NameInMap("MaxTime")
    public String maxTime;

    @NameInMap("MinTime")
    public String minTime;

    @NameInMap("OperatorsRepeatList")
    public java.util.List<String> operatorsRepeatList;

    @NameInMap("OperatorType")
    public String operatorType;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestIdsRepeatList")
    public java.util.List<String> requestIdsRepeatList;

    @NameInMap("RequestStatusesRepeatList")
    public java.util.List<String> requestStatusesRepeatList;

    @NameInMap("RequestTypesRepeatList")
    public java.util.List<String> requestTypesRepeatList;

    @NameInMap("ResourceIdsRepeatList")
    public java.util.List<String> resourceIdsRepeatList;

    @NameInMap("ResourceTypesRepeatList")
    public java.util.List<String> resourceTypesRepeatList;

    @NameInMap("StatusesRepeatList")
    public java.util.List<String> statusesRepeatList;

    @NameInMap("WorkspaceIdsRepeatList")
    public java.util.List<String> workspaceIdsRepeatList;

    public static QueryCasRequestTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCasRequestTaskRequest self = new QueryCasRequestTaskRequest();
        return TeaModel.build(map, self);
    }

    public QueryCasRequestTaskRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryCasRequestTaskRequest setIdsRepeatList(java.util.List<String> idsRepeatList) {
        this.idsRepeatList = idsRepeatList;
        return this;
    }
    public java.util.List<String> getIdsRepeatList() {
        return this.idsRepeatList;
    }

    public QueryCasRequestTaskRequest setMaxTime(String maxTime) {
        this.maxTime = maxTime;
        return this;
    }
    public String getMaxTime() {
        return this.maxTime;
    }

    public QueryCasRequestTaskRequest setMinTime(String minTime) {
        this.minTime = minTime;
        return this;
    }
    public String getMinTime() {
        return this.minTime;
    }

    public QueryCasRequestTaskRequest setOperatorsRepeatList(java.util.List<String> operatorsRepeatList) {
        this.operatorsRepeatList = operatorsRepeatList;
        return this;
    }
    public java.util.List<String> getOperatorsRepeatList() {
        return this.operatorsRepeatList;
    }

    public QueryCasRequestTaskRequest setOperatorType(String operatorType) {
        this.operatorType = operatorType;
        return this;
    }
    public String getOperatorType() {
        return this.operatorType;
    }

    public QueryCasRequestTaskRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCasRequestTaskRequest setRequestIdsRepeatList(java.util.List<String> requestIdsRepeatList) {
        this.requestIdsRepeatList = requestIdsRepeatList;
        return this;
    }
    public java.util.List<String> getRequestIdsRepeatList() {
        return this.requestIdsRepeatList;
    }

    public QueryCasRequestTaskRequest setRequestStatusesRepeatList(java.util.List<String> requestStatusesRepeatList) {
        this.requestStatusesRepeatList = requestStatusesRepeatList;
        return this;
    }
    public java.util.List<String> getRequestStatusesRepeatList() {
        return this.requestStatusesRepeatList;
    }

    public QueryCasRequestTaskRequest setRequestTypesRepeatList(java.util.List<String> requestTypesRepeatList) {
        this.requestTypesRepeatList = requestTypesRepeatList;
        return this;
    }
    public java.util.List<String> getRequestTypesRepeatList() {
        return this.requestTypesRepeatList;
    }

    public QueryCasRequestTaskRequest setResourceIdsRepeatList(java.util.List<String> resourceIdsRepeatList) {
        this.resourceIdsRepeatList = resourceIdsRepeatList;
        return this;
    }
    public java.util.List<String> getResourceIdsRepeatList() {
        return this.resourceIdsRepeatList;
    }

    public QueryCasRequestTaskRequest setResourceTypesRepeatList(java.util.List<String> resourceTypesRepeatList) {
        this.resourceTypesRepeatList = resourceTypesRepeatList;
        return this;
    }
    public java.util.List<String> getResourceTypesRepeatList() {
        return this.resourceTypesRepeatList;
    }

    public QueryCasRequestTaskRequest setStatusesRepeatList(java.util.List<String> statusesRepeatList) {
        this.statusesRepeatList = statusesRepeatList;
        return this;
    }
    public java.util.List<String> getStatusesRepeatList() {
        return this.statusesRepeatList;
    }

    public QueryCasRequestTaskRequest setWorkspaceIdsRepeatList(java.util.List<String> workspaceIdsRepeatList) {
        this.workspaceIdsRepeatList = workspaceIdsRepeatList;
        return this;
    }
    public java.util.List<String> getWorkspaceIdsRepeatList() {
        return this.workspaceIdsRepeatList;
    }

}
