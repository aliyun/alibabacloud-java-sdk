// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListAutoScalingPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAutoScalingPoliciesResponseBody body;

    public static ListAutoScalingPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAutoScalingPoliciesResponse self = new ListAutoScalingPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public ListAutoScalingPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAutoScalingPoliciesResponse setBody(ListAutoScalingPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAutoScalingPoliciesResponseBody getBody() {
        return this.body;
    }

}
