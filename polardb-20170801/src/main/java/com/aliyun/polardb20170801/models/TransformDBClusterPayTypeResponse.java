// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class TransformDBClusterPayTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public TransformDBClusterPayTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TransformDBClusterPayTypeResponse setBody(TransformDBClusterPayTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public TransformDBClusterPayTypeResponseBody getBody() {
        return this.body;
    }

}
