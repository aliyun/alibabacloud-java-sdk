// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeAcceptprojectreviewtaskRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("PullRequestId")
    public String pullRequestId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static QueryLinkeantcodeAntcodeAcceptprojectreviewtaskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeAcceptprojectreviewtaskRequest self = new QueryLinkeantcodeAntcodeAcceptprojectreviewtaskRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeAcceptprojectreviewtaskRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryLinkeantcodeAntcodeAcceptprojectreviewtaskRequest setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
        return this;
    }
    public String getPullRequestId() {
        return this.pullRequestId;
    }

    public QueryLinkeantcodeAntcodeAcceptprojectreviewtaskRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
