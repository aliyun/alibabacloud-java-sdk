// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class CreateHttpEventConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHttpEventConfigResponseBody body;

    public static CreateHttpEventConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHttpEventConfigResponse self = new CreateHttpEventConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateHttpEventConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHttpEventConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHttpEventConfigResponse setBody(CreateHttpEventConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHttpEventConfigResponseBody getBody() {
        return this.body;
    }

}
