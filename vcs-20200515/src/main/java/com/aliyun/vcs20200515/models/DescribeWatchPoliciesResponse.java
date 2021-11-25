// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeWatchPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeWatchPoliciesResponseBody body;

    public static DescribeWatchPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWatchPoliciesResponse self = new DescribeWatchPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWatchPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWatchPoliciesResponse setBody(DescribeWatchPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWatchPoliciesResponseBody getBody() {
        return this.body;
    }

}
