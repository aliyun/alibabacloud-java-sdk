// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class RemoveUsersFromGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveUsersFromGroupResponseBody body;

    public static RemoveUsersFromGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveUsersFromGroupResponse self = new RemoveUsersFromGroupResponse();
        return TeaModel.build(map, self);
    }

    public RemoveUsersFromGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveUsersFromGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveUsersFromGroupResponse setBody(RemoveUsersFromGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveUsersFromGroupResponseBody getBody() {
        return this.body;
    }

}
