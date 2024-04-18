// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ValidateTemplateContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ValidateTemplateContentResponseBody body;

    public static ValidateTemplateContentResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateTemplateContentResponse self = new ValidateTemplateContentResponse();
        return TeaModel.build(map, self);
    }

    public ValidateTemplateContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateTemplateContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidateTemplateContentResponse setBody(ValidateTemplateContentResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateTemplateContentResponseBody getBody() {
        return this.body;
    }

}
