// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class RemoveDatabasesFromGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveDatabasesFromGroupResponseBody body;

    public static RemoveDatabasesFromGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveDatabasesFromGroupResponse self = new RemoveDatabasesFromGroupResponse();
        return TeaModel.build(map, self);
    }

    public RemoveDatabasesFromGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveDatabasesFromGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveDatabasesFromGroupResponse setBody(RemoveDatabasesFromGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveDatabasesFromGroupResponseBody getBody() {
        return this.body;
    }

}
