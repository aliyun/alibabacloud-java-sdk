// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class OperateUnskipJobExecutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateUnskipJobExecutionResponseBody body;

    public static OperateUnskipJobExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateUnskipJobExecutionResponse self = new OperateUnskipJobExecutionResponse();
        return TeaModel.build(map, self);
    }

    public OperateUnskipJobExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateUnskipJobExecutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateUnskipJobExecutionResponse setBody(OperateUnskipJobExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateUnskipJobExecutionResponseBody getBody() {
        return this.body;
    }

}
