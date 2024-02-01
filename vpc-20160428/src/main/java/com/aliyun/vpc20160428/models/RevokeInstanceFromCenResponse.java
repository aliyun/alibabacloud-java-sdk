// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class RevokeInstanceFromCenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeInstanceFromCenResponseBody body;

    public static RevokeInstanceFromCenResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeInstanceFromCenResponse self = new RevokeInstanceFromCenResponse();
        return TeaModel.build(map, self);
    }

    public RevokeInstanceFromCenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeInstanceFromCenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeInstanceFromCenResponse setBody(RevokeInstanceFromCenResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeInstanceFromCenResponseBody getBody() {
        return this.body;
    }

}
