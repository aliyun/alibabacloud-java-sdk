// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDefenseRuleStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDefenseRuleStatusResponseBody body;

    public static ModifyDefenseRuleStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefenseRuleStatusResponse self = new ModifyDefenseRuleStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDefenseRuleStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDefenseRuleStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDefenseRuleStatusResponse setBody(ModifyDefenseRuleStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDefenseRuleStatusResponseBody getBody() {
        return this.body;
    }

}
