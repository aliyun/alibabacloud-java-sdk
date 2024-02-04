// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListPermissionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPermissionsResponseBody body;

    public static ListPermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPermissionsResponse self = new ListPermissionsResponse();
        return TeaModel.build(map, self);
    }

    public ListPermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPermissionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPermissionsResponse setBody(ListPermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPermissionsResponseBody getBody() {
        return this.body;
    }

}
