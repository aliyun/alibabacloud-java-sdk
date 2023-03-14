// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetHostShareKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetHostShareKeyResponseBody body;

    public static GetHostShareKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHostShareKeyResponse self = new GetHostShareKeyResponse();
        return TeaModel.build(map, self);
    }

    public GetHostShareKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHostShareKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHostShareKeyResponse setBody(GetHostShareKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHostShareKeyResponseBody getBody() {
        return this.body;
    }

}
