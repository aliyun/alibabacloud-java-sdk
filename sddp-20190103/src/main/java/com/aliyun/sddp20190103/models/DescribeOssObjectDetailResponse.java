// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeOssObjectDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOssObjectDetailResponseBody body;

    public static DescribeOssObjectDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssObjectDetailResponse self = new DescribeOssObjectDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOssObjectDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOssObjectDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOssObjectDetailResponse setBody(DescribeOssObjectDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOssObjectDetailResponseBody getBody() {
        return this.body;
    }

}
