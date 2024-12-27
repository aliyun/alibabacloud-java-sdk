// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetHostCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHostCountResponseBody body;

    public static GetHostCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHostCountResponse self = new GetHostCountResponse();
        return TeaModel.build(map, self);
    }

    public GetHostCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHostCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHostCountResponse setBody(GetHostCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHostCountResponseBody getBody() {
        return this.body;
    }

}
