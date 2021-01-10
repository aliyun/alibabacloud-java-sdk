// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeMergeprojectpullrequestRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("MergeCommitMessage")
    public String mergeCommitMessage;

    @NameInMap("MergeMethod")
    public String mergeMethod;

    @NameInMap("PullRequestId")
    public String pullRequestId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("ShouldRemoveSourceBranch")
    public String shouldRemoveSourceBranch;

    public static QueryLinkeantcodeAntcodeMergeprojectpullrequestRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeMergeprojectpullrequestRequest self = new QueryLinkeantcodeAntcodeMergeprojectpullrequestRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestRequest setMergeCommitMessage(String mergeCommitMessage) {
        this.mergeCommitMessage = mergeCommitMessage;
        return this;
    }
    public String getMergeCommitMessage() {
        return this.mergeCommitMessage;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestRequest setMergeMethod(String mergeMethod) {
        this.mergeMethod = mergeMethod;
        return this;
    }
    public String getMergeMethod() {
        return this.mergeMethod;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestRequest setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
        return this;
    }
    public String getPullRequestId() {
        return this.pullRequestId;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestRequest setShouldRemoveSourceBranch(String shouldRemoveSourceBranch) {
        this.shouldRemoveSourceBranch = shouldRemoveSourceBranch;
        return this;
    }
    public String getShouldRemoveSourceBranch() {
        return this.shouldRemoveSourceBranch;
    }

}
