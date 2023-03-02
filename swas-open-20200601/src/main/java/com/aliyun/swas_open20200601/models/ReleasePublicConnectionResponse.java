// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ReleasePublicConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ReleasePublicConnectionResponseBody body;

    public static ReleasePublicConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleasePublicConnectionResponse self = new ReleasePublicConnectionResponse();
        return TeaModel.build(map, self);
    }

    public ReleasePublicConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleasePublicConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleasePublicConnectionResponse setBody(ReleasePublicConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleasePublicConnectionResponseBody getBody() {
        return this.body;
    }

}
