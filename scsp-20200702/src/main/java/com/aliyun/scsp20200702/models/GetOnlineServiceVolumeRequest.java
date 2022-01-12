// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetOnlineServiceVolumeRequest extends TeaModel {
    // 坐席id列表
    @NameInMap("AgentIds")
    public java.util.List<Long> agentIds;

    // 当前页（默认为1）
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // 部门id列表
    @NameInMap("DepIds")
    public java.util.List<Long> depIds;

    // 结束日期时间戳（毫秒）
    @NameInMap("EndDate")
    public Long endDate;

    // 是否根据坐席分组
    @NameInMap("ExistAgentGrouping")
    public Boolean existAgentGrouping;

    // 是否根据部门分组
    @NameInMap("ExistDepartmentGrouping")
    public Boolean existDepartmentGrouping;

    // 是否根据技能组分组
    @NameInMap("ExistSkillGroupGrouping")
    public Boolean existSkillGroupGrouping;

    // 技能组id列表
    @NameInMap("GroupIds")
    public java.util.List<Long> groupIds;

    // AICCS实例ID，在智能联络中心控制台上可以看到
    @NameInMap("InstanceId")
    public String instanceId;

    // 每页大小（默认为10)
    @NameInMap("PageSize")
    public Integer pageSize;

    // 开始日期时间戳（毫秒）
    @NameInMap("StartDate")
    public Long startDate;

    // 时间纬度类型
    @NameInMap("TimeLatitudeType")
    public String timeLatitudeType;

    public static GetOnlineServiceVolumeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOnlineServiceVolumeRequest self = new GetOnlineServiceVolumeRequest();
        return TeaModel.build(map, self);
    }

    public GetOnlineServiceVolumeRequest setAgentIds(java.util.List<Long> agentIds) {
        this.agentIds = agentIds;
        return this;
    }
    public java.util.List<Long> getAgentIds() {
        return this.agentIds;
    }

    public GetOnlineServiceVolumeRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetOnlineServiceVolumeRequest setDepIds(java.util.List<Long> depIds) {
        this.depIds = depIds;
        return this;
    }
    public java.util.List<Long> getDepIds() {
        return this.depIds;
    }

    public GetOnlineServiceVolumeRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public GetOnlineServiceVolumeRequest setExistAgentGrouping(Boolean existAgentGrouping) {
        this.existAgentGrouping = existAgentGrouping;
        return this;
    }
    public Boolean getExistAgentGrouping() {
        return this.existAgentGrouping;
    }

    public GetOnlineServiceVolumeRequest setExistDepartmentGrouping(Boolean existDepartmentGrouping) {
        this.existDepartmentGrouping = existDepartmentGrouping;
        return this;
    }
    public Boolean getExistDepartmentGrouping() {
        return this.existDepartmentGrouping;
    }

    public GetOnlineServiceVolumeRequest setExistSkillGroupGrouping(Boolean existSkillGroupGrouping) {
        this.existSkillGroupGrouping = existSkillGroupGrouping;
        return this;
    }
    public Boolean getExistSkillGroupGrouping() {
        return this.existSkillGroupGrouping;
    }

    public GetOnlineServiceVolumeRequest setGroupIds(java.util.List<Long> groupIds) {
        this.groupIds = groupIds;
        return this;
    }
    public java.util.List<Long> getGroupIds() {
        return this.groupIds;
    }

    public GetOnlineServiceVolumeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetOnlineServiceVolumeRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetOnlineServiceVolumeRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public GetOnlineServiceVolumeRequest setTimeLatitudeType(String timeLatitudeType) {
        this.timeLatitudeType = timeLatitudeType;
        return this;
    }
    public String getTimeLatitudeType() {
        return this.timeLatitudeType;
    }

}
