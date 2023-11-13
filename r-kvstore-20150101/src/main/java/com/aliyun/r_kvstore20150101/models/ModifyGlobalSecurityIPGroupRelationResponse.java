// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyGlobalSecurityIPGroupRelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyGlobalSecurityIPGroupRelationResponseBody body;

    public static ModifyGlobalSecurityIPGroupRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyGlobalSecurityIPGroupRelationResponse self = new ModifyGlobalSecurityIPGroupRelationResponse();
        return TeaModel.build(map, self);
    }

    public ModifyGlobalSecurityIPGroupRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyGlobalSecurityIPGroupRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyGlobalSecurityIPGroupRelationResponse setBody(ModifyGlobalSecurityIPGroupRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyGlobalSecurityIPGroupRelationResponseBody getBody() {
        return this.body;
    }

}
