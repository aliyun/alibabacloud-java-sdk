// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutVcsmergerequestRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AssigneeId")
    public String assigneeId;

    @NameInMap("AssigneeUserName")
    public String assigneeUserName;

    @NameInMap("Description")
    public String description;

    @NameInMap("IterationUnitId")
    public String iterationUnitId;

    @NameInMap("NeedReview")
    public Boolean needReview;

    @NameInMap("ReviewersThreshold")
    public Long reviewersThreshold;

    @NameInMap("ReviewRules")
    public String reviewRules;

    @NameInMap("ShouldRemoveSourceBranch")
    public Boolean shouldRemoveSourceBranch;

    @NameInMap("SourceBranch")
    public String sourceBranch;

    @NameInMap("SquashMerge")
    public Boolean squashMerge;

    @NameInMap("StageId")
    public String stageId;

    @NameInMap("TargetBranch")
    public String targetBranch;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("Title")
    public String title;

    @NameInMap("ReviewersRepeatList")
    public java.util.List<String> reviewersRepeatList;

    @NameInMap("WorkItemsRepeatList")
    public java.util.List<String> workItemsRepeatList;

    public static AddLinkeBahamutVcsmergerequestRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutVcsmergerequestRequest self = new AddLinkeBahamutVcsmergerequestRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutVcsmergerequestRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddLinkeBahamutVcsmergerequestRequest setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId;
        return this;
    }
    public String getAssigneeId() {
        return this.assigneeId;
    }

    public AddLinkeBahamutVcsmergerequestRequest setAssigneeUserName(String assigneeUserName) {
        this.assigneeUserName = assigneeUserName;
        return this;
    }
    public String getAssigneeUserName() {
        return this.assigneeUserName;
    }

    public AddLinkeBahamutVcsmergerequestRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddLinkeBahamutVcsmergerequestRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

    public AddLinkeBahamutVcsmergerequestRequest setNeedReview(Boolean needReview) {
        this.needReview = needReview;
        return this;
    }
    public Boolean getNeedReview() {
        return this.needReview;
    }

    public AddLinkeBahamutVcsmergerequestRequest setReviewersThreshold(Long reviewersThreshold) {
        this.reviewersThreshold = reviewersThreshold;
        return this;
    }
    public Long getReviewersThreshold() {
        return this.reviewersThreshold;
    }

    public AddLinkeBahamutVcsmergerequestRequest setReviewRules(String reviewRules) {
        this.reviewRules = reviewRules;
        return this;
    }
    public String getReviewRules() {
        return this.reviewRules;
    }

    public AddLinkeBahamutVcsmergerequestRequest setShouldRemoveSourceBranch(Boolean shouldRemoveSourceBranch) {
        this.shouldRemoveSourceBranch = shouldRemoveSourceBranch;
        return this;
    }
    public Boolean getShouldRemoveSourceBranch() {
        return this.shouldRemoveSourceBranch;
    }

    public AddLinkeBahamutVcsmergerequestRequest setSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
        return this;
    }
    public String getSourceBranch() {
        return this.sourceBranch;
    }

    public AddLinkeBahamutVcsmergerequestRequest setSquashMerge(Boolean squashMerge) {
        this.squashMerge = squashMerge;
        return this;
    }
    public Boolean getSquashMerge() {
        return this.squashMerge;
    }

    public AddLinkeBahamutVcsmergerequestRequest setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

    public AddLinkeBahamutVcsmergerequestRequest setTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
        return this;
    }
    public String getTargetBranch() {
        return this.targetBranch;
    }

    public AddLinkeBahamutVcsmergerequestRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AddLinkeBahamutVcsmergerequestRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public AddLinkeBahamutVcsmergerequestRequest setReviewersRepeatList(java.util.List<String> reviewersRepeatList) {
        this.reviewersRepeatList = reviewersRepeatList;
        return this;
    }
    public java.util.List<String> getReviewersRepeatList() {
        return this.reviewersRepeatList;
    }

    public AddLinkeBahamutVcsmergerequestRequest setWorkItemsRepeatList(java.util.List<String> workItemsRepeatList) {
        this.workItemsRepeatList = workItemsRepeatList;
        return this;
    }
    public java.util.List<String> getWorkItemsRepeatList() {
        return this.workItemsRepeatList;
    }

}
