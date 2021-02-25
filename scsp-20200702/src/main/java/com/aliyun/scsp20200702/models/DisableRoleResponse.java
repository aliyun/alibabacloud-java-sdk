// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class DisableRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableRoleResponseBody body;

    public static DisableRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableRoleResponse self = new DisableRoleResponse();
        return TeaModel.build(map, self);
    }

    public DisableRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableRoleResponse setBody(DisableRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableRoleResponseBody getBody() {
        return this.body;
    }

}
