// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyACLResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyACLResponseBody body;

    public static ModifyACLResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyACLResponse self = new ModifyACLResponse();
        return TeaModel.build(map, self);
    }

    public ModifyACLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyACLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyACLResponse setBody(ModifyACLResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyACLResponseBody getBody() {
        return this.body;
    }

}
