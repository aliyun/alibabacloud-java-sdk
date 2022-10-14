// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DeleteSwimLaneGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSwimLaneGroupResponseBody body;

    public static DeleteSwimLaneGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSwimLaneGroupResponse self = new DeleteSwimLaneGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSwimLaneGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSwimLaneGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSwimLaneGroupResponse setBody(DeleteSwimLaneGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSwimLaneGroupResponseBody getBody() {
        return this.body;
    }

}
