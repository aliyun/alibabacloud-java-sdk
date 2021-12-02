// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class SubmitInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitInfoResponseBody body;

    public static SubmitInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitInfoResponse self = new SubmitInfoResponse();
        return TeaModel.build(map, self);
    }

    public SubmitInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitInfoResponse setBody(SubmitInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitInfoResponseBody getBody() {
        return this.body;
    }

}
