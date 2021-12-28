// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeAlertActionPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAlertActionPoliciesResponseBody body;

    public static DescribeAlertActionPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertActionPoliciesResponse self = new DescribeAlertActionPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAlertActionPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAlertActionPoliciesResponse setBody(DescribeAlertActionPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAlertActionPoliciesResponseBody getBody() {
        return this.body;
    }

}
