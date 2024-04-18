// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetParametersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetParametersResponseBody body;

    public static GetParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        GetParametersResponse self = new GetParametersResponse();
        return TeaModel.build(map, self);
    }

    public GetParametersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetParametersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetParametersResponse setBody(GetParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public GetParametersResponseBody getBody() {
        return this.body;
    }

}
