// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class CreateDigitalHumanProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDigitalHumanProjectResponseBody body;

    public static CreateDigitalHumanProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDigitalHumanProjectResponse self = new CreateDigitalHumanProjectResponse();
        return TeaModel.build(map, self);
    }

    public CreateDigitalHumanProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDigitalHumanProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDigitalHumanProjectResponse setBody(CreateDigitalHumanProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDigitalHumanProjectResponseBody getBody() {
        return this.body;
    }

}
