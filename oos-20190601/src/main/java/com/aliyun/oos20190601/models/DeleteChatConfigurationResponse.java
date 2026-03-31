// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeleteChatConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteChatConfigurationResponseBody body;

    public static DeleteChatConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteChatConfigurationResponse self = new DeleteChatConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteChatConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteChatConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteChatConfigurationResponse setBody(DeleteChatConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteChatConfigurationResponseBody getBody() {
        return this.body;
    }

}
