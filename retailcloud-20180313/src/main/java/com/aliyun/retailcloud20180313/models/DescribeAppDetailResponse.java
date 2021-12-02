// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeAppDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAppDetailResponseBody body;

    public static DescribeAppDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppDetailResponse self = new DescribeAppDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppDetailResponse setBody(DescribeAppDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppDetailResponseBody getBody() {
        return this.body;
    }

}
