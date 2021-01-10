// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryLinkeBahamutTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RetryLinkeBahamutTaskResponseBody body;

    public static RetryLinkeBahamutTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryLinkeBahamutTaskResponse self = new RetryLinkeBahamutTaskResponse();
        return TeaModel.build(map, self);
    }

    public RetryLinkeBahamutTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryLinkeBahamutTaskResponse setBody(RetryLinkeBahamutTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryLinkeBahamutTaskResponseBody getBody() {
        return this.body;
    }

}
