// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListAppResourcePermissionRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAppResourcePermissionRecordsResponseBody body;

    public static ListAppResourcePermissionRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppResourcePermissionRecordsResponse self = new ListAppResourcePermissionRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListAppResourcePermissionRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppResourcePermissionRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppResourcePermissionRecordsResponse setBody(ListAppResourcePermissionRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppResourcePermissionRecordsResponseBody getBody() {
        return this.body;
    }

}
