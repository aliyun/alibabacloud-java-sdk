// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeSubscribepullrequestsRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("PullRequestId")
    public String pullRequestId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static ExecLinkeantcodeAntcodeSubscribepullrequestsRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeSubscribepullrequestsRequest self = new ExecLinkeantcodeAntcodeSubscribepullrequestsRequest();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeSubscribepullrequestsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ExecLinkeantcodeAntcodeSubscribepullrequestsRequest setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
        return this;
    }
    public String getPullRequestId() {
        return this.pullRequestId;
    }

    public ExecLinkeantcodeAntcodeSubscribepullrequestsRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
