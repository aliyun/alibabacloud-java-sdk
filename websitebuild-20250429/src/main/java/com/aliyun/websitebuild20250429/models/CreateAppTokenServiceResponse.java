// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateAppTokenServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAppTokenServiceResponseBody body;

    public static CreateAppTokenServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppTokenServiceResponse self = new CreateAppTokenServiceResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppTokenServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppTokenServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppTokenServiceResponse setBody(CreateAppTokenServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppTokenServiceResponseBody getBody() {
        return this.body;
    }

}
