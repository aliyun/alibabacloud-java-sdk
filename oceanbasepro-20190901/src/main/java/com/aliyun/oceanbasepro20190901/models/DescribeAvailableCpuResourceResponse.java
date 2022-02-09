// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeAvailableCpuResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAvailableCpuResourceResponseBody body;

    public static DescribeAvailableCpuResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableCpuResourceResponse self = new DescribeAvailableCpuResourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableCpuResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAvailableCpuResourceResponse setBody(DescribeAvailableCpuResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAvailableCpuResourceResponseBody getBody() {
        return this.body;
    }

}
