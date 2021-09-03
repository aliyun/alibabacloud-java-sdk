// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class DetailTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetailTemplateResponseBody body;

    public static DetailTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailTemplateResponse self = new DetailTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DetailTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetailTemplateResponse setBody(DetailTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DetailTemplateResponseBody getBody() {
        return this.body;
    }

}
