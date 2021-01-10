// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeLsifexistsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeLsifexistsResponseBody body;

    public static QueryLinkeantcodeAntcodeLsifexistsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeLsifexistsResponse self = new QueryLinkeantcodeAntcodeLsifexistsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeLsifexistsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeLsifexistsResponse setBody(QueryLinkeantcodeAntcodeLsifexistsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeLsifexistsResponseBody getBody() {
        return this.body;
    }

}
