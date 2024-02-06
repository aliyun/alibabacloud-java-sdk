// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetAppliedMachineGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppliedMachineGroupsResponseBody body;

    public static GetAppliedMachineGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppliedMachineGroupsResponse self = new GetAppliedMachineGroupsResponse();
        return TeaModel.build(map, self);
    }

    public GetAppliedMachineGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppliedMachineGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppliedMachineGroupsResponse setBody(GetAppliedMachineGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppliedMachineGroupsResponseBody getBody() {
        return this.body;
    }

}
