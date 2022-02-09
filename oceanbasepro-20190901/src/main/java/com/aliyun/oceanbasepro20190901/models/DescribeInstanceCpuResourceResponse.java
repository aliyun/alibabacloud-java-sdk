// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceCpuResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceCpuResourceResponseBody body;

    public static DescribeInstanceCpuResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceCpuResourceResponse self = new DescribeInstanceCpuResourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceCpuResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceCpuResourceResponse setBody(DescribeInstanceCpuResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceCpuResourceResponseBody getBody() {
        return this.body;
    }

}
