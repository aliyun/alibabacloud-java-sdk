// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class RebootRenderingServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RebootRenderingServerResponseBody body;

    public static RebootRenderingServerResponse build(java.util.Map<String, ?> map) throws Exception {
        RebootRenderingServerResponse self = new RebootRenderingServerResponse();
        return TeaModel.build(map, self);
    }

    public RebootRenderingServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RebootRenderingServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RebootRenderingServerResponse setBody(RebootRenderingServerResponseBody body) {
        this.body = body;
        return this;
    }
    public RebootRenderingServerResponseBody getBody() {
        return this.body;
    }

}
