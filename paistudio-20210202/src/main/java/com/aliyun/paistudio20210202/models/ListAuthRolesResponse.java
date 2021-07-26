// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class ListAuthRolesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAuthRolesResponseBody body;

    public static ListAuthRolesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthRolesResponse self = new ListAuthRolesResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthRolesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthRolesResponse setBody(ListAuthRolesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthRolesResponseBody getBody() {
        return this.body;
    }

}
