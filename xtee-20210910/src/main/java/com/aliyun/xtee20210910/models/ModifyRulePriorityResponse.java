// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModifyRulePriorityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyRulePriorityResponseBody body;

    public static ModifyRulePriorityResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRulePriorityResponse self = new ModifyRulePriorityResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRulePriorityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRulePriorityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRulePriorityResponse setBody(ModifyRulePriorityResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRulePriorityResponseBody getBody() {
        return this.body;
    }

}
