// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeModelServiceListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeModelServiceListResponseBody body;

    public static DescribeModelServiceListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelServiceListResponse self = new DescribeModelServiceListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeModelServiceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeModelServiceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeModelServiceListResponse setBody(DescribeModelServiceListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeModelServiceListResponseBody getBody() {
        return this.body;
    }

}
