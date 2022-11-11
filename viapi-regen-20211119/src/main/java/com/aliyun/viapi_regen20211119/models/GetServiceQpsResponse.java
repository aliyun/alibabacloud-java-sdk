// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class GetServiceQpsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetServiceQpsResponseBody body;

    public static GetServiceQpsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceQpsResponse self = new GetServiceQpsResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceQpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceQpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceQpsResponse setBody(GetServiceQpsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceQpsResponseBody getBody() {
        return this.body;
    }

}
