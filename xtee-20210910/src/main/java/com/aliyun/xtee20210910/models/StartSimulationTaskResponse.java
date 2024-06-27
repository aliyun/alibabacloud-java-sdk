// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class StartSimulationTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartSimulationTaskResponseBody body;

    public static StartSimulationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StartSimulationTaskResponse self = new StartSimulationTaskResponse();
        return TeaModel.build(map, self);
    }

    public StartSimulationTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartSimulationTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartSimulationTaskResponse setBody(StartSimulationTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StartSimulationTaskResponseBody getBody() {
        return this.body;
    }

}
