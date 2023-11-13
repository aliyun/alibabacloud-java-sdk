// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyGlobalSecurityIPGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyGlobalSecurityIPGroupResponseBody body;

    public static ModifyGlobalSecurityIPGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyGlobalSecurityIPGroupResponse self = new ModifyGlobalSecurityIPGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyGlobalSecurityIPGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyGlobalSecurityIPGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyGlobalSecurityIPGroupResponse setBody(ModifyGlobalSecurityIPGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyGlobalSecurityIPGroupResponseBody getBody() {
        return this.body;
    }

}
