// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SuspendJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SuspendJobsResponseBody body;

    public static SuspendJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        SuspendJobsResponse self = new SuspendJobsResponse();
        return TeaModel.build(map, self);
    }

    public SuspendJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SuspendJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SuspendJobsResponse setBody(SuspendJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public SuspendJobsResponseBody getBody() {
        return this.body;
    }

}
