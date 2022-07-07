// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetMachineGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MachineGroup body;

    public static GetMachineGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMachineGroupResponse self = new GetMachineGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetMachineGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMachineGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMachineGroupResponse setBody(MachineGroup body) {
        this.body = body;
        return this;
    }
    public MachineGroup getBody() {
        return this.body;
    }

}
