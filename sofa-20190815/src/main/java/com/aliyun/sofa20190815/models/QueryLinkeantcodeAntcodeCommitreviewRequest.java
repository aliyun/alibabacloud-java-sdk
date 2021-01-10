// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeCommitreviewRequest extends TeaModel {
    @NameInMap("Body")
    public String body;

    @NameInMap("Id")
    public String id;

    @NameInMap("PullRequestId")
    public String pullRequestId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static QueryLinkeantcodeAntcodeCommitreviewRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeCommitreviewRequest self = new QueryLinkeantcodeAntcodeCommitreviewRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeCommitreviewRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public QueryLinkeantcodeAntcodeCommitreviewRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryLinkeantcodeAntcodeCommitreviewRequest setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
        return this;
    }
    public String getPullRequestId() {
        return this.pullRequestId;
    }

    public QueryLinkeantcodeAntcodeCommitreviewRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
