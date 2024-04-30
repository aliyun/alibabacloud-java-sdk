// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyAccountMaskingPrivilegeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAccountMaskingPrivilegeResponseBody body;

    public static ModifyAccountMaskingPrivilegeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountMaskingPrivilegeResponse self = new ModifyAccountMaskingPrivilegeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAccountMaskingPrivilegeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAccountMaskingPrivilegeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAccountMaskingPrivilegeResponse setBody(ModifyAccountMaskingPrivilegeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAccountMaskingPrivilegeResponseBody getBody() {
        return this.body;
    }

}
