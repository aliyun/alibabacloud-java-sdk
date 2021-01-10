// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeNsubscribepullrequestRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("PullRequestId")
    public String pullRequestId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static ExecLinkeantcodeAntcodeNsubscribepullrequestRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeNsubscribepullrequestRequest self = new ExecLinkeantcodeAntcodeNsubscribepullrequestRequest();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeNsubscribepullrequestRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ExecLinkeantcodeAntcodeNsubscribepullrequestRequest setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
        return this;
    }
    public String getPullRequestId() {
        return this.pullRequestId;
    }

    public ExecLinkeantcodeAntcodeNsubscribepullrequestRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
