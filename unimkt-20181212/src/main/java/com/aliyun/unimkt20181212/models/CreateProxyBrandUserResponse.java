// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class CreateProxyBrandUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateProxyBrandUserResponseBody body;

    public static CreateProxyBrandUserResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProxyBrandUserResponse self = new CreateProxyBrandUserResponse();
        return TeaModel.build(map, self);
    }

    public CreateProxyBrandUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProxyBrandUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProxyBrandUserResponse setBody(CreateProxyBrandUserResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProxyBrandUserResponseBody getBody() {
        return this.body;
    }

}
