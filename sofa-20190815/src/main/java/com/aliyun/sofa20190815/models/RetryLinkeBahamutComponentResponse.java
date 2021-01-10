// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryLinkeBahamutComponentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RetryLinkeBahamutComponentResponseBody body;

    public static RetryLinkeBahamutComponentResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryLinkeBahamutComponentResponse self = new RetryLinkeBahamutComponentResponse();
        return TeaModel.build(map, self);
    }

    public RetryLinkeBahamutComponentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryLinkeBahamutComponentResponse setBody(RetryLinkeBahamutComponentResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryLinkeBahamutComponentResponseBody getBody() {
        return this.body;
    }

}
