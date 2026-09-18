// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20250630.models;

import com.aliyun.tea.*;

public class GetDistillationTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDistillationTemplateResponseBody body;

    public static GetDistillationTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDistillationTemplateResponse self = new GetDistillationTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetDistillationTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDistillationTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDistillationTemplateResponse setBody(GetDistillationTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDistillationTemplateResponseBody getBody() {
        return this.body;
    }

}
