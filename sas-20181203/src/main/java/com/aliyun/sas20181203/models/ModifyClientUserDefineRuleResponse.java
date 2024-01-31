// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyClientUserDefineRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyClientUserDefineRuleResponseBody body;

    public static ModifyClientUserDefineRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyClientUserDefineRuleResponse self = new ModifyClientUserDefineRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyClientUserDefineRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyClientUserDefineRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyClientUserDefineRuleResponse setBody(ModifyClientUserDefineRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyClientUserDefineRuleResponseBody getBody() {
        return this.body;
    }

}
