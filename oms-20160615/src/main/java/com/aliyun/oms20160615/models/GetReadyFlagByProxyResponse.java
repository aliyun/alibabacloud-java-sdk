// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class GetReadyFlagByProxyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetReadyFlagByProxyResponseBody body;

    public static GetReadyFlagByProxyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetReadyFlagByProxyResponse self = new GetReadyFlagByProxyResponse();
        return TeaModel.build(map, self);
    }

    public GetReadyFlagByProxyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetReadyFlagByProxyResponse setBody(GetReadyFlagByProxyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetReadyFlagByProxyResponseBody getBody() {
        return this.body;
    }

}
