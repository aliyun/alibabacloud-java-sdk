// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class DeleteGroupIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteGroupIdResponseBody body;

    public static DeleteGroupIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGroupIdResponse self = new DeleteGroupIdResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGroupIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGroupIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGroupIdResponse setBody(DeleteGroupIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGroupIdResponseBody getBody() {
        return this.body;
    }

}
