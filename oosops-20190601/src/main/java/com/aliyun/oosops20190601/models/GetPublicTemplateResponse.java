// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class GetPublicTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPublicTemplateResponseBody body;

    public static GetPublicTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPublicTemplateResponse self = new GetPublicTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetPublicTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPublicTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPublicTemplateResponse setBody(GetPublicTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPublicTemplateResponseBody getBody() {
        return this.body;
    }

}
