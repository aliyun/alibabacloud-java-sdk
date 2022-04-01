// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListAutoScalingRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAutoScalingRulesResponseBody body;

    public static ListAutoScalingRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAutoScalingRulesResponse self = new ListAutoScalingRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListAutoScalingRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAutoScalingRulesResponse setBody(ListAutoScalingRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAutoScalingRulesResponseBody getBody() {
        return this.body;
    }

}
