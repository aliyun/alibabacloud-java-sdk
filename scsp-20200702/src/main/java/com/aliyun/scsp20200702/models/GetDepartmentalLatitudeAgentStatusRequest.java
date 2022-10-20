// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetDepartmentalLatitudeAgentStatusRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("DepIds")
    public java.util.List<Long> depIds;

    @NameInMap("EndDate")
    public Long endDate;

    @NameInMap("ExistDepartmentGrouping")
    public Boolean existDepartmentGrouping;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("StartDate")
    public Long startDate;

    public static GetDepartmentalLatitudeAgentStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDepartmentalLatitudeAgentStatusRequest self = new GetDepartmentalLatitudeAgentStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetDepartmentalLatitudeAgentStatusRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public GetDepartmentalLatitudeAgentStatusRequest setDepIds(java.util.List<Long> depIds) {
        this.depIds = depIds;
        return this;
    }
    public java.util.List<Long> getDepIds() {
        return this.depIds;
    }

    public GetDepartmentalLatitudeAgentStatusRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public GetDepartmentalLatitudeAgentStatusRequest setExistDepartmentGrouping(Boolean existDepartmentGrouping) {
        this.existDepartmentGrouping = existDepartmentGrouping;
        return this;
    }
    public Boolean getExistDepartmentGrouping() {
        return this.existDepartmentGrouping;
    }

    public GetDepartmentalLatitudeAgentStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetDepartmentalLatitudeAgentStatusRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetDepartmentalLatitudeAgentStatusRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

}
