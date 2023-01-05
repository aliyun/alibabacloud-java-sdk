// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class AssignJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AssignJobsResponseBody body;

    public static AssignJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        AssignJobsResponse self = new AssignJobsResponse();
        return TeaModel.build(map, self);
    }

    public AssignJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssignJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssignJobsResponse setBody(AssignJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public AssignJobsResponseBody getBody() {
        return this.body;
    }

}
