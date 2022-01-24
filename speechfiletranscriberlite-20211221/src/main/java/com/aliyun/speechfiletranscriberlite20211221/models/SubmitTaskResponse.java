// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.speechfiletranscriberlite20211221.models;

import com.aliyun.tea.*;

public class SubmitTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitTaskResponseBody body;

    public static SubmitTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitTaskResponse self = new SubmitTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitTaskResponse setBody(SubmitTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitTaskResponseBody getBody() {
        return this.body;
    }

}
