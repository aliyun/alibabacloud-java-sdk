// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetFunctionResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetFunctionResourceResponseBody body;

    public static GetFunctionResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionResourceResponse self = new GetFunctionResourceResponse();
        return TeaModel.build(map, self);
    }

    public GetFunctionResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFunctionResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFunctionResourceResponse setBody(GetFunctionResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFunctionResourceResponseBody getBody() {
        return this.body;
    }

}
