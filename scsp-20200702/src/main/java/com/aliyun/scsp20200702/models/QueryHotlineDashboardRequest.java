// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class QueryHotlineDashboardRequest extends TeaModel {
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("DepartmentIdList")
    public java.util.List<Long> departmentIdList;

    @NameInMap("EndDate")
    public Long endDate;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ServicerIdList")
    public java.util.List<Long> servicerIdList;

    @NameInMap("SortFieldList")
    public java.util.List<String> sortFieldList;

    @NameInMap("StartDate")
    public Long startDate;

    public static QueryHotlineDashboardRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHotlineDashboardRequest self = new QueryHotlineDashboardRequest();
        return TeaModel.build(map, self);
    }

    public QueryHotlineDashboardRequest setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryHotlineDashboardRequest setDepartmentIdList(java.util.List<Long> departmentIdList) {
        this.departmentIdList = departmentIdList;
        return this;
    }
    public java.util.List<Long> getDepartmentIdList() {
        return this.departmentIdList;
    }

    public QueryHotlineDashboardRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public QueryHotlineDashboardRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryHotlineDashboardRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryHotlineDashboardRequest setServicerIdList(java.util.List<Long> servicerIdList) {
        this.servicerIdList = servicerIdList;
        return this;
    }
    public java.util.List<Long> getServicerIdList() {
        return this.servicerIdList;
    }

    public QueryHotlineDashboardRequest setSortFieldList(java.util.List<String> sortFieldList) {
        this.sortFieldList = sortFieldList;
        return this;
    }
    public java.util.List<String> getSortFieldList() {
        return this.sortFieldList;
    }

    public QueryHotlineDashboardRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

}
