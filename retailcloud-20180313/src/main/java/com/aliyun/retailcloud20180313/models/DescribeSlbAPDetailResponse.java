// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeSlbAPDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSlbAPDetailResponseBody body;

    public static DescribeSlbAPDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlbAPDetailResponse self = new DescribeSlbAPDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSlbAPDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSlbAPDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSlbAPDetailResponse setBody(DescribeSlbAPDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSlbAPDetailResponseBody getBody() {
        return this.body;
    }

}
