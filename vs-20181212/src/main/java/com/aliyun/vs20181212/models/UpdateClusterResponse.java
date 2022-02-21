// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpdateClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateClusterResponseBody body;

    public static UpdateClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterResponse self = new UpdateClusterResponse();
        return TeaModel.build(map, self);
    }

    public UpdateClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateClusterResponse setBody(UpdateClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateClusterResponseBody getBody() {
        return this.body;
    }

}
