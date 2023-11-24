// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateFunctionResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFunctionResourceResponseBody body;

    public static CreateFunctionResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFunctionResourceResponse self = new CreateFunctionResourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateFunctionResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFunctionResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFunctionResourceResponse setBody(CreateFunctionResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFunctionResourceResponseBody getBody() {
        return this.body;
    }

}
