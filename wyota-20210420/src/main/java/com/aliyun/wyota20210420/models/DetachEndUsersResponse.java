// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class DetachEndUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachEndUsersResponseBody body;

    public static DetachEndUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachEndUsersResponse self = new DetachEndUsersResponse();
        return TeaModel.build(map, self);
    }

    public DetachEndUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachEndUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachEndUsersResponse setBody(DetachEndUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachEndUsersResponseBody getBody() {
        return this.body;
    }

}
