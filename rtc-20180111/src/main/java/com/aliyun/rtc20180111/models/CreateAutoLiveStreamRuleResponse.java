// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateAutoLiveStreamRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAutoLiveStreamRuleResponseBody body;

    public static CreateAutoLiveStreamRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoLiveStreamRuleResponse self = new CreateAutoLiveStreamRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateAutoLiveStreamRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAutoLiveStreamRuleResponse setBody(CreateAutoLiveStreamRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAutoLiveStreamRuleResponseBody getBody() {
        return this.body;
    }

}
