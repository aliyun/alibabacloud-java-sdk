// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeEipResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEipResourcesResponseBody body;

    public static DescribeEipResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEipResourcesResponse self = new DescribeEipResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEipResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEipResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEipResourcesResponse setBody(DescribeEipResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEipResourcesResponseBody getBody() {
        return this.body;
    }

}
