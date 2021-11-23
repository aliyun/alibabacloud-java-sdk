// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DisableAutoLiveStreamRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DisableAutoLiveStreamRuleResponse setBody(DisableAutoLiveStreamRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableAutoLiveStreamRuleResponseBody getBody() {
        return this.body;
    }

}
