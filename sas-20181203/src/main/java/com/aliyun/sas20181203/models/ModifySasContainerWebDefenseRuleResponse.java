// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifySasContainerWebDefenseRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySasContainerWebDefenseRuleResponseBody body;

    public static ModifySasContainerWebDefenseRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySasContainerWebDefenseRuleResponse self = new ModifySasContainerWebDefenseRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifySasContainerWebDefenseRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySasContainerWebDefenseRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySasContainerWebDefenseRuleResponse setBody(ModifySasContainerWebDefenseRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySasContainerWebDefenseRuleResponseBody getBody() {
        return this.body;
    }

}
