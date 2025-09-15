// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyUserWafLogStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyUserWafLogStatusResponseBody body;

    public static ModifyUserWafLogStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserWafLogStatusResponse self = new ModifyUserWafLogStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyUserWafLogStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyUserWafLogStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyUserWafLogStatusResponse setBody(ModifyUserWafLogStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyUserWafLogStatusResponseBody getBody() {
        return this.body;
    }

}
