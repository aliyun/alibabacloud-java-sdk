// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeGdnInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGdnInstancesResponseBody body;

    public static DescribeGdnInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGdnInstancesResponse self = new DescribeGdnInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGdnInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGdnInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGdnInstancesResponse setBody(DescribeGdnInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGdnInstancesResponseBody getBody() {
        return this.body;
    }

}
