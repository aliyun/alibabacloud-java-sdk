// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class AllocateContextDBPublicConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AllocateContextDBPublicConnectionResponseBody body;

    public static AllocateContextDBPublicConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocateContextDBPublicConnectionResponse self = new AllocateContextDBPublicConnectionResponse();
        return TeaModel.build(map, self);
    }

    public AllocateContextDBPublicConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllocateContextDBPublicConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AllocateContextDBPublicConnectionResponse setBody(AllocateContextDBPublicConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public AllocateContextDBPublicConnectionResponseBody getBody() {
        return this.body;
    }

}
