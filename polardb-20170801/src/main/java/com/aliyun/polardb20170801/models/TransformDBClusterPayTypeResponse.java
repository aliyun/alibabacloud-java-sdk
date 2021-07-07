// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class TransformDBClusterPayTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TransformDBClusterPayTypeResponseBody body;

    public static TransformDBClusterPayTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        TransformDBClusterPayTypeResponse self = new TransformDBClusterPayTypeResponse();
        return TeaModel.build(map, self);
    }

    public TransformDBClusterPayTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransformDBClusterPayTypeResponse setBody(TransformDBClusterPayTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public TransformDBClusterPayTypeResponseBody getBody() {
        return this.body;
    }

}
