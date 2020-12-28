// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DeleteMasterSlaveServerGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMasterSlaveServerGroupResponseBody body;

    public static DeleteMasterSlaveServerGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMasterSlaveServerGroupResponse self = new DeleteMasterSlaveServerGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMasterSlaveServerGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMasterSlaveServerGroupResponse setBody(DeleteMasterSlaveServerGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMasterSlaveServerGroupResponseBody getBody() {
        return this.body;
    }

}
