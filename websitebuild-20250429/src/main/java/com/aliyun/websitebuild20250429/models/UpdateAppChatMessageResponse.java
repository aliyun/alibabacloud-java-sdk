// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UpdateAppChatMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAppChatMessageResponseBody body;

    public static UpdateAppChatMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppChatMessageResponse self = new UpdateAppChatMessageResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppChatMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppChatMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAppChatMessageResponse setBody(UpdateAppChatMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppChatMessageResponseBody getBody() {
        return this.body;
    }

}
