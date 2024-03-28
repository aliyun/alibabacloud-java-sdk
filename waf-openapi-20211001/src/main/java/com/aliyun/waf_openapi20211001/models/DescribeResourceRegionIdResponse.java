// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeResourceRegionIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeResourceRegionIdResponseBody body;

    public static DescribeResourceRegionIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceRegionIdResponse self = new DescribeResourceRegionIdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceRegionIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourceRegionIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourceRegionIdResponse setBody(DescribeResourceRegionIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourceRegionIdResponseBody getBody() {
        return this.body;
    }

}
