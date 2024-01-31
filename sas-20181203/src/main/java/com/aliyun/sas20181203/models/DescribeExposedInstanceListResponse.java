// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedInstanceListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeExposedInstanceListResponseBody body;

    public static DescribeExposedInstanceListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExposedInstanceListResponse self = new DescribeExposedInstanceListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExposedInstanceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExposedInstanceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExposedInstanceListResponse setBody(DescribeExposedInstanceListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExposedInstanceListResponseBody getBody() {
        return this.body;
    }

}
