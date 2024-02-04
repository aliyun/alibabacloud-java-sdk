// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyMaskingRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyMaskingRulesResponseBody body;

    public static ModifyMaskingRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMaskingRulesResponse self = new ModifyMaskingRulesResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMaskingRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMaskingRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyMaskingRulesResponse setBody(ModifyMaskingRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMaskingRulesResponseBody getBody() {
        return this.body;
    }

}
