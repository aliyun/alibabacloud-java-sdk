// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class DeleteAppGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAppGroupResponseBody body;

    public static DeleteAppGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppGroupResponse self = new DeleteAppGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAppGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAppGroupResponse setBody(DeleteAppGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAppGroupResponseBody getBody() {
        return this.body;
    }

}
