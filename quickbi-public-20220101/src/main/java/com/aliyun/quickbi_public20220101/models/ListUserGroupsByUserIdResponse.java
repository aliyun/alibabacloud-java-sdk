// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListUserGroupsByUserIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserGroupsByUserIdResponseBody body;

    public static ListUserGroupsByUserIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserGroupsByUserIdResponse self = new ListUserGroupsByUserIdResponse();
        return TeaModel.build(map, self);
    }

    public ListUserGroupsByUserIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserGroupsByUserIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserGroupsByUserIdResponse setBody(ListUserGroupsByUserIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserGroupsByUserIdResponseBody getBody() {
        return this.body;
    }

}
