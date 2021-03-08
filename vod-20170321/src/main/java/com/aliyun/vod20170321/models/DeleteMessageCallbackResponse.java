// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteMessageCallbackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMessageCallbackResponseBody body;

    public static DeleteMessageCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMessageCallbackResponse self = new DeleteMessageCallbackResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMessageCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMessageCallbackResponse setBody(DeleteMessageCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMessageCallbackResponseBody getBody() {
        return this.body;
    }

}
