// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class StopSimulationTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopSimulationTaskResponseBody body;

    public static StopSimulationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StopSimulationTaskResponse self = new StopSimulationTaskResponse();
        return TeaModel.build(map, self);
    }

    public StopSimulationTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopSimulationTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopSimulationTaskResponse setBody(StopSimulationTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StopSimulationTaskResponseBody getBody() {
        return this.body;
    }

}
