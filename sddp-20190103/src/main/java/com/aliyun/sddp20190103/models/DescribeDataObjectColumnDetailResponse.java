// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataObjectColumnDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDataObjectColumnDetailResponseBody body;

    public static DescribeDataObjectColumnDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataObjectColumnDetailResponse self = new DescribeDataObjectColumnDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataObjectColumnDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataObjectColumnDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDataObjectColumnDetailResponse setBody(DescribeDataObjectColumnDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataObjectColumnDetailResponseBody getBody() {
        return this.body;
    }

}
