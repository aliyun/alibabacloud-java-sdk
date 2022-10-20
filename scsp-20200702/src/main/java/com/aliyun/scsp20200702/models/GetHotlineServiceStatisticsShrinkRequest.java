// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetHotlineServiceStatisticsShrinkRequest extends TeaModel {
    @NameInMap("AgentIds")
    public String agentIdsShrink;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("DepIds")
    public String depIdsShrink;

    @NameInMap("EndDate")
    public Long endDate;

    @NameInMap("ExistAgentGrouping")
    public Boolean existAgentGrouping;

    @NameInMap("ExistDepartmentGrouping")
    public Boolean existDepartmentGrouping;

    @NameInMap("ExistSkillGroupGrouping")
    public Boolean existSkillGroupGrouping;

    @NameInMap("GroupIds")
    public String groupIdsShrink;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StartDate")
    public Long startDate;

    @NameInMap("TimeLatitudeType")
    public String timeLatitudeType;

    public static GetHotlineServiceStatisticsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineServiceStatisticsShrinkRequest self = new GetHotlineServiceStatisticsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetHotlineServiceStatisticsShrinkRequest setAgentIdsShrink(String agentIdsShrink) {
        this.agentIdsShrink = agentIdsShrink;
        return this;
    }
    public String getAgentIdsShrink() {
        return this.agentIdsShrink;
    }

    public GetHotlineServiceStatisticsShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetHotlineServiceStatisticsShrinkRequest setDepIdsShrink(String depIdsShrink) {
        this.depIdsShrink = depIdsShrink;
        return this;
    }
    public String getDepIdsShrink() {
        return this.depIdsShrink;
    }

    public GetHotlineServiceStatisticsShrinkRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public GetHotlineServiceStatisticsShrinkRequest setExistAgentGrouping(Boolean existAgentGrouping) {
        this.existAgentGrouping = existAgentGrouping;
        return this;
    }
    public Boolean getExistAgentGrouping() {
        return this.existAgentGrouping;
    }

    public GetHotlineServiceStatisticsShrinkRequest setExistDepartmentGrouping(Boolean existDepartmentGrouping) {
        this.existDepartmentGrouping = existDepartmentGrouping;
        return this;
    }
    public Boolean getExistDepartmentGrouping() {
        return this.existDepartmentGrouping;
    }

    public GetHotlineServiceStatisticsShrinkRequest setExistSkillGroupGrouping(Boolean existSkillGroupGrouping) {
        this.existSkillGroupGrouping = existSkillGroupGrouping;
        return this;
    }
    public Boolean getExistSkillGroupGrouping() {
        return this.existSkillGroupGrouping;
    }

    public GetHotlineServiceStatisticsShrinkRequest setGroupIdsShrink(String groupIdsShrink) {
        this.groupIdsShrink = groupIdsShrink;
        return this;
    }
    public String getGroupIdsShrink() {
        return this.groupIdsShrink;
    }

    public GetHotlineServiceStatisticsShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetHotlineServiceStatisticsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetHotlineServiceStatisticsShrinkRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public GetHotlineServiceStatisticsShrinkRequest setTimeLatitudeType(String timeLatitudeType) {
        this.timeLatitudeType = timeLatitudeType;
        return this;
    }
    public String getTimeLatitudeType() {
        return this.timeLatitudeType;
    }

}
