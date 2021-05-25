// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeAvailableNacosInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAvailableNacosInstancesResponseBody body;

    public static DescribeAvailableNacosInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableNacosInstancesResponse self = new DescribeAvailableNacosInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableNacosInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAvailableNacosInstancesResponse setBody(DescribeAvailableNacosInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAvailableNacosInstancesResponseBody getBody() {
        return this.body;
    }

}
