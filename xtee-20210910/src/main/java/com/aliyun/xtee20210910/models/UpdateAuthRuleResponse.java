// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class UpdateAuthRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAuthRuleResponseBody body;

    public static UpdateAuthRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthRuleResponse self = new UpdateAuthRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAuthRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAuthRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAuthRuleResponse setBody(UpdateAuthRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAuthRuleResponseBody getBody() {
        return this.body;
    }

}
