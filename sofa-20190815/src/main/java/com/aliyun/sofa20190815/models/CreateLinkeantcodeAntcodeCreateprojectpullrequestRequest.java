// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeCreateprojectpullrequestRequest extends TeaModel {
    @NameInMap("AssigneeId")
    public String assigneeId;

    @NameInMap("AutoMerge")
    public String autoMerge;

    @NameInMap("Description")
    public String description;

    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("ReviewRequired")
    public String reviewRequired;

    @NameInMap("ReviewRules")
    public String reviewRules;

    @NameInMap("ShouldRemoveSourceBranch")
    public String shouldRemoveSourceBranch;

    @NameInMap("SourceBranch")
    public String sourceBranch;

    @NameInMap("SquashMerge")
    public String squashMerge;

    @NameInMap("TargetBranch")
    public String targetBranch;

    @NameInMap("TargetProjectId")
    public String targetProjectId;

    @NameInMap("Threshold")
    public String threshold;

    @NameInMap("Title")
    public String title;

    @NameInMap("IssuesRepeatList")
    public java.util.List<String> issuesRepeatList;

    @NameInMap("LabelsRepeatList")
    public java.util.List<String> labelsRepeatList;

    @NameInMap("ReviewerIdsRepeatList")
    public java.util.List<String> reviewerIdsRepeatList;

    public static CreateLinkeantcodeAntcodeCreateprojectpullrequestRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeCreateprojectpullrequestRequest self = new CreateLinkeantcodeAntcodeCreateprojectpullrequestRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestRequest setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId;
        return this;
    }
    public String getAssigneeId() {
        return this.assigneeId;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestRequest setAutoMerge(String autoMerge) {
        this.autoMerge = autoMerge;
        return this;
    }
    public String getAutoMerge() {
        return this.autoMerge;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestRequest setReviewRequired(String reviewRequired) {
        this.reviewRequired = reviewRequired;
        return this;
    }
    public String getReviewRequired() {
        return this.reviewRequired;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestRequest setReviewRules(String reviewRules) {
        this.reviewRules = reviewRules;
        return this;
    }
    public String getReviewRules() {
        return this.reviewRules;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestRequest setShouldRemoveSourceBranch(String shouldRemoveSourceBranch) {
        this.shouldRemoveSourceBranch = shouldRemoveSourceBranch;
        return this;
    }
    public String getShouldRemoveSourceBranch() {
        return this.shouldRemoveSourceBranch;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestRequest setSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
        return this;
    }
    public String getSourceBranch() {
        return this.sourceBranch;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestRequest setSquashMerge(String squashMerge) {
        this.squashMerge = squashMerge;
        return this;
    }
    public String getSquashMerge() {
        return this.squashMerge;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestRequest setTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
        return this;
    }
    public String getTargetBranch() {
        return this.targetBranch;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestRequest setTargetProjectId(String targetProjectId) {
        this.targetProjectId = targetProjectId;
        return this;
    }
    public String getTargetProjectId() {
        return this.targetProjectId;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestRequest setThreshold(String threshold) {
        this.threshold = threshold;
        return this;
    }
    public String getThreshold() {
        return this.threshold;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestRequest setIssuesRepeatList(java.util.List<String> issuesRepeatList) {
        this.issuesRepeatList = issuesRepeatList;
        return this;
    }
    public java.util.List<String> getIssuesRepeatList() {
        return this.issuesRepeatList;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestRequest setLabelsRepeatList(java.util.List<String> labelsRepeatList) {
        this.labelsRepeatList = labelsRepeatList;
        return this;
    }
    public java.util.List<String> getLabelsRepeatList() {
        return this.labelsRepeatList;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestRequest setReviewerIdsRepeatList(java.util.List<String> reviewerIdsRepeatList) {
        this.reviewerIdsRepeatList = reviewerIdsRepeatList;
        return this;
    }
    public java.util.List<String> getReviewerIdsRepeatList() {
        return this.reviewerIdsRepeatList;
    }

}
