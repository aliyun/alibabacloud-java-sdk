// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyAccountPrivilegeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAccountPrivilegeResponseBody body;

    public static ModifyAccountPrivilegeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountPrivilegeResponse self = new ModifyAccountPrivilegeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAccountPrivilegeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAccountPrivilegeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAccountPrivilegeResponse setBody(ModifyAccountPrivilegeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAccountPrivilegeResponseBody getBody() {
        return this.body;
    }

}
