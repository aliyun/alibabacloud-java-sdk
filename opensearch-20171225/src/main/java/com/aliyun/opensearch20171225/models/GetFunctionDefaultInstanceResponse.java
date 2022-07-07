// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetFunctionDefaultInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetFunctionDefaultInstanceResponseBody body;

    public static GetFunctionDefaultInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionDefaultInstanceResponse self = new GetFunctionDefaultInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetFunctionDefaultInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFunctionDefaultInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFunctionDefaultInstanceResponse setBody(GetFunctionDefaultInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFunctionDefaultInstanceResponseBody getBody() {
        return this.body;
    }

}
