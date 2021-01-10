// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidsubscribeRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("PullRequestId")
    public String pullRequestId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidsubscribeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidsubscribeRequest self = new QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidsubscribeRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidsubscribeRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidsubscribeRequest setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
        return this;
    }
    public String getPullRequestId() {
        return this.pullRequestId;
    }

    public QueryLinkeantcodeAntcodeProjectsidpullrequestspullrequestidsubscribeRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
