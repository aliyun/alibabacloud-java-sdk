// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateAckClusterNodePoolsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAckClusterNodePoolsResponseBody body;

    public static UpdateAckClusterNodePoolsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAckClusterNodePoolsResponse self = new UpdateAckClusterNodePoolsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAckClusterNodePoolsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAckClusterNodePoolsResponse setBody(UpdateAckClusterNodePoolsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAckClusterNodePoolsResponseBody getBody() {
        return this.body;
    }

}
