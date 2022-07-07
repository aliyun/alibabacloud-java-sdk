// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetFunctionTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetFunctionTaskResponseBody body;

    public static GetFunctionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionTaskResponse self = new GetFunctionTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetFunctionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFunctionTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFunctionTaskResponse setBody(GetFunctionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFunctionTaskResponseBody getBody() {
        return this.body;
    }

}
