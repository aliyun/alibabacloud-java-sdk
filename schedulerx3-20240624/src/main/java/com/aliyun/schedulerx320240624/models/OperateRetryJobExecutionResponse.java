// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class OperateRetryJobExecutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateRetryJobExecutionResponseBody body;

    public static OperateRetryJobExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateRetryJobExecutionResponse self = new OperateRetryJobExecutionResponse();
        return TeaModel.build(map, self);
    }

    public OperateRetryJobExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateRetryJobExecutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateRetryJobExecutionResponse setBody(OperateRetryJobExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateRetryJobExecutionResponseBody getBody() {
        return this.body;
    }

}
