// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class GrantAccountPrivilegeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GrantAccountPrivilegeResponseBody body;

    public static GrantAccountPrivilegeResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantAccountPrivilegeResponse self = new GrantAccountPrivilegeResponse();
        return TeaModel.build(map, self);
    }

    public GrantAccountPrivilegeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantAccountPrivilegeResponse setBody(GrantAccountPrivilegeResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantAccountPrivilegeResponseBody getBody() {
        return this.body;
    }

}
