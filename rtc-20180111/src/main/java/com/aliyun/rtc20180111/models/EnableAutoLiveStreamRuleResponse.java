// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class EnableAutoLiveStreamRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnableAutoLiveStreamRuleResponseBody body;

    public static EnableAutoLiveStreamRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableAutoLiveStreamRuleResponse self = new EnableAutoLiveStreamRuleResponse();
        return TeaModel.build(map, self);
    }

    public EnableAutoLiveStreamRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableAutoLiveStreamRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableAutoLiveStreamRuleResponse setBody(EnableAutoLiveStreamRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableAutoLiveStreamRuleResponseBody getBody() {
        return this.body;
    }

}
