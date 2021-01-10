// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("FfOnlyEnabled")
    public Boolean ffOnlyEnabled;

    @NameInMap("Id")
    public Long id;

    @NameInMap("OnlyAllChecksSucceed")
    public Boolean onlyAllChecksSucceed;

    @NameInMap("OnlyAllDiscussionsResolved")
    public Boolean onlyAllDiscussionsResolved;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("RebaseEnabled")
    public Boolean rebaseEnabled;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("ReviewRequired")
    public Boolean reviewRequired;

    @NameInMap("ShouldRemoveSourceBranch")
    public Boolean shouldRemoveSourceBranch;

    @NameInMap("SquashMerge")
    public Boolean squashMerge;

    @NameInMap("UpdatedAt")
    public String updatedAt;

    @NameInMap("WorkitemFinishWhenMerge")
    public Boolean workitemFinishWhenMerge;

    @NameInMap("WorkitemRequired")
    public Boolean workitemRequired;

    public static UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponseBody self = new UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponseBody setFfOnlyEnabled(Boolean ffOnlyEnabled) {
        this.ffOnlyEnabled = ffOnlyEnabled;
        return this;
    }
    public Boolean getFfOnlyEnabled() {
        return this.ffOnlyEnabled;
    }

    public UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponseBody setOnlyAllChecksSucceed(Boolean onlyAllChecksSucceed) {
        this.onlyAllChecksSucceed = onlyAllChecksSucceed;
        return this;
    }
    public Boolean getOnlyAllChecksSucceed() {
        return this.onlyAllChecksSucceed;
    }

    public UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponseBody setOnlyAllDiscussionsResolved(Boolean onlyAllDiscussionsResolved) {
        this.onlyAllDiscussionsResolved = onlyAllDiscussionsResolved;
        return this;
    }
    public Boolean getOnlyAllDiscussionsResolved() {
        return this.onlyAllDiscussionsResolved;
    }

    public UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponseBody setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponseBody setRebaseEnabled(Boolean rebaseEnabled) {
        this.rebaseEnabled = rebaseEnabled;
        return this;
    }
    public Boolean getRebaseEnabled() {
        return this.rebaseEnabled;
    }

    public UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponseBody setReviewRequired(Boolean reviewRequired) {
        this.reviewRequired = reviewRequired;
        return this;
    }
    public Boolean getReviewRequired() {
        return this.reviewRequired;
    }

    public UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponseBody setShouldRemoveSourceBranch(Boolean shouldRemoveSourceBranch) {
        this.shouldRemoveSourceBranch = shouldRemoveSourceBranch;
        return this;
    }
    public Boolean getShouldRemoveSourceBranch() {
        return this.shouldRemoveSourceBranch;
    }

    public UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponseBody setSquashMerge(Boolean squashMerge) {
        this.squashMerge = squashMerge;
        return this;
    }
    public Boolean getSquashMerge() {
        return this.squashMerge;
    }

    public UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponseBody setWorkitemFinishWhenMerge(Boolean workitemFinishWhenMerge) {
        this.workitemFinishWhenMerge = workitemFinishWhenMerge;
        return this;
    }
    public Boolean getWorkitemFinishWhenMerge() {
        return this.workitemFinishWhenMerge;
    }

    public UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponseBody setWorkitemRequired(Boolean workitemRequired) {
        this.workitemRequired = workitemRequired;
        return this;
    }
    public Boolean getWorkitemRequired() {
        return this.workitemRequired;
    }

}
