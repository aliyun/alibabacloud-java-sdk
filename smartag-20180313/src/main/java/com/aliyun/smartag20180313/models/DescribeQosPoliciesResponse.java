// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeQosPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeQosPoliciesResponseBody body;

    public static DescribeQosPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeQosPoliciesResponse self = new DescribeQosPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeQosPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeQosPoliciesResponse setBody(DescribeQosPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeQosPoliciesResponseBody getBody() {
        return this.body;
    }

}
