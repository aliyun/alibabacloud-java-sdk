// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class OperateMarkSuccessJobExecutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateMarkSuccessJobExecutionResponseBody body;

    public static OperateMarkSuccessJobExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateMarkSuccessJobExecutionResponse self = new OperateMarkSuccessJobExecutionResponse();
        return TeaModel.build(map, self);
    }

    public OperateMarkSuccessJobExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateMarkSuccessJobExecutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateMarkSuccessJobExecutionResponse setBody(OperateMarkSuccessJobExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateMarkSuccessJobExecutionResponseBody getBody() {
        return this.body;
    }

}
