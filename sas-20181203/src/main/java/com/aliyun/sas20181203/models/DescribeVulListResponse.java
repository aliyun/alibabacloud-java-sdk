// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVulListResponseBody body;

    public static DescribeVulListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulListResponse self = new DescribeVulListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVulListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVulListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVulListResponse setBody(DescribeVulListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVulListResponseBody getBody() {
        return this.body;
    }

}
