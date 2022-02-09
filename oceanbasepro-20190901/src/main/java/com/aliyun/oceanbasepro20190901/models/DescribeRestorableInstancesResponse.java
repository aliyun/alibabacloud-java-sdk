// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeRestorableInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRestorableInstancesResponseBody body;

    public static DescribeRestorableInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestorableInstancesResponse self = new DescribeRestorableInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRestorableInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRestorableInstancesResponse setBody(DescribeRestorableInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRestorableInstancesResponseBody getBody() {
        return this.body;
    }

}
