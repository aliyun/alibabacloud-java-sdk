// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudResourceDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHybridCloudResourceDetailResponseBody body;

    public static DescribeHybridCloudResourceDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridCloudResourceDetailResponse self = new DescribeHybridCloudResourceDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHybridCloudResourceDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHybridCloudResourceDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHybridCloudResourceDetailResponse setBody(DescribeHybridCloudResourceDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHybridCloudResourceDetailResponseBody getBody() {
        return this.body;
    }

}
