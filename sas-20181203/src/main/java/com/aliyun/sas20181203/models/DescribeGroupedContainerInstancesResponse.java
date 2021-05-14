// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedContainerInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGroupedContainerInstancesResponseBody body;

    public static DescribeGroupedContainerInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupedContainerInstancesResponse self = new DescribeGroupedContainerInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGroupedContainerInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGroupedContainerInstancesResponse setBody(DescribeGroupedContainerInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGroupedContainerInstancesResponseBody getBody() {
        return this.body;
    }

}
