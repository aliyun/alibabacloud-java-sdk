// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class CreateCheckTypeToSchemeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCheckTypeToSchemeResponseBody body;

    public static CreateCheckTypeToSchemeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCheckTypeToSchemeResponse self = new CreateCheckTypeToSchemeResponse();
        return TeaModel.build(map, self);
    }

    public CreateCheckTypeToSchemeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCheckTypeToSchemeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCheckTypeToSchemeResponse setBody(CreateCheckTypeToSchemeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCheckTypeToSchemeResponseBody getBody() {
        return this.body;
    }

}
