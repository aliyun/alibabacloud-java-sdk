// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class AuditForkReviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AuditForkReviewResponseBody body;

    public static AuditForkReviewResponse build(java.util.Map<String, ?> map) throws Exception {
        AuditForkReviewResponse self = new AuditForkReviewResponse();
        return TeaModel.build(map, self);
    }

    public AuditForkReviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuditForkReviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuditForkReviewResponse setBody(AuditForkReviewResponseBody body) {
        this.body = body;
        return this;
    }
    public AuditForkReviewResponseBody getBody() {
        return this.body;
    }

}
