// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class UpdateAutoLiveStreamRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAutoLiveStreamRuleResponseBody body;

    public static UpdateAutoLiveStreamRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoLiveStreamRuleResponse self = new UpdateAutoLiveStreamRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAutoLiveStreamRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAutoLiveStreamRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAutoLiveStreamRuleResponse setBody(UpdateAutoLiveStreamRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAutoLiveStreamRuleResponseBody getBody() {
        return this.body;
    }

}
