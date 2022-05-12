// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DeleteVServerGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteVServerGroupResponseBody body;

    public static DeleteVServerGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVServerGroupResponse self = new DeleteVServerGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVServerGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVServerGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVServerGroupResponse setBody(DeleteVServerGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVServerGroupResponseBody getBody() {
        return this.body;
    }

}
