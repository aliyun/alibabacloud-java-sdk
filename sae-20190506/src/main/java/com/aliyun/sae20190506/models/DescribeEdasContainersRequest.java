// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeEdasContainersRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    public static DescribeEdasContainersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEdasContainersRequest self = new DescribeEdasContainersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEdasContainersRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
