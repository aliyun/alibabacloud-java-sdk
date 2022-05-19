// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeleteStackGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteStackGroupResponseBody body;

    public static DeleteStackGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStackGroupResponse self = new DeleteStackGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStackGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteStackGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteStackGroupResponse setBody(DeleteStackGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStackGroupResponseBody getBody() {
        return this.body;
    }

}
