// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLDCOpsplanRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("CreationTimeFrom")
    public String creationTimeFrom;

    @NameInMap("CreationTimeTo")
    public String creationTimeTo;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PlanIdsRepeatList")
    public java.util.List<String> planIdsRepeatList;

    @NameInMap("StateListRepeatList")
    public java.util.List<String> stateListRepeatList;

    @NameInMap("TimeSeriesId")
    public String timeSeriesId;

    @NameInMap("TypesRepeatList")
    public java.util.List<String> typesRepeatList;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static QueryLDCOpsplanRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLDCOpsplanRequest self = new QueryLDCOpsplanRequest();
        return TeaModel.build(map, self);
    }

    public QueryLDCOpsplanRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryLDCOpsplanRequest setCreationTimeFrom(String creationTimeFrom) {
        this.creationTimeFrom = creationTimeFrom;
        return this;
    }
    public String getCreationTimeFrom() {
        return this.creationTimeFrom;
    }

    public QueryLDCOpsplanRequest setCreationTimeTo(String creationTimeTo) {
        this.creationTimeTo = creationTimeTo;
        return this;
    }
    public String getCreationTimeTo() {
        return this.creationTimeTo;
    }

    public QueryLDCOpsplanRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryLDCOpsplanRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryLDCOpsplanRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryLDCOpsplanRequest setPlanIdsRepeatList(java.util.List<String> planIdsRepeatList) {
        this.planIdsRepeatList = planIdsRepeatList;
        return this;
    }
    public java.util.List<String> getPlanIdsRepeatList() {
        return this.planIdsRepeatList;
    }

    public QueryLDCOpsplanRequest setStateListRepeatList(java.util.List<String> stateListRepeatList) {
        this.stateListRepeatList = stateListRepeatList;
        return this;
    }
    public java.util.List<String> getStateListRepeatList() {
        return this.stateListRepeatList;
    }

    public QueryLDCOpsplanRequest setTimeSeriesId(String timeSeriesId) {
        this.timeSeriesId = timeSeriesId;
        return this;
    }
    public String getTimeSeriesId() {
        return this.timeSeriesId;
    }

    public QueryLDCOpsplanRequest setTypesRepeatList(java.util.List<String> typesRepeatList) {
        this.typesRepeatList = typesRepeatList;
        return this;
    }
    public java.util.List<String> getTypesRepeatList() {
        return this.typesRepeatList;
    }

    public QueryLDCOpsplanRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
