// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateMasterSlaveServerGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateMasterSlaveServerGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMasterSlaveServerGroupResponse setBody(CreateMasterSlaveServerGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMasterSlaveServerGroupResponseBody getBody() {
        return this.body;
    }

}
