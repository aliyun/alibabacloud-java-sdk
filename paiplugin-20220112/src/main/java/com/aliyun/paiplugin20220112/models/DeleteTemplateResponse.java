// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class DeleteTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTemplateResponseBody body;

    public static DeleteTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTemplateResponse self = new DeleteTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTemplateResponse setBody(DeleteTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTemplateResponseBody getBody() {
        return this.body;
    }

}
