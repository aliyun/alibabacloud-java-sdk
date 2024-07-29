// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateAppRecordTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAppRecordTemplateResponseBody body;

    public static CreateAppRecordTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppRecordTemplateResponse self = new CreateAppRecordTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppRecordTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppRecordTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppRecordTemplateResponse setBody(CreateAppRecordTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppRecordTemplateResponseBody getBody() {
        return this.body;
    }

}
