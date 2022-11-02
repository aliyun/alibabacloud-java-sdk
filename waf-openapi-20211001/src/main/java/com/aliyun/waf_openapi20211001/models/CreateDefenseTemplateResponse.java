// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateDefenseTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDefenseTemplateResponseBody body;

    public static CreateDefenseTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDefenseTemplateResponse self = new CreateDefenseTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateDefenseTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDefenseTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDefenseTemplateResponse setBody(CreateDefenseTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDefenseTemplateResponseBody getBody() {
        return this.body;
    }

}
