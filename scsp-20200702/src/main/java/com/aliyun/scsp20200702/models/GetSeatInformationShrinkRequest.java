// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetSeatInformationShrinkRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("currentPage")
    public Integer currentPage;

    @NameInMap("depIds")
    public String depIdsShrink;

    @NameInMap("endDate")
    public Long endDate;

    @NameInMap("existDepartmentGrouping")
    public Boolean existDepartmentGrouping;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("startDate")
    public Long startDate;

    public static GetSeatInformationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSeatInformationShrinkRequest self = new GetSeatInformationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetSeatInformationShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetSeatInformationShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetSeatInformationShrinkRequest setDepIdsShrink(String depIdsShrink) {
        this.depIdsShrink = depIdsShrink;
        return this;
    }
    public String getDepIdsShrink() {
        return this.depIdsShrink;
    }

    public GetSeatInformationShrinkRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public GetSeatInformationShrinkRequest setExistDepartmentGrouping(Boolean existDepartmentGrouping) {
        this.existDepartmentGrouping = existDepartmentGrouping;
        return this;
    }
    public Boolean getExistDepartmentGrouping() {
        return this.existDepartmentGrouping;
    }

    public GetSeatInformationShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetSeatInformationShrinkRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

}
