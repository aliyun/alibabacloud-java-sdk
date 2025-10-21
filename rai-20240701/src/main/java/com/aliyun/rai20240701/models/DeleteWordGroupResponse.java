// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class DeleteWordGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWordGroupResponseBody body;

    public static DeleteWordGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWordGroupResponse self = new DeleteWordGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWordGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWordGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWordGroupResponse setBody(DeleteWordGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWordGroupResponseBody getBody() {
        return this.body;
    }

}
