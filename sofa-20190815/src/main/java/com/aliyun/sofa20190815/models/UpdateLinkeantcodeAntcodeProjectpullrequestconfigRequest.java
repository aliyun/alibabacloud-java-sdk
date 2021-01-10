// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeProjectpullrequestconfigRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("MergeMethod")
    public String mergeMethod;

    @NameInMap("OnlyAllChecksSucceed")
    public String onlyAllChecksSucceed;

    @NameInMap("OnlyAllDiscussionsResolved")
    public String onlyAllDiscussionsResolved;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("ReviewRequired")
    public String reviewRequired;

    @NameInMap("ShouldRemoveSourceBranch")
    public String shouldRemoveSourceBranch;

    @NameInMap("SquashMerge")
    public String squashMerge;

    @NameInMap("WorkitemFinishWhenMerge")
    public String workitemFinishWhenMerge;

    @NameInMap("WorkitemRequired")
    public String workitemRequired;

    public static UpdateLinkeantcodeAntcodeProjectpullrequestconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeProjectpullrequestconfigRequest self = new UpdateLinkeantcodeAntcodeProjectpullrequestconfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeProjectpullrequestconfigRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateLinkeantcodeAntcodeProjectpullrequestconfigRequest setMergeMethod(String mergeMethod) {
        this.mergeMethod = mergeMethod;
        return this;
    }
    public String getMergeMethod() {
        return this.mergeMethod;
    }

    public UpdateLinkeantcodeAntcodeProjectpullrequestconfigRequest setOnlyAllChecksSucceed(String onlyAllChecksSucceed) {
        this.onlyAllChecksSucceed = onlyAllChecksSucceed;
        return this;
    }
    public String getOnlyAllChecksSucceed() {
        return this.onlyAllChecksSucceed;
    }

    public UpdateLinkeantcodeAntcodeProjectpullrequestconfigRequest setOnlyAllDiscussionsResolved(String onlyAllDiscussionsResolved) {
        this.onlyAllDiscussionsResolved = onlyAllDiscussionsResolved;
        return this;
    }
    public String getOnlyAllDiscussionsResolved() {
        return this.onlyAllDiscussionsResolved;
    }

    public UpdateLinkeantcodeAntcodeProjectpullrequestconfigRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public UpdateLinkeantcodeAntcodeProjectpullrequestconfigRequest setReviewRequired(String reviewRequired) {
        this.reviewRequired = reviewRequired;
        return this;
    }
    public String getReviewRequired() {
        return this.reviewRequired;
    }

    public UpdateLinkeantcodeAntcodeProjectpullrequestconfigRequest setShouldRemoveSourceBranch(String shouldRemoveSourceBranch) {
        this.shouldRemoveSourceBranch = shouldRemoveSourceBranch;
        return this;
    }
    public String getShouldRemoveSourceBranch() {
        return this.shouldRemoveSourceBranch;
    }

    public UpdateLinkeantcodeAntcodeProjectpullrequestconfigRequest setSquashMerge(String squashMerge) {
        this.squashMerge = squashMerge;
        return this;
    }
    public String getSquashMerge() {
        return this.squashMerge;
    }

    public UpdateLinkeantcodeAntcodeProjectpullrequestconfigRequest setWorkitemFinishWhenMerge(String workitemFinishWhenMerge) {
        this.workitemFinishWhenMerge = workitemFinishWhenMerge;
        return this;
    }
    public String getWorkitemFinishWhenMerge() {
        return this.workitemFinishWhenMerge;
    }

    public UpdateLinkeantcodeAntcodeProjectpullrequestconfigRequest setWorkitemRequired(String workitemRequired) {
        this.workitemRequired = workitemRequired;
        return this;
    }
    public String getWorkitemRequired() {
        return this.workitemRequired;
    }

}
