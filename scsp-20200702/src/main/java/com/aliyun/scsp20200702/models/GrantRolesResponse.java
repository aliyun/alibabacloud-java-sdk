// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GrantRolesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GrantRolesResponseBody body;

    public static GrantRolesResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantRolesResponse self = new GrantRolesResponse();
        return TeaModel.build(map, self);
    }

    public GrantRolesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantRolesResponse setBody(GrantRolesResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantRolesResponseBody getBody() {
        return this.body;
    }

}
