// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeRebasepullrequestRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("PullRequestId")
    public String pullRequestId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static ExecLinkeantcodeAntcodeRebasepullrequestRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeRebasepullrequestRequest self = new ExecLinkeantcodeAntcodeRebasepullrequestRequest();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestRequest setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
        return this;
    }
    public String getPullRequestId() {
        return this.pullRequestId;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
