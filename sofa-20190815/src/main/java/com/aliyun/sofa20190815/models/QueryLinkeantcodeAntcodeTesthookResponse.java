// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeTesthookResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeTesthookResponseBody body;

    public static QueryLinkeantcodeAntcodeTesthookResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeTesthookResponse self = new QueryLinkeantcodeAntcodeTesthookResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeTesthookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeTesthookResponse setBody(QueryLinkeantcodeAntcodeTesthookResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeTesthookResponseBody getBody() {
        return this.body;
    }

}
