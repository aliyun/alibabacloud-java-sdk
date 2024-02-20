// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DeleteDefenseRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDefenseRuleResponseBody body;

    public static DeleteDefenseRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDefenseRuleResponse self = new DeleteDefenseRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDefenseRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDefenseRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDefenseRuleResponse setBody(DeleteDefenseRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDefenseRuleResponseBody getBody() {
        return this.body;
    }

}
