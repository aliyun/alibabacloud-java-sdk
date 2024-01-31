// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyInterceptionRuleSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInterceptionRuleSwitchResponseBody body;

    public static ModifyInterceptionRuleSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInterceptionRuleSwitchResponse self = new ModifyInterceptionRuleSwitchResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInterceptionRuleSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInterceptionRuleSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInterceptionRuleSwitchResponse setBody(ModifyInterceptionRuleSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInterceptionRuleSwitchResponseBody getBody() {
        return this.body;
    }

}
