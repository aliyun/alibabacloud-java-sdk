// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetFunctionVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFunctionVersionResponseBody body;

    public static GetFunctionVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionVersionResponse self = new GetFunctionVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetFunctionVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFunctionVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFunctionVersionResponse setBody(GetFunctionVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFunctionVersionResponseBody getBody() {
        return this.body;
    }

}
