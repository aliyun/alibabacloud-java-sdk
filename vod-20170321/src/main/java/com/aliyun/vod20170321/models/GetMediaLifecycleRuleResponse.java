// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaLifecycleRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMediaLifecycleRuleResponseBody body;

    public static GetMediaLifecycleRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaLifecycleRuleResponse self = new GetMediaLifecycleRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetMediaLifecycleRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMediaLifecycleRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMediaLifecycleRuleResponse setBody(GetMediaLifecycleRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMediaLifecycleRuleResponseBody getBody() {
        return this.body;
    }

}
