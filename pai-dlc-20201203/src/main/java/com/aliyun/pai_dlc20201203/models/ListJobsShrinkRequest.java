// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListJobsShrinkRequest extends TeaModel {
    // 作业显示名称，支持模糊查询
    @NameInMap("DisplayName")
    public String displayName;

    // 作业类型
    @NameInMap("JobType")
    public String jobType;

    // 作业状态
    @NameInMap("Status")
    public String status;

    // 起始时间
    @NameInMap("StartTime")
    public String startTime;

    // 截止时间
    @NameInMap("EndTime")
    public String endTime;

    // 当前页
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 每页返回的作业数
    @NameInMap("PageSize")
    public Integer pageSize;

    // 按返回字段排序
    @NameInMap("SortBy")
    public String sortBy;

    // 排序顺序
    @NameInMap("Order")
    public String order;

    // 是否只返回当前登录者所提交的作业
    @NameInMap("ShowOwn")
    public Boolean showOwn;

    // 工作空间ID
    @NameInMap("WorkspaceId")
    public String workspaceId;

    // 资源组ID
    @NameInMap("ResourceId")
    public String resourceId;

    // 作业关联用户ID
    @NameInMap("BusinessUserId")
    public String businessUserId;

    // 调用方
    @NameInMap("Caller")
    public String caller;

    // 自定义标签
    @NameInMap("Tags")
    public String tagsShrink;

    // 工作流ID
    @NameInMap("PipelineId")
    public String pipelineId;

    public static ListJobsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobsShrinkRequest self = new ListJobsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListJobsShrinkRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ListJobsShrinkRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public ListJobsShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListJobsShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListJobsShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListJobsShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListJobsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListJobsShrinkRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListJobsShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListJobsShrinkRequest setShowOwn(Boolean showOwn) {
        this.showOwn = showOwn;
        return this;
    }
    public Boolean getShowOwn() {
        return this.showOwn;
    }

    public ListJobsShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public ListJobsShrinkRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListJobsShrinkRequest setBusinessUserId(String businessUserId) {
        this.businessUserId = businessUserId;
        return this;
    }
    public String getBusinessUserId() {
        return this.businessUserId;
    }

    public ListJobsShrinkRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public ListJobsShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public ListJobsShrinkRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

}
