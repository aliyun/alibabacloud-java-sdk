// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetResourceGroupMachineGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetResourceGroupMachineGroupResponseBody body;

    public static GetResourceGroupMachineGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceGroupMachineGroupResponse self = new GetResourceGroupMachineGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceGroupMachineGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceGroupMachineGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceGroupMachineGroupResponse setBody(GetResourceGroupMachineGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceGroupMachineGroupResponseBody getBody() {
        return this.body;
    }

}
