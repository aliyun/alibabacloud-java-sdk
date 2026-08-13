// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetInstanceExpireTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceExpireTimeResponseBody body;

    public static GetInstanceExpireTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceExpireTimeResponse self = new GetInstanceExpireTimeResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceExpireTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceExpireTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceExpireTimeResponse setBody(GetInstanceExpireTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceExpireTimeResponseBody getBody() {
        return this.body;
    }

}
