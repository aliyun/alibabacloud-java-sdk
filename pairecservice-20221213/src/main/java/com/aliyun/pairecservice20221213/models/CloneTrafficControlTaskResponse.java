// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CloneTrafficControlTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloneTrafficControlTaskResponseBody body;

    public static CloneTrafficControlTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CloneTrafficControlTaskResponse self = new CloneTrafficControlTaskResponse();
        return TeaModel.build(map, self);
    }

    public CloneTrafficControlTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloneTrafficControlTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloneTrafficControlTaskResponse setBody(CloneTrafficControlTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CloneTrafficControlTaskResponseBody getBody() {
        return this.body;
    }

}
