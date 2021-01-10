// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryLinkeBahamutAppcustomciexecutionexecutionidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RetryLinkeBahamutAppcustomciexecutionexecutionidResponseBody body;

    public static RetryLinkeBahamutAppcustomciexecutionexecutionidResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryLinkeBahamutAppcustomciexecutionexecutionidResponse self = new RetryLinkeBahamutAppcustomciexecutionexecutionidResponse();
        return TeaModel.build(map, self);
    }

    public RetryLinkeBahamutAppcustomciexecutionexecutionidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryLinkeBahamutAppcustomciexecutionexecutionidResponse setBody(RetryLinkeBahamutAppcustomciexecutionexecutionidResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryLinkeBahamutAppcustomciexecutionexecutionidResponseBody getBody() {
        return this.body;
    }

}
