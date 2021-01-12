// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class GetDbProxyInstanceSslResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetDbProxyInstanceSslResponse setBody(GetDbProxyInstanceSslResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDbProxyInstanceSslResponseBody getBody() {
        return this.body;
    }

}
