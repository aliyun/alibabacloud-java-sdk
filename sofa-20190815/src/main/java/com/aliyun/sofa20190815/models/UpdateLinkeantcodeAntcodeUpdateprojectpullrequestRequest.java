// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeUpdateprojectpullrequestRequest extends TeaModel {
    @NameInMap("AssigneeId")
    public String assigneeId;

    @NameInMap("AutoMerge")
    public String autoMerge;

    @NameInMap("Description")
    public String description;

    @NameInMap("Id")
    public String id;

    @NameInMap("LabelsRepeatList")
    public java.util.List<String> labelsRepeatList;

    @NameInMap("MergeCommitMessage")
    public String mergeCommitMessage;

    @NameInMap("MergeMethod")
    public String mergeMethod;

    @NameInMap("PullRequestId")
    public String pullRequestId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("ReviewRequired")
    public String reviewRequired;

    @NameInMap("ShouldRemoveSourceBranch")
    public String shouldRemoveSourceBranch;

    @NameInMap("SquashMerge")
    public String squashMerge;

    @NameInMap("StateEvent")
    public String stateEvent;

    @NameInMap("TargetBranch")
    public String targetBranch;

    @NameInMap("Threshold")
    public String threshold;

    @NameInMap("ThresholdClear")
    public String thresholdClear;

    @NameInMap("Title")
    public String title;

    public static UpdateLinkeantcodeAntcodeUpdateprojectpullrequestRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeUpdateprojectpullrequestRequest self = new UpdateLinkeantcodeAntcodeUpdateprojectpullrequestRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestRequest setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId;
        return this;
    }
    public String getAssigneeId() {
        return this.assigneeId;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestRequest setAutoMerge(String autoMerge) {
        this.autoMerge = autoMerge;
        return this;
    }
    public String getAutoMerge() {
        return this.autoMerge;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestRequest setLabelsRepeatList(java.util.List<String> labelsRepeatList) {
        this.labelsRepeatList = labelsRepeatList;
        return this;
    }
    public java.util.List<String> getLabelsRepeatList() {
        return this.labelsRepeatList;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestRequest setMergeCommitMessage(String mergeCommitMessage) {
        this.mergeCommitMessage = mergeCommitMessage;
        return this;
    }
    public String getMergeCommitMessage() {
        return this.mergeCommitMessage;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestRequest setMergeMethod(String mergeMethod) {
        this.mergeMethod = mergeMethod;
        return this;
    }
    public String getMergeMethod() {
        return this.mergeMethod;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestRequest setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
        return this;
    }
    public String getPullRequestId() {
        return this.pullRequestId;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestRequest setReviewRequired(String reviewRequired) {
        this.reviewRequired = reviewRequired;
        return this;
    }
    public String getReviewRequired() {
        return this.reviewRequired;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestRequest setShouldRemoveSourceBranch(String shouldRemoveSourceBranch) {
        this.shouldRemoveSourceBranch = shouldRemoveSourceBranch;
        return this;
    }
    public String getShouldRemoveSourceBranch() {
        return this.shouldRemoveSourceBranch;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestRequest setSquashMerge(String squashMerge) {
        this.squashMerge = squashMerge;
        return this;
    }
    public String getSquashMerge() {
        return this.squashMerge;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestRequest setStateEvent(String stateEvent) {
        this.stateEvent = stateEvent;
        return this;
    }
    public String getStateEvent() {
        return this.stateEvent;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestRequest setTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
        return this;
    }
    public String getTargetBranch() {
        return this.targetBranch;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestRequest setThreshold(String threshold) {
        this.threshold = threshold;
        return this;
    }
    public String getThreshold() {
        return this.threshold;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestRequest setThresholdClear(String thresholdClear) {
        this.thresholdClear = thresholdClear;
        return this;
    }
    public String getThresholdClear() {
        return this.thresholdClear;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
