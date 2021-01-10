// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CancelAKSClusterTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelAKSClusterTaskResponseBody body;

    public static CancelAKSClusterTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelAKSClusterTaskResponse self = new CancelAKSClusterTaskResponse();
        return TeaModel.build(map, self);
    }

    public CancelAKSClusterTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelAKSClusterTaskResponse setBody(CancelAKSClusterTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelAKSClusterTaskResponseBody getBody() {
        return this.body;
    }

}
