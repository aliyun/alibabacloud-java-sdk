// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageGroupedVulListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageGroupedVulListResponseBody body;

    public static DescribeImageGroupedVulListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageGroupedVulListResponse self = new DescribeImageGroupedVulListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageGroupedVulListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageGroupedVulListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageGroupedVulListResponse setBody(DescribeImageGroupedVulListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageGroupedVulListResponseBody getBody() {
        return this.body;
    }

}
