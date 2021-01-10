// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeAcipipelinewebhooktoantcodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeAcipipelinewebhooktoantcodeResponseBody body;

    public static QueryLinkeantcodeAntcodeAcipipelinewebhooktoantcodeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeAcipipelinewebhooktoantcodeResponse self = new QueryLinkeantcodeAntcodeAcipipelinewebhooktoantcodeResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeAcipipelinewebhooktoantcodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeAcipipelinewebhooktoantcodeResponse setBody(QueryLinkeantcodeAntcodeAcipipelinewebhooktoantcodeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeAcipipelinewebhooktoantcodeResponseBody getBody() {
        return this.body;
    }

}
