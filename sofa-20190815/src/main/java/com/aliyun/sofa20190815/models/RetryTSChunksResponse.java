// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryTSChunksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RetryTSChunksResponseBody body;

    public static RetryTSChunksResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryTSChunksResponse self = new RetryTSChunksResponse();
        return TeaModel.build(map, self);
    }

    public RetryTSChunksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryTSChunksResponse setBody(RetryTSChunksResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryTSChunksResponseBody getBody() {
        return this.body;
    }

}
