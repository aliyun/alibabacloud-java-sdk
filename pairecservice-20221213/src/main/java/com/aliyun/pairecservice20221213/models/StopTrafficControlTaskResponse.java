// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class StopTrafficControlTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopTrafficControlTaskResponseBody body;

    public static StopTrafficControlTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StopTrafficControlTaskResponse self = new StopTrafficControlTaskResponse();
        return TeaModel.build(map, self);
    }

    public StopTrafficControlTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopTrafficControlTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopTrafficControlTaskResponse setBody(StopTrafficControlTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StopTrafficControlTaskResponseBody getBody() {
        return this.body;
    }

}
