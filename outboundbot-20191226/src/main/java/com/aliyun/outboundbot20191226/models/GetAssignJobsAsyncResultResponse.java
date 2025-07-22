// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetAssignJobsAsyncResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAssignJobsAsyncResultResponseBody body;

    public static GetAssignJobsAsyncResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAssignJobsAsyncResultResponse self = new GetAssignJobsAsyncResultResponse();
        return TeaModel.build(map, self);
    }

    public GetAssignJobsAsyncResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAssignJobsAsyncResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAssignJobsAsyncResultResponse setBody(GetAssignJobsAsyncResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAssignJobsAsyncResultResponseBody getBody() {
        return this.body;
    }

}
