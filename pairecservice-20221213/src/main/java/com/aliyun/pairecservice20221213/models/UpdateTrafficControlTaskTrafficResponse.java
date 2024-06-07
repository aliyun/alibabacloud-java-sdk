// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateTrafficControlTaskTrafficResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTrafficControlTaskTrafficResponseBody body;

    public static UpdateTrafficControlTaskTrafficResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrafficControlTaskTrafficResponse self = new UpdateTrafficControlTaskTrafficResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTrafficControlTaskTrafficResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTrafficControlTaskTrafficResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTrafficControlTaskTrafficResponse setBody(UpdateTrafficControlTaskTrafficResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTrafficControlTaskTrafficResponseBody getBody() {
        return this.body;
    }

}
