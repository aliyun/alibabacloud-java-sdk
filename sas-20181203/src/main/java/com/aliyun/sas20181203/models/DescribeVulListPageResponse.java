// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulListPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVulListPageResponseBody body;

    public static DescribeVulListPageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulListPageResponse self = new DescribeVulListPageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVulListPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVulListPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVulListPageResponse setBody(DescribeVulListPageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVulListPageResponseBody getBody() {
        return this.body;
    }

}
