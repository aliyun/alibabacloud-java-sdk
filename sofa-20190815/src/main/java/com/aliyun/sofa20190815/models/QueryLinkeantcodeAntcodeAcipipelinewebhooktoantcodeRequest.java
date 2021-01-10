// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeAcipipelinewebhooktoantcodeRequest extends TeaModel {
    @NameInMap("BodyJsonStr")
    public String bodyJsonStr;

    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static QueryLinkeantcodeAntcodeAcipipelinewebhooktoantcodeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeAcipipelinewebhooktoantcodeRequest self = new QueryLinkeantcodeAntcodeAcipipelinewebhooktoantcodeRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeAcipipelinewebhooktoantcodeRequest setBodyJsonStr(String bodyJsonStr) {
        this.bodyJsonStr = bodyJsonStr;
        return this;
    }
    public String getBodyJsonStr() {
        return this.bodyJsonStr;
    }

    public QueryLinkeantcodeAntcodeAcipipelinewebhooktoantcodeRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryLinkeantcodeAntcodeAcipipelinewebhooktoantcodeRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
