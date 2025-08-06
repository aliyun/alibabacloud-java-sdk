// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateMediaLifecycleRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMediaLifecycleRuleResponseBody body;

    public static UpdateMediaLifecycleRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaLifecycleRuleResponse self = new UpdateMediaLifecycleRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMediaLifecycleRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMediaLifecycleRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMediaLifecycleRuleResponse setBody(UpdateMediaLifecycleRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMediaLifecycleRuleResponseBody getBody() {
        return this.body;
    }

}
