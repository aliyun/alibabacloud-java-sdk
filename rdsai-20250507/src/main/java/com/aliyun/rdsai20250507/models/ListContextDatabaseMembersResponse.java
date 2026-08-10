// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListContextDatabaseMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListContextDatabaseMembersResponseBody body;

    public static ListContextDatabaseMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListContextDatabaseMembersResponse self = new ListContextDatabaseMembersResponse();
        return TeaModel.build(map, self);
    }

    public ListContextDatabaseMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListContextDatabaseMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListContextDatabaseMembersResponse setBody(ListContextDatabaseMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListContextDatabaseMembersResponseBody getBody() {
        return this.body;
    }

}
