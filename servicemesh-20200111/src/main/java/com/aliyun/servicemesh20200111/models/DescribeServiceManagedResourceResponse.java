// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceManagedResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeServiceManagedResourceResponseBody body;

    public static DescribeServiceManagedResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceManagedResourceResponse self = new DescribeServiceManagedResourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceManagedResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServiceManagedResourceResponse setBody(DescribeServiceManagedResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServiceManagedResourceResponseBody getBody() {
        return this.body;
    }

}
