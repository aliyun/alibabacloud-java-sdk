// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetClusterOperationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetClusterOperationResponseBody body;

    public static GetClusterOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClusterOperationResponse self = new GetClusterOperationResponse();
        return TeaModel.build(map, self);
    }

    public GetClusterOperationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClusterOperationResponse setBody(GetClusterOperationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClusterOperationResponseBody getBody() {
        return this.body;
    }

}
