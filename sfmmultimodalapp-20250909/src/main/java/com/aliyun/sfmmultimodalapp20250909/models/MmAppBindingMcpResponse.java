// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class MmAppBindingMcpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MmAppBindingMcpResponseBody body;

    public static MmAppBindingMcpResponse build(java.util.Map<String, ?> map) throws Exception {
        MmAppBindingMcpResponse self = new MmAppBindingMcpResponse();
        return TeaModel.build(map, self);
    }

    public MmAppBindingMcpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MmAppBindingMcpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MmAppBindingMcpResponse setBody(MmAppBindingMcpResponseBody body) {
        this.body = body;
        return this;
    }
    public MmAppBindingMcpResponseBody getBody() {
        return this.body;
    }

}
