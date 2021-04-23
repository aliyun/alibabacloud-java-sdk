// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.plaso_online_class2021420.models;

import com.aliyun.tea.*;

public class EndCallbackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EndCallbackResponseBody body;

    public static EndCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        EndCallbackResponse self = new EndCallbackResponse();
        return TeaModel.build(map, self);
    }

    public EndCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EndCallbackResponse setBody(EndCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public EndCallbackResponseBody getBody() {
        return this.body;
    }

}
