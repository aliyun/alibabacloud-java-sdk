// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class GetUserTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserTemplateResponseBody body;

    public static GetUserTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserTemplateResponse self = new GetUserTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetUserTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserTemplateResponse setBody(GetUserTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserTemplateResponseBody getBody() {
        return this.body;
    }

}
