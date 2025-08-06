// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateMediaLifecycleRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMediaLifecycleRuleResponseBody body;

    public static CreateMediaLifecycleRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMediaLifecycleRuleResponse self = new CreateMediaLifecycleRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateMediaLifecycleRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMediaLifecycleRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMediaLifecycleRuleResponse setBody(CreateMediaLifecycleRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMediaLifecycleRuleResponseBody getBody() {
        return this.body;
    }

}
