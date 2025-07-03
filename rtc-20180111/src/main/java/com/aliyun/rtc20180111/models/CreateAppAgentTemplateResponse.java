// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateAppAgentTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAppAgentTemplateResponseBody body;

    public static CreateAppAgentTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppAgentTemplateResponse self = new CreateAppAgentTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppAgentTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppAgentTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppAgentTemplateResponse setBody(CreateAppAgentTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppAgentTemplateResponseBody getBody() {
        return this.body;
    }

}
