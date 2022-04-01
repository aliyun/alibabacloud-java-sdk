// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListAckClusterNodePoolsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAckClusterNodePoolsResponseBody body;

    public static ListAckClusterNodePoolsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAckClusterNodePoolsResponse self = new ListAckClusterNodePoolsResponse();
        return TeaModel.build(map, self);
    }

    public ListAckClusterNodePoolsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAckClusterNodePoolsResponse setBody(ListAckClusterNodePoolsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAckClusterNodePoolsResponseBody getBody() {
        return this.body;
    }

}
