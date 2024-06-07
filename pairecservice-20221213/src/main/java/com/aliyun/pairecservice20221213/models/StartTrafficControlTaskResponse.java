// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class StartTrafficControlTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartTrafficControlTaskResponseBody body;

    public static StartTrafficControlTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StartTrafficControlTaskResponse self = new StartTrafficControlTaskResponse();
        return TeaModel.build(map, self);
    }

    public StartTrafficControlTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartTrafficControlTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartTrafficControlTaskResponse setBody(StartTrafficControlTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StartTrafficControlTaskResponseBody getBody() {
        return this.body;
    }

}
