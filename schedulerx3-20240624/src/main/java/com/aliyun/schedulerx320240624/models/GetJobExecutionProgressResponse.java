// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class GetJobExecutionProgressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetJobExecutionProgressResponseBody body;

    public static GetJobExecutionProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJobExecutionProgressResponse self = new GetJobExecutionProgressResponse();
        return TeaModel.build(map, self);
    }

    public GetJobExecutionProgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJobExecutionProgressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetJobExecutionProgressResponse setBody(GetJobExecutionProgressResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJobExecutionProgressResponseBody getBody() {
        return this.body;
    }

}
