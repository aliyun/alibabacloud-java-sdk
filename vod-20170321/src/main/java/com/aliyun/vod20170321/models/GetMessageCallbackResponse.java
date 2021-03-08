// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMessageCallbackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMessageCallbackResponseBody body;

    public static GetMessageCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMessageCallbackResponse self = new GetMessageCallbackResponse();
        return TeaModel.build(map, self);
    }

    public GetMessageCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMessageCallbackResponse setBody(GetMessageCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMessageCallbackResponseBody getBody() {
        return this.body;
    }

}
