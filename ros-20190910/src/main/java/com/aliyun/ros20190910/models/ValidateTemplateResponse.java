// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ValidateTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ValidateTemplateResponseBody body;

    public static ValidateTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateTemplateResponse self = new ValidateTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ValidateTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidateTemplateResponse setBody(ValidateTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateTemplateResponseBody getBody() {
        return this.body;
    }

}
