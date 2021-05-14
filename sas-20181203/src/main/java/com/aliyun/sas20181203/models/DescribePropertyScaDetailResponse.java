// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyScaDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePropertyScaDetailResponseBody body;

    public static DescribePropertyScaDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyScaDetailResponse self = new DescribePropertyScaDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribePropertyScaDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePropertyScaDetailResponse setBody(DescribePropertyScaDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePropertyScaDetailResponseBody getBody() {
        return this.body;
    }

}
