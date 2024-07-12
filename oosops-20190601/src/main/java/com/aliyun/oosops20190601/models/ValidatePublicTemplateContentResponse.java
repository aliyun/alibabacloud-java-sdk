// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ValidatePublicTemplateContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ValidatePublicTemplateContentResponseBody body;

    public static ValidatePublicTemplateContentResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidatePublicTemplateContentResponse self = new ValidatePublicTemplateContentResponse();
        return TeaModel.build(map, self);
    }

    public ValidatePublicTemplateContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidatePublicTemplateContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidatePublicTemplateContentResponse setBody(ValidatePublicTemplateContentResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidatePublicTemplateContentResponseBody getBody() {
        return this.body;
    }

}
