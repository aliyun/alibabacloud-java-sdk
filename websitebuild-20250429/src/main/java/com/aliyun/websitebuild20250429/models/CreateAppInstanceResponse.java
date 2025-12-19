// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateAppInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAppInstanceResponseBody body;

    public static CreateAppInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppInstanceResponse self = new CreateAppInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppInstanceResponse setBody(CreateAppInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppInstanceResponseBody getBody() {
        return this.body;
    }

}
