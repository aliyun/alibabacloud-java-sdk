// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListJobsRequest extends TeaModel {
    // 作业关联用户ID
    @NameInMap("BusinessUserId")
    public String businessUserId;

    // 调用方
    @NameInMap("Caller")
    public String caller;

    // 作业显示名称，支持模糊查询
    @NameInMap("DisplayName")
    public String displayName;

    // 截止时间
    @NameInMap("EndTime")
    public String endTime;

    // 作业类型
    @NameInMap("JobType")
    public String jobType;

    // 排序顺序
    @NameInMap("Order")
    public String order;

    // 当前页
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 每页返回的作业数
    @NameInMap("PageSize")
    public Integer pageSize;

    // 工作流ID
    @NameInMap("PipelineId")
    public String pipelineId;

    // 资源组ID
    @NameInMap("ResourceId")
    public String resourceId;

    // 是否只返回当前登录者所提交的作业
    @NameInMap("ShowOwn")
    public Boolean showOwn;

    // 按返回字段排序
    @NameInMap("SortBy")
    public String sortBy;

    // 起始时间
    @NameInMap("StartTime")
    public String startTime;

    // 作业状态
    @NameInMap("Status")
    public String status;

    // 自定义标签
    @NameInMap("Tags")
    public java.util.Map<String, String> tags;

    // 工作空间ID
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobsRequest self = new ListJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListJobsRequest setBusinessUserId(String businessUserId) {
        this.businessUserId = businessUserId;
        return this;
    }
    public String getBusinessUserId() {
        return this.businessUserId;
    }

    public ListJobsRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public ListJobsRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ListJobsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListJobsRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public ListJobsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListJobsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListJobsRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public ListJobsRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListJobsRequest setShowOwn(Boolean showOwn) {
        this.showOwn = showOwn;
        return this;
    }
    public Boolean getShowOwn() {
        return this.showOwn;
    }

    public ListJobsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListJobsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListJobsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListJobsRequest setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, String> getTags() {
        return this.tags;
    }

    public ListJobsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
