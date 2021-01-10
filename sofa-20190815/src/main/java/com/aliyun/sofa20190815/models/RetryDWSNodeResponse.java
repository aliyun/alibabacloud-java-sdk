// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryDWSNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RetryDWSNodeResponseBody body;

    public static RetryDWSNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryDWSNodeResponse self = new RetryDWSNodeResponse();
        return TeaModel.build(map, self);
    }

    public RetryDWSNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryDWSNodeResponse setBody(RetryDWSNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryDWSNodeResponseBody getBody() {
        return this.body;
    }

}
