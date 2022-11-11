// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class GetServiceInvokeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetServiceInvokeResponseBody body;

    public static GetServiceInvokeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceInvokeResponse self = new GetServiceInvokeResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceInvokeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceInvokeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceInvokeResponse setBody(GetServiceInvokeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceInvokeResponseBody getBody() {
        return this.body;
    }

}
