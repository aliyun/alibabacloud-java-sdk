// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class AttachEndUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachEndUsersResponseBody body;

    public static AttachEndUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachEndUsersResponse self = new AttachEndUsersResponse();
        return TeaModel.build(map, self);
    }

    public AttachEndUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachEndUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachEndUsersResponse setBody(AttachEndUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachEndUsersResponseBody getBody() {
        return this.body;
    }

}
