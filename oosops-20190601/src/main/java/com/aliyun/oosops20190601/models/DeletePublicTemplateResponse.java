// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class DeletePublicTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePublicTemplateResponseBody body;

    public static DeletePublicTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePublicTemplateResponse self = new DeletePublicTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeletePublicTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePublicTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePublicTemplateResponse setBody(DeletePublicTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePublicTemplateResponseBody getBody() {
        return this.body;
    }

}
