// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryTSActivityInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RetryTSActivityInstanceResponseBody body;

    public static RetryTSActivityInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryTSActivityInstanceResponse self = new RetryTSActivityInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RetryTSActivityInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryTSActivityInstanceResponse setBody(RetryTSActivityInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryTSActivityInstanceResponseBody getBody() {
        return this.body;
    }

}
