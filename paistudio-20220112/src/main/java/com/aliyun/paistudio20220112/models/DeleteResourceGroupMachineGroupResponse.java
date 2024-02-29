// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class DeleteResourceGroupMachineGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteResourceGroupMachineGroupResponseBody body;

    public static DeleteResourceGroupMachineGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceGroupMachineGroupResponse self = new DeleteResourceGroupMachineGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteResourceGroupMachineGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteResourceGroupMachineGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteResourceGroupMachineGroupResponse setBody(DeleteResourceGroupMachineGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteResourceGroupMachineGroupResponseBody getBody() {
        return this.body;
    }

}
