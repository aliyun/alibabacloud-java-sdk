// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class OperateHoldJobExecutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateHoldJobExecutionResponseBody body;

    public static OperateHoldJobExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateHoldJobExecutionResponse self = new OperateHoldJobExecutionResponse();
        return TeaModel.build(map, self);
    }

    public OperateHoldJobExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateHoldJobExecutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateHoldJobExecutionResponse setBody(OperateHoldJobExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateHoldJobExecutionResponseBody getBody() {
        return this.body;
    }

}
