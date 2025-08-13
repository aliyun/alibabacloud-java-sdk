// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DeepCopyRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeepCopyRuleResponseBody body;

    public static DeepCopyRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeepCopyRuleResponse self = new DeepCopyRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeepCopyRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeepCopyRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeepCopyRuleResponse setBody(DeepCopyRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeepCopyRuleResponseBody getBody() {
        return this.body;
    }

}
