// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeGatherLogResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGatherLogResultResponseBody body;

    public static DescribeGatherLogResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatherLogResultResponse self = new DescribeGatherLogResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGatherLogResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGatherLogResultResponse setBody(DescribeGatherLogResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGatherLogResultResponseBody getBody() {
        return this.body;
    }

}
