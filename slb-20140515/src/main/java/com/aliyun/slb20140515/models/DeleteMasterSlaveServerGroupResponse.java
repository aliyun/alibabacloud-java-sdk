// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DeleteMasterSlaveServerGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteMasterSlaveServerGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMasterSlaveServerGroupResponse setBody(DeleteMasterSlaveServerGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMasterSlaveServerGroupResponseBody getBody() {
        return this.body;
    }

}
