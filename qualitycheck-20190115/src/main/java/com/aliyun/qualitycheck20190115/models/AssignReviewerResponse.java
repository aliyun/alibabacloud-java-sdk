// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class AssignReviewerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssignReviewerResponseBody body;

    public static AssignReviewerResponse build(java.util.Map<String, ?> map) throws Exception {
        AssignReviewerResponse self = new AssignReviewerResponse();
        return TeaModel.build(map, self);
    }

    public AssignReviewerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssignReviewerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssignReviewerResponse setBody(AssignReviewerResponseBody body) {
        this.body = body;
        return this;
    }
    public AssignReviewerResponseBody getBody() {
        return this.body;
    }

}
