// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class GetPublicParameterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPublicParameterResponseBody body;

    public static GetPublicParameterResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPublicParameterResponse self = new GetPublicParameterResponse();
        return TeaModel.build(map, self);
    }

    public GetPublicParameterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPublicParameterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPublicParameterResponse setBody(GetPublicParameterResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPublicParameterResponseBody getBody() {
        return this.body;
    }

}
