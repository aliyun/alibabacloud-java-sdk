// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetSlsLoginUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetSlsLoginUrlResponseBody body;

    public static GetSlsLoginUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSlsLoginUrlResponse self = new GetSlsLoginUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetSlsLoginUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSlsLoginUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSlsLoginUrlResponse setBody(GetSlsLoginUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSlsLoginUrlResponseBody getBody() {
        return this.body;
    }

}
