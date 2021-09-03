// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class DetailDigitalTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetailDigitalTemplateResponseBody body;

    public static DetailDigitalTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailDigitalTemplateResponse self = new DetailDigitalTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DetailDigitalTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetailDigitalTemplateResponse setBody(DetailDigitalTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DetailDigitalTemplateResponseBody getBody() {
        return this.body;
    }

}
