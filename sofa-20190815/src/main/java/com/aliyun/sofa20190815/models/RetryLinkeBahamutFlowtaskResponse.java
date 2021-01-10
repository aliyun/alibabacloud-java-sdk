// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryLinkeBahamutFlowtaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RetryLinkeBahamutFlowtaskResponseBody body;

    public static RetryLinkeBahamutFlowtaskResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryLinkeBahamutFlowtaskResponse self = new RetryLinkeBahamutFlowtaskResponse();
        return TeaModel.build(map, self);
    }

    public RetryLinkeBahamutFlowtaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryLinkeBahamutFlowtaskResponse setBody(RetryLinkeBahamutFlowtaskResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryLinkeBahamutFlowtaskResponseBody getBody() {
        return this.body;
    }

}
