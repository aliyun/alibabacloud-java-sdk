// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchDeleteAKSClusterNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchDeleteAKSClusterNodeResponseBody body;

    public static BatchDeleteAKSClusterNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteAKSClusterNodeResponse self = new BatchDeleteAKSClusterNodeResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteAKSClusterNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeleteAKSClusterNodeResponse setBody(BatchDeleteAKSClusterNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteAKSClusterNodeResponseBody getBody() {
        return this.body;
    }

}
