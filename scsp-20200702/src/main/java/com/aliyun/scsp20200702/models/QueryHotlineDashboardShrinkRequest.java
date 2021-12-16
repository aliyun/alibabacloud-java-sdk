// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class QueryHotlineDashboardShrinkRequest extends TeaModel {
    // 当前页码
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    // 部门标识列表
    @NameInMap("DepartmentIdList")
    public String departmentIdListShrink;

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
    public String servicerIdListShrink;

    // 排序字段集合
    @NameInMap("SortFieldList")
    public String sortFieldListShrink;

    // 开始时间
    @NameInMap("StartDate")
    public Long startDate;

    public static QueryHotlineDashboardShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHotlineDashboardShrinkRequest self = new QueryHotlineDashboardShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryHotlineDashboardShrinkRequest setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryHotlineDashboardShrinkRequest setDepartmentIdListShrink(String departmentIdListShrink) {
        this.departmentIdListShrink = departmentIdListShrink;
        return this;
    }
    public String getDepartmentIdListShrink() {
        return this.departmentIdListShrink;
    }

    public QueryHotlineDashboardShrinkRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public QueryHotlineDashboardShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryHotlineDashboardShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryHotlineDashboardShrinkRequest setServicerIdListShrink(String servicerIdListShrink) {
        this.servicerIdListShrink = servicerIdListShrink;
        return this;
    }
    public String getServicerIdListShrink() {
        return this.servicerIdListShrink;
    }

    public QueryHotlineDashboardShrinkRequest setSortFieldListShrink(String sortFieldListShrink) {
        this.sortFieldListShrink = sortFieldListShrink;
        return this;
    }
    public String getSortFieldListShrink() {
        return this.sortFieldListShrink;
    }

    public QueryHotlineDashboardShrinkRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

}
