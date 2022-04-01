// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class DeleteClusterNodeGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteClusterNodeGroupResponseBody body;

    public static DeleteClusterNodeGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterNodeGroupResponse self = new DeleteClusterNodeGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteClusterNodeGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteClusterNodeGroupResponse setBody(DeleteClusterNodeGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteClusterNodeGroupResponseBody getBody() {
        return this.body;
    }

}
