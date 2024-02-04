// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListPermissionVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPermissionVersionsResponseBody body;

    public static ListPermissionVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPermissionVersionsResponse self = new ListPermissionVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListPermissionVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPermissionVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPermissionVersionsResponse setBody(ListPermissionVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPermissionVersionsResponseBody getBody() {
        return this.body;
    }

}
