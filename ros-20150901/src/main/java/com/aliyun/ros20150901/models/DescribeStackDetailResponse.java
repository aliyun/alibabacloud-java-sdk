// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20150901.models;

import com.aliyun.tea.*;

public class DescribeStackDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static DescribeStackDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStackDetailResponse self = new DescribeStackDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStackDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
