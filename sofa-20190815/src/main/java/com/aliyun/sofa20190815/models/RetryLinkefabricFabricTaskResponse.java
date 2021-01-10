// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryLinkefabricFabricTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RetryLinkefabricFabricTaskResponseBody body;

    public static RetryLinkefabricFabricTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryLinkefabricFabricTaskResponse self = new RetryLinkefabricFabricTaskResponse();
        return TeaModel.build(map, self);
    }

    public RetryLinkefabricFabricTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryLinkefabricFabricTaskResponse setBody(RetryLinkefabricFabricTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryLinkefabricFabricTaskResponseBody getBody() {
        return this.body;
    }

}
