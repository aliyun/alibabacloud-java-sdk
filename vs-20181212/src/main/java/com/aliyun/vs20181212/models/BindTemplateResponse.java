// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BindTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindTemplateResponseBody body;

    public static BindTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        BindTemplateResponse self = new BindTemplateResponse();
        return TeaModel.build(map, self);
    }

    public BindTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindTemplateResponse setBody(BindTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public BindTemplateResponseBody getBody() {
        return this.body;
    }

}
