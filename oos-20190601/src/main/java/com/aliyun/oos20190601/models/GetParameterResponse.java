// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetParameterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetParameterResponseBody body;

    public static GetParameterResponse build(java.util.Map<String, ?> map) throws Exception {
        GetParameterResponse self = new GetParameterResponse();
        return TeaModel.build(map, self);
    }

    public GetParameterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetParameterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetParameterResponse setBody(GetParameterResponseBody body) {
        this.body = body;
        return this;
    }
    public GetParameterResponseBody getBody() {
        return this.body;
    }

}
