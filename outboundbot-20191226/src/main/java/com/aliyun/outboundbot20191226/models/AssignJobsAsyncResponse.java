// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class AssignJobsAsyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssignJobsAsyncResponseBody body;

    public static AssignJobsAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        AssignJobsAsyncResponse self = new AssignJobsAsyncResponse();
        return TeaModel.build(map, self);
    }

    public AssignJobsAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssignJobsAsyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssignJobsAsyncResponse setBody(AssignJobsAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public AssignJobsAsyncResponseBody getBody() {
        return this.body;
    }

}
