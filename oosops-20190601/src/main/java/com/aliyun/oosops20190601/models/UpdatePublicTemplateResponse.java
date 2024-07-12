// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class UpdatePublicTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePublicTemplateResponseBody body;

    public static UpdatePublicTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePublicTemplateResponse self = new UpdatePublicTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePublicTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePublicTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePublicTemplateResponse setBody(UpdatePublicTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePublicTemplateResponseBody getBody() {
        return this.body;
    }

}
