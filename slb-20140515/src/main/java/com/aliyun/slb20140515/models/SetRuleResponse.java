// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetRuleResponseBody body;

    public static SetRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        SetRuleResponse self = new SetRuleResponse();
        return TeaModel.build(map, self);
    }

    public SetRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetRuleResponse setBody(SetRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public SetRuleResponseBody getBody() {
        return this.body;
    }

}
