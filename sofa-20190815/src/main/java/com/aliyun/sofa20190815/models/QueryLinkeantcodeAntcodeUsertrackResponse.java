// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeUsertrackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeUsertrackResponseBody body;

    public static QueryLinkeantcodeAntcodeUsertrackResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeUsertrackResponse self = new QueryLinkeantcodeAntcodeUsertrackResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeUsertrackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeUsertrackResponse setBody(QueryLinkeantcodeAntcodeUsertrackResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeUsertrackResponseBody getBody() {
        return this.body;
    }

}
