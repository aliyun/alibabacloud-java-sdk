// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetLoginUserInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetLoginUserInfoResponseBody body;

    public static GetLoginUserInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLoginUserInfoResponse self = new GetLoginUserInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetLoginUserInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLoginUserInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLoginUserInfoResponse setBody(GetLoginUserInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLoginUserInfoResponseBody getBody() {
        return this.body;
    }

}
