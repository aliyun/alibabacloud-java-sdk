// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetMachineGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMachineGroupResponseBody body;

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

    public GetMachineGroupResponse setBody(GetMachineGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMachineGroupResponseBody getBody() {
        return this.body;
    }

}
