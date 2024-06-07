// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateTrafficControlTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTrafficControlTaskResponseBody body;

    public static UpdateTrafficControlTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrafficControlTaskResponse self = new UpdateTrafficControlTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTrafficControlTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTrafficControlTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTrafficControlTaskResponse setBody(UpdateTrafficControlTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTrafficControlTaskResponseBody getBody() {
        return this.body;
    }

}
