// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClusterOperationNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClusterOperationNodesResponseBody body;

    public static ListClusterOperationNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterOperationNodesResponse self = new ListClusterOperationNodesResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterOperationNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterOperationNodesResponse setBody(ListClusterOperationNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterOperationNodesResponseBody getBody() {
        return this.body;
    }

}
