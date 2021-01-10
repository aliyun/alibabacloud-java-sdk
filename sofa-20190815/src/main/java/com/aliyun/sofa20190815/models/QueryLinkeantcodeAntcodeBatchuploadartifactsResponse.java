// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeBatchuploadartifactsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeantcodeAntcodeBatchuploadartifactsResponseBody body;

    public static QueryLinkeantcodeAntcodeBatchuploadartifactsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeBatchuploadartifactsResponse self = new QueryLinkeantcodeAntcodeBatchuploadartifactsResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeBatchuploadartifactsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeantcodeAntcodeBatchuploadartifactsResponse setBody(QueryLinkeantcodeAntcodeBatchuploadartifactsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeantcodeAntcodeBatchuploadartifactsResponseBody getBody() {
        return this.body;
    }

}
