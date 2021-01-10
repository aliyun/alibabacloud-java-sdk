// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeApiwebhookRequest extends TeaModel {
    @NameInMap("RequestBody")
    public String requestBody;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static QueryLinkeantcodeAntcodeApiwebhookRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeApiwebhookRequest self = new QueryLinkeantcodeAntcodeApiwebhookRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeApiwebhookRequest setRequestBody(String requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    public String getRequestBody() {
        return this.requestBody;
    }

    public QueryLinkeantcodeAntcodeApiwebhookRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
