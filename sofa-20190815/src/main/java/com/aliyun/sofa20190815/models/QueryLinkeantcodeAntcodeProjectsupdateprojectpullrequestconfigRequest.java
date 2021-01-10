// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigRequest extends TeaModel {
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

    public static QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigRequest self = new QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigRequest setMergeMethod(String mergeMethod) {
        this.mergeMethod = mergeMethod;
        return this;
    }
    public String getMergeMethod() {
        return this.mergeMethod;
    }

    public QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigRequest setOnlyAllChecksSucceed(String onlyAllChecksSucceed) {
        this.onlyAllChecksSucceed = onlyAllChecksSucceed;
        return this;
    }
    public String getOnlyAllChecksSucceed() {
        return this.onlyAllChecksSucceed;
    }

    public QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigRequest setOnlyAllDiscussionsResolved(String onlyAllDiscussionsResolved) {
        this.onlyAllDiscussionsResolved = onlyAllDiscussionsResolved;
        return this;
    }
    public String getOnlyAllDiscussionsResolved() {
        return this.onlyAllDiscussionsResolved;
    }

    public QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigRequest setReviewRequired(String reviewRequired) {
        this.reviewRequired = reviewRequired;
        return this;
    }
    public String getReviewRequired() {
        return this.reviewRequired;
    }

    public QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigRequest setShouldRemoveSourceBranch(String shouldRemoveSourceBranch) {
        this.shouldRemoveSourceBranch = shouldRemoveSourceBranch;
        return this;
    }
    public String getShouldRemoveSourceBranch() {
        return this.shouldRemoveSourceBranch;
    }

    public QueryLinkeantcodeAntcodeProjectsupdateprojectpullrequestconfigRequest setSquashMerge(String squashMerge) {
        this.squashMerge = squashMerge;
        return this;
    }
    public String getSquashMerge() {
        return this.squashMerge;
    }

}
