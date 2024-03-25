// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyRuleStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyRuleStatusResponseBody body;

    public static ModifyRuleStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRuleStatusResponse self = new ModifyRuleStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRuleStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRuleStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRuleStatusResponse setBody(ModifyRuleStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRuleStatusResponseBody getBody() {
        return this.body;
    }

}
