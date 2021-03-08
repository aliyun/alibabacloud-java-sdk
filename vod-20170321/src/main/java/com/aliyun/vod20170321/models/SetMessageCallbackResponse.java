// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetMessageCallbackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetMessageCallbackResponseBody body;

    public static SetMessageCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        SetMessageCallbackResponse self = new SetMessageCallbackResponse();
        return TeaModel.build(map, self);
    }

    public SetMessageCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetMessageCallbackResponse setBody(SetMessageCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public SetMessageCallbackResponseBody getBody() {
        return this.body;
    }

}
