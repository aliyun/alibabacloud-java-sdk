// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class DeleteMachineGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMachineGroupResponseBody body;

    public static DeleteMachineGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMachineGroupResponse self = new DeleteMachineGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMachineGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMachineGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMachineGroupResponse setBody(DeleteMachineGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMachineGroupResponseBody getBody() {
        return this.body;
    }

}
