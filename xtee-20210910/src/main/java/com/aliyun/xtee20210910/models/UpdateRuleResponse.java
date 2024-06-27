// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class UpdateRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRuleResponseBody body;

    public static UpdateRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRuleResponse self = new UpdateRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRuleResponse setBody(UpdateRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRuleResponseBody getBody() {
        return this.body;
    }

}
