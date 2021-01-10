// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigResponseBody extends TeaModel {
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

    public static QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigResponseBody self = new QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigResponseBody setFfOnlyEnabled(Boolean ffOnlyEnabled) {
        this.ffOnlyEnabled = ffOnlyEnabled;
        return this;
    }
    public Boolean getFfOnlyEnabled() {
        return this.ffOnlyEnabled;
    }

    public QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigResponseBody setOnlyAllChecksSucceed(Boolean onlyAllChecksSucceed) {
        this.onlyAllChecksSucceed = onlyAllChecksSucceed;
        return this;
    }
    public Boolean getOnlyAllChecksSucceed() {
        return this.onlyAllChecksSucceed;
    }

    public QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigResponseBody setOnlyAllDiscussionsResolved(Boolean onlyAllDiscussionsResolved) {
        this.onlyAllDiscussionsResolved = onlyAllDiscussionsResolved;
        return this;
    }
    public Boolean getOnlyAllDiscussionsResolved() {
        return this.onlyAllDiscussionsResolved;
    }

    public QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigResponseBody setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigResponseBody setRebaseEnabled(Boolean rebaseEnabled) {
        this.rebaseEnabled = rebaseEnabled;
        return this;
    }
    public Boolean getRebaseEnabled() {
        return this.rebaseEnabled;
    }

    public QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigResponseBody setReviewRequired(Boolean reviewRequired) {
        this.reviewRequired = reviewRequired;
        return this;
    }
    public Boolean getReviewRequired() {
        return this.reviewRequired;
    }

    public QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigResponseBody setShouldRemoveSourceBranch(Boolean shouldRemoveSourceBranch) {
        this.shouldRemoveSourceBranch = shouldRemoveSourceBranch;
        return this;
    }
    public Boolean getShouldRemoveSourceBranch() {
        return this.shouldRemoveSourceBranch;
    }

    public QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigResponseBody setSquashMerge(Boolean squashMerge) {
        this.squashMerge = squashMerge;
        return this;
    }
    public Boolean getSquashMerge() {
        return this.squashMerge;
    }

    public QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

}
