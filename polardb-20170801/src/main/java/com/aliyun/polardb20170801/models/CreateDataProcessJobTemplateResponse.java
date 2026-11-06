// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDataProcessJobTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataProcessJobTemplateResponseBody body;

    public static CreateDataProcessJobTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataProcessJobTemplateResponse self = new CreateDataProcessJobTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataProcessJobTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataProcessJobTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataProcessJobTemplateResponse setBody(CreateDataProcessJobTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataProcessJobTemplateResponseBody getBody() {
        return this.body;
    }

}
