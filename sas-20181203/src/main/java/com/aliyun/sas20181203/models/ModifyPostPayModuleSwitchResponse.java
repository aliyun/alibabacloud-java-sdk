// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyPostPayModuleSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyPostPayModuleSwitchResponseBody body;

    public static ModifyPostPayModuleSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPostPayModuleSwitchResponse self = new ModifyPostPayModuleSwitchResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPostPayModuleSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPostPayModuleSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPostPayModuleSwitchResponse setBody(ModifyPostPayModuleSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPostPayModuleSwitchResponseBody getBody() {
        return this.body;
    }

}
