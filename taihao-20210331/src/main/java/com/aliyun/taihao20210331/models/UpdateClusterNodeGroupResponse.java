// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateClusterNodeGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateClusterNodeGroupResponseBody body;

    public static UpdateClusterNodeGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterNodeGroupResponse self = new UpdateClusterNodeGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateClusterNodeGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateClusterNodeGroupResponse setBody(UpdateClusterNodeGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateClusterNodeGroupResponseBody getBody() {
        return this.body;
    }

}
