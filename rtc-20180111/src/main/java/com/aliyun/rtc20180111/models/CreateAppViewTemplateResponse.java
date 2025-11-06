// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateAppViewTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAppViewTemplateResponseBody body;

    public static CreateAppViewTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppViewTemplateResponse self = new CreateAppViewTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppViewTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppViewTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppViewTemplateResponse setBody(CreateAppViewTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppViewTemplateResponseBody getBody() {
        return this.body;
    }

}
