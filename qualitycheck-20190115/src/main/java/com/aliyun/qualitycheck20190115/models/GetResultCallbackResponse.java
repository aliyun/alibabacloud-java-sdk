// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetResultCallbackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetResultCallbackResponseBody body;

    public static GetResultCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResultCallbackResponse self = new GetResultCallbackResponse();
        return TeaModel.build(map, self);
    }

    public GetResultCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResultCallbackResponse setBody(GetResultCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResultCallbackResponseBody getBody() {
        return this.body;
    }

}
