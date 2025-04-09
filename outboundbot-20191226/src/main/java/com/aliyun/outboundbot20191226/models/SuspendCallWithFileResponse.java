// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SuspendCallWithFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SuspendCallWithFileResponseBody body;

    public static SuspendCallWithFileResponse build(java.util.Map<String, ?> map) throws Exception {
        SuspendCallWithFileResponse self = new SuspendCallWithFileResponse();
        return TeaModel.build(map, self);
    }

    public SuspendCallWithFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SuspendCallWithFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SuspendCallWithFileResponse setBody(SuspendCallWithFileResponseBody body) {
        this.body = body;
        return this;
    }
    public SuspendCallWithFileResponseBody getBody() {
        return this.body;
    }

}
