// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateResourceRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateResourceRuleResponseBody body;

    public static UpdateResourceRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceRuleResponse self = new UpdateResourceRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateResourceRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateResourceRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateResourceRuleResponse setBody(UpdateResourceRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateResourceRuleResponseBody getBody() {
        return this.body;
    }

}
