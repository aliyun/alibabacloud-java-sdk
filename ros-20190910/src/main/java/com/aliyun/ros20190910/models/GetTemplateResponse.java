// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTemplateResponseBody body;

    public static GetTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateResponse self = new GetTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTemplateResponse setBody(GetTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTemplateResponseBody getBody() {
        return this.body;
    }

}
