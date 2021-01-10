// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryAKSClusterTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RetryAKSClusterTaskResponseBody body;

    public static RetryAKSClusterTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryAKSClusterTaskResponse self = new RetryAKSClusterTaskResponse();
        return TeaModel.build(map, self);
    }

    public RetryAKSClusterTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryAKSClusterTaskResponse setBody(RetryAKSClusterTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryAKSClusterTaskResponseBody getBody() {
        return this.body;
    }

}
