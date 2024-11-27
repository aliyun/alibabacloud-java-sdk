// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class OperateStopJobExecutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateStopJobExecutionResponseBody body;

    public static OperateStopJobExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateStopJobExecutionResponse self = new OperateStopJobExecutionResponse();
        return TeaModel.build(map, self);
    }

    public OperateStopJobExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateStopJobExecutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateStopJobExecutionResponse setBody(OperateStopJobExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateStopJobExecutionResponseBody getBody() {
        return this.body;
    }

}
