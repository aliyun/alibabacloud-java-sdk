// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeLockprojectvariableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeLockprojectvariableResponseBody body;

    public static QueryLinkeantcodeAntcodeLockprojectvariableResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeLockprojectvariableResponse self = new QueryLinkeantcodeAntcodeLockprojectvariableResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeLockprojectvariableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeLockprojectvariableResponse setBody(QueryLinkeantcodeAntcodeLockprojectvariableResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeLockprojectvariableResponseBody getBody() {
        return this.body;
    }

}
