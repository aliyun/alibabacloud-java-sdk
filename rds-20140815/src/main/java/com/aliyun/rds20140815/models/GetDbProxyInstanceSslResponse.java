// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class GetDbProxyInstanceSslResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDbProxyInstanceSslResponseBody body;

    public static GetDbProxyInstanceSslResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDbProxyInstanceSslResponse self = new GetDbProxyInstanceSslResponse();
        return TeaModel.build(map, self);
    }

    public GetDbProxyInstanceSslResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDbProxyInstanceSslResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDbProxyInstanceSslResponse setBody(GetDbProxyInstanceSslResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDbProxyInstanceSslResponseBody getBody() {
        return this.body;
    }

}
