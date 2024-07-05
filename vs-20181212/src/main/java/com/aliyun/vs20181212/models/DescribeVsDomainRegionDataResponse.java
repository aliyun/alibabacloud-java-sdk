// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainRegionDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVsDomainRegionDataResponseBody body;

    public static DescribeVsDomainRegionDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDomainRegionDataResponse self = new DescribeVsDomainRegionDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVsDomainRegionDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVsDomainRegionDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVsDomainRegionDataResponse setBody(DescribeVsDomainRegionDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsDomainRegionDataResponseBody getBody() {
        return this.body;
    }

}
