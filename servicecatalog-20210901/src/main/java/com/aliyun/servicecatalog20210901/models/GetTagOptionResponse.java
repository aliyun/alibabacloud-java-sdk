// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class GetTagOptionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTagOptionResponseBody body;

    public static GetTagOptionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTagOptionResponse self = new GetTagOptionResponse();
        return TeaModel.build(map, self);
    }

    public GetTagOptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTagOptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTagOptionResponse setBody(GetTagOptionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTagOptionResponseBody getBody() {
        return this.body;
    }

}
