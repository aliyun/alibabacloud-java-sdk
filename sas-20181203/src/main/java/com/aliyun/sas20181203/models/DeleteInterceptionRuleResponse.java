// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteInterceptionRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteInterceptionRuleResponseBody body;

    public static DeleteInterceptionRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteInterceptionRuleResponse self = new DeleteInterceptionRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteInterceptionRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteInterceptionRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteInterceptionRuleResponse setBody(DeleteInterceptionRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteInterceptionRuleResponseBody getBody() {
        return this.body;
    }

}
