// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ReleaseTrafficControlTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleaseTrafficControlTaskResponseBody body;

    public static ReleaseTrafficControlTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseTrafficControlTaskResponse self = new ReleaseTrafficControlTaskResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseTrafficControlTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseTrafficControlTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseTrafficControlTaskResponse setBody(ReleaseTrafficControlTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseTrafficControlTaskResponseBody getBody() {
        return this.body;
    }

}
