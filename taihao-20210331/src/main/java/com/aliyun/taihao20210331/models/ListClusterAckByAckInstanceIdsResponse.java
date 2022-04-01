// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClusterAckByAckInstanceIdsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClusterAckByAckInstanceIdsResponseBody body;

    public static ListClusterAckByAckInstanceIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterAckByAckInstanceIdsResponse self = new ListClusterAckByAckInstanceIdsResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterAckByAckInstanceIdsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterAckByAckInstanceIdsResponse setBody(ListClusterAckByAckInstanceIdsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterAckByAckInstanceIdsResponseBody getBody() {
        return this.body;
    }

}
