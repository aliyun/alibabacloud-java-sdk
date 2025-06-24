// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateLogoTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLogoTaskResponseBody body;

    public static CreateLogoTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLogoTaskResponse self = new CreateLogoTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateLogoTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLogoTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLogoTaskResponse setBody(CreateLogoTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLogoTaskResponseBody getBody() {
        return this.body;
    }

}
