// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class GetUserByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserByIdResponseBody body;

    public static GetUserByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserByIdResponse self = new GetUserByIdResponse();
        return TeaModel.build(map, self);
    }

    public GetUserByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserByIdResponse setBody(GetUserByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserByIdResponseBody getBody() {
        return this.body;
    }

}
