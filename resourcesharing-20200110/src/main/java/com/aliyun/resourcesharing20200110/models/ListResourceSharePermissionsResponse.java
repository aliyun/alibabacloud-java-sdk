// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListResourceSharePermissionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListResourceSharePermissionsResponseBody body;

    public static ListResourceSharePermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceSharePermissionsResponse self = new ListResourceSharePermissionsResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceSharePermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceSharePermissionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListResourceSharePermissionsResponse setBody(ListResourceSharePermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceSharePermissionsResponseBody getBody() {
        return this.body;
    }

}
