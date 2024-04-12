// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateConfigMapResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateConfigMapResponseBody body;

    public static CreateConfigMapResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigMapResponse self = new CreateConfigMapResponse();
        return TeaModel.build(map, self);
    }

    public CreateConfigMapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateConfigMapResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateConfigMapResponse setBody(CreateConfigMapResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateConfigMapResponseBody getBody() {
        return this.body;
    }

}
