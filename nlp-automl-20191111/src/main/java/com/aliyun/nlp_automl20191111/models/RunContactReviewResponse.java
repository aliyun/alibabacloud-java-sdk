// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20191111.models;

import com.aliyun.tea.*;

public class RunContactReviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RunContactReviewResponseBody body;

    public static RunContactReviewResponse build(java.util.Map<String, ?> map) throws Exception {
        RunContactReviewResponse self = new RunContactReviewResponse();
        return TeaModel.build(map, self);
    }

    public RunContactReviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunContactReviewResponse setBody(RunContactReviewResponseBody body) {
        this.body = body;
        return this;
    }
    public RunContactReviewResponseBody getBody() {
        return this.body;
    }

}
