// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class RestartAsrTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RestartAsrTaskResponseBody body;

    public static RestartAsrTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartAsrTaskResponse self = new RestartAsrTaskResponse();
        return TeaModel.build(map, self);
    }

    public RestartAsrTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartAsrTaskResponse setBody(RestartAsrTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartAsrTaskResponseBody getBody() {
        return this.body;
    }

}
