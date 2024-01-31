// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DisableAutoLiveStreamRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableAutoLiveStreamRuleResponseBody body;

    public static DisableAutoLiveStreamRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableAutoLiveStreamRuleResponse self = new DisableAutoLiveStreamRuleResponse();
        return TeaModel.build(map, self);
    }

    public DisableAutoLiveStreamRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableAutoLiveStreamRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableAutoLiveStreamRuleResponse setBody(DisableAutoLiveStreamRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableAutoLiveStreamRuleResponseBody getBody() {
        return this.body;
    }

}
