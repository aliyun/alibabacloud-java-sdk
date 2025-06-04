// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class GetJobExecutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetJobExecutionResponseBody body;

    public static GetJobExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJobExecutionResponse self = new GetJobExecutionResponse();
        return TeaModel.build(map, self);
    }

    public GetJobExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJobExecutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetJobExecutionResponse setBody(GetJobExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJobExecutionResponseBody getBody() {
        return this.body;
    }

}
