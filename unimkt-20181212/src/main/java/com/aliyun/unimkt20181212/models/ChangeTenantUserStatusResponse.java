// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ChangeTenantUserStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeTenantUserStatusResponseBody body;

    public static ChangeTenantUserStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeTenantUserStatusResponse self = new ChangeTenantUserStatusResponse();
        return TeaModel.build(map, self);
    }

    public ChangeTenantUserStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeTenantUserStatusResponse setBody(ChangeTenantUserStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeTenantUserStatusResponseBody getBody() {
        return this.body;
    }

}
