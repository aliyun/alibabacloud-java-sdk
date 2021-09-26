// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class DeregisterTemplatesFromRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeregisterTemplatesFromRuleResponseBody body;

    public static DeregisterTemplatesFromRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeregisterTemplatesFromRuleResponse self = new DeregisterTemplatesFromRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeregisterTemplatesFromRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeregisterTemplatesFromRuleResponse setBody(DeregisterTemplatesFromRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeregisterTemplatesFromRuleResponseBody getBody() {
        return this.body;
    }

}
