// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTemplateResponseBody body;

    public static UpdateTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateResponse self = new UpdateTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTemplateResponse setBody(UpdateTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTemplateResponseBody getBody() {
        return this.body;
    }

}
