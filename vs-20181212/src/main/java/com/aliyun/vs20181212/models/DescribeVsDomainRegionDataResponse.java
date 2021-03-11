// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainRegionDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeVsDomainRegionDataResponse setBody(DescribeVsDomainRegionDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsDomainRegionDataResponseBody getBody() {
        return this.body;
    }

}
