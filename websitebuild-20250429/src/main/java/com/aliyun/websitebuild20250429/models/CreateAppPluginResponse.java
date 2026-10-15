// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateAppPluginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAppPluginResponseBody body;

    public static CreateAppPluginResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppPluginResponse self = new CreateAppPluginResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppPluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppPluginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppPluginResponse setBody(CreateAppPluginResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppPluginResponseBody getBody() {
        return this.body;
    }

}
