// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeInstanceSpecificationsRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    public static DescribeInstanceSpecificationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSpecificationsRequest self = new DescribeInstanceSpecificationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSpecificationsRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
