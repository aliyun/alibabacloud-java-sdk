// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class RevokePrivilegesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RevokePrivilegesResponseBody body;

    public static RevokePrivilegesResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokePrivilegesResponse self = new RevokePrivilegesResponse();
        return TeaModel.build(map, self);
    }

    public RevokePrivilegesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokePrivilegesResponse setBody(RevokePrivilegesResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokePrivilegesResponseBody getBody() {
        return this.body;
    }

}
