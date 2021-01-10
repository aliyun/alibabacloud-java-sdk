// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ScaleAKSClusterNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ScaleAKSClusterNodeResponseBody body;

    public static ScaleAKSClusterNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        ScaleAKSClusterNodeResponse self = new ScaleAKSClusterNodeResponse();
        return TeaModel.build(map, self);
    }

    public ScaleAKSClusterNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScaleAKSClusterNodeResponse setBody(ScaleAKSClusterNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public ScaleAKSClusterNodeResponseBody getBody() {
        return this.body;
    }

}
