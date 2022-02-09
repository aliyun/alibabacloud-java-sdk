// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceMergeDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceMergeDetailResponseBody body;

    public static DescribeInstanceMergeDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceMergeDetailResponse self = new DescribeInstanceMergeDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceMergeDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceMergeDetailResponse setBody(DescribeInstanceMergeDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceMergeDetailResponseBody getBody() {
        return this.body;
    }

}
