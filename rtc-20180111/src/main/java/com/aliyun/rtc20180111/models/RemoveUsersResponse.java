// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class RemoveUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveUsersResponseBody body;

    public static RemoveUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveUsersResponse self = new RemoveUsersResponse();
        return TeaModel.build(map, self);
    }

    public RemoveUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveUsersResponse setBody(RemoveUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveUsersResponseBody getBody() {
        return this.body;
    }

}
