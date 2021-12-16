// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class QueryHotlineDashboardRequest extends TeaModel {
    // 当前页码
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    // 部门标识列表
    @NameInMap("DepartmentIdList")
    public java.util.List<Long> departmentIdList;

    // j结束时间
    @NameInMap("EndDate")
    public Long endDate;

    // A short description of struct
    @NameInMap("InstanceId")
    public String instanceId;

    // 页面大小
    @NameInMap("PageSize")
    public Integer pageSize;

    // 坐席标识列表
    @NameInMap("ServicerIdList")
    public java.util.List<Long> servicerIdList;

    // 排序字段集合
    @NameInMap("SortFieldList")
    public java.util.List<String> sortFieldList;

    // 开始时间
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
