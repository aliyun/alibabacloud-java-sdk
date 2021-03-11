// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UnbindTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindTemplateResponseBody body;

    public static UnbindTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindTemplateResponse self = new UnbindTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UnbindTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindTemplateResponse setBody(UnbindTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindTemplateResponseBody getBody() {
        return this.body;
    }

}
