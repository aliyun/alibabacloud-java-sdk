// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyMemberAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyMemberAccountResponseBody body;

    public static ModifyMemberAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMemberAccountResponse self = new ModifyMemberAccountResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMemberAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMemberAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyMemberAccountResponse setBody(ModifyMemberAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMemberAccountResponseBody getBody() {
        return this.body;
    }

}
