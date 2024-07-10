// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateWebApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public WebApplicationBody body;

    public static CreateWebApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWebApplicationResponse self = new CreateWebApplicationResponse();
        return TeaModel.build(map, self);
    }

    public CreateWebApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWebApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWebApplicationResponse setBody(WebApplicationBody body) {
        this.body = body;
        return this;
    }
    public WebApplicationBody getBody() {
        return this.body;
    }

}
