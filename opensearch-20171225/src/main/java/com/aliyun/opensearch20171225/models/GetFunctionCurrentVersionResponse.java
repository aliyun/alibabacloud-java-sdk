// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetFunctionCurrentVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetFunctionCurrentVersionResponseBody body;

    public static GetFunctionCurrentVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionCurrentVersionResponse self = new GetFunctionCurrentVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetFunctionCurrentVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFunctionCurrentVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFunctionCurrentVersionResponse setBody(GetFunctionCurrentVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFunctionCurrentVersionResponseBody getBody() {
        return this.body;
    }

}
