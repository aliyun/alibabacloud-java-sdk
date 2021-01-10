// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeExternswebhookResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeExternswebhookResponseBody body;

    public static QueryLinkeantcodeAntcodeExternswebhookResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeExternswebhookResponse self = new QueryLinkeantcodeAntcodeExternswebhookResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeExternswebhookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeExternswebhookResponse setBody(QueryLinkeantcodeAntcodeExternswebhookResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeExternswebhookResponseBody getBody() {
        return this.body;
    }

}
