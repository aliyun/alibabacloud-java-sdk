// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class SubmitSupplementResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SubmitSupplementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitSupplementResponse setBody(SubmitSupplementResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitSupplementResponseBody getBody() {
        return this.body;
    }

}
