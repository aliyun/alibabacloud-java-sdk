// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeApiwebhookResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeApiwebhookResponseBody body;

    public static QueryLinkeantcodeAntcodeApiwebhookResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeApiwebhookResponse self = new QueryLinkeantcodeAntcodeApiwebhookResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeApiwebhookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeApiwebhookResponse setBody(QueryLinkeantcodeAntcodeApiwebhookResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeApiwebhookResponseBody getBody() {
        return this.body;
    }

}
