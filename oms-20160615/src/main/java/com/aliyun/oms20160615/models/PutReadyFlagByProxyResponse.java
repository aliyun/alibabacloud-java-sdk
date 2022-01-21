// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class PutReadyFlagByProxyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PutReadyFlagByProxyResponseBody body;

    public static PutReadyFlagByProxyResponse build(java.util.Map<String, ?> map) throws Exception {
        PutReadyFlagByProxyResponse self = new PutReadyFlagByProxyResponse();
        return TeaModel.build(map, self);
    }

    public PutReadyFlagByProxyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutReadyFlagByProxyResponse setBody(PutReadyFlagByProxyResponseBody body) {
        this.body = body;
        return this;
    }
    public PutReadyFlagByProxyResponseBody getBody() {
        return this.body;
    }

}
