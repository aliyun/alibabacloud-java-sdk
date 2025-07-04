// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class GetJobExecutionThreadDumpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetJobExecutionThreadDumpResponseBody body;

    public static GetJobExecutionThreadDumpResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJobExecutionThreadDumpResponse self = new GetJobExecutionThreadDumpResponse();
        return TeaModel.build(map, self);
    }

    public GetJobExecutionThreadDumpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJobExecutionThreadDumpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetJobExecutionThreadDumpResponse setBody(GetJobExecutionThreadDumpResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJobExecutionThreadDumpResponseBody getBody() {
        return this.body;
    }

}
