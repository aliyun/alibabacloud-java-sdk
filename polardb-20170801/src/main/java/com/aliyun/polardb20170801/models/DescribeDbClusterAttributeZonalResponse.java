// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDbClusterAttributeZonalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDbClusterAttributeZonalResponseBody body;

    public static DescribeDbClusterAttributeZonalResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDbClusterAttributeZonalResponse self = new DescribeDbClusterAttributeZonalResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDbClusterAttributeZonalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDbClusterAttributeZonalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDbClusterAttributeZonalResponse setBody(DescribeDbClusterAttributeZonalResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDbClusterAttributeZonalResponseBody getBody() {
        return this.body;
    }

}
