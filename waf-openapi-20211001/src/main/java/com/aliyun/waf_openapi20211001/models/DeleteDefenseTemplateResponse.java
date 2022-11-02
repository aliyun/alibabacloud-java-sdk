// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DeleteDefenseTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDefenseTemplateResponseBody body;

    public static DeleteDefenseTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDefenseTemplateResponse self = new DeleteDefenseTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDefenseTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDefenseTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDefenseTemplateResponse setBody(DeleteDefenseTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDefenseTemplateResponseBody getBody() {
        return this.body;
    }

}
