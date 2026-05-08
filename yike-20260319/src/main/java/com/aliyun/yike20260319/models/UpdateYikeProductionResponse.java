// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class UpdateYikeProductionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateYikeProductionResponseBody body;

    public static UpdateYikeProductionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateYikeProductionResponse self = new UpdateYikeProductionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateYikeProductionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateYikeProductionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateYikeProductionResponse setBody(UpdateYikeProductionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateYikeProductionResponseBody getBody() {
        return this.body;
    }

}
