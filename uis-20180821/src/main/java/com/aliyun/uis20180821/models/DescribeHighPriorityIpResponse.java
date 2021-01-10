// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class DescribeHighPriorityIpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHighPriorityIpResponseBody body;

    public static DescribeHighPriorityIpResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHighPriorityIpResponse self = new DescribeHighPriorityIpResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHighPriorityIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHighPriorityIpResponse setBody(DescribeHighPriorityIpResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHighPriorityIpResponseBody getBody() {
        return this.body;
    }

}
