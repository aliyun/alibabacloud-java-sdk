// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class RecallRuleAuditResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecallRuleAuditResponseBody body;

    public static RecallRuleAuditResponse build(java.util.Map<String, ?> map) throws Exception {
        RecallRuleAuditResponse self = new RecallRuleAuditResponse();
        return TeaModel.build(map, self);
    }

    public RecallRuleAuditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecallRuleAuditResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecallRuleAuditResponse setBody(RecallRuleAuditResponseBody body) {
        this.body = body;
        return this;
    }
    public RecallRuleAuditResponseBody getBody() {
        return this.body;
    }

}
