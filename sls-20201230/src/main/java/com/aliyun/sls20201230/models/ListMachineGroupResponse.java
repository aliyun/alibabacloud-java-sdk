// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListMachineGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMachineGroupResponseBody body;

    public static ListMachineGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMachineGroupResponse self = new ListMachineGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListMachineGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMachineGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMachineGroupResponse setBody(ListMachineGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMachineGroupResponseBody getBody() {
        return this.body;
    }

}
