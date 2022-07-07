// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListRamRolesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListRamRolesResponseBody body;

    public static ListRamRolesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRamRolesResponse self = new ListRamRolesResponse();
        return TeaModel.build(map, self);
    }

    public ListRamRolesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRamRolesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRamRolesResponse setBody(ListRamRolesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRamRolesResponseBody getBody() {
        return this.body;
    }

}
