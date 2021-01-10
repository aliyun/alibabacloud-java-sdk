// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeABTestGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeABTestGroupResponseBody body;

    public static DescribeABTestGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeABTestGroupResponse self = new DescribeABTestGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeABTestGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeABTestGroupResponse setBody(DescribeABTestGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeABTestGroupResponseBody getBody() {
        return this.body;
    }

}
