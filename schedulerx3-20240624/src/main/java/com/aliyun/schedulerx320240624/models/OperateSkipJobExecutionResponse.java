// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class OperateSkipJobExecutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateSkipJobExecutionResponseBody body;

    public static OperateSkipJobExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateSkipJobExecutionResponse self = new OperateSkipJobExecutionResponse();
        return TeaModel.build(map, self);
    }

    public OperateSkipJobExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateSkipJobExecutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateSkipJobExecutionResponse setBody(OperateSkipJobExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateSkipJobExecutionResponseBody getBody() {
        return this.body;
    }

}
