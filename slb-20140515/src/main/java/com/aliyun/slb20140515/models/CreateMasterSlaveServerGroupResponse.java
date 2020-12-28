// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateMasterSlaveServerGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMasterSlaveServerGroupResponseBody body;

    public static CreateMasterSlaveServerGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMasterSlaveServerGroupResponse self = new CreateMasterSlaveServerGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateMasterSlaveServerGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMasterSlaveServerGroupResponse setBody(CreateMasterSlaveServerGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMasterSlaveServerGroupResponseBody getBody() {
        return this.body;
    }

}
