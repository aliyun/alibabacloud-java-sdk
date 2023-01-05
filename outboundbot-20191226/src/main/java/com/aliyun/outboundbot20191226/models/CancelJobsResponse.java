// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CancelJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CancelJobsResponseBody body;

    public static CancelJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelJobsResponse self = new CancelJobsResponse();
        return TeaModel.build(map, self);
    }

    public CancelJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelJobsResponse setBody(CancelJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelJobsResponseBody getBody() {
        return this.body;
    }

}
