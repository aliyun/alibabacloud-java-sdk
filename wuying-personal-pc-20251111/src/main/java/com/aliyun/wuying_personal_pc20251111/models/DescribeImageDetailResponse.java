// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuying_personal_pc20251111.models;

import com.aliyun.tea.*;

public class DescribeImageDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageDetailResponseBody body;

    public static DescribeImageDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageDetailResponse self = new DescribeImageDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageDetailResponse setBody(DescribeImageDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageDetailResponseBody getBody() {
        return this.body;
    }

}
