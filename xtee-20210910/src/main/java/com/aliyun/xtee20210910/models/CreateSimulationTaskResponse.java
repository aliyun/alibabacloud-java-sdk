// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateSimulationTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSimulationTaskResponseBody body;

    public static CreateSimulationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSimulationTaskResponse self = new CreateSimulationTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateSimulationTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSimulationTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSimulationTaskResponse setBody(CreateSimulationTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSimulationTaskResponseBody getBody() {
        return this.body;
    }

}
