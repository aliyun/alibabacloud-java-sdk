// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class UpdateJobExecutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateJobExecutionResponseBody body;

    public static UpdateJobExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateJobExecutionResponse self = new UpdateJobExecutionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateJobExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateJobExecutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateJobExecutionResponse setBody(UpdateJobExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateJobExecutionResponseBody getBody() {
        return this.body;
    }

}
