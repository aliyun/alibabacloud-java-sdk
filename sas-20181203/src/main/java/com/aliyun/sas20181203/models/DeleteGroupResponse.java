// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteGroupResponseBody body;

    public static DeleteGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGroupResponse self = new DeleteGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGroupResponse setBody(DeleteGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGroupResponseBody getBody() {
        return this.body;
    }

}
