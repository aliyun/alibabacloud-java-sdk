// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeCommitreviewRequest extends TeaModel {
    @NameInMap("Body")
    public String body;

    @NameInMap("Id")
    public String id;

    @NameInMap("PullRequestId")
    public String pullRequestId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static ExecLinkeantcodeAntcodeCommitreviewRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeCommitreviewRequest self = new ExecLinkeantcodeAntcodeCommitreviewRequest();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeCommitreviewRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public ExecLinkeantcodeAntcodeCommitreviewRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ExecLinkeantcodeAntcodeCommitreviewRequest setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
        return this;
    }
    public String getPullRequestId() {
        return this.pullRequestId;
    }

    public ExecLinkeantcodeAntcodeCommitreviewRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
