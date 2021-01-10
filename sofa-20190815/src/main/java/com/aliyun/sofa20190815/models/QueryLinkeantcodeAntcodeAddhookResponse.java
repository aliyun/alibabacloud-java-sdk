// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeAddhookResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeAddhookResponseBody body;

    public static QueryLinkeantcodeAntcodeAddhookResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeAddhookResponse self = new QueryLinkeantcodeAntcodeAddhookResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeAddhookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeAddhookResponse setBody(QueryLinkeantcodeAntcodeAddhookResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeAddhookResponseBody getBody() {
        return this.body;
    }

}
