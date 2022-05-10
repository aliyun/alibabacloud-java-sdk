// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedInstanceDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeExposedInstanceDetailResponseBody body;

    public static DescribeExposedInstanceDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExposedInstanceDetailResponse self = new DescribeExposedInstanceDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExposedInstanceDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExposedInstanceDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExposedInstanceDetailResponse setBody(DescribeExposedInstanceDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExposedInstanceDetailResponseBody getBody() {
        return this.body;
    }

}
