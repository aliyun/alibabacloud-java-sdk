// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class AllocatePublicConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AllocatePublicConnectionResponseBody body;

    public static AllocatePublicConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocatePublicConnectionResponse self = new AllocatePublicConnectionResponse();
        return TeaModel.build(map, self);
    }

    public AllocatePublicConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllocatePublicConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AllocatePublicConnectionResponse setBody(AllocatePublicConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public AllocatePublicConnectionResponseBody getBody() {
        return this.body;
    }

}
