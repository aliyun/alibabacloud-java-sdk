// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class VerifyTrainLabelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public VerifyTrainLabelResponseBody body;

    public static VerifyTrainLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyTrainLabelResponse self = new VerifyTrainLabelResponse();
        return TeaModel.build(map, self);
    }

    public VerifyTrainLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyTrainLabelResponse setBody(VerifyTrainLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyTrainLabelResponseBody getBody() {
        return this.body;
    }

}
