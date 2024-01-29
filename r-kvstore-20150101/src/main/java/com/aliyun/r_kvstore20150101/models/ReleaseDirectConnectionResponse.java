// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ReleaseDirectConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleaseDirectConnectionResponseBody body;

    public static ReleaseDirectConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseDirectConnectionResponse self = new ReleaseDirectConnectionResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseDirectConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseDirectConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseDirectConnectionResponse setBody(ReleaseDirectConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseDirectConnectionResponseBody getBody() {
        return this.body;
    }

}
