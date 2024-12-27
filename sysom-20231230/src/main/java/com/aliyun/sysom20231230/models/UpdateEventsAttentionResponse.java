// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UpdateEventsAttentionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEventsAttentionResponseBody body;

    public static UpdateEventsAttentionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEventsAttentionResponse self = new UpdateEventsAttentionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEventsAttentionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEventsAttentionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEventsAttentionResponse setBody(UpdateEventsAttentionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEventsAttentionResponseBody getBody() {
        return this.body;
    }

}
