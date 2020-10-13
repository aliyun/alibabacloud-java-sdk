// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GrantPrivilegesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GrantPrivilegesResponseBody body;

    public static GrantPrivilegesResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantPrivilegesResponse self = new GrantPrivilegesResponse();
        return TeaModel.build(map, self);
    }

    public GrantPrivilegesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantPrivilegesResponse setBody(GrantPrivilegesResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantPrivilegesResponseBody getBody() {
        return this.body;
    }

}
