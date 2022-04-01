// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateAckClusterNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAckClusterNodesResponseBody body;

    public static UpdateAckClusterNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAckClusterNodesResponse self = new UpdateAckClusterNodesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAckClusterNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAckClusterNodesResponse setBody(UpdateAckClusterNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAckClusterNodesResponseBody getBody() {
        return this.body;
    }

}
