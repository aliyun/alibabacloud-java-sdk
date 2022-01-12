// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetDepartmentalLatitudeAgentStatusShrinkRequest extends TeaModel {
    // 当前页（默认为1）
    @NameInMap("CurrentPage")
    public Long currentPage;

    // 技能组分组id列表
    @NameInMap("DepIds")
    public String depIdsShrink;

    // 结束日期时间戳（毫秒）
    @NameInMap("EndDate")
    public Long endDate;

    // 是否根据技能组分组id分组显示
    @NameInMap("ExistDepartmentGrouping")
    public Boolean existDepartmentGrouping;

    // AICCS实例ID，在智能联络中心控制台上可以看到
    @NameInMap("InstanceId")
    public String instanceId;

    // 每页大小（默认为10)
    @NameInMap("PageSize")
    public Long pageSize;

    // 开始日期时间戳（毫秒）
    @NameInMap("StartDate")
    public Long startDate;

    public static GetDepartmentalLatitudeAgentStatusShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDepartmentalLatitudeAgentStatusShrinkRequest self = new GetDepartmentalLatitudeAgentStatusShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetDepartmentalLatitudeAgentStatusShrinkRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public GetDepartmentalLatitudeAgentStatusShrinkRequest setDepIdsShrink(String depIdsShrink) {
        this.depIdsShrink = depIdsShrink;
        return this;
    }
    public String getDepIdsShrink() {
        return this.depIdsShrink;
    }

    public GetDepartmentalLatitudeAgentStatusShrinkRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public GetDepartmentalLatitudeAgentStatusShrinkRequest setExistDepartmentGrouping(Boolean existDepartmentGrouping) {
        this.existDepartmentGrouping = existDepartmentGrouping;
        return this;
    }
    public Boolean getExistDepartmentGrouping() {
        return this.existDepartmentGrouping;
    }

    public GetDepartmentalLatitudeAgentStatusShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetDepartmentalLatitudeAgentStatusShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetDepartmentalLatitudeAgentStatusShrinkRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

}
