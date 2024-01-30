// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeleteStackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteStackResponseBody body;

    public static DeleteStackResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStackResponse self = new DeleteStackResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteStackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteStackResponse setBody(DeleteStackResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStackResponseBody getBody() {
        return this.body;
    }

}
