// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateAutoLiveStreamRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateAutoLiveStreamRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAutoLiveStreamRuleResponse setBody(CreateAutoLiveStreamRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAutoLiveStreamRuleResponseBody getBody() {
        return this.body;
    }

}
