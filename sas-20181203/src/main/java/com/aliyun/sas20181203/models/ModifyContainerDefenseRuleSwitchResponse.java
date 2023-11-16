// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyContainerDefenseRuleSwitchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyContainerDefenseRuleSwitchResponseBody body;

    public static ModifyContainerDefenseRuleSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyContainerDefenseRuleSwitchResponse self = new ModifyContainerDefenseRuleSwitchResponse();
        return TeaModel.build(map, self);
    }

    public ModifyContainerDefenseRuleSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyContainerDefenseRuleSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyContainerDefenseRuleSwitchResponse setBody(ModifyContainerDefenseRuleSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyContainerDefenseRuleSwitchResponseBody getBody() {
        return this.body;
    }

}
