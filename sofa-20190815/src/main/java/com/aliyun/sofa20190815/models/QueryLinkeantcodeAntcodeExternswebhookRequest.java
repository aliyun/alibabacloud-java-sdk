// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeExternswebhookRequest extends TeaModel {
    @NameInMap("Body")
    public String body;

    @NameInMap("GitlabEvent")
    public String gitlabEvent;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static QueryLinkeantcodeAntcodeExternswebhookRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeExternswebhookRequest self = new QueryLinkeantcodeAntcodeExternswebhookRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeExternswebhookRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public QueryLinkeantcodeAntcodeExternswebhookRequest setGitlabEvent(String gitlabEvent) {
        this.gitlabEvent = gitlabEvent;
        return this;
    }
    public String getGitlabEvent() {
        return this.gitlabEvent;
    }

    public QueryLinkeantcodeAntcodeExternswebhookRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
