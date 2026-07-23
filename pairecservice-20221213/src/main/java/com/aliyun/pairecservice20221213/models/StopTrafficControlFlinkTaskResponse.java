// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class StopTrafficControlFlinkTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopTrafficControlFlinkTaskResponseBody body;

    public static StopTrafficControlFlinkTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StopTrafficControlFlinkTaskResponse self = new StopTrafficControlFlinkTaskResponse();
        return TeaModel.build(map, self);
    }

    public StopTrafficControlFlinkTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopTrafficControlFlinkTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopTrafficControlFlinkTaskResponse setBody(StopTrafficControlFlinkTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StopTrafficControlFlinkTaskResponseBody getBody() {
        return this.body;
    }

}
