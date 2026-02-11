// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DescribeModelingProjectDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeModelingProjectDetailResponseBody body;

    public static DescribeModelingProjectDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelingProjectDetailResponse self = new DescribeModelingProjectDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeModelingProjectDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeModelingProjectDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeModelingProjectDetailResponse setBody(DescribeModelingProjectDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeModelingProjectDetailResponseBody getBody() {
        return this.body;
    }

}
