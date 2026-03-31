// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateChatConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateChatConfigurationResponseBody body;

    public static CreateChatConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateChatConfigurationResponse self = new CreateChatConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public CreateChatConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateChatConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateChatConfigurationResponse setBody(CreateChatConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateChatConfigurationResponseBody getBody() {
        return this.body;
    }

}
