// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class AssignReviewerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AssignReviewerResponse setBody(AssignReviewerResponseBody body) {
        this.body = body;
        return this;
    }
    public AssignReviewerResponseBody getBody() {
        return this.body;
    }

}
