// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class OperateUnholdJobExecutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateUnholdJobExecutionResponseBody body;

    public static OperateUnholdJobExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateUnholdJobExecutionResponse self = new OperateUnholdJobExecutionResponse();
        return TeaModel.build(map, self);
    }

    public OperateUnholdJobExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateUnholdJobExecutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateUnholdJobExecutionResponse setBody(OperateUnholdJobExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateUnholdJobExecutionResponseBody getBody() {
        return this.body;
    }

}
