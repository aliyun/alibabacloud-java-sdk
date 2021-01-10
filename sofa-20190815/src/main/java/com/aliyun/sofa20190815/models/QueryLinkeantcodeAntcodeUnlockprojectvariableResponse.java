// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeUnlockprojectvariableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeUnlockprojectvariableResponseBody body;

    public static QueryLinkeantcodeAntcodeUnlockprojectvariableResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeUnlockprojectvariableResponse self = new QueryLinkeantcodeAntcodeUnlockprojectvariableResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeUnlockprojectvariableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeUnlockprojectvariableResponse setBody(QueryLinkeantcodeAntcodeUnlockprojectvariableResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeUnlockprojectvariableResponseBody getBody() {
        return this.body;
    }

}
