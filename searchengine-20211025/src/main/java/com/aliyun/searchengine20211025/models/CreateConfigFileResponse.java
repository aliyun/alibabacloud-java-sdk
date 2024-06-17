// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class CreateConfigFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateConfigFileResponseBody body;

    public static CreateConfigFileResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigFileResponse self = new CreateConfigFileResponse();
        return TeaModel.build(map, self);
    }

    public CreateConfigFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateConfigFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateConfigFileResponse setBody(CreateConfigFileResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateConfigFileResponseBody getBody() {
        return this.body;
    }

}
