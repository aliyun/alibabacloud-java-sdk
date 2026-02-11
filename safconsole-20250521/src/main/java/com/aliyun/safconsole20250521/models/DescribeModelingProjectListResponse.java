// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DescribeModelingProjectListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeModelingProjectListResponseBody body;

    public static DescribeModelingProjectListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelingProjectListResponse self = new DescribeModelingProjectListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeModelingProjectListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeModelingProjectListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeModelingProjectListResponse setBody(DescribeModelingProjectListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeModelingProjectListResponseBody getBody() {
        return this.body;
    }

}
