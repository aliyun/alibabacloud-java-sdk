// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasRequestRequest extends TeaModel {
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

    @NameInMap("ParentIdsRepeatList")
    public java.util.List<String> parentIdsRepeatList;

    @NameInMap("ResourceIdsRepeatList")
    public java.util.List<String> resourceIdsRepeatList;

    @NameInMap("ResourceTypesRepeatList")
    public java.util.List<String> resourceTypesRepeatList;

    @NameInMap("StatusesRepeatList")
    public java.util.List<String> statusesRepeatList;

    @NameInMap("TaskStatusesRepeatList")
    public java.util.List<String> taskStatusesRepeatList;

    @NameInMap("TokensRepeatList")
    public java.util.List<String> tokensRepeatList;

    @NameInMap("TypesRepeatList")
    public java.util.List<String> typesRepeatList;

    @NameInMap("WorkspaceIdsRepeatList")
    public java.util.List<String> workspaceIdsRepeatList;

    public static QueryCasRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCasRequestRequest self = new QueryCasRequestRequest();
        return TeaModel.build(map, self);
    }

    public QueryCasRequestRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryCasRequestRequest setIdsRepeatList(java.util.List<String> idsRepeatList) {
        this.idsRepeatList = idsRepeatList;
        return this;
    }
    public java.util.List<String> getIdsRepeatList() {
        return this.idsRepeatList;
    }

    public QueryCasRequestRequest setMaxTime(String maxTime) {
        this.maxTime = maxTime;
        return this;
    }
    public String getMaxTime() {
        return this.maxTime;
    }

    public QueryCasRequestRequest setMinTime(String minTime) {
        this.minTime = minTime;
        return this;
    }
    public String getMinTime() {
        return this.minTime;
    }

    public QueryCasRequestRequest setOperatorsRepeatList(java.util.List<String> operatorsRepeatList) {
        this.operatorsRepeatList = operatorsRepeatList;
        return this;
    }
    public java.util.List<String> getOperatorsRepeatList() {
        return this.operatorsRepeatList;
    }

    public QueryCasRequestRequest setOperatorType(String operatorType) {
        this.operatorType = operatorType;
        return this;
    }
    public String getOperatorType() {
        return this.operatorType;
    }

    public QueryCasRequestRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCasRequestRequest setParentIdsRepeatList(java.util.List<String> parentIdsRepeatList) {
        this.parentIdsRepeatList = parentIdsRepeatList;
        return this;
    }
    public java.util.List<String> getParentIdsRepeatList() {
        return this.parentIdsRepeatList;
    }

    public QueryCasRequestRequest setResourceIdsRepeatList(java.util.List<String> resourceIdsRepeatList) {
        this.resourceIdsRepeatList = resourceIdsRepeatList;
        return this;
    }
    public java.util.List<String> getResourceIdsRepeatList() {
        return this.resourceIdsRepeatList;
    }

    public QueryCasRequestRequest setResourceTypesRepeatList(java.util.List<String> resourceTypesRepeatList) {
        this.resourceTypesRepeatList = resourceTypesRepeatList;
        return this;
    }
    public java.util.List<String> getResourceTypesRepeatList() {
        return this.resourceTypesRepeatList;
    }

    public QueryCasRequestRequest setStatusesRepeatList(java.util.List<String> statusesRepeatList) {
        this.statusesRepeatList = statusesRepeatList;
        return this;
    }
    public java.util.List<String> getStatusesRepeatList() {
        return this.statusesRepeatList;
    }

    public QueryCasRequestRequest setTaskStatusesRepeatList(java.util.List<String> taskStatusesRepeatList) {
        this.taskStatusesRepeatList = taskStatusesRepeatList;
        return this;
    }
    public java.util.List<String> getTaskStatusesRepeatList() {
        return this.taskStatusesRepeatList;
    }

    public QueryCasRequestRequest setTokensRepeatList(java.util.List<String> tokensRepeatList) {
        this.tokensRepeatList = tokensRepeatList;
        return this;
    }
    public java.util.List<String> getTokensRepeatList() {
        return this.tokensRepeatList;
    }

    public QueryCasRequestRequest setTypesRepeatList(java.util.List<String> typesRepeatList) {
        this.typesRepeatList = typesRepeatList;
        return this;
    }
    public java.util.List<String> getTypesRepeatList() {
        return this.typesRepeatList;
    }

    public QueryCasRequestRequest setWorkspaceIdsRepeatList(java.util.List<String> workspaceIdsRepeatList) {
        this.workspaceIdsRepeatList = workspaceIdsRepeatList;
        return this;
    }
    public java.util.List<String> getWorkspaceIdsRepeatList() {
        return this.workspaceIdsRepeatList;
    }

}
