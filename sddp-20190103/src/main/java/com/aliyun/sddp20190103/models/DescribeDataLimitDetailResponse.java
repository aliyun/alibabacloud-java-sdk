// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataLimitDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDataLimitDetailResponseBody body;

    public static DescribeDataLimitDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataLimitDetailResponse self = new DescribeDataLimitDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataLimitDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataLimitDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDataLimitDetailResponse setBody(DescribeDataLimitDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataLimitDetailResponseBody getBody() {
        return this.body;
    }

}
