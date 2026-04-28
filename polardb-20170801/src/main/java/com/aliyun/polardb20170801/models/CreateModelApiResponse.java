// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateModelApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateModelApiResponseBody body;

    public static CreateModelApiResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateModelApiResponse self = new CreateModelApiResponse();
        return TeaModel.build(map, self);
    }

    public CreateModelApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateModelApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateModelApiResponse setBody(CreateModelApiResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateModelApiResponseBody getBody() {
        return this.body;
    }

}
