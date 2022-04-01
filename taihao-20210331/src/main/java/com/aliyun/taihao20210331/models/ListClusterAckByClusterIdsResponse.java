// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClusterAckByClusterIdsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClusterAckByClusterIdsResponseBody body;

    public static ListClusterAckByClusterIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterAckByClusterIdsResponse self = new ListClusterAckByClusterIdsResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterAckByClusterIdsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterAckByClusterIdsResponse setBody(ListClusterAckByClusterIdsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterAckByClusterIdsResponseBody getBody() {
        return this.body;
    }

}
