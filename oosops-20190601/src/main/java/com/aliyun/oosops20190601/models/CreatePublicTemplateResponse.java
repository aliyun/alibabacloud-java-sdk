// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class CreatePublicTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePublicTemplateResponseBody body;

    public static CreatePublicTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePublicTemplateResponse self = new CreatePublicTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreatePublicTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePublicTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePublicTemplateResponse setBody(CreatePublicTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePublicTemplateResponseBody getBody() {
        return this.body;
    }

}
