// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SubmitSupplementResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitSupplementResponseBody body;

    public static SubmitSupplementResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitSupplementResponse self = new SubmitSupplementResponse();
        return TeaModel.build(map, self);
    }

    public SubmitSupplementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitSupplementResponse setBody(SubmitSupplementResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitSupplementResponseBody getBody() {
        return this.body;
    }

}
