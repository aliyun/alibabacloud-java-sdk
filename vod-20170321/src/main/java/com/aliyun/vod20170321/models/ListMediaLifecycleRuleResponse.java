// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListMediaLifecycleRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMediaLifecycleRuleResponseBody body;

    public static ListMediaLifecycleRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMediaLifecycleRuleResponse self = new ListMediaLifecycleRuleResponse();
        return TeaModel.build(map, self);
    }

    public ListMediaLifecycleRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMediaLifecycleRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMediaLifecycleRuleResponse setBody(ListMediaLifecycleRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMediaLifecycleRuleResponseBody getBody() {
        return this.body;
    }

}
