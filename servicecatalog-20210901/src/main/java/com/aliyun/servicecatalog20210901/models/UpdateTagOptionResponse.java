// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class UpdateTagOptionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTagOptionResponseBody body;

    public static UpdateTagOptionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTagOptionResponse self = new UpdateTagOptionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTagOptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTagOptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTagOptionResponse setBody(UpdateTagOptionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTagOptionResponseBody getBody() {
        return this.body;
    }

}
