// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class DescribeHighPriorityIpsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHighPriorityIpsResponseBody body;

    public static DescribeHighPriorityIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHighPriorityIpsResponse self = new DescribeHighPriorityIpsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHighPriorityIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHighPriorityIpsResponse setBody(DescribeHighPriorityIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHighPriorityIpsResponseBody getBody() {
        return this.body;
    }

}
