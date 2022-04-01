// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClusterNodeGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClusterNodeGroupResponseBody body;

    public static ListClusterNodeGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterNodeGroupResponse self = new ListClusterNodeGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterNodeGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterNodeGroupResponse setBody(ListClusterNodeGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterNodeGroupResponseBody getBody() {
        return this.body;
    }

}
