// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CreateClusterNodeGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateClusterNodeGroupResponseBody body;

    public static CreateClusterNodeGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterNodeGroupResponse self = new CreateClusterNodeGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateClusterNodeGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateClusterNodeGroupResponse setBody(CreateClusterNodeGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateClusterNodeGroupResponseBody getBody() {
        return this.body;
    }

}
