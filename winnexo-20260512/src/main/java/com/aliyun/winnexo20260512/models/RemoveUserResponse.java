// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class RemoveUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveUserResponseBody body;

    public static RemoveUserResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserResponse self = new RemoveUserResponse();
        return TeaModel.build(map, self);
    }

    public RemoveUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveUserResponse setBody(RemoveUserResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveUserResponseBody getBody() {
        return this.body;
    }

}
