// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class QueryHotlineDashboardShrinkRequest extends TeaModel {
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("DepartmentIdList")
    public String departmentIdListShrink;

    @NameInMap("EndDate")
    public Long endDate;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ServicerIdList")
    public String servicerIdListShrink;

    @NameInMap("SortFieldList")
    public String sortFieldListShrink;

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
