// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetClusterOperationNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetClusterOperationNodeResponseBody body;

    public static GetClusterOperationNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClusterOperationNodeResponse self = new GetClusterOperationNodeResponse();
        return TeaModel.build(map, self);
    }

    public GetClusterOperationNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClusterOperationNodeResponse setBody(GetClusterOperationNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClusterOperationNodeResponseBody getBody() {
        return this.body;
    }

}
